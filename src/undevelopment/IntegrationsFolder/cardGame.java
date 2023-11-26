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
    
    private double cardNum;
    private double counter;
    private int score=0;
    
    private String user;
    
    choiceCardHolder test = new choiceCardHolder();
   
      @Override
      public void enterName()
      {
           super.enterName();
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
