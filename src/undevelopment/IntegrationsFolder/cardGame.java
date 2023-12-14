/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package undevelopment.IntegrationsFolder;

/**
 *
 * @author dmoc2
 */

import java.io.BufferedReader;
import java.util.ArrayList;
import javax.swing.JOptionPane;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

import java.sql.*;




public class cardGame extends HandleInputs
{//open class

    public cardGame() { //constructor for input 
    }
    
    ArrayList <user> userList = new ArrayList<>(); //creates an object array list to store user data
    
  
   
   
    private int realScore = 0; //used for score counter 
    private String score = realScore+""; //used to store the score into the users account
    public  int randomID = (int)(Math.random()*1000+1); //generates the user id 
   
    user newUser = new user(); // creates an instance of the user object
   
    
    choiceCardHolder test = new choiceCardHolder(); //create instance of game
    
    
   

    public static Connection Myconn; //creates the connector for the db
    
     public void scriptRunner(){
        //establish connection with the database
        try{
            Myconn = DriverManager.getConnection("jdbc:mysql://localhost:3306/scoreDB","root","1234"); // .getConnection("link to db","username","password")
        } catch(SQLException ex)
        {
            System.out.println("Error connection to db"+ex.getMessage());
        }
    }
    
     public void game() //loads the game from the choiceCardHolder class
     {
         test.askID();
         test.trial();
         
     }
      
     
     
    
    
