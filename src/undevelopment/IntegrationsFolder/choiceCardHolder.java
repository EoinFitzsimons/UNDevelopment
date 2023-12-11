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
public class ChoiceCardHolder {
    
   private static String[][] cardSet1 = new String[16][5]; // this stores all 16 cards and their choices along with the answers!
   
   private static int score=0; //keeps track of the users score 
   private static int Cardnum=0; //helps to let the program to load the next card in the array and saves adding 16 if functions
   private static int maxCards = 16;
   private static int lives=5; //lets the user know the amount of attempts they have
  public static int  id;
   
   public int scoreGrab = score;
  
   

    public ChoiceCardHolder() { //the game does not work without this constructor
        trial();
    }
   
   
  private String card1 = "______ climate change measures into national policies, strategies, and planning";
  private String card2 = "______ sustainable practices to address climate change  in national policies, strategies, and planning";
  private String card3 = "Goal 13 of the UN Sustainable Development Goals focuses on _____ to combat climate change and its impacts.";
  private String card4 = "Nationally Determined Contributions (NDCs) are pledges made by countries to _____ emissions and adapt to climate change.";
  private String card5 = "The secretariat of the United Nations Framework Convention on Climate Change (UNFCCC) coordinates and tracks countries' commitments to climate action, including their _____ .";
  private String card6 = "Long-term strategies, national adaptation plans, and adaptation communications are essential components of comprehensive _____ planning.";
  private String card7 = "The main purpose of reporting to the UNFCCC secretariat is to enhance _____ among nations in addressing climate change.";
  private String card8 = "Global efforts to limit the rise in temperature and promote sustainable development align with the objectives of UN Sustainable Development Goal _____.";
  private String card9 = "Greenhouse gases, such as carbon dioxide and methane, contribute to the _____ effect.";
  private String card10 = "Total greenhouse gas emissions per year are crucial for assessing progress in _____ climate change.";
  private String card11 = "Countries submit their NDCs to outline their intended efforts to reduce greenhouse gas emissions and adapt to climate change, promoting global _____.";
  private String card12 = "The primary international treaty addressing climate change is the United Nations Framework Convention on Climate Change (_____).";
  private String card13 = "Effective integration of climate change measures into national policies requires a focus on both _____ and adaptation strategies.";
  private String card14 = "Monitoring and reporting on total greenhouse gas emissions help identify trends and evaluate the effectiveness of climate _____ .";
  private String card15= "The overarching goal of UN Sustainable Development Goal 13 is to take _____ action to combat climate change.";
  
  
    
