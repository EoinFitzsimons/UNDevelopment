/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package undevelopment;

import javax.swing.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


/**
 *
 * @author Aepel
 */
public class quiz extends JFrame {

     JLabel quizLabel = new JLabel("THIS IS THE Quiz PAGE");
    
    JButton mainMenu = new JButton("Main Menu");
    
    
    public quiz() {
        
        setTitle("SIDs Quiz");
        setSize(200,200);
        
        setLayout(new BoxLayout(getContentPane(),BoxLayout.Y_AXIS));
        
        add(quizLabel);
        
        add(mainMenu);
        mainMenu.addActionListener(new ActionListener() 
        {
            public void actionPerformed(ActionEvent e)
            {
                Quizgui qg = new Quizgui();
            }
             
        });
         setVisible(true);
    }
    
    
    
   
     
        
        
   
        
}
