/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package undevelopment.IntegrationsFolder;

/**
 *
 * @author dmoc2
 */

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
import java.io.FileWriter;

import java.sql.*;




public class cardGame extends handleInputs {

    public cardGame() {
    }
    
    ArrayList <user> userList = new ArrayList<>();
    
  
   
    private String userName1;
    private int realScore = 0;
    private String score = realScore+"";
    user newUser = new user();
    handleInputs tes = new handleInputs();
    
    choiceCardHolder test = new choiceCardHolder();
    
    
   

  //  public static String url1 = "jdbc:mysql://localhost:3306/giftDB","root","1234";

   // public static String url = "jdbc:sqlite:C:/myDB/scoreDB.db";
    public static Connection Myconn;
    
     private void scriptRunner(){
        //establish connection with the database
        try{
            Myconn = DriverManager.getConnection("jdbc:mysql://localhost:3306/scoreDB","root","1234"); // .getConnection("link to db","username","password")
        } catch(SQLException ex)
        {
            System.out.println("Error connection to db"+ex.getMessage());
        }
    }
    
     public void gameTest()
     {
         test.trial();
         
     }
      
     
     
    
    
    public void addUser()
    {
      
        
        int randomID = (int)(Math.random()*1000+1);
        String random = randomID+"";
       
       String name = undevelopment.IntegrationsUI.nameField.getText();
        
        newUser.setId(random);
        newUser.setUserName(undevelopment.IntegrationsUI.nameField.getText());
        newUser.setScore(score);
        System.out.println(name);
        userList.add(newUser);
        
       
       
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
            f = new File("user2.dat");
            fs = new FileOutputStream(f);
            os = new ObjectOutputStream(fs);
            
            os.writeObject(userList);
            
            System.out.println("user is added");
            os.close();
            
            
            
        }//end try
        catch(IOException e)
        {
            System.out.println("Error writing to file: "+e);
        }//end catch
        
         
        
        
    }
    
    
    public void display()
    {
        
         File f;
        FileInputStream fs;
        ObjectInputStream os;
          try
         {
             f = new File("user2.dat");
            fs = new FileInputStream(f);
            os = new ObjectInputStream(fs);
             userList = (ArrayList<user>)os.readObject();
             
            // undevelopment.IntegrationsUI.displayScoreArea.append("ID: \t Name: \t Score: \n");
            for(int i =0; i<userList.size(); i++)
             {
                 user load = userList.get(i);
                undevelopment.IntegrationsUI.displayScoreArea.append(load.details()+"\n");
                 
             } 
           
            displayDB();
             
             
             os.close();
              
         }
         catch(ClassNotFoundException c)
      {
          System.out.println("Error cannot find class"+c);
       }
         
         catch(IOException e)
        {
            System.out.println("some error"+e);
        }
             
    }
    
    
    public void displayDB()
    {
         try(Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/scoreDB","root","1234")) // estabishes connection to the db
          {
               Statement stmt = conn.createStatement(); //used to create sql commands 
                ResultSet rs = stmt.executeQuery("SELECT * FROM integrationsScore"); //pulls from the the table to be displayed
                
                while(rs.next()) // loops through the database for the following details
                {
                    String id1 = rs.getString("ID"); //grabs id
                    String name = rs.getString("userName"); //grabs the user name
                    String score1 = rs.getString("score"); //grabs the score the user has 
                    

                    undevelopment.IntegrationsUI.displayScoreArea.append(id1+"\t"+name+"\t"+score1+"\n"); //displays all the users and their details

                   

                }
                
          }
          catch(SQLException ex){
              System.out.println("this is an error"+ex);
          
          }
    }
    
    
      
      
      public void searchBTN() //searches through the database 
      {//open search button
          try(Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/scoreDB","root","1234")) //establishing connection with db
          {
              String grabInfo = undevelopment.IntegrationsUI.searchField.getText(); //grabs the string from the field
             PreparedStatement pst = conn.prepareStatement("select * From integrationsScore Where ID = ?"); //searchs for IDs within the db file
              
              pst.setString(1,grabInfo); //using the ids to search as the parameters
              ResultSet rs = pst.executeQuery();
              if(rs.next()) //loops through different parts of the db and displays it in the text area
              {
                  undevelopment.IntegrationsUI.displayScoreArea.append(rs.getString(1)+"\t"); //grabbing the field based of its index in the db
                   undevelopment.IntegrationsUI.displayScoreArea.append(rs.getString(2)+"\t"); //grabbing the field based of its index in the db
                    undevelopment.IntegrationsUI.displayScoreArea.append(rs.getString(3)); //grabbing the field based of its index in the db
              } 
              else // in the event the user they are searching for is not in the data base, it will search through the array 
              { 
                  JOptionPane.showMessageDialog(null, "Error not in database but is possibly in array!"); 
                  searchArray();
              }
               
          }
          catch(SQLException ex)
          {
              System.out.println("There is an error :"+ex);
          }
      }
      
    
      public void searchArray() //allows the user to search through the array
      {
          String selected = undevelopment.IntegrationsUI.searchField.getText(); //grabs the text from the field 
          
          if(userList.isEmpty()) // checks to see if the array is empty
          {
              JOptionPane.showMessageDialog(null, "There is no user to search"); //lets the user know their is no one in the array
          }//end if
          else
          {
              for(int i=0; i<userList.size(); i++) //loops through the array 
              {
                 user  e = userList.get(i); //will get user based on index
                  if(e.getId().equalsIgnoreCase(selected)) //ignores cases
                  {
                     undevelopment.IntegrationsUI.displayScoreArea.append(e.details()); //displays the users details in the text area
                  }
              }
          }
          
      }
      
      private void deleteFileContents(String fileName) {
        FileWriter f; //declarations

        try {
            f = new FileWriter(fileName, false); // a secret append option is now set to false
            f.write(""); // Overwrite the file with an empty string
            f.close();
        } catch (IOException e) {
            // Handle the exception if the file cannot be cleared
            System.out.println("There is an error "+e);
        }
    }
     
     public void delete()
     {
      
        String fileName = "user2.dat"; // Replace with your file name
        deleteFileContents(fileName);
     }
      
      
    
    
}