    public void addUser() //function for adding the user to the db and the arraylist/file
    {
      
        
       
        String random = randomID+""; //stringify the id
       
        String name = undevelopment.IntegrationsUI.nameField.getText(); //gets the name
        
        newUser.setId(random); //sets the id
        newUser.setUserName(undevelopment.IntegrationsUI.nameField.getText()); //sets the name
        newUser.setScore(score); //sets the score 
        
        System.out.println(name); //prints the name in terminal to check if it is working 
        userList.add(newUser); //adds the user to the array
        
         addUserToDB(); //method adds the user to the database 
       
        // TODO add your handling code here:
        //file
        File f;
        //fileWriter
        FileOutputStream fs;
        //Buffered Writer
        ObjectOutputStream os;
        
        //try catch
        
        try
        {
            f = new File("user2.dat"); //creates the file  
            fs = new FileOutputStream(f);
            os = new ObjectOutputStream(fs);
            
            os.writeObject(userList); //writes the array to the file 
            
            System.out.println("user is added");
            os.close(); //closes the write process 
            
            
            
        }//end try
        catch(IOException e)
        {
            System.out.println("Error writing to file: "+e);
        }//end catch
        
    }//end add user 
    
    
    public void addUserToDB() //adds the user to the database
    {
         String name = undevelopment.IntegrationsUI.nameField.getText(); //grabs the name the user has entered
       
         try(Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/scoreDB","root","1234")) // establishing the connection to the database 
         {
             String query = "insert into integrationsScore (ID, userName, score) values(?,?,?) "; //insert query into the db
             PreparedStatement pst = conn.prepareStatement(query);// loads that query into java 
             pst.setString(1, Integer.toString(randomID)); // adds the users randomly generated id 
             pst.setString(2,name ); // adds the users name 
             pst.setString(3, Integer.toString(realScore)); //intializes the users score as 0
             pst.executeUpdate(); //loads the query into the db
             
             System.out.println("user is added to database!"); //lets the user know in the terminal that the details have been added 
             
             
         }
         catch(SQLException ex)
         {
             JOptionPane.showMessageDialog(null, (ex.getMessage()));
         }
         
         
         
    }//end add user to db
    
    
    
    
    
    
    
    public void display() //displays the users details 
    { //open display
        
         File f;
        FileInputStream fs;
        ObjectInputStream os;
          try
         {//open try
             f = new File("user2.dat"); //will read from thsi file 
            fs = new FileInputStream(f);
            os = new ObjectInputStream(fs);
             userList = (ArrayList<user>)os.readObject(); //reading from the arraylist that is in the file 
             
            
            for(int i =0; i<userList.size(); i++) //loops through the arraylist to grab all users from it 
             {
                user load = userList.get(i); 
               undevelopment.IntegrationsUI.displayScoreArea.append(load.details()+"\n");//displays the user details 
                 
             } 
           
            displayDB(); //will display the user from the database
             
             
             os.close(); //closes the read 
              
         }//close try
         catch(ClassNotFoundException c)
      {
          System.out.println("Error cannot find class"+c);
       }//close catch
         
         catch(IOException e)
        {
            System.out.println("some error"+e);
        }//close catch
             
    }//close dislpay
    
    
    public void displayDB() // will display the users that are stored on the database 
    { //open displayDB
         try(Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/scoreDB","root","1234")) // estabishes connection to the db
          {//open try
               Statement stmt = conn.createStatement(); //used to create sql commands 
                ResultSet rs = stmt.executeQuery("SELECT * FROM integrationsScore"); //pulls from the the table to be displayed
                
                while(rs.next()) // loops through the database for the following details
                {//open while 
                    String id1 = rs.getString("ID"); //grabs id
                    String name = rs.getString("userName"); //grabs the user name
                    String score1 = rs.getString("score"); //grabs the score the user has 
                    

                    undevelopment.IntegrationsUI.displayScoreArea.append(id1+"\t"+name+"\t"+score1+"\n"); //displays all the users and their details

                }//close while
                
          }//close try
          catch(SQLException ex){
              System.out.println("this is an error"+ex);
          
          }//close catch
    }//close displayDB
    
    
      
      
      public void searchBTN() //searches through the database 
      {//open search button
          try(Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/scoreDB","root","1234")) //establishing connection with db
          {//open try
              String grabInfo = undevelopment.IntegrationsUI.searchField.getText(); //grabs the string from the field
             PreparedStatement pst = conn.prepareStatement("select * From integrationsScore Where ID = ?"); //searchs for IDs within the db file
              
              pst.setString(1,grabInfo); //using the ids to search as the parameters
              ResultSet rs = pst.executeQuery();
              if(rs.next()) //loops through different parts of the db and displays it in the text area
              {//open if
                  undevelopment.IntegrationsUI.displayScoreArea.append(rs.getString(1)+"\t"); //grabbing the field based of its index in the db
                   undevelopment.IntegrationsUI.displayScoreArea.append(rs.getString(2)+"\t"); //grabbing the field based of its index in the db
                    undevelopment.IntegrationsUI.displayScoreArea.append(rs.getString(3)); //grabbing the field based of its index in the db
              }//close if 
              else // in the event the user they are searching for is not in the data base, it will search through the array 
              { //open else
                  JOptionPane.showMessageDialog(null, "Error not in database but is possibly in array!"); 
                  searchArray();
              }//close else
               
          }
          catch(SQLException ex)
          {//open catch
              System.out.println("There is an error :"+ex);
          } //close catch
      }//close search btn
      
    
      public void searchArray() //allows the user to search through the array
      {//open search array
          
          String selected = undevelopment.IntegrationsUI.searchField.getText(); //grabs the text from the field 
          
          if(userList.isEmpty()) // checks to see if the array is empty
          {//open if
              JOptionPane.showMessageDialog(null, "There is no user to search"); //lets the user know their is no one in the array
          }//end if
          else
          { //close if 
              for(int i=0; i<userList.size(); i++) //loops through the array 
              {//open for
                 user  e = userList.get(i); //will get user based on index
                  if(e.getId().equalsIgnoreCase(selected)) //ignores cases
                  {//open if
                     undevelopment.IntegrationsUI.displayScoreArea.append(e.details()); //displays the users details in the text area
                  }//close if
              }//close for
          }//close else
          
      }//close seaarch array
      
      private void deleteFileContents(String fileName) 
      {//open delete file
        FileWriter f; //declarations

        try 
        {//open try
            f = new FileWriter(fileName, false); // a secret append option is now set to false
            f.write(""); // Overwrite the file with an empty string
            f.close();
        }//close try 
        catch (IOException e)
        {//open catch
            // Handle the exception if the file cannot be cleared
            System.out.println("There is an error "+e);
        }//close catch
    }//close delete file contents
     
     public void delete()
     {//open delete
      
        String fileName = "user2.dat"; // Replace with your file name
        deleteFileContents(fileName);
        deleteFromDB(); //deletes the user from the db
     } //close
      
     
     private void  deleteFromDB() //deletes the user from the database 
     {
         //user will be able to delete details from the db
         try(Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/scoreDB","root","1234")) //establishes the connection to the database
         {//open try
            
             String query = "Delete From integrationsScore Where ID = ?"; //creating delte query 
             PreparedStatement pst = conn.prepareStatement(query); //loads query into java
             String grabInfo = undevelopment.IntegrationsUI.searchField.getText(); //grabs the id
             int tempID = Integer.parseInt(grabInfo);
             pst.setInt(1, tempID);
             if(test.userExist(tempID) == true)//checks if the user exists within the database before the delete commences 
             {//open if
                 pst.executeUpdate(); //if the user exists then commit the delete
                 System.out.println("Deleted from db successfully"); //print the message to say the user has been deleted 
                 
             } //close if
             else if(test.userExist(tempID) == false) //if user does not exists
             {//open else if
                 System.out.println("Unable to delete from db because user does not exist!"); //let the user know the user they're deleting does not exist
             } //close else if
             else //open else 
             {
                 System.out.println("User cannot be deleted because you entered user name or the field is empty"); // the field is empty
             }//close else 
             
         }//close try
         catch(SQLException ex)
         {//open catch
             JOptionPane.showMessageDialog(null, ex);
         }//close catch
     }//close delete from db
      
     
    
    
    
}//close class
