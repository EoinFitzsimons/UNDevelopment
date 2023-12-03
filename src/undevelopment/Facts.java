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

public class Facts extends JFrame{

    
    String SIDS_Name;
    String factDetail;
    FactsAboutSids[] allFacts;
    
    
    JButton mainMenu = new JButton("Main Menu");
    
    
    
    
    
    
    public Facts(String SIDS_Name, FactsAboutSids[] allFacts) {
        
        this.SIDS_Name = SIDS_Name;
        this.allFacts = allFacts;
        
        JTextField [] allTextFields = new JTextField [10];
        
        setTitle(SIDS_Name+" SIDs Facts");
        setSize(200,200);
        
        setLayout(new BoxLayout(getContentPane(),BoxLayout.Y_AXIS));
        
        
        for(int i=0; i<10; i++)
        {
            JTextField textField = new JTextField();
            JLabel label = new JLabel("Fact Number: "+(i+1));
            add(label);
            add(textField);  
            
            allTextFields[i] = textField;
        }
        
        
        int counter = 0;
           
        for(int a=0; a<allFacts.length; a++)
        {           
            if(SIDS_Name == allFacts[a].getSidscountry())
            {
                factDetail = allFacts[a].getSidsfact();
                allTextFields[counter].setText(factDetail);
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
        
        
        
        setVisible(true);
        
    }

    public String getSIDS_Name() {
        return SIDS_Name;
    }

    public void setSIDS_Name(String SIDS_Name) {
        this.SIDS_Name = SIDS_Name;
    }

    public String getFactDetail() {
        return factDetail;
    }

    public void setFactDetail(String factDetail) {
        this.factDetail = factDetail;
    }

    public FactsAboutSids[] getAllFacts() {
        return allFacts;
    }

    public void setAllFacts(FactsAboutSids[] allFacts) {
        this.allFacts = allFacts;
    }
}
