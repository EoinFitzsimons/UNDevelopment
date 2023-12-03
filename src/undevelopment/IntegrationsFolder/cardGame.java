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
    
    ArrayList <user> userList = new ArrayList<>();
    
    private double cardNum;
    private double counter;
   
    private String userName1;
    private int realScore = 0;
    private String score = realScore+"";
    user newUser = new user();
    
    
    choiceCardHolder test = new choiceCardHolder();
   
    
    
    public void addUser()
    {
      
        
        int randomID = (int)(Math.random()*1000+1);
        
       
       String name = undevelopment.IntegrationsUI.nameField.getText();
        
        newUser.setId(randomID);
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
    
    
     
      
      public void test()
      {
          
          test.choices1();
          test.choices1a();
          test.choices1b();
          
          
          
          if(undevelopment.IntegrationsUI.choiceOneBTN.isSelected())
          {//open if
              JOptionPane.showMessageDialog(null, "You got it right!");
             // score ++;
              undevelopment.IntegrationsUI.scoreCounter.setText("1");
          } else if (undevelopment.IntegrationsUI.choiceTwoBTN.isSelected())
          {//open else
              JOptionPane.showMessageDialog(null, "You got it wrong!");
             // score --;
              undevelopment.IntegrationsUI.scoreCounter.setText("0");
          }//close else
          else if (undevelopment.IntegrationsUI.choiceTwoBTN.isSelected())
          {
              JOptionPane.showMessageDialog(null, "You got it wrong!");
           //   score --;
              undevelopment.IntegrationsUI.scoreCounter.setText("0");
          }
          
          
      }
    
    
    
}
