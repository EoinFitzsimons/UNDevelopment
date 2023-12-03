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


import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class quiz extends JFrame{
  
    JButton mainMenu = new JButton("Main Menu");
    JButton submitAnswers = new JButton("Submit Answers");
    
       
    String SIDS_Name;
    String question;
    quizQuestion[] allQuestions;
    
    boolean[] questionAnswers = new boolean[4];
    boolean[] userAnswers = new boolean[4];
 
    
    public quiz(String sidSelected,quizQuestion[] allQuestions) {
        
        setTitle(sidSelected + " SIDs Quiz");
        setSize(200,200);
        
        
        this.SIDS_Name = sidSelected;
        this.allQuestions = allQuestions;
        
        setLayout(new BoxLayout(getContentPane(),BoxLayout.Y_AXIS));
        
        JTextField [] allTextFields = new JTextField [10];
        
        for(int i=0; i<5; i++)
        {
            JTextField questionTextField = new JTextField();
            JLabel label = new JLabel("Question Number: "+(i+1));
            JLabel blankLabel = new JLabel("");
            
            JRadioButton trueButton = new JRadioButton("True");
            JRadioButton falseButton = new JRadioButton("False");     
            
            ButtonGroup  answerButtonGroup = new ButtonGroup();
            answerButtonGroup.add(trueButton);
            answerButtonGroup.add(falseButton);
            
            int position = i;
            
            trueButton.addActionListener(new ActionListener()
            {
                @Override
                public void actionPerformed(ActionEvent e)
                {
                    handleRadioButtonSelection(position, true);
                }
            });
            
            falseButton.addActionListener(new ActionListener()
            {
                @Override
                public void actionPerformed(ActionEvent e)
                {
                    handleRadioButtonSelection(position, false);
                }
            });
            
            
            add(label);
            add(questionTextField); 
            add(trueButton);
            add(falseButton);
            
            allTextFields[i] = questionTextField;
            
            
            
        }
        
        

        
        
        int counter = 0;
           
        for(int a=0; a<allQuestions.length; a++)
        {           
            if(SIDS_Name == allQuestions[a].getSIDSCountry())
            {
               
                String question = allQuestions[a].getQuestion();
                allTextFields[counter].setText(question);
                
                questionAnswers[counter] = allQuestions[a].isAnswer();
                
                counter = counter + 1;                    
            }
                      
        }
        
        
        
        
        add(mainMenu);
        mainMenu.addActionListener(new ActionListener() 
        {
            public void actionPerformed(ActionEvent e)
            {
                Quizgui qg = new Quizgui();
            }
             
        });
        
        add(submitAnswers);
        submitAnswers.addActionListener(new ActionListener() 
        {
            public void actionPerformed(ActionEvent e)
            {
                int correctAnswers = 0;
                             
                for(int a=0;a<questionAnswers.length;a++)
                {
                    if(questionAnswers[a] == userAnswers[a])
                    {
                        correctAnswers = correctAnswers+1;
                    }                    
                }
                
                JOptionPane.showMessageDialog(null, "You Have Answered " + correctAnswers + " Questions Correctly");
            }
             
        });
        
         setVisible(true);
    }
    
    
        public void handleRadioButtonSelection(int pos, boolean Selection)
        {
            //System.out.println("++++++++");
            //userAnswers[pos] = Selection;
        }
   
     
        
        
   
        
}