   public void cardHolder()
   {
       cardSet1[0][0] = card1; //the fill in the blank question
       cardSet1[0][1] ="Embrace"; // one of the choices you are given to use!
       cardSet1[0][2] ="Implement";  // one of the choices you are given to use!
       cardSet1[0][3] ="Embed";// one of the choices you are given to use!
       cardSet1[0][4] = "2"; // this gives the program the answer to the question based on the postion of the answer in the array!
       
       
        cardSet1[1][0] = card2;  //the fill in the blank question
       cardSet1[1][1] ="Advocate"; // one of the choices you are given to use!
       cardSet1[1][2] ="Monitor";  // one of the choices you are given to use!
       cardSet1[1][3]="Incorpate";// one of the choices you are given to use!
       cardSet1[1][4] = "3"; // this gives the program the answer to the question based on the postion of the answer in the array!
       
       
           cardSet1[2][0] = card3; //the fill in the blank question
       cardSet1[2][1] ="Adaptation"; // one of the choices you are given to use!
       cardSet1[2][2] ="Urgent action";  // one of the choices you are given to use!
       cardSet1[2][3]="Mitigation"; // one of the choices you are given to use!
       
       cardSet1[2][4] = "2"; // this gives the program the answer to the question based on the postion of the answer in the array!
       
       
           cardSet1[3][0] = card4; //the fill in the blank question
       cardSet1[3][1] ="Reduce"; // one of the choices you are given to use!
       cardSet1[3][2] ="Increase";  // one of the choices you are given to use!
       cardSet1[3][3]="Maintain"; // one of the choices you are given to use!
       cardSet1[3][4] = "1"; // this gives the program the answer to the question based on the postion of the answer in the array!
       
           cardSet1[4][0] = card5; //the fill in the blank question
       cardSet1[4][1] =" Economic growth plans"; // one of the choices you are given to use!
       cardSet1[4][2] ="National security strategies";  // one of the choices you are given to use!
       cardSet1[4][3]="Nationally determined contributions (NDCs)"; // one of the choices you are given to use!
       cardSet1[4][4] = "3"; // this gives the program the answer to the question based on the postion of the answer in the array!
       
           cardSet1[5][0] = card6; //the fill in the blank question
       cardSet1[5][1] =" Infrastructure"; // one of the choices you are given to use!
       cardSet1[5][2] ="Economic development";  // one of the choices you are given to use!
       cardSet1[5][3]="Climate action"; // one of the choices you are given to use!
       cardSet1[5][4] = "3"; // this gives the program the answer to the question based on the postion of the answer in the array!
       
           cardSet1[6][0] = card7; //the fill in the blank question
       cardSet1[6][1] ="Collaboration"; // one of the choices you are given to use!
       cardSet1[6][2] ="Transparency";  // one of the choices you are given to use!
       cardSet1[6][3]="Secrecy"; // one of the choices you are given to use!
       cardSet1[6][4] = "2"; // this gives the program the answer to the question based on the postion of the answer in the array!
       
           cardSet1[7][0] = card8; //the fill in the blank question
       cardSet1[7][1] ="11"; // one of the choices you are given to use!
       cardSet1[7][2] =" 12";  // one of the choices you are given to use!
       cardSet1[7][3]="13"; // one of the choices you are given to use!
       cardSet1[7][4] = "3"; // this gives the program the answer to the question based on the postion of the answer in the array!
       
           cardSet1[8][0] = card9; //the fill in the blank question
       cardSet1[8][1] ="Ozone"; // one of the choices you are given to use!
       cardSet1[8][2] ="Greenhouse";  // one of the choices you are given to use!
       cardSet1[8][3]="Deforestation"; // one of the choices you are given to use!
       cardSet1[8][4] = "2"; // this gives the program the answer to the question based on the postion of the answer in the array!
       
           cardSet1[9][0] = card10; //the fill in the blank question
       cardSet1[9][1] ="Ignoring"; // one of the choices you are given to use!
       cardSet1[9][2] ="Mitigating";  // one of the choices you are given to use!
       cardSet1[9][3]="Accelerating"; // one of the choices you are given to use!
       cardSet1[9][4] = "2"; // this gives the program the answer to the question based on the postion of the answer in the array!
       
           cardSet1[10][0] = card11; //the fill in the blank question
       cardSet1[11][1] ="Sustainability"; // one of the choices you are given to use!
       cardSet1[11][2] ="Inequality";  // one of the choices you are given to use!
       cardSet1[11][3]="Resilience"; // one of the choices you are given to use!
       cardSet1[11][4] = "3"; // this gives the program the answer to the question based on the postion of the answer in the array!
       
           cardSet1[12][0] = card12; //the fill in the blank question
       cardSet1[12][1] ="UNFCCC"; // one of the choices you are given to use!
       cardSet1[12][2] ="UNICEF";  // one of the choices you are given to use!
       cardSet1[12][3]="UNDP"; // one of the choices you are given to use!
       cardSet1[12][4] = "1"; // this gives the program the answer to the question based on the postion of the answer in the array!
       
           cardSet1[13][0] = card13; //the fill in the blank question
       cardSet1[13][1] ="Mitigation"; // one of the choices you are given to use!
       cardSet1[13][2] ="Deforestation";  // one of the choices you are given to use!
       cardSet1[13][3]="Industrialization"; // one of the choices you are given to use!
       cardSet1[13][4] = "1"; // this gives the program the answer to the question based on the postion of the answer in the array!
       
           cardSet1[14][0] = card14; //the fill in the blank question
       cardSet1[14][1] ="Conflicts"; // one of the choices you are given to use!
       cardSet1[14][2] ="Debates";  // one of the choices you are given to use!
       cardSet1[14][3]="Policies"; // one of the choices you are given to use!
       cardSet1[14][4] = "3"; // this gives the program the answer to the question based on the postion of the answer in the array!
       
           cardSet1[15][0] = card15; //the fill in the blank question
       cardSet1[15][1] ="Urgent"; // one of the choices you are given to use!
       cardSet1[15][2] ="Gradual";  // one of the choices you are given to use!
       cardSet1[15][3]="wrong"; // one of the choices you are given to use!
       cardSet1[15][4] = "1"; // this gives the program the answer to the question based on the postion of the answer in the array!
       
       
   }//end card holder
    
