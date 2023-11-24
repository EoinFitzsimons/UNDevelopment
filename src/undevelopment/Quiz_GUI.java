/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package undevelopment;

/**
 *
 * @author Aepel
 */

import javax.swing.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Quiz_GUI extends JFrame {

    private JLabel userNameL = new JLabel("UserName: ");
    private JTextField userNameT = new JTextField(50);

    
    private JButton facts = new JButton("Facts");
    private JButton specialIssues = new JButton("Special Issues");
    private JButton quiz = new JButton("Take A Quiz");
    
    private JLabel countriesL = new JLabel("Country");
    String[] sids = {"Barbados","Cape Verde","Fiji","Grenada", "Jamaica","Maldives","Mauritius","Saint Lucia","Solomon Islands","Seychelles"};
    private JComboBox<String>  countriesCB = new JComboBox<>(sids); 
    
    
    FactsAboutSids[] allFacts = new FactsAboutSids[40];
    SIDS[] allSids = new SIDS[10];
    
    
    public Quiz_GUI()
    {
        
        setTitle("SIDS Knowledge Area");
        
        setSize(400,400);
        
        
        setLayout(new BoxLayout(getContentPane(),BoxLayout.Y_AXIS));
        
        add(userNameL);
        add(userNameT);
        
        add(countriesL);
        add(countriesCB);
        
        createSIDS();
        createFacts();
        
        
        add(facts);
        facts.addActionListener(new ActionListener() 
        {
            public void actionPerformed(ActionEvent e)
            {
                String sidSelected = (String)countriesCB.getSelectedItem();
                
                Facts fact1 = new Facts(sidSelected,allFacts);
            }
        });
        
        
        add(specialIssues);
        specialIssues.addActionListener(new ActionListener() 
        {
            public void actionPerformed(ActionEvent e)
            {
                specialIssues sp1 = new specialIssues();
            }
        });
        
        
        add(quiz);
        quiz.addActionListener(new ActionListener() 
        {
            public void actionPerformed(ActionEvent e)
            {
                quiz q1 = new quiz();
            }
        });
        
        
        
        setVisible(true);
    }
    
    
    
    public void createSIDS()
    {
        allSids[0] = new SIDS("Barbados",39.4,287000,430);
        allSids[1] = new SIDS("Cape Verde",25.8,556000,4033);
        allSids[2] = new SIDS("Fiji",29.3,896000,18274);
        allSids[3] = new SIDS("Grenada",31.7,113000,344);
        allSids[4] = new SIDS("Jamacia",27.3,2800000,10991);
        allSids[5] = new SIDS("Maldives",28.2,521000,298);
        allSids[6] = new SIDS("Mauritius",35.4,1300000,2040);
        allSids[7] = new SIDS("Saint Lucia",34.6,183000,616);
        allSids[8] = new SIDS("Solomen Islands",23.9,721000,28896);
        allSids[9] = new SIDS("Seychelles",34.3,98000,459);                                                                        
    }
    






    
    public void createFacts()
    {
       
        allFacts[0] = new FactsAboutSids(allSids[0].getName(),"Barbados has a tropical climate with relatively constant temperatures throughout the year");
        allFacts[1] = new FactsAboutSids(allSids[0].getName(),"The island is outside the hurricane belt, making it less prone to direct hits by hurricanes");
        allFacts[2] = new FactsAboutSids(allSids[0].getName(),"The dry season typically runs from December to May, with less rainfall and lower humidity");
        allFacts[3] = new FactsAboutSids(allSids[0].getName(),"The wet season, from June to November, sees an increase in rainfall and the occasional tropical storm");
        allFacts[4] = new FactsAboutSids(allSids[0].getName(),"Trade winds from the northeast help keep the climate pleasant, providing a cool breeze");
        allFacts[5] = new FactsAboutSids(allSids[0].getName(),"The average temperature hovers around 26-30°C (79-86°F) year-round");
        allFacts[6] = new FactsAboutSids(allSids[0].getName(),"Barbados is known for its white sandy beaches and clear blue waters, thanks to its sunny climate");
        
        allFacts[7] = new FactsAboutSids(allSids[1].getName(),"Cape Verde experiences a tropical dry climate with a distinct wet and dry season");
        allFacts[8] = new FactsAboutSids(allSids[1].getName(),"The wet season typically occurs between August and October, bringing most of the annual rainfall");
        allFacts[9] = new FactsAboutSids(allSids[1].getName(),"The Harmattan winds from the Sahara can influence the climate, bringing hot and dusty conditions");
        allFacts[10] = new FactsAboutSids(allSids[1].getName(),"Temperatures in Cape Verde range from 23-30°C (73-86°F), making it a warm destination");
        allFacts[11] = new FactsAboutSids(allSids[1].getName(),"The islands are vulnerable to droughts, and water scarcity can be a challenge during dry periods");
        allFacts[12] = new FactsAboutSids(allSids[1].getName(),"The trade winds contribute to the cooling of the islands, especially during the dry season");
        allFacts[13] = new FactsAboutSids(allSids[1].getName(),"Cape Verde's climate has a significant impact on its agriculture and water resource management");
        
        allFacts[14] = new FactsAboutSids(allSids[2].getName(),"Fiji has a tropical marine climate with warm temperatures and high humidity");
        allFacts[15] = new FactsAboutSids(allSids[2].getName(),"The wet season, from November to April, brings heavy rainfall and the risk of tropical cyclones");
        allFacts[16] = new FactsAboutSids(allSids[2].getName(),"The dry season, from May to October, offers milder temperatures and lower humidity");
        allFacts[17] = new FactsAboutSids(allSids[2].getName(),"Average temperatures range from 22-31°C (72-88°F), providing a comfortable climate for visitors");
        allFacts[18] = new FactsAboutSids(allSids[2].getName(),"The trade winds play a role in the climate, creating pleasant breezes on the islands");
        allFacts[19] = new FactsAboutSids(allSids[2].getName(),"Fiji's diverse geography, including mountains and coastal areas, contributes to varied microclimates");
        allFacts[20] = new FactsAboutSids(allSids[2].getName(),"Coral reefs and marine life thrive in Fiji's warm and nutrient-rich waters");
      
         allFacts[21] = new FactsAboutSids(allSids[3].getName(),"Grenada enjoys a tropical climate, with a distinct wet season from June to December.");
         allFacts[22] = new FactsAboutSids(allSids[3].getName(),"The dry season, from January to May, features less rainfall and cooler temperatures.");
         allFacts[23] = new FactsAboutSids(allSids[3].getName(),"The island's climate is influenced by the trade winds, providing a refreshing breeze.");
         allFacts[24] = new FactsAboutSids(allSids[3].getName(),"Grenada is known as the 'Island of Spice' due to its production of nutmeg and other spices.");
         allFacts[25] = new FactsAboutSids(allSids[3].getName(),"Hurricanes occasionally affect the region during the wet season, but Grenada is south of the main hurricane belt.");
         allFacts[26] = new FactsAboutSids(allSids[3].getName(),"Average temperatures range from 24-30°C (75-86°F), creating a warm and inviting atmosphere.");
         allFacts[27] = new FactsAboutSids(allSids[3].getName(),"The lush rainforests and mountainous terrain contribute to Grenada's unique microclimates.");
        
         allFacts[28] = new FactsAboutSids(allSids[4].getName(), "Jamaica has a tropical climate with warm temperatures year-round");

         allFacts[29] = new FactsAboutSids(allSids[4].getName(), "The island experiences a wet season from May to October, with higher rainfall and occasional hurricanes.");
         allFacts[30] = new FactsAboutSids(allSids[4].getName(), "The dry season, from November to April, brings less rainfall and cooler temperatures.");
         allFacts[31] = new FactsAboutSids(allSids[4].getName(), "Jamaica's Blue Mountains influence local climates, providing cooler conditions in higher elevations.");
         allFacts[32] = new FactsAboutSids(allSids[4].getName(),  "The trade winds contribute to the island's pleasant weather, especially along the coast.");
         allFacts[33] = new FactsAboutSids(allSids[4].getName(),  "Average temperatures range from 23-32°C (73-90°F), making it an ideal destination for sun-seekers.");
         allFacts[33] = new FactsAboutSids(allSids[4].getName(),  "Jamaica's diverse ecosystems include beaches, mountains, and rainforests, each with its unique climate.");


         allFacts[34] = new FactsAboutSids(allSids[4].getName(),  "The Maldives has a tropical monsoon climate with two distinct seasons: wet and dry.");
         allFacts[35] = new FactsAboutSids(allSids[4].getName(),   "The wet southwest monsoon season occurs from April to October, bringing higher rainfall.");
         allFacts[36] = new FactsAboutSids(allSids[4].getName(),  "The dry northeast monsoon season, from November to March, has less rainfall and lower humidity.");
         allFacts[37] = new FactsAboutSids(allSids[4].getName(),  "Average temperatures range from 25-31°C (77-88°F), creating a warm and humid environment.");
         allFacts[38] = new FactsAboutSids(allSids[4].getName(),   "The Maldives is vulnerable to sea-level rise and climate change, with concerns about the impact on its low-lying islands.");
         allFacts[39] = new FactsAboutSids(allSids[4].getName(),   "Coral reefs in the Maldives are sensitive to temperature changes, making them susceptible to coral bleaching.");
         allFacts[39] = new FactsAboutSids(allSids[4].getName(),    "The crystal-clear waters and vibrant marine life attract tourists seeking a tropical paradise.");

    }
    

    

    
    
    public static void main(String[] args) {
        Quiz_GUI qg = new Quiz_GUI();
    }
    
}
