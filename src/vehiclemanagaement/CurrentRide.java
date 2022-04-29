/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vehiclemanagaement;

/**
 *
 * @author dell
 */

import java.awt.Color;
import javax.swing.JOptionPane;

public class CurrentRide extends javax.swing.JFrame {
    
    int billCar;
    int billRickshaw;
    private String username,type;

    /**
     * Creates new form CurrentRide
     */
    public CurrentRide() {
        initComponents();
    }
    public CurrentRide(String username,String type)
    {
        initComponents();
        this.username=username;
        this.type=type;
        updateHeading.setVisible(false);
        checkAtPickup.setVisible(false);
        checkRunning.setVisible(false);
        updateButton.setVisible(false);
        calculateLabel.setVisible(false);
        kmLabel.setVisible(false);
        inkmLabel.setVisible(false);
        kmCombo.setVisible(false);
        calculateButton.setVisible(false);
        billLabel.setVisible(false);
        billText.setVisible(false);
        receivedButton.setVisible(false);
        rsLabel.setVisible(false);
        mm();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        checkRidesButton = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        currentRideButton = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        settingsButton = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        logOutButton = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        firstHeadline = new javax.swing.JLabel();
        confirmButton = new javax.swing.JPanel();
        jLabel40 = new javax.swing.JLabel();
        updateHeading = new javax.swing.JLabel();
        checkAtPickup = new javax.swing.JCheckBox();
        checkRunning = new javax.swing.JCheckBox();
        updateButton = new javax.swing.JPanel();
        jLabel42 = new javax.swing.JLabel();
        calculateLabel = new javax.swing.JLabel();
        kmLabel = new javax.swing.JLabel();
        kmCombo = new javax.swing.JComboBox();
        inkmLabel = new javax.swing.JLabel();
        calculateButton = new javax.swing.JPanel();
        jLabel46 = new javax.swing.JLabel();
        billLabel = new javax.swing.JLabel();
        billText = new javax.swing.JTextField();
        rsLabel = new javax.swing.JLabel();
        receivedButton = new javax.swing.JPanel();
        jLabel49 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(204, 204, 255));
        jPanel2.setMinimumSize(new java.awt.Dimension(1344, 724));
        jPanel2.setPreferredSize(new java.awt.Dimension(1344, 724));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(0, 0, 255));
        jPanel3.setPreferredSize(new java.awt.Dimension(425, 655));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Verdana", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 204, 255));
        jLabel1.setText("VMS");
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 30, -1, -1));
        jPanel3.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(108, 76, 183, 10));

        checkRidesButton.setBackground(new java.awt.Color(0, 0, 0));
        checkRidesButton.setMinimumSize(new java.awt.Dimension(214, 40));
        checkRidesButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                checkRidesButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                checkRidesButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                checkRidesButtonMouseExited(evt);
            }
        });
        checkRidesButton.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(240, 240, 240));
        jLabel4.setText("Check Rides");
        checkRidesButton.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 0, -1, 40));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8_Transportation_25px.png"))); // NOI18N
        checkRidesButton.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 0, 40, 40));

        jPanel3.add(checkRidesButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 174, 395, -1));

        currentRideButton.setBackground(new java.awt.Color(0, 0, 0));
        currentRideButton.setMinimumSize(new java.awt.Dimension(214, 40));
        currentRideButton.setPreferredSize(new java.awt.Dimension(0, 47));
        currentRideButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                currentRideButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                currentRideButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                currentRideButtonMouseExited(evt);
            }
        });
        currentRideButton.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel12.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(240, 240, 240));
        jLabel12.setText("Current Ride");
        currentRideButton.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 0, 120, 40));

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8_Present_25px_1.png"))); // NOI18N
        currentRideButton.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 0, 40, 40));

        jPanel3.add(currentRideButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 241, 395, 40));

        settingsButton.setBackground(new java.awt.Color(0, 0, 0));
        settingsButton.setMinimumSize(new java.awt.Dimension(182, 40));
        settingsButton.setPreferredSize(new java.awt.Dimension(182, 40));
        settingsButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                settingsButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                settingsButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                settingsButtonMouseExited(evt);
            }
        });
        settingsButton.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel18.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(240, 240, 240));
        jLabel18.setText("Settings");
        settingsButton.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 0, -1, 40));

        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8_Settings_25px.png"))); // NOI18N
        settingsButton.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 0, -1, 40));

        jPanel3.add(settingsButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 315, 395, -1));

        logOutButton.setBackground(new java.awt.Color(0, 0, 0));
        logOutButton.setMinimumSize(new java.awt.Dimension(184, 40));
        logOutButton.setPreferredSize(new java.awt.Dimension(184, 40));
        logOutButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logOutButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                logOutButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                logOutButtonMouseExited(evt);
            }
        });
        logOutButton.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel20.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(240, 240, 240));
        jLabel20.setText("Log Out");
        logOutButton.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 0, -1, 40));

        jLabel21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8_Logout_Rounded_Up_25px.png"))); // NOI18N
        logOutButton.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 0, -1, 40));

        jPanel3.add(logOutButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 633, 395, -1));

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 724));

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        firstHeadline.setFont(new java.awt.Font("Trebuchet MS", 0, 36)); // NOI18N
        firstHeadline.setForeground(new java.awt.Color(0, 51, 51));
        firstHeadline.setText("Press This To Check If You've Any Current Ride");
        jPanel1.add(firstHeadline, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 40, -1, -1));

        confirmButton.setBackground(new java.awt.Color(204, 204, 255));
        confirmButton.setPreferredSize(new java.awt.Dimension(200, 136));
        confirmButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                confirmButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                confirmButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                confirmButtonMouseExited(evt);
            }
        });

        jLabel40.setBackground(new java.awt.Color(204, 204, 255));
        jLabel40.setForeground(new java.awt.Color(0, 51, 51));
        jLabel40.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8_Approval_104px_1.png"))); // NOI18N

        javax.swing.GroupLayout confirmButtonLayout = new javax.swing.GroupLayout(confirmButton);
        confirmButton.setLayout(confirmButtonLayout);
        confirmButtonLayout.setHorizontalGroup(
            confirmButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(confirmButtonLayout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(jLabel40, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(43, Short.MAX_VALUE))
        );
        confirmButtonLayout.setVerticalGroup(
            confirmButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(confirmButtonLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel40)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(confirmButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 110, 200, -1));

        updateHeading.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        updateHeading.setForeground(new java.awt.Color(0, 51, 51));
        updateHeading.setText("Update your current Ride Status");
        jPanel1.add(updateHeading, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 290, -1, -1));

        checkAtPickup.setText("At Pickup");
        checkAtPickup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkAtPickupActionPerformed(evt);
            }
        });
        jPanel1.add(checkAtPickup, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 330, -1, -1));

        checkRunning.setText("Running");
        checkRunning.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkRunningActionPerformed(evt);
            }
        });
        jPanel1.add(checkRunning, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 330, -1, -1));

        updateButton.setBackground(new java.awt.Color(0, 0, 0));
        updateButton.setMinimumSize(new java.awt.Dimension(100, 54));
        updateButton.setPreferredSize(new java.awt.Dimension(100, 54));
        updateButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                updateButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                updateButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                updateButtonMouseExited(evt);
            }
        });

        jLabel42.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jLabel42.setForeground(new java.awt.Color(240, 240, 240));
        jLabel42.setText("Update");

        javax.swing.GroupLayout updateButtonLayout = new javax.swing.GroupLayout(updateButton);
        updateButton.setLayout(updateButtonLayout);
        updateButtonLayout.setHorizontalGroup(
            updateButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(updateButtonLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel42)
                .addContainerGap(29, Short.MAX_VALUE))
        );
        updateButtonLayout.setVerticalGroup(
            updateButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(updateButtonLayout.createSequentialGroup()
                .addComponent(jLabel42, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 14, Short.MAX_VALUE))
        );

        jPanel1.add(updateButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 380, 120, 40));

        calculateLabel.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        calculateLabel.setForeground(new java.awt.Color(0, 51, 51));
        calculateLabel.setText("Calculate Bill");
        jPanel1.add(calculateLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 290, -1, -1));

        kmLabel.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        kmLabel.setForeground(new java.awt.Color(0, 51, 51));
        kmLabel.setText("Km covered:");
        jPanel1.add(kmLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 330, -1, -1));

        kmCombo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9\t", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35", "36", "37", "38", "39", "40" }));
        kmCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kmComboActionPerformed(evt);
            }
        });
        jPanel1.add(kmCombo, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 330, 40, -1));

        inkmLabel.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        inkmLabel.setForeground(new java.awt.Color(0, 51, 51));
        inkmLabel.setText("(In Km)");
        jPanel1.add(inkmLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 330, -1, -1));

        calculateButton.setBackground(new java.awt.Color(0, 0, 0));
        calculateButton.setMinimumSize(new java.awt.Dimension(100, 54));
        calculateButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                calculateButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                calculateButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                calculateButtonMouseExited(evt);
            }
        });

        jLabel46.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jLabel46.setForeground(new java.awt.Color(240, 240, 240));
        jLabel46.setText("Calculate");

        javax.swing.GroupLayout calculateButtonLayout = new javax.swing.GroupLayout(calculateButton);
        calculateButton.setLayout(calculateButtonLayout);
        calculateButtonLayout.setHorizontalGroup(
            calculateButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(calculateButtonLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel46)
                .addContainerGap(24, Short.MAX_VALUE))
        );
        calculateButtonLayout.setVerticalGroup(
            calculateButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(calculateButtonLayout.createSequentialGroup()
                .addComponent(jLabel46, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 14, Short.MAX_VALUE))
        );

        jPanel1.add(calculateButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 380, 130, 40));

        billLabel.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        billLabel.setForeground(new java.awt.Color(0, 51, 51));
        billLabel.setText("The Bill Is");
        jPanel1.add(billLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 480, -1, -1));

        billText.setBackground(new java.awt.Color(204, 204, 255));
        billText.setFont(new java.awt.Font("Trebuchet MS", 0, 16)); // NOI18N
        billText.setForeground(new java.awt.Color(102, 102, 102));
        billText.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(12, 91, 160)));
        jPanel1.add(billText, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 510, 240, 30));

        rsLabel.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        rsLabel.setForeground(new java.awt.Color(0, 51, 51));
        rsLabel.setText("(In Rs.)");
        jPanel1.add(rsLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 520, -1, -1));

        receivedButton.setBackground(new java.awt.Color(0, 0, 0));
        receivedButton.setMinimumSize(new java.awt.Dimension(100, 54));
        receivedButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                receivedButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                receivedButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                receivedButtonMouseExited(evt);
            }
        });

        jLabel49.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jLabel49.setForeground(new java.awt.Color(240, 240, 240));
        jLabel49.setText("Received");

        javax.swing.GroupLayout receivedButtonLayout = new javax.swing.GroupLayout(receivedButton);
        receivedButton.setLayout(receivedButtonLayout);
        receivedButtonLayout.setHorizontalGroup(
            receivedButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(receivedButtonLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel49)
                .addContainerGap(24, Short.MAX_VALUE))
        );
        receivedButtonLayout.setVerticalGroup(
            receivedButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(receivedButtonLayout.createSequentialGroup()
                .addComponent(jLabel49, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 14, Short.MAX_VALUE))
        );

        jPanel1.add(receivedButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 570, 130, 40));

        jPanel2.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(427, 0, 920, 724));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1344, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 724, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        setSize(new java.awt.Dimension(1366, 780));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    
    public void mm()
   {
       billText.setEditable(false);
   }
    
    private void checkRidesButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_checkRidesButtonMouseClicked
        // TODO add your handling code here:
        DriverRide driverride=new DriverRide(username,type);
        this.setVisible(false);
        driverride.setVisible(true);
    }//GEN-LAST:event_checkRidesButtonMouseClicked

    private void checkRidesButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_checkRidesButtonMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_checkRidesButtonMouseEntered

    private void checkRidesButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_checkRidesButtonMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_checkRidesButtonMouseExited

    private void currentRideButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_currentRideButtonMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_currentRideButtonMouseClicked

    private void currentRideButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_currentRideButtonMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_currentRideButtonMouseEntered

    private void currentRideButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_currentRideButtonMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_currentRideButtonMouseExited

    private void settingsButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_settingsButtonMouseClicked
        // TODO add your handling code here:
        DriverSettings ds=new DriverSettings(username,type);
        this.setVisible(false);
        ds.setVisible(true);
    }//GEN-LAST:event_settingsButtonMouseClicked

    private void settingsButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_settingsButtonMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_settingsButtonMouseEntered

    private void settingsButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_settingsButtonMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_settingsButtonMouseExited

    private void logOutButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logOutButtonMouseClicked
        // TODO add your handling code here:
        Login lm=new Login();
        this.setVisible(false);
        lm.setVisible(true);
    }//GEN-LAST:event_logOutButtonMouseClicked

    private void logOutButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logOutButtonMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_logOutButtonMouseEntered

    private void logOutButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logOutButtonMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_logOutButtonMouseExited

    private void confirmButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_confirmButtonMouseClicked
        // TODO add your handling code here:
        if(type=="Car")
        {
            DriverCar dc=new DriverCar();
            if(dc.ConfirmCurrentRide(username))
            {
                JOptionPane.showMessageDialog(null,"YEA, YOU HAVE A CURRENT RIDE ");
                updateHeading.setVisible(true);
                checkAtPickup.setVisible(true);
                checkRunning.setVisible(true);
                updateButton.setVisible(true);
                calculateLabel.setVisible(true);
                kmLabel.setVisible(true);
                inkmLabel.setVisible(true);
                kmCombo.setVisible(true);
                calculateButton.setVisible(true);
                billLabel.setVisible(true);
                billText.setVisible(true);
                receivedButton.setVisible(true);
                rsLabel.setVisible(true);        
            }
            else
            {
                JOptionPane.showMessageDialog(null, " NO ONGOING RIDE ");
            }
        }
        
        else if(type=="Rickshaw")
        {
            DriverRickshaw dr=new DriverRickshaw();
            if(dr.ConfirmCurrentRide(username))
            {
                JOptionPane.showMessageDialog(null,"YEA, YOU HAVE A CURRENT RIDE ");
                updateHeading.setVisible(true);
                checkAtPickup.setVisible(true);
                checkRunning.setVisible(true);
                updateButton.setVisible(true);
                calculateLabel.setVisible(true);
                kmLabel.setVisible(true);
                inkmLabel.setVisible(true);
                kmCombo.setVisible(true);
                calculateButton.setVisible(true);
                billLabel.setVisible(true);
                billText.setVisible(true);
                receivedButton.setVisible(true);
                rsLabel.setVisible(true);    
            }
            else
            {
                JOptionPane.showMessageDialog(null, " NO ONGOING RIDE ");
            }
        }
    }//GEN-LAST:event_confirmButtonMouseClicked

    private void confirmButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_confirmButtonMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_confirmButtonMouseEntered

    private void confirmButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_confirmButtonMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_confirmButtonMouseExited

    private void checkAtPickupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkAtPickupActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_checkAtPickupActionPerformed

    private void checkRunningActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkRunningActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_checkRunningActionPerformed

    private void calculateButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_calculateButtonMouseClicked
        // TODO add your handling code here:
        int km=Integer.parseInt(String.valueOf(kmCombo.getSelectedItem()));
        Ride ride=new Ride();
        String billStatus="Unpaid";
        
        if(type=="Car")
        {
            billCar=km*50;
            billText.setText(Integer.toString(billCar));
            DateTime dt=new DateTime();
            String endtime=dt.getTime();
            ride.updateEndTimeDateCar(username,endtime);
            ride.updateBillStatusCar(username, billStatus,billCar);
        }
        
        else if(type=="Rickshaw")
        {
            billRickshaw=km*30;
            billText.setText(Integer.toString(billRickshaw));
            DateTime dt=new DateTime();
            String endtime=dt.getTime();
            ride.updateEndTimeDateRickshaw(username,endtime);
            ride.updateBillStatusRickshaw(username, billStatus,billRickshaw);
        }
    }//GEN-LAST:event_calculateButtonMouseClicked

    private void calculateButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_calculateButtonMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_calculateButtonMouseEntered

    private void calculateButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_calculateButtonMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_calculateButtonMouseExited

    private void kmComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kmComboActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_kmComboActionPerformed

    private void updateButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updateButtonMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_updateButtonMouseExited

    private void updateButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updateButtonMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_updateButtonMouseEntered

    private void updateButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updateButtonMouseClicked
        // TODO add your handling code here:
        String answer;
        Ride ride=new Ride();
        DateTime dt=new DateTime();
        
        if(type=="Car")
        {
            if(checkAtPickup.isSelected())
            {
                answer="AtPickUp";
                ride.updateRideStatus(username,answer);
            }
            else if(checkRunning.isSelected())
            {
                String time=dt.getTime();
                String date=dt.getDate();
                answer="Running";
                ride.updateRideStatus(username,answer);
                ride.updateStartTimeDateCar(username,date,time);
            }
        }
        
        else if(type=="Rickshaw")
        {
            if(checkAtPickup.isSelected())
            {
                answer="AtPickUp";
                ride.updateRideStatusRickshaw(username,answer);
            }
            else if(checkRunning.isSelected())
            {
                answer="Running";
                ride.updateRideStatusRickshaw(username,answer);
                String time=dt.getTime();
                String date=dt.getDate();
                ride.updateStartTimeDateRickshaw(username, date, time);
            } 
        }
    }//GEN-LAST:event_updateButtonMouseClicked

    private void receivedButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_receivedButtonMouseClicked
        // TODO add your handling code here:
        String answer;
        Ride ride=new Ride();
        String billStatus="Paid";
        
        if(type=="Car")
        {
            answer="Completed";
            ride.updateBillStatusCar(username, billStatus,billCar);
            ride.updateRideStatus(username,answer);   
        }
        
        else if(type=="Rickshaw")
        {
            answer="Completed";
            ride.updateBillStatusRickshaw(username,billStatus,billRickshaw);
            ride.updateRideStatusRickshaw(username,answer);  
        }
    }//GEN-LAST:event_receivedButtonMouseClicked

    private void receivedButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_receivedButtonMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_receivedButtonMouseEntered

    private void receivedButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_receivedButtonMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_receivedButtonMouseExited

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
            java.util.logging.Logger.getLogger(CurrentRide.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CurrentRide.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CurrentRide.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CurrentRide.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CurrentRide().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel billLabel;
    private javax.swing.JTextField billText;
    private javax.swing.JPanel calculateButton;
    private javax.swing.JLabel calculateLabel;
    private javax.swing.JCheckBox checkAtPickup;
    private javax.swing.JPanel checkRidesButton;
    private javax.swing.JCheckBox checkRunning;
    private javax.swing.JPanel confirmButton;
    private javax.swing.JPanel currentRideButton;
    private javax.swing.JLabel firstHeadline;
    private javax.swing.JLabel inkmLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JComboBox kmCombo;
    private javax.swing.JLabel kmLabel;
    private javax.swing.JPanel logOutButton;
    private javax.swing.JPanel receivedButton;
    private javax.swing.JLabel rsLabel;
    private javax.swing.JPanel settingsButton;
    private javax.swing.JPanel updateButton;
    private javax.swing.JLabel updateHeading;
    // End of variables declaration//GEN-END:variables
}