/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package undevelopment;

import java.awt.Color; 
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList; 
import javax.swing.ButtonGroup; 
import javax.swing.JRadioButton;

/**
 *AwarenessGUI.java
 * 15/12/23
 * @author Conor Judge
 */


public class AwarenessGUI extends javax.swing.JFrame {
    
    // ArrayList to store questions
    ArrayList<String> questions = new ArrayList<>();
    
    // ArrayList to store options
    ArrayList<ArrayList<String>> options = new ArrayList<>();
    
    // Arraylist to store user input
    ArrayList <Feedback> awarenessUser;
    
    // Index to keep track of the current question
    int index = 0;
    
    // Counter for correct answers
    int correct = 0;
    
    // user's name
    String name = "";
    
    // ArrayList to store incorrect answers
    ArrayList<String> incorrect = new ArrayList<>(); 
    
    // ButtonGroup to link radio buttons together
    ButtonGroup bg = new ButtonGroup();

    /**
     * Creates new form AwarenessGUI
     */
    
    //
    public AwarenessGUI() {
        initComponents();
        
        awarenessUser = new ArrayList <>();

        
        // Link individual buttons to the ButtonGroup
        bg.add(r1BTN);
        bg.add(r2BTN);
        bg.add(r3BTN);
        bg.add(r4BTN);
        
        // Add questions about climate change to the ArrayList
        questions.add("What is the main greenhouse gas responsible for global warming?"); 
        questions.add("Which human activity contributes the most to deforestation?"); 
        questions.add("What is the primary cause of ocean acidification?"); 
        questions.add("What is the largest source of carbon dioxide emissions?"); 
        questions.add("What is the impact of melting ice caps on sea levels?"); 
        questions.add("What is the main cause of ozone depletion?"); 
        questions.add("What is the primary greenhouse gas emitted by agriculture?"); 
        questions.add("What is the main cause of air pollution in cities?"); 
        questions.add("What is the primary cause of water pollution in rivers and lakes?");
        questions.add("What is the main cause of soil erosion?"); 
        
        // Adding options to the ArrayList
        ArrayList<String> options1 = new ArrayList<>();
        options1.add("Carbon dioxide"); 
        options1.add("Methane"); 
        options1.add("Nitrous oxide"); 
        options1.add("Water vapor");
        options1.add("Carbon dioxide");
        options.add(options1);
        
        ArrayList<String> options2 = new ArrayList<>(); 
        options2.add("Agriculture"); 
        options2.add("Mining"); 
        options2.add("Urbanization"); 
        options2.add("Logging");
        options2.add("Logging"); 
        options.add(options2); 

        ArrayList<String> options3 = new ArrayList<>();
        options3.add("Burning fossil fuels"); 
        options3.add("Industrial pollution");
        options3.add("Deforestation"); 
        options3.add("Ocean pollution"); 
        options3.add("Burning fossil fuels"); 
        options.add(options3); 

        ArrayList<String> options4 = new ArrayList<>();
        options4.add("Transportation"); 
        options4.add("Power generation"); 
        options4.add("Agriculture");
        options4.add("Industrial processes");
        options4.add("Power generation"); 
        options.add(options4);

        ArrayList<String> options5 = new ArrayList<>(); 
        options5.add("Rising sea levels"); 
        options5.add("Increased rainfall"); 
        options5.add("Decreased ocean salinity"); 
        options5.add("Stronger hurricanes"); 
        options5.add("Rising sea levels"); 
        options.add(options5); 

        ArrayList<String> options6 = new ArrayList<>(); 
        options6.add("Chlorofluorocarbons (CFCs)"); 
        options6.add("Carbon monoxide"); 
        options6.add("Sulfur dioxide"); 
        options6.add("Methane"); 
        options6.add("Chlorofluorocarbons (CFCs)"); 
        options.add(options6); 

        ArrayList<String> options7 = new ArrayList<>(); 
        options7.add("Carbon dioxide");
        options7.add("Methane"); 
        options7.add("Nitrous oxide"); 
        options7.add("Carbon monoxide"); 
        options7.add("Carbon dioxide"); 
        options.add(options7); 

        ArrayList<String> options8 = new ArrayList<>(); 
        options8.add("Global warming"); 
        options8.add("Climate change"); 
        options8.add("Greenhouse effect"); 
        options8.add("Ozone depletion"); 
        options8.add("Global warming"); 
        options.add(options8); 

        ArrayList<String> options9 = new ArrayList<>(); 
        options9.add("Recycling"); 
        options9.add("Composting"); 
        options9.add("Incineration"); 
        options9.add("Landfill"); 
        options9.add("Recycling"); 
        options.add(options9); 

        ArrayList<String> options10 = new ArrayList<>(); 
        options10.add("China"); 
        options10.add("United States"); 
        options10.add("India"); 
        options10.add("Russia"); 
        options10.add("China");
        options.add(options10); 
        
        
        // Ask for user's name at the beginning of the quiz
        name = javax.swing.JOptionPane.showInputDialog(this, "Enter your name:");
        if(name != null && !name.isEmpty()){
            System.out.println("User's name: " + name); // Print the user's name
        }
        
        nextBTNActionPerformed(null);
    }

