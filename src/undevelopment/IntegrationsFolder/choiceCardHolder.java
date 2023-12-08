/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package undevelopment.IntegrationsFolder;

import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.*;



/**
 *
 * @author dmoc2
 */
public class choiceCardHolder {
    
   private static String[][] cardSet1 = new String[16][5]; // this stores all 16 cards and their choices along with the answers!
   
   private static int score=0; //keeps track of the users score 
   private static int Cardnum=0; //helps to let the program to load the next card in the array and saves adding 16 if functions
   private static int lives=5; //lets the user know the amount of attempts they have
  public static int  id;
   
   
  
   

    public choiceCardHolder() { //the game does not work without this constructor
        trial();
    }
   
   
   private String lol = "______ climate change measures into national \n policies, strategies, and planning";
    
   public void cardHolder()
   {
       cardSet1[0][0] = "______ climate change measures into national policies, strategies, and planning"; //the fill in the blank question
       cardSet1[0][1] ="Embrace"; // one of the choices you are given to use!
       cardSet1[0][2] ="Implement";  // one of the choices you are given to use!
       cardSet1[0][3] ="Embed";// one of the choices you are given to use!
       cardSet1[0][4] = "2"; // this gives the program the answer to the question based on the postion of the answer in the array!
       
       
        cardSet1[1][0] = "______ sustainable practices to address climate change  in national policies, strategies, and planning";  //the fill in the blank question
       cardSet1[1][1] ="Advocate"; // one of the choices you are given to use!
       cardSet1[1][2] ="Monitor";  // one of the choices you are given to use!
       cardSet1[1][3]="Incorpate";// one of the choices you are given to use!
       cardSet1[1][4] = "3"; // this gives the program the answer to the question based on the postion of the answer in the array!
       
       
           cardSet1[2][0] = "pick right"; //the fill in the blank question
       cardSet1[2][1] ="right"; // one of the choices you are given to use!
       cardSet1[2][2] ="wrong";  // one of the choices you are given to use!
       cardSet1[2][3]="wrong"; // one of the choices you are given to use!
       
       cardSet1[2][4] = "1"; // this gives the program the answer to the question based on the postion of the answer in the array!
       
       
           cardSet1[3][0] = "You can pick the right one!"; //the fill in the blank question
       cardSet1[3][1] ="I am right"; // one of the choices you are given to use!
       cardSet1[3][2] ="wrong";  // one of the choices you are given to use!
       cardSet1[3][3]="wrong"; // one of the choices you are given to use!
       cardSet1[3][4] = "1"; // this gives the program the answer to the question based on the postion of the answer in the array!
       
       
       
       
       
       
       
   }//end card holder
    
   public static void updateGame()
   {//open uodate game
       undevelopment.IntegrationsUI.cardHolderImg.setText(cardSet1[Cardnum][0]); //sets the main text area as the question
       undevelopment.IntegrationsUI.choiceOneBTN.setText(cardSet1[Cardnum][1]); // will load one of the three choices for fill in the blank card game
       undevelopment.IntegrationsUI.choiceTwoBTN.setText(cardSet1[Cardnum][2]);//will load one of the three choices for fill in the blank card game
       undevelopment.IntegrationsUI.choiceThreeBTN.setText(cardSet1[Cardnum][3]); //will load one of the three choices for fill in the blank card game
       undevelopment.IntegrationsUI.scoreCounter.setText(""+score); //adjusts the score due to the users performance in the game
       undevelopment.IntegrationsUI.livesCounter.setText(""+lives); //adjusts the lives of the user due to performance of the user!
   }//end update game
   
   
   //these buttons serve as the functionailty of the program, without making these buttons in this class would make it awkward trying to transfer scoring and lives 
   public void btn1()
   {
       
        if(cardSet1[Cardnum][4] == "1") // if the button matches the answer to question it will give the user +1 to their score
       {
           score++;
            updateUserScore();
             
       } else {
            lives--; //will remove a live from a user if the answer they given is wrong
             noLives(); //will load when the user runs out of lives, to end the game
        }
        Cardnum++; // this will let the program to know to move onto the next card whether the answer is right or not
        updateGame(); // this will let the program know to change the text in the button and card img holder according to what card it is on in the array
     
   }//close button 1
  
   //these buttons serve as the functionailty of the program, without making these buttons in this class would make it awkward trying to transfer scoring and lives
   
   public void btn2()
   {
        if(cardSet1[Cardnum][4] == "2") // if the button matches the answer to question it will give the user +1 to their score
       {
           score++;
           updateUserScore();
             
       } else {
            lives--; //will remove a live from a user if the answer they given is wrong
             noLives(); //will load when the user runs out of lives, to end the game
        }
        
        Cardnum++; // this will let the program to know to move onto the next card whether the answer is right or not
        updateGame(); // this will let the program know to change the text in the button and card img holder according to what card it is on in the array
        
   }//close btn2
   
   
  //these buttons serve as the functionailty of the program, without making these buttons in this class would make it awkward trying to transfer scoring and lives
   
   public void btn3()
   {
        if(cardSet1[Cardnum][4]== "3") // if the button matches the answer to question it will give the user +1 to their score
       {
           score++;
           updateUserScore();
           
       }else {
            lives--; //will remove a live from a user if the answer they given is wrong
            noLives(); //will load when the user runs out of lives, to end the game
        }
         Cardnum++; // this will let the program to know to move onto the next card whether the answer is right or not
        updateGame(); // this will let the program know to change the text in the button and card img holder according to what card it is on in the array
        
        
   }//close button3
   
    /**
this will be loaded when the user runs out of lives!
*
     */
    public static void noLives()
   {
       if(lives == 0)
       {
           JOptionPane.showMessageDialog(null, "You have ran out of lives!");
           undevelopment.IntegrationsUI.cardHolderImg.setText("Game Over! Please return the check score tab to check your score!");
            undevelopment.IntegrationsUI.choiceOneBTN.setText("");
            undevelopment.IntegrationsUI.choiceTwoBTN.setText("");
            undevelopment.IntegrationsUI.choiceThreeBTN.setText("");
            
       }
   }
    
    public static void updateUserScore() {
       
        
        
        
    try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/scoreDB", "root", "1234")) 
    {//open try 
        String query = "UPDATE integrationsScore SET score = ? WHERE ID = ?" ;
        PreparedStatement pst = conn.prepareStatement(query);
        pst.setInt(1, score);
        pst.setInt(2, id);
        pst.executeUpdate();
    }//close try
    catch (SQLException ex) 
    {
        JOptionPane.showMessageDialog(null, ex.getMessage());
    }
}

    
    
   public void askID()
   {
      id = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter Your User ID! Please check the display!"));
   }
   
   
   
   public void trial() //this method is passed into the constructor in order to have the game functionailty to be working
   {
       
       cardHolder();
       updateGame();
      
       
   }
   

}//close public class

   
   
   
   
   
    

