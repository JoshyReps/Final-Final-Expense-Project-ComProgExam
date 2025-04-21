package frames;

import classes.AccountHandler;
import classes.ExpenseProject;
import java.awt.CardLayout;
import java.awt.Insets;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import org.json.simple.JSONObject;

public class BetterLogIn extends javax.swing.JFrame {

    public BetterLogIn() {
        
        initComponents();
        extras();
        setVisible(true);
        setLocationRelativeTo(null);
        setResizable(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jToggleButton1 = new javax.swing.JToggleButton();
        jPanel2 = new javax.swing.JPanel();
        jrbLogIn = new javax.swing.JRadioButton();
        jrbSignUp = new javax.swing.JRadioButton();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        jPanel3 = new javax.swing.JPanel();
        jtxfLogInUsername = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jbtnLogIn = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jtxfLogInPassword = new javax.swing.JPasswordField();
        jPanel4 = new javax.swing.JPanel();
        jtxfSignUpUsername = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jbtnSignUp = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jtxfSignUpPassword = new javax.swing.JPasswordField();
        jtxfSignUpConfirmPassword = new javax.swing.JPasswordField();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        jToggleButton1.setText("jToggleButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(800, 530));
        setMinimumSize(new java.awt.Dimension(800, 530));
        setPreferredSize(new java.awt.Dimension(800, 530));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(105, 11, 34));

        jrbLogIn.setBackground(new java.awt.Color(105, 11, 34));
        jrbLogIn.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jrbLogIn.setForeground(new java.awt.Color(241, 227, 211));
        jrbLogIn.setText("Log In");
        jrbLogIn.setFocusPainted(false);
        jrbLogIn.setFocusable(false);
        jrbLogIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbLogInActionPerformed(evt);
            }
        });

        jrbSignUp.setBackground(new java.awt.Color(105, 11, 34));
        jrbSignUp.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jrbSignUp.setForeground(new java.awt.Color(241, 227, 211));
        jrbSignUp.setText("Sign Up");
        jrbSignUp.setFocusPainted(false);
        jrbSignUp.setFocusable(false);
        jrbSignUp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbSignUpActionPerformed(evt);
            }
        });

        jTabbedPane2.setTabPlacement(javax.swing.JTabbedPane.BOTTOM);

        jPanel3.setBackground(new java.awt.Color(105, 11, 34));

        jtxfLogInUsername.setBackground(new java.awt.Color(255, 255, 255));
        jtxfLogInUsername.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jtxfLogInUsername.setForeground(new java.awt.Color(50, 92, 7));
        jtxfLogInUsername.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(254, 254, 180), 2));

        jLabel3.setFont(new java.awt.Font("Serif", 1, 22)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(241, 227, 211));
        jLabel3.setText("Username :");

        jLabel4.setFont(new java.awt.Font("Serif", 1, 22)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(241, 227, 211));
        jLabel4.setText("Password :");

        jbtnLogIn.setBackground(new java.awt.Color(35, 32, 19));
        jbtnLogIn.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jbtnLogIn.setForeground(new java.awt.Color(255, 255, 255));
        jbtnLogIn.setText("Log In");
        jbtnLogIn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(254, 254, 180), 2, true));
        jbtnLogIn.setFocusPainted(false);
        jbtnLogIn.setFocusable(false);
        jbtnLogIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnLogInActionPerformed(evt);
            }
        });

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/WalletRUI.gif"))); // NOI18N

        jtxfLogInPassword.setBackground(new java.awt.Color(255, 255, 255));
        jtxfLogInPassword.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jtxfLogInPassword.setForeground(new java.awt.Color(50, 92, 7));
        jtxfLogInPassword.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(254, 254, 180), 2));
        jtxfLogInPassword.setPreferredSize(new java.awt.Dimension(90, 29));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(54, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jtxfLogInUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtxfLogInPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(35, 35, 35))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(65, 65, 65))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jbtnLogIn, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(79, 79, 79))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jtxfLogInUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(jtxfLogInPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jbtnLogIn, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(60, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("tab1", jPanel3);

        jPanel4.setBackground(new java.awt.Color(105, 11, 34));

        jtxfSignUpUsername.setBackground(new java.awt.Color(255, 255, 255));
        jtxfSignUpUsername.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jtxfSignUpUsername.setForeground(new java.awt.Color(50, 92, 7));
        jtxfSignUpUsername.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(254, 254, 180), 2));

        jLabel6.setFont(new java.awt.Font("Serif", 1, 22)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(241, 227, 211));
        jLabel6.setText("Username :");

        jLabel7.setFont(new java.awt.Font("Serif", 1, 22)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(241, 227, 211));
        jLabel7.setText("Password :");

        jbtnSignUp.setBackground(new java.awt.Color(35, 32, 19));
        jbtnSignUp.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jbtnSignUp.setForeground(new java.awt.Color(255, 255, 255));
        jbtnSignUp.setText("Sign Up");
        jbtnSignUp.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(254, 254, 180), 2));
        jbtnSignUp.setFocusPainted(false);
        jbtnSignUp.setFocusable(false);
        jbtnSignUp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnSignUpActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Serif", 1, 22)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(241, 227, 211));
        jLabel8.setText("Confirm Password :");

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/WalletRUI.gif"))); // NOI18N

        jtxfSignUpPassword.setBackground(new java.awt.Color(255, 255, 255));
        jtxfSignUpPassword.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jtxfSignUpPassword.setForeground(new java.awt.Color(50, 92, 7));
        jtxfSignUpPassword.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(254, 254, 180), 2));
        jtxfSignUpPassword.setPreferredSize(new java.awt.Dimension(90, 29));

        jtxfSignUpConfirmPassword.setBackground(new java.awt.Color(255, 255, 255));
        jtxfSignUpConfirmPassword.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jtxfSignUpConfirmPassword.setForeground(new java.awt.Color(50, 92, 7));
        jtxfSignUpConfirmPassword.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(254, 254, 180), 2));
        jtxfSignUpConfirmPassword.setPreferredSize(new java.awt.Dimension(90, 29));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(56, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel7)
                            .addComponent(jtxfSignUpUsername, javax.swing.GroupLayout.DEFAULT_SIZE, 178, Short.MAX_VALUE)
                            .addComponent(jLabel6)
                            .addComponent(jtxfSignUpPassword, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(35, 35, 35))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(74, 74, 74))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addComponent(jbtnSignUp, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(78, 78, 78))))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(jtxfSignUpConfirmPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 23, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jtxfSignUpUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jtxfSignUpPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jtxfSignUpConfirmPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jbtnSignUp, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("tab1", jPanel4);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(108, 108, 108)
                        .addComponent(jrbLogIn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jrbSignUp))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(jTabbedPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(81, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jrbLogIn)
                    .addComponent(jrbSignUp))
                .addGap(18, 18, 18)
                .addComponent(jTabbedPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 445, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 0, 410, 500));

        jLabel5.setFont(new java.awt.Font("Segoe UI Light", 1, 36)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(204, 255, 255));
        jLabel5.setText("@RUI");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 450, -1, 39));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/LogInBackground.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 500));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //RADIO-BUTTONS -------------------------------------------------------------------------
    private void jrbLogInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbLogInActionPerformed
        jTabbedPane2.setSelectedIndex(0);
    }//GEN-LAST:event_jrbLogInActionPerformed

    private void jrbSignUpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbSignUpActionPerformed
        jTabbedPane2.setSelectedIndex(1);
    }//GEN-LAST:event_jrbSignUpActionPerformed
    //------------------------------------------------------------------------------------------
    
    
    //LOGIN ----------------------------------------------------------------------------------
    private void jbtnLogInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnLogInActionPerformed

        String usernameSpecified = jtxfLogInUsername.getText();
        String passwordSpecified = String.valueOf(jtxfLogInPassword.getPassword());
        
        if("tigbason".equals(usernameSpecified) && "tigbason".equals(passwordSpecified)) {
            this.setVisible(false);
            ExpenseProject.admin.setDefault();
            ExpenseProject.admin.setVisible(true);
            return;
        }
        
        JSONObject accountSpecified = AccountHandler.findAccount(usernameSpecified);
        
        if(accountSpecified == null) JOptionPane.showMessageDialog(null, "Account Does Not Exist");
        else {
            
            String actualPassword = (String) accountSpecified.get("password");
            
            if(actualPassword.equals(passwordSpecified)) {
                this.setVisible(false);
                BetterStudentProfile loggedIn = new BetterStudentProfile();
                loggedIn.setVisible(true);
                loggedIn.setAccount(accountSpecified);
            }
            else JOptionPane.showMessageDialog(null, "Invalid Password");
        }
    }//GEN-LAST:event_jbtnLogInActionPerformed
    //------------------------------------------------------------------------------------------
    
    
    //SIGN UP ----------------------------------------------------------------------------------
    private void jbtnSignUpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnSignUpActionPerformed
        
        String signInUsername = jtxfSignUpUsername.getText();
        String signInPassword = String.valueOf(jtxfSignUpPassword.getPassword());
        String signInConfirmPassword = String.valueOf(jtxfSignUpConfirmPassword.getPassword());
        
        if(signInPassword.equals(signInConfirmPassword)) {
            
            JSONObject newlyCreatedAccount = AccountHandler.addAccount(signInUsername, signInPassword);
            
            if(newlyCreatedAccount != null) {
                this.setVisible(false);
                BetterStudentProfile newProfile = new BetterStudentProfile();
                newProfile.setVisible(true);
                newProfile.setAccount(newlyCreatedAccount);
            }
        }
        else JOptionPane.showMessageDialog(null, "Password Mismatch");
    }//GEN-LAST:event_jbtnSignUpActionPerformed
    //------------------------------------------------------------------------------------------
    
    
    //EXTRAS -----------------------------------------------------------------------------------
    public final void extras () {
        
        Insets insets = UIManager.getInsets("TabbedPane.contentBorderInsets");
        insets.top = -1;
        insets.bottom = -1;
        insets.left = -1;
        insets.right = -1;
        UIManager.put("TabbedPane.contentBorderInsets", insets);
        
        jTabbedPane2.setLayout(new CardLayout());
        
        buttonGroup1.add(jrbLogIn);
        buttonGroup1.add(jrbSignUp);
    }
    //------------------------------------------------------------------------------------------
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JButton jbtnLogIn;
    private javax.swing.JButton jbtnSignUp;
    private javax.swing.JRadioButton jrbLogIn;
    private javax.swing.JRadioButton jrbSignUp;
    private javax.swing.JPasswordField jtxfLogInPassword;
    private javax.swing.JTextField jtxfLogInUsername;
    private javax.swing.JPasswordField jtxfSignUpConfirmPassword;
    private javax.swing.JPasswordField jtxfSignUpPassword;
    private javax.swing.JTextField jtxfSignUpUsername;
    // End of variables declaration//GEN-END:variables
}