    // Method to get the selected option from the radio button
    public void getSelectedOption(JRadioButton rbtn)
    {
        System.out.println(rbtn.getText()); // Print the selected option
        System.out.println(options.get(index).get(4)); // Print the correct answer for the current question
        if(rbtn.getText().equals(options.get(index).get(4)))
        {
            correct++; // Increment the correct answer counter if the selected option is correct
        }
        index++; // Increment the index to move to the next question
        enableRBTNs(false); // Disable the radio buttons
    }

    
    // Method to enable/disable radio buttons
    public void enableRBTNs(boolean enableDisable)
    {
        r1BTN.setEnabled(enableDisable); // Enable/disable r1BTN
        r2BTN.setEnabled(enableDisable); // Enable/disable r2BTN
        r3BTN.setEnabled(enableDisable); // Enable/disable r3BTN
        r4BTN.setEnabled(enableDisable); // Enable/disable r4BTN
    }


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        tabAdaptability = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        titleLBL1 = new javax.swing.JLabel();
        qPNL = new javax.swing.JPanel();
        qLBL = new javax.swing.JLabel();
        r1BTN = new javax.swing.JRadioButton();
        r2BTN = new javax.swing.JRadioButton();
        r3BTN = new javax.swing.JRadioButton();
        r4BTN = new javax.swing.JRadioButton();
        nextBTN = new javax.swing.JButton();
        exitBTN2 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        feedbackLBL = new javax.swing.JLabel();
        titleLBL2 = new javax.swing.JLabel();
        dspBtn = new javax.swing.JButton();
        addBtn = new javax.swing.JButton();
        saveBTN = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        displayTA = new javax.swing.JTextArea();
        exitBTN3 = new javax.swing.JButton();
        retrieveBTN = new javax.swing.JButton();
        feedbackTF = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(800, 600));

        jPanel2.setBackground(new java.awt.Color(100, 150, 200));

        titleLBL1.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        titleLBL1.setForeground(new java.awt.Color(255, 255, 255));
        titleLBL1.setText("Awareness");

        qPNL.setBackground(new java.awt.Color(100, 150, 200));

        qLBL.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        qLBL.setForeground(new java.awt.Color(255, 255, 255));
        qLBL.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout qPNLLayout = new javax.swing.GroupLayout(qPNL);
        qPNL.setLayout(qPNLLayout);
        qPNLLayout.setHorizontalGroup(
            qPNLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, qPNLLayout.createSequentialGroup()
                .addContainerGap(34, Short.MAX_VALUE)
                .addComponent(qLBL, javax.swing.GroupLayout.PREFERRED_SIZE, 432, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28))
        );
        qPNLLayout.setVerticalGroup(
            qPNLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(qPNLLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(qLBL, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        r1BTN.setForeground(new java.awt.Color(255, 255, 255));
        r1BTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r1BTNActionPerformed(evt);
            }
        });

        r2BTN.setForeground(new java.awt.Color(255, 255, 255));
        r2BTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r2BTNActionPerformed(evt);
            }
        });

        r3BTN.setForeground(new java.awt.Color(255, 255, 255));
        r3BTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r3BTNActionPerformed(evt);
            }
        });

        r4BTN.setForeground(new java.awt.Color(255, 255, 255));
        r4BTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r4BTNActionPerformed(evt);
            }
        });

        nextBTN.setText("Next");
        nextBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextBTNActionPerformed(evt);
            }
        });

        exitBTN2.setText("Exit");
        exitBTN2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitBTN2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(r1BTN, javax.swing.GroupLayout.PREFERRED_SIZE, 494, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(298, 298, 298)
                                .addComponent(titleLBL1))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(163, 163, 163)
                                .addComponent(qPNL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addComponent(r2BTN, javax.swing.GroupLayout.PREFERRED_SIZE, 494, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(r3BTN, javax.swing.GroupLayout.PREFERRED_SIZE, 494, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(r4BTN, javax.swing.GroupLayout.PREFERRED_SIZE, 494, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(285, 285, 285)
                        .addComponent(nextBTN)
                        .addGap(82, 82, 82)
                        .addComponent(exitBTN2)))
                .addContainerGap(154, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(titleLBL1)
                .addGap(53, 53, 53)
                .addComponent(qPNL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(62, 62, 62)
                .addComponent(r1BTN)
                .addGap(28, 28, 28)
                .addComponent(r2BTN)
                .addGap(26, 26, 26)
                .addComponent(r3BTN)
                .addGap(26, 26, 26)
                .addComponent(r4BTN)
                .addGap(81, 81, 81)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nextBTN)
                    .addComponent(exitBTN2))
                .addContainerGap(116, Short.MAX_VALUE))
        );

        tabAdaptability.addTab("Game", jPanel2);

        jPanel4.setBackground(new java.awt.Color(100, 150, 200));

        feedbackLBL.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        feedbackLBL.setForeground(new java.awt.Color(255, 255, 255));
        feedbackLBL.setText("Feedback");

        titleLBL2.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        titleLBL2.setForeground(new java.awt.Color(255, 255, 255));
        titleLBL2.setText("Awareness");

        dspBtn.setText("Display");
        dspBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dspBtnActionPerformed(evt);
            }
        });

        addBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sampleoflayout/img/icon.png"))); // NOI18N
        addBtn.setText("Add");
        addBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBtnActionPerformed(evt);
            }
        });

        saveBTN.setText("Save");
        saveBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveBTNActionPerformed(evt);
            }
        });

        displayTA.setColumns(20);
        displayTA.setRows(5);
        jScrollPane1.setViewportView(displayTA);

        exitBTN3.setText("Exit");
        exitBTN3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitBTN3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(298, 298, 298)
                        .addComponent(titleLBL2))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(213, 213, 213)
                        .addComponent(addBtn)
                        .addGap(28, 28, 28)
                        .addComponent(dspBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(saveBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(340, 340, 340)
                        .addComponent(feedbackLBL))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(166, 166, 166)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 480, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(165, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(exitBTN3)
                .addGap(368, 368, 368))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(titleLBL2)
                .addGap(35, 35, 35)
                .addComponent(feedbackLBL)
                .addGap(215, 215, 215)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dspBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addBtn)
                    .addComponent(saveBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(exitBTN3)
                .addContainerGap(78, Short.MAX_VALUE))
        );

        retrieveBTN.setText("Retrieve");
        retrieveBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                retrieveBTNActionPerformed(evt);
            }
        });

        feedbackTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                feedbackTFActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(168, 168, 168)
                .addComponent(feedbackTF, javax.swing.GroupLayout.PREFERRED_SIZE, 480, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(163, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(retrieveBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(186, 186, 186))
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(109, 109, 109)
                .addComponent(feedbackTF, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(retrieveBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(320, Short.MAX_VALUE))
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tabAdaptability.addTab("Feedback", jPanel3);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tabAdaptability)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tabAdaptability)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nextBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextBTNActionPerformed
        
        //display the next question
        if(nextBTN.getText().equals("Restart The Quiz"))
        {
            nextBTN.setText("Next"); // Change the button text to "Next"
            qPNL.setBackground(new java.awt.Color(204, 204, 204)); // Reset the background color of the container
            index = 0; // Reset the index to 0
            correct = 0; // Reset the correct answer counter to 0

        }
        
        if(index == questions.size())
        {
            String result = name + "'s Score: " + correct + " / " + questions.size();
            if(correct >= (float) questions.size()/2)
            {
               qPNL.setBackground(Color.green); // Set the background color to green if the score is above or equal to 50%
            }
            else{
                qPNL.setBackground(Color.red); // Set the background color to red if the score is below 50%
            }
            
            // Display incorrect answers
            if (!incorrect.isEmpty()) {
                result += "\nIncorrect Answers:"; // Add a header for incorrect answers
                for (String answer : incorrect) {
                    result += "\n- " + answer; // Add each incorrect answer to the result string
                }
            }
            
            qLBL.setText(result); // Display the user's score and incorrect answers
            nextBTN.setText("Restart The Quiz"); // Change the button text to "Restart The Quiz"
        }
        else{
            enableRBTNs(true); // Enable the radio buttons

            qLBL.setText(questions.get(index)); // Display the next question
            // Set the text for radio buttons
            r1BTN.setText(options.get(index).get(0)); 
            r2BTN.setText(options.get(index).get(1)); 
            r3BTN.setText(options.get(index).get(2)); 
            r4BTN.setText(options.get(index).get(3));
             
            if(index == questions.size()-1){
                nextBTN.setText("Finish"); // Change the button text if it's the last question
            }
        }
        
        bg.clearSelection(); // Clear the ButtonGroup selection       
    }//GEN-LAST:event_nextBTNActionPerformed

    private void r1BTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r1BTNActionPerformed
        // Call the getSelectedOption method with r1BTN as the argument
        getSelectedOption(r1BTN); 
    }//GEN-LAST:event_r1BTNActionPerformed

    private void r2BTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r2BTNActionPerformed
        getSelectedOption(r2BTN);
    }//GEN-LAST:event_r2BTNActionPerformed

    private void r3BTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r3BTNActionPerformed
        getSelectedOption(r3BTN);
    }//GEN-LAST:event_r3BTNActionPerformed

    private void r4BTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r4BTNActionPerformed
        getSelectedOption(r4BTN);   
    }//GEN-LAST:event_r4BTNActionPerformed

    private void exitBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitBTNActionPerformed
        //exits the program
        System.exit(0);
    }//GEN-LAST:event_exitBTNActionPerformed

    private void dspBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dspBtnActionPerformed
        // TODO add your handling code here:
           for(int i = 0; i < awarenessUser.size(); i++){
           Feedback fb = awarenessUser.get(i);
           displayTA.append(fb.toString());
        }
    }//GEN-LAST:event_dspBtnActionPerformed

    private void addBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBtnActionPerformed
        // TODO add your handling code here:
        Feedback fb;
        String input = feedbackTF.getText();
        
        fb = new Feedback(input);
        
        awarenessUser.add(fb);
    }//GEN-LAST:event_addBtnActionPerformed

    private void saveBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveBTNActionPerformed
        // TODO add your handling code here:
                File f;
        FileOutputStream fStream;
        ObjectOutputStream oStream;
        
        try{
            f = new File("output.dat");
            fStream = new FileOutputStream(f);
            oStream = new ObjectOutputStream(fStream);
            
            oStream.writeObject(awarenessUser);
            oStream.close();
        }
        catch(IOException e){
            System.out.println(e);
        }
    }//GEN-LAST:event_saveBTNActionPerformed

    private void retrieveBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_retrieveBTNActionPerformed
        // TODO add your handling code here:
        File f;
        FileInputStream fStream;
        ObjectInputStream oStream;
        
        try{
            f = new File("output.dat");
            fStream = new FileInputStream(f);
            oStream = new ObjectInputStream(fStream);
            
            awarenessUser = (ArrayList<Feedback>)oStream.readObject();
            oStream.close();
        }
        catch(IOException|ClassNotFoundException e){
            System.out.println(e);
        }
    }//GEN-LAST:event_retrieveBTNActionPerformed

    private void feedbackTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_feedbackTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_feedbackTFActionPerformed

    private void exitBTN2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitBTN2ActionPerformed
        // TODO add your handling code here:
            System.exit(0);
    }//GEN-LAST:event_exitBTN2ActionPerformed

    private void exitBTN3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitBTN3ActionPerformed
        // TODO add your handling code here:
         System.exit(0);

    }//GEN-LAST:event_exitBTN3ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(AwarenessGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AwarenessGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AwarenessGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AwarenessGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AwarenessGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addBtn;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JTextArea displayTA;
    private javax.swing.JButton dspBtn;
    private javax.swing.JButton exitBTN2;
    private javax.swing.JButton exitBTN3;
    private javax.swing.JLabel feedbackLBL;
    private javax.swing.JTextField feedbackTF;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton nextBTN;
    private javax.swing.JLabel qLBL;
    private javax.swing.JPanel qPNL;
    private javax.swing.JRadioButton r1BTN;
    private javax.swing.JRadioButton r2BTN;
    private javax.swing.JRadioButton r3BTN;
    private javax.swing.JRadioButton r4BTN;
    private javax.swing.JButton retrieveBTN;
    private javax.swing.JButton saveBTN;
    private javax.swing.JTabbedPane tabAdaptability;
    private javax.swing.JLabel titleLBL1;
    private javax.swing.JLabel titleLBL2;
    // End of variables declaration//GEN-END:variables
}
