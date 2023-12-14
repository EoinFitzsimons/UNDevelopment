/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package undevelopment;
import javax.swing.JOptionPane;
import undevelopment.IntegrationsFolder.cardGame;
import undevelopment.IntegrationsFolder.choiceCardHolder;
/**
 *
 * @author dmoc2
 */
public class IntegrationsUI extends javax.swing.JFrame {

    /**
     * Creates new form IntegrationsUI
     */
    public IntegrationsUI() {
        initComponents();
       gamePane.setVisible(false);
       startBTN.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
//            public static JTextArea cardHolderImg = new JTextArea();
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        integrateTabbedPane = new javax.swing.JTabbedPane();
        scorePanel = new javax.swing.JPanel();
        nameLabel = new javax.swing.JLabel();
        nameField = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        displayScoreArea = new javax.swing.JTextArea();
        searchLabel = new javax.swing.JLabel();
        searchField = new javax.swing.JTextField();
        addBTN = new javax.swing.JButton();
        deleteBTN = new javax.swing.JButton();
        searchBTN = new javax.swing.JButton();
        refereshBTN = new javax.swing.JButton();
        displayBTN = new javax.swing.JButton();
        startBTN = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        backgroundGame = new javax.swing.JLayeredPane();
        gamePane = new javax.swing.JPanel();
        cardHolderImg = new javax.swing.JTextArea();
        livesCounter = new javax.swing.JLabel();
        choiceOneBTN = new javax.swing.JButton();
        choiceTwoBTN = new javax.swing.JButton();
        choiceThreeBTN = new javax.swing.JButton();
        scoreCounter = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        integrateTabbedPane.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                integrateTabbedPaneMouseClicked(evt);
            }
        });

        scorePanel.setBackground(new java.awt.Color(204, 204, 0));
        scorePanel.setLayout(null);

        nameLabel.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        nameLabel.setForeground(new java.awt.Color(255, 255, 255));
        nameLabel.setText("Name:");
        scorePanel.add(nameLabel);
        nameLabel.setBounds(30, 60, 98, 49);

        nameField.setToolTipText("Please enter a name ");
        nameField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                nameFieldKeyTyped(evt);
            }
        });
        scorePanel.add(nameField);
        nameField.setBounds(146, 57, 200, 49);

        displayScoreArea.setEditable(false);
        displayScoreArea.setColumns(20);
        displayScoreArea.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        displayScoreArea.setRows(5);
        displayScoreArea.setText("ID: \t Name: \t Score:\n");
        displayScoreArea.setToolTipText("I display users and their scores ");
        jScrollPane1.setViewportView(displayScoreArea);

        scorePanel.add(jScrollPane1);
        jScrollPane1.setBounds(364, 57, 418, 361);

        searchLabel.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        searchLabel.setForeground(new java.awt.Color(255, 255, 255));
        searchLabel.setText("Search:");
        scorePanel.add(searchLabel);
        searchLabel.setBounds(30, 130, 98, 50);

        searchField.setToolTipText("Enter ID to search");
        searchField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                searchFieldKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                searchFieldKeyTyped(evt);
            }
        });
        scorePanel.add(searchField);
        searchField.setBounds(146, 124, 200, 50);

        addBTN.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        addBTN.setText("ADD");
        addBTN.setToolTipText("Must Enter name to add user");
        addBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBTNActionPerformed(evt);
            }
        });
        scorePanel.add(addBTN);
        addBTN.setBounds(6, 214, 199, 70);

        deleteBTN.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        deleteBTN.setText("Delete");
        deleteBTN.setToolTipText("ID must be entered in the search to delete user");
        deleteBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteBTNActionPerformed(evt);
            }
        });
        scorePanel.add(deleteBTN);
        deleteBTN.setBounds(6, 405, 199, 70);

        searchBTN.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        searchBTN.setText("Search");
        searchBTN.setToolTipText("Enter ID to search for user!");
        searchBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchBTNActionPerformed(evt);
            }
        });
        scorePanel.add(searchBTN);
        searchBTN.setBounds(6, 302, 199, 70);

        refereshBTN.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        refereshBTN.setText("Save To File");
        refereshBTN.setToolTipText("Press me to see your results");
        refereshBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refereshBTNActionPerformed(evt);
            }
        });
        scorePanel.add(refereshBTN);
        refereshBTN.setBounds(364, 436, 199, 70);

        displayBTN.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        displayBTN.setText("Display");
        displayBTN.setToolTipText("Press me to show all users");
        displayBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                displayBTNActionPerformed(evt);
            }
        });
        scorePanel.add(displayBTN);
        displayBTN.setBounds(581, 436, 201, 70);

        startBTN.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        startBTN.setText("Start Game");
        startBTN.setToolTipText("ID must be entered in the search to delete user");
        startBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                startBTNActionPerformed(evt);
            }
        });
        scorePanel.add(startBTN);
        startBTN.setBounds(6, 487, 199, 70);

        jLabel1.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sampleoflayout/img/background.jpg"))); // NOI18N
        scorePanel.add(jLabel1);
        jLabel1.setBounds(2, -126, 810, 700);

        integrateTabbedPane.addTab("Check Score", scorePanel);

        backgroundGame.setBackground(new java.awt.Color(255, 255, 255));

        gamePane.setBackground(new java.awt.Color(255, 255, 255));
        gamePane.setMaximumSize(new java.awt.Dimension(800, 600));
        gamePane.setMinimumSize(new java.awt.Dimension(800, 600));
        gamePane.setLayout(null);

        cardHolderImg.setEditable(false);
        cardHolderImg.setBackground(new java.awt.Color(255, 255, 255));
        cardHolderImg.setColumns(20);
        cardHolderImg.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        cardHolderImg.setLineWrap(true);
        cardHolderImg.setRows(5);
        gamePane.add(cardHolderImg);
        cardHolderImg.setBounds(160, 150, 450, 290);

        livesCounter.setFont(new java.awt.Font("Arial Black", 0, 20)); // NOI18N
        livesCounter.setText("0");
        gamePane.add(livesCounter);
        livesCounter.setBounds(780, -20, 90, 70);

        choiceOneBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                choiceOneBTNActionPerformed(evt);
            }
        });
        gamePane.add(choiceOneBTN);
        choiceOneBTN.setBounds(30, 470, 220, 65);

        choiceTwoBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                choiceTwoBTNActionPerformed(evt);
            }
        });
        gamePane.add(choiceTwoBTN);
        choiceTwoBTN.setBounds(260, 470, 228, 65);

        choiceThreeBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                choiceThreeBTNActionPerformed(evt);
            }
        });
        gamePane.add(choiceThreeBTN);
        choiceThreeBTN.setBounds(500, 470, 225, 65);

        scoreCounter.setFont(new java.awt.Font("Arial Black", 0, 20)); // NOI18N
        scoreCounter.setText("0");
        gamePane.add(scoreCounter);
        scoreCounter.setBounds(90, -20, 104, 70);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sampleoflayout/img/BackgroundForIntegrations.png"))); // NOI18N
        gamePane.add(jLabel2);
        jLabel2.setBounds(0, 0, 800, 600);

        backgroundGame.setLayer(gamePane, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout backgroundGameLayout = new javax.swing.GroupLayout(backgroundGame);
        backgroundGame.setLayout(backgroundGameLayout);
        backgroundGameLayout.setHorizontalGroup(
            backgroundGameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 800, Short.MAX_VALUE)
            .addGroup(backgroundGameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(gamePane, javax.swing.GroupLayout.DEFAULT_SIZE, 800, Short.MAX_VALUE))
        );
        backgroundGameLayout.setVerticalGroup(
            backgroundGameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 571, Short.MAX_VALUE)
            .addGroup(backgroundGameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(backgroundGameLayout.createSequentialGroup()
                    .addComponent(gamePane, javax.swing.GroupLayout.PREFERRED_SIZE, 569, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        integrateTabbedPane.addTab("Card Game", backgroundGame);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(integrateTabbedPane)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(integrateTabbedPane, javax.swing.GroupLayout.PREFERRED_SIZE, 601, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void choiceOneBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_choiceOneBTNActionPerformed
        // TODO add your handling code here:
        
      choiceCardHolder load = new  choiceCardHolder();
      load.btn1();
        
          
       
    }//GEN-LAST:event_choiceOneBTNActionPerformed

    private void integrateTabbedPaneMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_integrateTabbedPaneMouseClicked
       
    }//GEN-LAST:event_integrateTabbedPaneMouseClicked

    private void addBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBTNActionPerformed
        // TODO add your handling code here:
       if(nameField.getText().isEmpty()){
           JOptionPane.showMessageDialog(null, "You must fill this field before adding");
       } else {
           cardGame test = new cardGame();
       test.addUser();
        startBTN.setVisible(true);
       }
    }//GEN-LAST:event_addBTNActionPerformed

    private void displayBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_displayBTNActionPerformed
        // TODO add your handling code here:
        cardGame test = new cardGame();
        
        displayScoreArea.setText("");
            displayScoreArea.setText("ID: \t Name: \t Score: \n");
            test.display();
    }//GEN-LAST:event_displayBTNActionPerformed

    private void startBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_startBTNActionPerformed
        // TODO add your handling code here:
        
        cardGame game = new cardGame();
        
        game.gameTest();
    }//GEN-LAST:event_startBTNActionPerformed

    private void searchBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchBTNActionPerformed
        // TODO add your handling code here:
       cardGame load = new cardGame();
        if(searchField.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(null, "You must fill this field before search");
        } else {
            displayScoreArea.setText("");
            displayScoreArea.setText("ID: \t Name: \t Score: \n");
            load.searchBTN();
        }
        
    }//GEN-LAST:event_searchBTNActionPerformed

    private void choiceTwoBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_choiceTwoBTNActionPerformed
        // TODO add your handling code here:
            
             choiceCardHolder load = new  choiceCardHolder();
             load.btn2();
       
        
        
    }//GEN-LAST:event_choiceTwoBTNActionPerformed

    private void deleteBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteBTNActionPerformed
        // TODO add your handling code here:
        cardGame load = new cardGame();
        load.delete();
    }//GEN-LAST:event_deleteBTNActionPerformed

    private void choiceThreeBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_choiceThreeBTNActionPerformed
        // TODO add your handling code here:
        
         choiceCardHolder load = new  choiceCardHolder();
            load.btn3();
       
    }//GEN-LAST:event_choiceThreeBTNActionPerformed

    private void searchFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchFieldKeyPressed
        // TODO add your handling code here:
        
        
        
     
    }//GEN-LAST:event_searchFieldKeyPressed

    private void nameFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nameFieldKeyTyped
        // TODO add your handling code here:
        
        char c = evt.getKeyChar();

        if(!Character.isLetter(c)){
            evt.consume();
            JOptionPane.showMessageDialog(null, "Letters Only!");
            nameField.setText("");
        }
        
    }//GEN-LAST:event_nameFieldKeyTyped

    private void searchFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchFieldKeyTyped
        // TODO add your handling code here:
           char c = evt.getKeyChar();
        
        if(!Character.isDigit(c)){
           evt.consume();
           JOptionPane.showMessageDialog(null, "Numbers Only!");
           searchField.setText("");
        }
        
    }//GEN-LAST:event_searchFieldKeyTyped

    private void refereshBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refereshBTNActionPerformed
        // TODO add your handling code here:
        
         
        
        displayScoreArea.setText("");
            displayScoreArea.setText("ID: \t Name: \t Score: \n");
         //   test.display();
        
    }//GEN-LAST:event_refereshBTNActionPerformed

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
            java.util.logging.Logger.getLogger(IntegrationsUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(IntegrationsUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(IntegrationsUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(IntegrationsUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

         
       
        
        
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new IntegrationsUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addBTN;
    private javax.swing.JLayeredPane backgroundGame;
    public static javax.swing.JTextArea cardHolderImg;
    public static javax.swing.JButton choiceOneBTN;
    public static javax.swing.JButton choiceThreeBTN;
    public static javax.swing.JButton choiceTwoBTN;
    private javax.swing.JButton deleteBTN;
    private javax.swing.JButton displayBTN;
    public static javax.swing.JTextArea displayScoreArea;
    public static javax.swing.JPanel gamePane;
    private javax.swing.JTabbedPane integrateTabbedPane;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    public static javax.swing.JLabel livesCounter;
    public static javax.swing.JTextField nameField;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JButton refereshBTN;
    public static javax.swing.JLabel scoreCounter;
    private javax.swing.JPanel scorePanel;
    private javax.swing.JButton searchBTN;
    public static javax.swing.JTextField searchField;
    private javax.swing.JLabel searchLabel;
    private javax.swing.JButton startBTN;
    // End of variables declaration//GEN-END:variables
}
