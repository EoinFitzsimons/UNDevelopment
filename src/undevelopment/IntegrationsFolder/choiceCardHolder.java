/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package undevelopment.IntegrationsFolder;

import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

/**
 *
 * @author dmoc2
 */
public class choiceCardHolder {
    
   private String[][] cardSet1 = new String[16][6];
   private int score=0;
   private int Cardnum=0;
   private int lives=5;
   private String fakeScore = score+""; 
   
   
  
   

    public choiceCardHolder() {
        trial();
    }
   
   
   
    
   public void cardHolder()
   {
       cardSet1[0][0] = "______ climate change measures into national policies, strategies, and planning";
       cardSet1[0][1] ="Embrace"; cardSet1[0][2] ="Implement";  cardSet1[0][3] ="Embed";
       cardSet1[0][4] = "2";
       
       
        cardSet1[1][0] = "______ sustainable practices to address climate change  in national policies, strategies, and planning";
       cardSet1[1][1] ="Advocate"; cardSet1[1][2] ="Monitor";  cardSet1[1][3] ="Incorpate";
       cardSet1[1][4] = "3";
       
   }
    
   public void updateGame()
   {
       undevelopment.IntegrationsUI.cardHolderImg.setText(cardSet1[Cardnum][0]);
       undevelopment.IntegrationsUI.choiceOneBTN.setText(cardSet1[Cardnum][1]);
       undevelopment.IntegrationsUI.choiceTwoBTN.setText(cardSet1[Cardnum][2]);
       undevelopment.IntegrationsUI.choiceThreeBTN.setText(cardSet1[Cardnum][3]);
   }
    
   public void btn1()
   {
        if(cardSet1[Cardnum][4] == "1")
       {
           score++;
           undevelopment.IntegrationsUI.scoreCounter.setText(fakeScore);
              
       } 
        Cardnum++;
           updateGame();
        
        
   }//close button 1
   
   public void btn2()
   {
        if(cardSet1[Cardnum][4] == "2")
       {
           score++;
             undevelopment.IntegrationsUI.scoreCounter.setText(fakeScore);
       } 
        
        Cardnum++;
        updateGame();
        
   }//close btn2
   
   
   public void btn3()
   {
        if(cardSet1[Cardnum][4]== "3")
       {
           score++;
          undevelopment.IntegrationsUI.scoreCounter.setText(fakeScore);
           
       }
         Cardnum++;
        updateGame();
        
        
   }//close button3
   
   
   public void trial()
   {
       cardHolder();
       updateGame();
   }
   

}//close public class

   
   
   
   
   
    

