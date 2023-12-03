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
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
    


public class cardGame extends handleInputs {

    public cardGame() {
    }
    
    ArrayList <handleInputs> user = new ArrayList<>();
    
    private double cardNum;
    private double counter;
    private int score=0;
    private String userName1;
    
    
    
    
    choiceCardHolder test = new choiceCardHolder();
   
    
    
    public void addUser()
    {
       user test = new user();
        
        int randomID = (int)(Math.random()*1000+1);
        
        test.setId(randomID);
        test.setUserName(undevelopment.IntegrationsUI.nameField.getText());
        
        user.add(test);
       
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
            f = new File("user.dat");
            fs = new FileOutputStream(f);
            os = new ObjectOutputStream(fs);
            
            os.writeObject(user);
            
            os.close();
            JOptionPane.showMessageDialog(null, "User has been added to the Array!");
            
            
        }//end try
        catch(IOException e)
        {
            System.out.println("Error writing to file: "+e);
        }//end catch
        
        
    }
    
    
    
    
     
      
      public void test()
      {
          test.card1();
          test.choices1();
          test.choices1a();
          test.choices1b();
          
          
          
          if(undevelopment.IntegrationsUI.choiceOneBTN.isSelected())
          {//open if
              JOptionPane.showMessageDialog(null, "You got it right!");
              score ++;
              undevelopment.IntegrationsUI.scoreCounter.setText("1");
          } else if (undevelopment.IntegrationsUI.choiceTwoBTN.isSelected())
          {//open else
              JOptionPane.showMessageDialog(null, "You got it wrong!");
              score --;
              undevelopment.IntegrationsUI.scoreCounter.setText("0");
          }//close else
          else if (undevelopment.IntegrationsUI.choiceTwoBTN.isSelected())
          {
              JOptionPane.showMessageDialog(null, "You got it wrong!");
              score --;
              undevelopment.IntegrationsUI.scoreCounter.setText("0");
          }
          
          
      }
    
    
    
}