   public static void updateGame()
   {//open uodate game
       undevelopment.IntegrationsUI.displayQ.append(cardSet1[Cardnum][0]); //sets the main text area as the question
       undevelopment.IntegrationsUI.choiceOneBTN.setText(cardSet1[Cardnum][1]); // will load one of the three choices for fill in the blank card game
       undevelopment.IntegrationsUI.choiceTwoBTN.setText(cardSet1[Cardnum][2]);//will load one of the three choices for fill in the blank card game
       undevelopment.IntegrationsUI.choiceThreeBTN.setText(cardSet1[Cardnum][3]); //will load one of the three choices for fill in the blank card game
       undevelopment.IntegrationsUI.scoreCounter.setText(""+score); //adjusts the score due to the users performance in the game
       undevelopment.IntegrationsUI.livesCounter.setText(""+lives); //adjusts the lives of the user due to performance of the user!
   }//end update game
   
   public void endGame()
   {
       if(Cardnum == maxCards)
       {
           JOptionPane.showMessageDialog(null, "Thank you for playing the game!");
            undevelopment.IntegrationsUI.displayQ.setText("Game Over Please return to the check score menu!");
            undevelopment.IntegrationsUI.choiceOneBTN.setText("End Game");
            undevelopment.IntegrationsUI.choiceTwoBTN.setText("End Game");
            undevelopment.IntegrationsUI.choiceThreeBTN.setText("End Game");
       }
   }
   
   
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
        endGame();
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
        endGame();
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
        endGame();
        
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
           undevelopment.IntegrationsUI.displayQ.setText("Game Over! Please return the check score tab to check your score!");
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

   public boolean userExist(int id)
   {
       try(Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/scoreDB", "root", "1234"))
       {
           String query = "SELECT COUNT(*) FROM integrationsScore WHERE ID = ?";
           PreparedStatement pst = conn.prepareStatement(query);
           pst.setInt(1, id);
           
           ResultSet rs = pst.executeQuery();
           
           if(rs.next())
           {
               int count = rs.getInt(1);
               return count > 0;
           }
           
       }
       catch(SQLException ex)
       {
           System.out.println("You have error "+ex);
       }
       return false;
   }
    
   public void askID()
   {
      id = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter Your User ID! Please check the display!"));
      if(userExist(id) == true)
      {
          JOptionPane.showMessageDialog(null, "User Exists! Please Enjoy the Game!");
          undevelopment.IntegrationsUI.gamePane.setVisible(true);
      } else if(userExist(id) == false) {
          JOptionPane.showMessageDialog(null,"user does not exist! Please Try Again!");
          undevelopment.IntegrationsUI.gamePane.setVisible(false);
      } else {
          JOptionPane.showMessageDialog(null, "Only Numbers, No letters!");
          undevelopment.IntegrationsUI.gamePane.setVisible(false);
      }
      
      
   }
   
   
   
   public void trial() //this method is passed into the constructor in order to have the game functionailty to be working
   {
       
       cardHolder();
       updateGame();
      
       
   }
   

}//close public class

   
   
   
   
   
    

