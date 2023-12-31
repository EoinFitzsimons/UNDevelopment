/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package undevelopment;

//import undevelopment.IntegrationsFolder.cardGame;




import undevelopment.adaptabilityFolder.CrosswordUsers;
import undevelopment.IntegrationsFolder.cardGame;


/**
 *
 * @author everyone, david came up with the tab idea, eoin closed the menu and fixed menu bugs.
 */
public class UNDevelopmentMainMenuGUI extends javax.swing.JFrame {


    /**
     * Creates new form UNDevelopmentMainMenuGUI
     */
    public UNDevelopmentMainMenuGUI() {
        initComponents();

    }


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        adaptabilityBackground1 = new javax.swing.JPanel();
        AdaptabilityAppBTN1 = new javax.swing.JButton();
        cwtLBL1 = new javax.swing.JLabel();
        cweLBL4 = new javax.swing.JLabel();
        cweLBL5 = new javax.swing.JLabel();
        cweLBL6 = new javax.swing.JLabel();
        updateBTN1 = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        cwsTA1 = new javax.swing.JTextArea();
        deleteBTN1 = new javax.swing.JButton();
        searchBTN1 = new javax.swing.JButton();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        homePane = new javax.swing.JLayeredPane();
        backgroundPane = new javax.swing.JPanel();
        backgroundIMG = new javax.swing.JLabel();
        awarenessPane = new javax.swing.JLayeredPane();
        awarenessBackground = new javax.swing.JPanel();
        adaptabilityBackground2 = new javax.swing.JPanel();
        AwarenessAppBTN = new javax.swing.JButton();
        awarenessTitleLBL = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        welcomeTXT = new javax.swing.JTextArea();
        adaptabilityPane = new javax.swing.JLayeredPane();
        adaptabilityBackground = new javax.swing.JPanel();
        AdaptabilityAppBTN = new javax.swing.JButton();
        cwtLBL = new javax.swing.JLabel();
        cweLBL1 = new javax.swing.JLabel();
        cweLBL2 = new javax.swing.JLabel();
        cweLBL3 = new javax.swing.JLabel();
        updateBTN = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        cwsTA = new javax.swing.JTextArea();
        deleteBTN = new javax.swing.JButton();
        searchBTN = new javax.swing.JButton();
        integrationPane = new javax.swing.JLayeredPane();
        backgroundIntegration = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        loadIntegrationApp = new javax.swing.JButton();
        loadBrief = new javax.swing.JButton();
        jScrollPane6 = new javax.swing.JScrollPane();
        displayText = new javax.swing.JTextArea();
        jLabel8 = new javax.swing.JLabel();

        adaptabilityBackground1.setBackground(new java.awt.Color(100, 150, 200));

