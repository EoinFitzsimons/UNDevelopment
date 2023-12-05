/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package undevelopment.IntegrationsFolder;

/**
 *
 * @author dmoc2
 */
public class choiceCardHolder {
    
   private String[][] cardSet1 = new String[16][6];
    
   public void cardHolder()
   {
       cardSet1[0][0] = "______ climate change measures into national policies, strategies, and planning";
       cardSet1[0][1] ="Embrace"; cardSet1[0][2] ="Implement";  cardSet1[0][3] ="Embed";
       cardSet1[0][4] = "2";
   }
    
   public void updateGame()
   {
       undevelopment.IntegrationsUI.cardHolderImg.setText(cardSet1[0][0]);
       undevelopment.IntegrationsUI.choiceOneBTN.setText(cardSet1[0][1]);
       undevelopment.IntegrationsUI.choiceTwoBTN.setText(cardSet1[0][2]);
       undevelopment.IntegrationsUI.choiceThreeBTN.setText(cardSet1[0][3]);
   }
    
    
}
