/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package undevelopment;

/**
 *
 * @author Aepel
 */

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class specialIssues extends JFrame {
    
 JLabel specialIssues = new JLabel("THIS IS THE Special Issues PAGE");
    
JButton mainMenu = new JButton("Main Menu");

    public specialIssues() {
   
        setTitle("SIDs Special Issues");
        setSize(200,200);
        
        setLayout(new BoxLayout(getContentPane(),BoxLayout.Y_AXIS));
        
        add(specialIssues);
        
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