        AdaptabilityAppBTN1.setText("Load Adaptability App");
        AdaptabilityAppBTN1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AdaptabilityAppBTN1ActionPerformed(evt);
            }
        });

        cwtLBL1.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        cwtLBL1.setForeground(new java.awt.Color(255, 255, 255));
        cwtLBL1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cwtLBL1.setText("Adaptability Menu");

        cweLBL4.setFont(new java.awt.Font("Segoe UI", 0, 22)); // NOI18N
        cweLBL4.setForeground(new java.awt.Color(255, 255, 255));
        cweLBL4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cweLBL4.setText("This is a crossword whose hints are information regarding natural disasters.");

        cweLBL5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        cweLBL5.setForeground(new java.awt.Color(255, 255, 255));
        cweLBL5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cweLBL5.setText("You should take what you learn from this crossword and be able to apply it in future.");

        cweLBL6.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        cweLBL6.setForeground(new java.awt.Color(255, 255, 255));
        cweLBL6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cweLBL6.setText("With this knowledege you will be more adaptable in the face of danger.");

        updateBTN1.setText("Update Scores");
        updateBTN1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateBTN1ActionPerformed(evt);
            }
        });

        cwsTA1.setColumns(20);
        cwsTA1.setRows(5);
        jScrollPane3.setViewportView(cwsTA1);

        deleteBTN1.setText("Delete Scores");
        deleteBTN1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteBTN1ActionPerformed(evt);
            }
        });

        searchBTN1.setText("Search Scores");
        searchBTN1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchBTN1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout adaptabilityBackground1Layout = new javax.swing.GroupLayout(adaptabilityBackground1);
        adaptabilityBackground1.setLayout(adaptabilityBackground1Layout);
        adaptabilityBackground1Layout.setHorizontalGroup(
            adaptabilityBackground1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(cwtLBL1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(adaptabilityBackground1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(adaptabilityBackground1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cweLBL5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cweLBL6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cweLBL4, javax.swing.GroupLayout.PREFERRED_SIZE, 776, Short.MAX_VALUE)
                    .addGroup(adaptabilityBackground1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(adaptabilityBackground1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(adaptabilityBackground1Layout.createSequentialGroup()
                                .addComponent(updateBTN1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(deleteBTN1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(searchBTN1))
                            .addComponent(jScrollPane3)
                            .addComponent(AdaptabilityAppBTN1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        adaptabilityBackground1Layout.setVerticalGroup(
            adaptabilityBackground1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, adaptabilityBackground1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cwtLBL1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(cweLBL4)
                .addGap(18, 18, 18)
                .addComponent(cweLBL5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cweLBL6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 254, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(adaptabilityBackground1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(updateBTN1)
                    .addComponent(deleteBTN1)
                    .addComponent(searchBTN1))
                .addGap(18, 18, 18)
                .addComponent(AdaptabilityAppBTN1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTabbedPane1.setMinimumSize(new java.awt.Dimension(800, 600));
        jTabbedPane1.setPreferredSize(new java.awt.Dimension(800, 600));

        backgroundPane.setMinimumSize(new java.awt.Dimension(800, 600));

        backgroundIMG.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sampleoflayout/img/OOP Background.png"))); // NOI18N

        javax.swing.GroupLayout backgroundPaneLayout = new javax.swing.GroupLayout(backgroundPane);
        backgroundPane.setLayout(backgroundPaneLayout);
        backgroundPaneLayout.setHorizontalGroup(
            backgroundPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backgroundPaneLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(backgroundIMG, javax.swing.GroupLayout.PREFERRED_SIZE, 800, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        backgroundPaneLayout.setVerticalGroup(
            backgroundPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(backgroundIMG, javax.swing.GroupLayout.PREFERRED_SIZE, 571, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        homePane.setLayer(backgroundPane, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout homePaneLayout = new javax.swing.GroupLayout(homePane);
        homePane.setLayout(homePaneLayout);
        homePaneLayout.setHorizontalGroup(
            homePaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, homePaneLayout.createSequentialGroup()
                .addComponent(backgroundPane, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        homePaneLayout.setVerticalGroup(
            homePaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(homePaneLayout.createSequentialGroup()
                .addComponent(backgroundPane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Home", homePane);

        adaptabilityBackground2.setBackground(new java.awt.Color(100, 150, 200));

        AwarenessAppBTN.setText("Load Awareness App");
        AwarenessAppBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AwarenessAppBTNActionPerformed(evt);
            }
        });

        awarenessTitleLBL.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        awarenessTitleLBL.setForeground(new java.awt.Color(255, 255, 255));
        awarenessTitleLBL.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        awarenessTitleLBL.setText("Awareness Menu");

        welcomeTXT.setBackground(new java.awt.Color(100, 150, 200));
        welcomeTXT.setColumns(20);
        welcomeTXT.setForeground(new java.awt.Color(255, 255, 255));
        welcomeTXT.setRows(5);
        welcomeTXT.setTabSize(15);
        welcomeTXT.setText("Welcome to the Climate Change Quiz Game!\n\nIn this quiz, you'll embark on a learning adventure with ten questions\nthat delve into the crucial topic of climate change.\n\nBut first, let's understand why Multiple Choice Questions make for an\nengaging learning experience.\n\nMCQs challenge you to think critically and make informed choices.\nBy presenting various options, they encourage active participation, helping you\ninternalize concepts more effectively. Now, let's link this to the questions ahead,\nwhere your choices will reflect your understanding of pressing environmental issues.\n\nClimate change stems from human activities releasing greenhouse gases, leading\nto a rise in Earth's temperature. From the main greenhouse gas responsible for global\nwarming to the largest emitter of these gases, each question ties directly to the\nreal-world challenges we face. So, get ready to not just answer questions but\nto deepen your awareness of the environmental factors shaping our\nplanet.\n\nWhen the quiz is over we want your feedback. We value your thoughts! Your feedback\nis essential to improving our educational experience. Please take a moment to share\nyour thoughts on the quiz and any suggestions you may have.\n\nGood luck!");
        welcomeTXT.setToolTipText("");
        welcomeTXT.setBorder(null);
        jScrollPane5.setViewportView(welcomeTXT);

        javax.swing.GroupLayout adaptabilityBackground2Layout = new javax.swing.GroupLayout(adaptabilityBackground2);
        adaptabilityBackground2.setLayout(adaptabilityBackground2Layout);
        adaptabilityBackground2Layout.setHorizontalGroup(
            adaptabilityBackground2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(adaptabilityBackground2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(AwarenessAppBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 354, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, adaptabilityBackground2Layout.createSequentialGroup()
                .addGap(0, 1, Short.MAX_VALUE)
                .addComponent(awarenessTitleLBL, javax.swing.GroupLayout.PREFERRED_SIZE, 787, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(adaptabilityBackground2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(adaptabilityBackground2Layout.createSequentialGroup()
                    .addGap(108, 108, 108)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 571, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(109, Short.MAX_VALUE)))
        );
        adaptabilityBackground2Layout.setVerticalGroup(
            adaptabilityBackground2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, adaptabilityBackground2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(awarenessTitleLBL, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 441, Short.MAX_VALUE)
                .addComponent(AwarenessAppBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(adaptabilityBackground2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(adaptabilityBackground2Layout.createSequentialGroup()
                    .addGap(72, 72, 72)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 409, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(72, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout awarenessBackgroundLayout = new javax.swing.GroupLayout(awarenessBackground);
        awarenessBackground.setLayout(awarenessBackgroundLayout);
        awarenessBackgroundLayout.setHorizontalGroup(
            awarenessBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(adaptabilityBackground2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        awarenessBackgroundLayout.setVerticalGroup(
            awarenessBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(adaptabilityBackground2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        awarenessPane.setLayer(awarenessBackground, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout awarenessPaneLayout = new javax.swing.GroupLayout(awarenessPane);
        awarenessPane.setLayout(awarenessPaneLayout);
        awarenessPaneLayout.setHorizontalGroup(
            awarenessPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(awarenessPaneLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(awarenessBackground, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        awarenessPaneLayout.setVerticalGroup(
            awarenessPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, awarenessPaneLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(awarenessBackground, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Awareness", awarenessPane);

        adaptabilityBackground.setBackground(new java.awt.Color(100, 150, 200));

        AdaptabilityAppBTN.setText("Load Adaptability App");
        AdaptabilityAppBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AdaptabilityAppBTNActionPerformed(evt);
            }
        });

        cwtLBL.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        cwtLBL.setForeground(new java.awt.Color(255, 255, 255));
        cwtLBL.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cwtLBL.setText("Adaptability Menu");

        cweLBL1.setFont(new java.awt.Font("Segoe UI", 0, 22)); // NOI18N
        cweLBL1.setForeground(new java.awt.Color(255, 255, 255));
        cweLBL1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cweLBL1.setText("This is a crossword whose hints are information regarding natural disasters.");

        cweLBL2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        cweLBL2.setForeground(new java.awt.Color(255, 255, 255));
        cweLBL2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cweLBL2.setText("You should take what you learn from this crossword and be able to apply it in future.");

        cweLBL3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        cweLBL3.setForeground(new java.awt.Color(255, 255, 255));
        cweLBL3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cweLBL3.setText("With this knowledege you will be more adaptable in the face of danger.");

        updateBTN.setText("Update Scores");
        updateBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateBTNActionPerformed(evt);
            }
        });

        cwsTA.setColumns(20);
        cwsTA.setRows(5);
        jScrollPane2.setViewportView(cwsTA);

        deleteBTN.setText("Delete Scores");
        deleteBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteBTNActionPerformed(evt);
            }
        });

        searchBTN.setText("Search Scores");
        searchBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchBTNActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout adaptabilityBackgroundLayout = new javax.swing.GroupLayout(adaptabilityBackground);
        adaptabilityBackground.setLayout(adaptabilityBackgroundLayout);
        adaptabilityBackgroundLayout.setHorizontalGroup(
            adaptabilityBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(cwtLBL, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(adaptabilityBackgroundLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(adaptabilityBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cweLBL2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cweLBL3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cweLBL1, javax.swing.GroupLayout.PREFERRED_SIZE, 776, Short.MAX_VALUE)
                    .addGroup(adaptabilityBackgroundLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(adaptabilityBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(adaptabilityBackgroundLayout.createSequentialGroup()
                                .addComponent(updateBTN)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(deleteBTN)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(searchBTN))
                            .addComponent(jScrollPane2)
                            .addComponent(AdaptabilityAppBTN, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        adaptabilityBackgroundLayout.setVerticalGroup(
            adaptabilityBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, adaptabilityBackgroundLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cwtLBL, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(cweLBL1)
                .addGap(18, 18, 18)
                .addComponent(cweLBL2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cweLBL3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 254, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(adaptabilityBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(updateBTN)
                    .addComponent(deleteBTN)
                    .addComponent(searchBTN))
                .addGap(18, 18, 18)
                .addComponent(AdaptabilityAppBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        adaptabilityPane.setLayer(adaptabilityBackground, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout adaptabilityPaneLayout = new javax.swing.GroupLayout(adaptabilityPane);
        adaptabilityPane.setLayout(adaptabilityPaneLayout);
        adaptabilityPaneLayout.setHorizontalGroup(
            adaptabilityPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(adaptabilityPaneLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(adaptabilityBackground, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        adaptabilityPaneLayout.setVerticalGroup(
            adaptabilityPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, adaptabilityPaneLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(adaptabilityBackground, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Adaptability", adaptabilityPane);

        backgroundIntegration.setBackground(new java.awt.Color(100, 150, 200));
        backgroundIntegration.setLayout(null);

        jLabel3.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Brief Information On Integration ");
        backgroundIntegration.add(jLabel3);
        jLabel3.setBounds(0, 6, 788, 50);

        loadIntegrationApp.setBackground(new java.awt.Color(229, 225, 205));
        loadIntegrationApp.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        loadIntegrationApp.setText("Load Integration App");
        loadIntegrationApp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loadIntegrationAppActionPerformed(evt);
            }
        });
        backgroundIntegration.add(loadIntegrationApp);
        loadIntegrationApp.setBounds(350, 500, 432, 57);

        loadBrief.setBackground(new java.awt.Color(229, 225, 205));
        loadBrief.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        loadBrief.setText("Brief About Game");
        loadBrief.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loadBriefActionPerformed(evt);
            }
        });
        backgroundIntegration.add(loadBrief);
        loadBrief.setBounds(350, 410, 432, 57);

        displayText.setEditable(false);
        displayText.setBackground(new java.awt.Color(229, 225, 205));
        displayText.setColumns(20);
        displayText.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        displayText.setLineWrap(true);
        displayText.setRows(5);
        displayText.setText("Intregration for climate change is the number of countres that nationally determined contributions to national adaptation plans, long term strategies and adaptation communications. Intregrated land use planning is part of this to help improve our atmosphere. The integrated land strategy is to allocate land for different purposes, to balance social,\\n enviormental economic values at a national or sub-national levels. This is the process of supporting decision makers and land users in selectomg the best combination of land uses to ultimately meet multiple needs for people, while safeguardomg natural resources and ecosystem services");
        displayText.setWrapStyleWord(true);
        jScrollPane6.setViewportView(displayText);

        backgroundIntegration.add(jScrollPane6);
        jScrollPane6.setBounds(0, 90, 326, 460);

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sampleoflayout/img/intregation.png"))); // NOI18N
        backgroundIntegration.add(jLabel8);
        jLabel8.setBounds(350, 97, 432, 260);

        integrationPane.setLayer(backgroundIntegration, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout integrationPaneLayout = new javax.swing.GroupLayout(integrationPane);
        integrationPane.setLayout(integrationPaneLayout);
        integrationPaneLayout.setHorizontalGroup(
            integrationPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, integrationPaneLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(backgroundIntegration, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        integrationPaneLayout.setVerticalGroup(
            integrationPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(backgroundIntegration, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Integration", integrationPane);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void loadIntegrationAppActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loadIntegrationAppActionPerformed
        // TODO add your handling code here:
        IntegrationsUI load = new IntegrationsUI();
        load.setVisible(true);
        this.dispose();

        cardGame load1 = new cardGame();
        load1.scriptRunner();

    }//GEN-LAST:event_loadIntegrationAppActionPerformed

    private void searchBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchBTNActionPerformed
        // TODO add your handling code here:
        //calls eoin's search method from his leaderboard fuction class called crossword users, repeated below for others
        CrosswordUsers search = new CrosswordUsers();
        search.search();
    }//GEN-LAST:event_searchBTNActionPerformed

    private void deleteBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteBTNActionPerformed
        // TODO add your handling code here:
        CrosswordUsers delete = new CrosswordUsers();
        delete.delete();
    }//GEN-LAST:event_deleteBTNActionPerformed

    private void updateBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateBTNActionPerformed
        CrosswordUsers update = new CrosswordUsers();
        update.update();
    }//GEN-LAST:event_updateBTNActionPerformed


    private void AdaptabilityAppBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AdaptabilityAppBTNActionPerformed
        // TODO add your handling code here:
        //loads eoin's crossword and closes main menu

        AdaptabilityGUI load = new AdaptabilityGUI();
        load.setVisible(true);
        this.dispose();

    }//GEN-LAST:event_AdaptabilityAppBTNActionPerformed

       

    private void loadBriefActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loadBriefActionPerformed
        // TODO add your handling code here:
        BriefAboutGame load = new BriefAboutGame();
        load.setVisible(true);
        this.dispose();
        
    }//GEN-LAST:event_loadBriefActionPerformed

    private void AdaptabilityAppBTN1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AdaptabilityAppBTN1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AdaptabilityAppBTN1ActionPerformed

    private void updateBTN1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateBTN1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_updateBTN1ActionPerformed

    private void deleteBTN1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteBTN1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_deleteBTN1ActionPerformed

    private void searchBTN1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchBTN1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchBTN1ActionPerformed

    private void AwarenessAppBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AwarenessAppBTNActionPerformed
        // TODO add your handling code here:
        AwarenessGUI load = new AwarenessGUI();
        load.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_AwarenessAppBTNActionPerformed


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
            java.util.logging.Logger.getLogger(UNDevelopmentMainMenuGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UNDevelopmentMainMenuGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UNDevelopmentMainMenuGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UNDevelopmentMainMenuGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UNDevelopmentMainMenuGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AdaptabilityAppBTN;
    private javax.swing.JButton AdaptabilityAppBTN1;
    private javax.swing.JButton AwarenessAppBTN;
    private javax.swing.JPanel adaptabilityBackground;
    private javax.swing.JPanel adaptabilityBackground1;
    private javax.swing.JPanel adaptabilityBackground2;
    private javax.swing.JLayeredPane adaptabilityPane;
    private javax.swing.JPanel awarenessBackground;
    private javax.swing.JLayeredPane awarenessPane;
    private javax.swing.JLabel awarenessTitleLBL;
    private javax.swing.JLabel backgroundIMG;
    private javax.swing.JPanel backgroundIntegration;
    private javax.swing.JPanel backgroundPane;
    private javax.swing.JLabel cweLBL1;
    private javax.swing.JLabel cweLBL2;
    private javax.swing.JLabel cweLBL3;
    private javax.swing.JLabel cweLBL4;
    private javax.swing.JLabel cweLBL5;
    private javax.swing.JLabel cweLBL6;
    public static javax.swing.JTextArea cwsTA;
    public static javax.swing.JTextArea cwsTA1;
    private javax.swing.JLabel cwtLBL;
    private javax.swing.JLabel cwtLBL1;
    private javax.swing.JButton deleteBTN;
    private javax.swing.JButton deleteBTN1;
    private javax.swing.JTextArea displayText;
    private javax.swing.JLayeredPane homePane;
    private javax.swing.JLayeredPane integrationPane;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JButton loadBrief;
    private javax.swing.JButton loadIntegrationApp;
    private javax.swing.JButton searchBTN;
    private javax.swing.JButton searchBTN1;
    private javax.swing.JButton updateBTN;
    private javax.swing.JButton updateBTN1;
    private javax.swing.JTextArea welcomeTXT;
    // End of variables declaration//GEN-END:variables
}
