package frames;

import classes.AccountHandler;
import classes.ExpenseProject;
import classes.FoodItem;
import static classes.FoodItem.referencedList;
import classes.FoodItemHandler;
import classes.OrderList;
import classes.Rank;
import classes.SimplifiedAccount;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Insets;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.Comparator;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.UIManager;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public final class BetterFoodMenu extends javax.swing.JFrame {
    
    BetterStudentProfile studentProfile = null;
    
    SimplifiedAccount loggedAccount = null;
    public OrderList listOfFoodOrdered = null;
    DefaultListModel<String> model;
    
    boolean alreadyHaveAnOrder = false;
    
    public BetterFoodMenu() {
        
        initComponents();
        setVisible(true);
        setLocationRelativeTo(null);
        setResizable(false);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jpgbBudgetProgressBar = new javax.swing.JProgressBar();
        jlbLoggedBudgetPlan = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel3 = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jlstOrderTab = new javax.swing.JList<>();
        jLabel23 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jlbDiscount = new javax.swing.JLabel();
        jPanel11 = new javax.swing.JPanel();
        jlbOrderTotal = new javax.swing.JLabel();
        jlbTotalDescription = new javax.swing.JLabel();
        jbtmRemoveOrderButton = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        jlbOrderStatus = new javax.swing.JLabel();
        jPanel13 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jbtnDeleteOrder = new javax.swing.JButton();
        jLabel28 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jtxfBudgetBar = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        jtxfSearchBar = new javax.swing.JTextField();
        jcmbxSortCombo = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jcbxSort = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        jTabbedPane3 = new javax.swing.JTabbedPane();
        jTabbedPane4 = new javax.swing.JTabbedPane();
        jTabbedPane5 = new javax.swing.JTabbedPane();
        jLabel17 = new javax.swing.JLabel();
        jSeparator5 = new javax.swing.JSeparator();
        jSeparator6 = new javax.swing.JSeparator();
        jButton3 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1050, 750));
        setMinimumSize(new java.awt.Dimension(1050, 750));
        setPreferredSize(new java.awt.Dimension(1050, 750));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(241, 227, 211));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/WalletRUIMenu.gif"))); // NOI18N

        jLabel6.setFont(new java.awt.Font("Sitka Display", 1, 48)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(222, 180, 125));
        jLabel6.setText("RUI");

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/FoodsButtonIdle.png"))); // NOI18N

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/DrinksButtonIdle.png"))); // NOI18N

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/DessertsButtonIdle.png"))); // NOI18N

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/OrderButtonIdle.png"))); // NOI18N
        jLabel10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel10MouseClicked(evt);
            }
        });

        jLabel21.setText("Mewtwo");

        jLabel27.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(130, 108, 80));
        jLabel27.setText("Get Order");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addGap(41, 41, 41))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(27, Short.MAX_VALUE)
                        .addComponent(jLabel9))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel8)
                            .addComponent(jLabel7))))
                .addContainerGap(27, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(76, 76, 76)
                        .addComponent(jLabel10))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel21))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addComponent(jLabel27)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addGap(33, 33, 33)
                .addComponent(jLabel7)
                .addGap(18, 18, 18)
                .addComponent(jLabel8)
                .addGap(18, 18, 18)
                .addComponent(jLabel9)
                .addGap(59, 59, 59)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel27)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 133, Short.MAX_VALUE)
                .addComponent(jLabel21)
                .addContainerGap())
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 220, 710));

        jpgbBudgetProgressBar.setBackground(new java.awt.Color(255, 255, 255));
        jpgbBudgetProgressBar.setForeground(new java.awt.Color(0, 153, 0));
        jpgbBudgetProgressBar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 3));
        getContentPane().add(jpgbBudgetProgressBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 150, 470, 20));

        jlbLoggedBudgetPlan.setFont(new java.awt.Font("Tw Cen MT", 1, 30)); // NOI18N
        jlbLoggedBudgetPlan.setForeground(new java.awt.Color(255, 255, 51));
        jlbLoggedBudgetPlan.setText("P0");
        getContentPane().add(jlbLoggedBudgetPlan, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 120, 110, 80));

        jLabel18.setFont(new java.awt.Font("Tw Cen MT", 1, 25)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 51));
        jLabel18.setText("Budget Bar :");
        getContentPane().add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 130, 160, 60));

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 32)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Your Budget Plan");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 100, 330, 40));

        jLabel13.setFont(new java.awt.Font("Verdana", 1, 45)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Be Sure to Follow");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 50, 480, 60));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/BudgetFoodImage.png"))); // NOI18N
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 20, 280, 160));

        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/MenuBG1.png"))); // NOI18N
        jLabel3.setFocusable(false);
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 40, -1, 140));

        jTabbedPane1.setTabPlacement(javax.swing.JTabbedPane.BOTTOM);

        jPanel3.setBackground(new java.awt.Color(105, 11, 34));

        jPanel10.setBackground(new java.awt.Color(155, 27, 58));
        jPanel10.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPane1.setBorder(null);

        jlstOrderTab.setBackground(new java.awt.Color(105, 11, 34));
        jlstOrderTab.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 50, 3, new java.awt.Color(135, 28, 43)), "ITEMS", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 32), new java.awt.Color(255, 255, 255))); // NOI18N
        jlstOrderTab.setFont(new java.awt.Font("Courier New", 1, 18)); // NOI18N
        jlstOrderTab.setForeground(new java.awt.Color(255, 255, 255));
        jlstOrderTab.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(jlstOrderTab);

        jPanel10.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 90, 289, 340));

        jLabel23.setFont(new java.awt.Font("Sylfaen", 1, 48)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(255, 255, 255));
        jLabel23.setText("Total");
        jPanel10.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 20, 130, 70));

        jLabel25.setFont(new java.awt.Font("Sylfaen", 1, 48)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(255, 255, 255));
        jLabel25.setText("Your Order");
        jPanel10.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 20, 250, 70));

        jlbDiscount.setFont(new java.awt.Font("Tw Cen MT", 1, 48)); // NOI18N
        jlbDiscount.setForeground(new java.awt.Color(255, 255, 102));
        jlbDiscount.setText("- 0%");
        jPanel10.add(jlbDiscount, new org.netbeans.lib.awtextra.AbsoluteConstraints(618, 50, 140, 90));

        jPanel11.setBackground(new java.awt.Color(105, 11, 34));
        jPanel11.setBorder(javax.swing.BorderFactory.createMatteBorder(5, 3, 5, 3, new java.awt.Color(255, 255, 255)));

        jlbOrderTotal.setFont(new java.awt.Font("Tahoma", 1, 55)); // NOI18N
        jlbOrderTotal.setForeground(new java.awt.Color(241, 243, 236));
        jlbOrderTotal.setText("P500");

        jlbTotalDescription.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jlbTotalDescription.setForeground(new java.awt.Color(255, 255, 204));
        jlbTotalDescription.setText("P300 higher than your daily goal");

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                .addContainerGap(38, Short.MAX_VALUE)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jlbTotalDescription, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                        .addComponent(jlbOrderTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(38, 38, 38))))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jlbOrderTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jlbTotalDescription, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );

        jPanel10.add(jPanel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 90, 280, 120));

        jbtmRemoveOrderButton.setBackground(new java.awt.Color(102, 0, 0));
        jbtmRemoveOrderButton.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jbtmRemoveOrderButton.setForeground(new java.awt.Color(255, 255, 255));
        jbtmRemoveOrderButton.setText("Remove");
        jbtmRemoveOrderButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jbtmRemoveOrderButton.setFocusPainted(false);
        jbtmRemoveOrderButton.setFocusable(false);
        jbtmRemoveOrderButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtmRemoveOrderButtonActionPerformed(evt);
            }
        });
        jPanel10.add(jbtmRemoveOrderButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 440, 90, 30));

        jPanel7.setBackground(new java.awt.Color(105, 11, 34));
        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createMatteBorder(5, 3, 5, 3, new java.awt.Color(255, 255, 255)), "STATUS", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 24), new java.awt.Color(255, 255, 255))); // NOI18N

        jlbOrderStatus.setFont(new java.awt.Font("Tw Cen MT", 1, 28)); // NOI18N
        jlbOrderStatus.setForeground(new java.awt.Color(255, 255, 255));
        jlbOrderStatus.setText("No Order");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap(36, Short.MAX_VALUE)
                .addComponent(jlbOrderStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addComponent(jlbOrderStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel10.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 340, 280, 90));

        jPanel13.setBackground(new java.awt.Color(105, 11, 34));
        jPanel13.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createMatteBorder(5, 3, 5, 3, new java.awt.Color(255, 255, 255)), "ORDER NOW!", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 24), new java.awt.Color(255, 255, 255))); // NOI18N

        jButton1.setBackground(new java.awt.Color(43, 39, 3));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Order");
        jButton1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton1.setFocusPainted(false);
        jButton1.setFocusable(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addGap(78, 78, 78)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addComponent(jButton1)
                .addGap(0, 17, Short.MAX_VALUE))
        );

        jPanel10.add(jPanel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 240, 280, 90));

        jbtnDeleteOrder.setBackground(new java.awt.Color(102, 0, 0));
        jbtnDeleteOrder.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jbtnDeleteOrder.setForeground(new java.awt.Color(255, 255, 255));
        jbtnDeleteOrder.setText("Delete Order");
        jbtnDeleteOrder.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jbtnDeleteOrder.setFocusPainted(false);
        jbtnDeleteOrder.setFocusable(false);
        jbtnDeleteOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnDeleteOrderActionPerformed(evt);
            }
        });
        jPanel10.add(jbtnDeleteOrder, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 440, 90, 30));

        jLabel28.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/GradientRedBG.png"))); // NOI18N
        jLabel28.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel10.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 770, 500));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(35, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(46, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("tab2", jPanel3);

        jPanel2.setBackground(new java.awt.Color(105, 11, 34));
        jPanel2.setFocusable(false);

        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jtxfBudgetBar.setBackground(new java.awt.Color(241, 227, 211));
        jtxfBudgetBar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jtxfBudgetBar.setForeground(new java.awt.Color(51, 102, 0));
        jtxfBudgetBar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(43, 39, 3), 3));
        jPanel4.add(jtxfBudgetBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 50, 160, 30));

        jtxfSearchBar.setBackground(new java.awt.Color(241, 227, 211));
        jtxfSearchBar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jtxfSearchBar.setForeground(new java.awt.Color(51, 102, 0));
        jtxfSearchBar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(43, 39, 3), 3));
        jtxfSearchBar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxfSearchBarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jtxfSearchBar, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jtxfSearchBar)
        );

        jPanel4.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 50, -1, 30));

        jcmbxSortCombo.setFont(new java.awt.Font("Sylfaen", 1, 25)); // NOI18N
        jcmbxSortCombo.setForeground(new java.awt.Color(255, 255, 255));
        jcmbxSortCombo.setText("Sort");
        jPanel4.add(jcmbxSortCombo, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 0, 60, 80));

        jLabel15.setFont(new java.awt.Font("Sylfaen", 1, 34)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Search");
        jPanel4.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 10, 150, 60));

        jLabel16.setFont(new java.awt.Font("Sylfaen", 1, 25)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Budget");
        jPanel4.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 10, 100, 60));

        jcbxSort.setBackground(new java.awt.Color(241, 227, 211));
        jcbxSort.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jcbxSort.setForeground(new java.awt.Color(51, 102, 0));
        jcbxSort.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Most Popular", "Chepeast" }));
        jcbxSort.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(43, 39, 3), 3));
        jcbxSort.setFocusable(false);
        jPanel4.add(jcbxSort, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 50, 140, 30));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/MenuBG2.png"))); // NOI18N
        jLabel5.setText("jLabel5");
        jLabel5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel4.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 780, 100));

        jPanel6.setBackground(new java.awt.Color(155, 27, 58));

        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/RightArrowIcon.png"))); // NOI18N

        jLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/LeftArrowIcon.png"))); // NOI18N

        jTabbedPane2.setTabPlacement(javax.swing.JTabbedPane.BOTTOM);
        jTabbedPane2.setFocusable(false);
        jTabbedPane2.addTab("", jTabbedPane3);
        jTabbedPane2.addTab("", jTabbedPane4);
        jTabbedPane2.addTab("", jTabbedPane5);

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel19)
                .addGap(20, 20, 20)
                .addComponent(jTabbedPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 656, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel20)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(176, 176, 176)
                        .addComponent(jLabel19))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(175, 175, 175)
                        .addComponent(jLabel20))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jTabbedPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 364, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(28, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 25, Short.MAX_VALUE))
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("tab1", jPanel2);

        jTabbedPane1.setSelectedIndex(1);

        getContentPane().add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 180, 830, 600));

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(241, 243, 236));
        jLabel17.setText("MENU");
        getContentPane().add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 0, -1, 40));

        jSeparator5.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator5.setForeground(new java.awt.Color(255, 255, 255));
        jSeparator5.setOrientation(javax.swing.SwingConstants.VERTICAL);
        getContentPane().add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 10, 90, 20));

        jSeparator6.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator6.setForeground(new java.awt.Color(255, 255, 255));
        jSeparator6.setOrientation(javax.swing.SwingConstants.VERTICAL);
        getContentPane().add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 10, 50, 20));

        jButton3.setBackground(new java.awt.Color(43, 71, 44));
        jButton3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton3.setForeground(new java.awt.Color(241, 243, 236));
        jButton3.setText("Log Out");
        jButton3.setBorder(null);
        jButton3.setFocusPainted(false);
        jButton3.setFocusable(false);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 0, 80, 40));

        jButton2.setBackground(new java.awt.Color(43, 71, 44));
        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(241, 243, 236));
        jButton2.setText("Profile");
        jButton2.setBorder(null);
        jButton2.setFocusPainted(false);
        jButton2.setFocusable(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 0, 80, 40));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/FoodMenuBG.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

   
    //Set Logged Account
    public void setLoggedAccount (SimplifiedAccount loggedAccount) {
        
        this.loggedAccount = loggedAccount;
        jlbLoggedBudgetPlan.setText("P" + loggedAccount.getBudgetGoal());
        jpgbBudgetProgressBar.setMaximum((int) Math.round((loggedAccount.getBudgetGoal())));
        
        
        if(!loggedAccount.getOrder().isEmpty()) {
            
            jpgbBudgetProgressBar.setValue(loggedAccount.getOrderSum());
            alreadyHaveAnOrder = false;
            
            if(loggedAccount.getOrderSum() <= jpgbBudgetProgressBar.getMaximum()) {
                jpgbBudgetProgressBar.setForeground(new Color(0,224,0));
            }
            else {
                jpgbBudgetProgressBar.setForeground(new Color(204,0,0));
            }
        }
        else jpgbBudgetProgressBar.setValue(0);
        
        listOfFoodOrdered =  new OrderList();
        
        jlstOrderTab.setModel(new DefaultListModel());
        model = (DefaultListModel<String>) jlstOrderTab.getModel();
        
        alreadyHaveAnOrder = !loggedAccount.getOrder().isEmpty();
        
        jcbxSort.addActionListener(e -> {
            activatePopulateFoodMenu();
        });
        
        jtxfSearchBar.addActionListener(e -> {
            activatePopulateFoodMenu();
        });
        
        jtxfBudgetBar.addActionListener(e -> {
            activatePopulateFoodMenu();
        });
        
        new FoodItemHandler(listOfFoodOrdered, jpgbBudgetProgressBar, model, alreadyHaveAnOrder);
        FoodItem.budgetGoal = loggedAccount.getBudgetGoal();
        extras();
        activatePopulateFoodMenu();
    }
    
    //This is the Mouse Listener for the Order/Menu JLabel (It's not a Button);
    private void jLabel10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseClicked
        
        if(!loggedAccount.getRank().equals(Rank.BRONZE)) jlbDiscount.setText("-%" + (int) (loggedAccount.getRank().getDiscount() * 100));
        
        if(jTabbedPane1.getSelectedIndex() == 1) {
            
            jTabbedPane1.setSelectedIndex(0);
            
            int budgetGoal = (int) Math.round(loggedAccount.getBudgetGoal());
            
            if(!loggedAccount.getOrder().isEmpty()) {
                
                if(!model.isEmpty()) return;
                
                jbtmRemoveOrderButton.setVisible(false);
                
                jlbOrderStatus.setText("Go to the Cashier");
                
                int sum = 0;
                
                for (Object item : loggedAccount.getOrder()) {

                    JSONObject jsonItem = (JSONObject) item;
                    int jsonItemPrice = Integer.parseInt(String.valueOf(jsonItem.get("price")));
                    model.addElement(jsonItem.get("foodName") + " " + jsonItemPrice);
                    sum += jsonItemPrice;
                }
                
                int discounted = (int) (sum - (sum * loggedAccount.getRank().getDiscount()));
                
                jlbOrderTotal.setText("%5s".formatted("P" + discounted));
                
                if(sum == 0) jlbTotalDescription.setText("");
                else if(sum <= budgetGoal)jlbTotalDescription.setText("P%d Under Budget Goal. Yay!".formatted(budgetGoal - discounted));
                else jlbTotalDescription.setText("P%d Higher than Budget Goal".formatted(discounted - budgetGoal));
            }
            else {
            
                int discounted = (int) (listOfFoodOrdered.getTotalPrice() - (listOfFoodOrdered.getTotalPrice() * loggedAccount.getRank().getDiscount()));
                
                jlbOrderStatus.setText("       No Order");

                jlbOrderTotal.setText("%5s".formatted("P" + discounted));

                if(listOfFoodOrdered.getTotalPrice() == 0) jlbTotalDescription.setText("");
                else if(listOfFoodOrdered.getTotalPrice() <= budgetGoal)jlbTotalDescription.setText("P%d Under Budget Goal. Yay!".formatted(budgetGoal - discounted));
                else jlbTotalDescription.setText("P%d Higher than Budget Goal".formatted(discounted - budgetGoal));

            }
        }
    }//GEN-LAST:event_jLabel10MouseClicked

    //This is the Action Listener for the Profile Button
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        this.setVisible(false);
        studentProfile.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    //This is the Action Listneer for the Log Out Button
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        this.setVisible(false);
        ExpenseProject.logIn.setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

    //This is the Action Listener for the Remove Button in the Order Tab
    private void jbtmRemoveOrderButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtmRemoveOrderButtonActionPerformed

        int selectedFoodInOrderIndex = jlstOrderTab.getSelectedIndex();
        
        if(selectedFoodInOrderIndex == -1) {
            JOptionPane.showMessageDialog(this, "Select Food Item to be Removed"); return;
        } 
        
        listOfFoodOrdered.removeFoodItem(selectedFoodInOrderIndex);
        model.remove(selectedFoodInOrderIndex);
        
        int budgetGoal = (int) Math.round(loggedAccount.getBudgetGoal());
        
        jlbOrderTotal.setText("%5s".formatted("P" + listOfFoodOrdered.getTotalPrice()));
        
        if(listOfFoodOrdered.getTotalPrice() == 0) jlbTotalDescription.setText("");
        else if(listOfFoodOrdered.getTotalPrice() <= budgetGoal)jlbTotalDescription.setText("P%d Under Budget Goal. Yay!".formatted(budgetGoal - listOfFoodOrdered.getTotalPrice()));
        else jlbTotalDescription.setText("P%d Higher than Budget Goal".formatted(listOfFoodOrdered.getTotalPrice() - budgetGoal));
        
        jpgbBudgetProgressBar.setValue(listOfFoodOrdered.getTotalPrice());
        if(referencedList.getTotalPrice() <= jpgbBudgetProgressBar.getMaximum()) {
            jpgbBudgetProgressBar.setForeground(new Color(0,153,0));
        }
        else {
            jpgbBudgetProgressBar.setForeground(new Color(204,0,0));
        }
    }//GEN-LAST:event_jbtmRemoveOrderButtonActionPerformed

    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        JSONArray accountOrder = loggedAccount.getOrder();
        
        if(!accountOrder.isEmpty()) {
            JOptionPane.showMessageDialog(this, "You Already Have a Pending Order"); return;
        }
        else if (listOfFoodOrdered.getSize() == 0) {
            JOptionPane.showMessageDialog(this, "You didn't order anything...", "Error", JOptionPane.ERROR_MESSAGE); return;
        }
        
        jbtmRemoveOrderButton.setVisible(false);
        jbtnDeleteOrder.setVisible(true);
        
        alreadyHaveAnOrder = true;
        FoodItem.alreadyHaveAnOrder = true;
        
        jlbOrderStatus.setText("Go to the Cashier");
        
        AccountHandler.updateOrderFile(loggedAccount.getUsername(),loggedAccount.getOrderPath(),listOfFoodOrdered);
        
        int discounted = (int) (listOfFoodOrdered.getTotalPrice() - (listOfFoodOrdered.getTotalPrice() * loggedAccount.getRank().getDiscount()));
        
        ExpenseProject.admin.orderHandler.addItem(loggedAccount.getUsername(), loggedAccount.getOrderPath(), listOfFoodOrdered.getSize(), discounted);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jbtnDeleteOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnDeleteOrderActionPerformed
        
        jlstOrderTab.setModel(new DefaultListModel());
        model = (DefaultListModel<String>) jlstOrderTab.getModel();
        
        listOfFoodOrdered = new OrderList();
        ExpenseProject.admin.orderHandler.removeItem(loggedAccount.getUsername());
        AccountHandler.updateOrderFile(loggedAccount.getUsername(), loggedAccount.getOrderPath(), listOfFoodOrdered);
        
        jlbOrderTotal.setText("  P0.0");
        jlbTotalDescription.setText("");
        jlbOrderStatus.setText("       No Order");
        
        jbtmRemoveOrderButton.setVisible(true);
        
        jpgbBudgetProgressBar.setForeground(new Color(0,224,0));
        
        alreadyHaveAnOrder = false;
        FoodItem.alreadyHaveAnOrder = false;
        jpgbBudgetProgressBar.setValue(0);
        
        FoodItem.referencedList = listOfFoodOrdered;
        FoodItem.list = model;
    }//GEN-LAST:event_jbtnDeleteOrderActionPerformed

    //Search Bar Action Listener -----------------------------------------------
    private void jtxfSearchBarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxfSearchBarActionPerformed
        
    }//GEN-LAST:event_jtxfSearchBarActionPerformed


    //This method is mainly for UI codes ------------------------
    public void extras () {
        
        Insets insets = UIManager.getInsets("TabbedPane.contentBorderInsets");
        insets.top = -1;
        insets.bottom = -1;
        insets.left = -1;
        insets.right = -1;
        UIManager.put("TabbedPane.contentBorderInsets", insets);
        
        for(JButton buttons : new JButton[]{jButton2, jButton3}) {
            
            buttons.setContentAreaFilled( false );
        
            buttons.addMouseListener(new MouseAdapter() {

                @Override
                public void mouseEntered(MouseEvent e) {
                    buttons.setForeground(new Color(204,204,255));
                }

                @Override
                public void mouseExited(MouseEvent e) {
                    buttons.setForeground(new Color(241,243,236));
                }
            });
        }
        
        jTabbedPane1.setLayout(new CardLayout());
        jTabbedPane2.setLayout(new CardLayout());
        jTabbedPane3.setLayout(new CardLayout());
        jTabbedPane4.setLayout(new CardLayout());
        jTabbedPane5.setLayout(new CardLayout());
        
        final JLabel[] LABEL_CATEGORIES_BUTTON = {jLabel7, jLabel8, jLabel9};
        
        for (int i = 0; i < 3; i++) {
            
            JLabel currentLabel = LABEL_CATEGORIES_BUTTON[i];
            
            final int x = i;
            
            currentLabel.addMouseListener(new MouseAdapter() {
                
            @Override
            public void mouseClicked(MouseEvent e) {
                
                jTabbedPane1.setSelectedIndex(1);
                jTabbedPane2.setSelectedIndex(x);
            }
        });
            
        }
        
        final JLabel[] LABEL_ARROWS_BUTTON = {jLabel19, jLabel20};
        final String[] LABEL_ARROWS_NAMES  = {"Right","Left"};
        
        for (int i = 0; i < 2; i++) {
            
            JLabel currentArrowLabel = LABEL_ARROWS_BUTTON[i];
            String currentArrowName = LABEL_ARROWS_NAMES[i];
            
            currentArrowLabel.addMouseListener(new MouseAdapter() {
                
            @Override
            public void mouseEntered(MouseEvent e) {
                currentArrowLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/" + currentArrowName + "ArrowIconHover.png")));
            }
            
            @Override
            public void mouseExited(MouseEvent e) {
                currentArrowLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/" + currentArrowName + "ArrowIcon.png")));
            }
        });
        }
        
        final JTabbedPane[] PAGES_FOR_CATEGORIES = {jTabbedPane3, jTabbedPane4, jTabbedPane5};
        
        jLabel19.addMouseListener(new MouseAdapter() {

            @Override
            public void mouseClicked(MouseEvent e) {
                
                JTabbedPane currentTab = PAGES_FOR_CATEGORIES[jTabbedPane2.getSelectedIndex()];
                int currentSelectedIndex = currentTab.getSelectedIndex();
                
                if(currentSelectedIndex - 1 >= 0) currentTab.setSelectedIndex(currentSelectedIndex - 1);
            }
        });
        
        jLabel20.addMouseListener(new MouseAdapter() {

            @Override
            public void mouseClicked(MouseEvent e) {
                
                
                
                JTabbedPane currentTab = PAGES_FOR_CATEGORIES[jTabbedPane2.getSelectedIndex()];
                int currentTabMaxPages = currentTab.getTabCount();
                
                int currentSelectedIndex = currentTab.getSelectedIndex();
                
                if(currentSelectedIndex + 1 < currentTabMaxPages) currentTab.setSelectedIndex(currentSelectedIndex + 1);
            }
        });
        
        
        final JLabel[] LABEL_BUTTONS_EXTRA = {jLabel7, jLabel8, jLabel9, jLabel10};
        final String[] LABEL_BUTTON_NAMES  = {"Foods","Drinks","Desserts","Order"};
        
        for(int i = 0; i < 4; i++) {
            
            JLabel labelButton = LABEL_BUTTONS_EXTRA[i];
            String labelButtonName = LABEL_BUTTON_NAMES[i];
            
            labelButton.addMouseListener(new MouseAdapter() {
                
            @Override
            public void mouseEntered(MouseEvent e) {
                labelButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/" + labelButtonName + "ButtonHover.png")));
            }
            
            @Override
            public void mouseExited(MouseEvent e) {
                
                labelButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/" + labelButtonName + "ButtonIdle.png")));
            }
        });
        }
        
        jScrollPane1.getVerticalScrollBar().setPreferredSize(new Dimension(10, 0));
        jScrollPane1.getVerticalScrollBar().setBackground(new Color(35,35,35));
        
        jScrollPane1.getHorizontalScrollBar().setPreferredSize(new Dimension(10, 0));
        jScrollPane1.getHorizontalScrollBar().setBackground(new Color(35,35,35));
    }
    
    //This is the Method that Populates the Menu Based on the Food Items contained in the (foodItem) JSON File
    public void activatePopulateFoodMenu () {
        
        int sortComboBoxInput = jcbxSort.getSelectedIndex();
        String searchBarInput = jtxfSearchBar.getText().trim();
        Integer budgetBarInput = null;
        
        if(!jtxfBudgetBar.getText().isBlank()) {
            try {
            budgetBarInput = Integer.valueOf(String.valueOf(jtxfBudgetBar.getText()));
            }
            catch(NumberFormatException e) {
                JOptionPane.showMessageDialog(this, "Budget Must Be an Integer", "Warning", JOptionPane.WARNING_MESSAGE);
            }
        }
        else if(budgetBarInput != null && budgetBarInput <= 40) JOptionPane.showMessageDialog(this, "The Chepeast Food Item is 40", "Warning", JOptionPane.WARNING_MESSAGE);
        
        jTabbedPane3.removeAll();
        jTabbedPane4.removeAll();
        jTabbedPane5.removeAll();
        
        populateFoodMenu(sortComboBoxInput, searchBarInput, budgetBarInput);
        
    }
    
    public void populateFoodMenu (int indexComboBox, String search, Integer budget) {
        
        final String[] CATEGORIES = FoodItemHandler.categoriesArray;
        final JTabbedPane[] TAB_PANES = {jTabbedPane3, jTabbedPane4, jTabbedPane5};
        
        int index = 0;
        
        for (String category : CATEGORIES) {
            
            var foodItems = new ArrayList<>(FoodItemHandler.foodItemsMap.get(category));
            
            switch (indexComboBox) {
                case 0 -> foodItems.sort(Comparator.comparing(FoodItem::getAmountBought));
                case 1 -> foodItems.sort(Comparator.comparing(FoodItem::getPrice));
                default -> foodItems.sort(Comparator.comparing(FoodItem::getAmountBought));
            }
            
            class newPanel extends JPanel {
                
                private final int NUM_OF_COL = 4;
                private final int NUM_OF_ROWS = 2;
                
                public newPanel() {
                    setLayout(new GridLayout(NUM_OF_ROWS, NUM_OF_COL));
                    setBackground(new Color(155,27,58));
                }
            }
            
            JPanel newTabbedPanel = new newPanel();
            TAB_PANES[index].addTab("",newTabbedPanel);
                    
            int size = 0;
            int count = 0;
            
            for (int i = 0; i < foodItems.size(); i++) {
                
                FoodItem foodItem = foodItems.get(i);
                
                if(count == 8) {
                    count = 0;
                    newTabbedPanel = new newPanel();
                    TAB_PANES[index].addTab("",newTabbedPanel);
                }
                
                if(!search.isBlank()) {
                    if((!foodItem.getName().toLowerCase().trim().contains(search.toLowerCase().trim()))) {
                        continue;
                    }
                }

                if(budget != null) {
                    
                    if(foodItem.getPrice() > budget && budget >= 40) {
                        continue;
                    }
                }
                
                newTabbedPanel.add(foodItem.getPanel());
                
                size++;
                count++;
            }
            
            
            if(newTabbedPanel.getComponentCount() == 0 && size > 0) {
                TAB_PANES[index].remove(newTabbedPanel);
            }
            
            
            if(size % 8 != 0) {
                for (int i = 0; i < (int) Math.abs((size%8) - 8); i++) {
                    newTabbedPanel.add(new FoodItem("Empty").getPanel());
                }
            }
            
            index++;
        }
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JTabbedPane jTabbedPane3;
    private javax.swing.JTabbedPane jTabbedPane4;
    private javax.swing.JTabbedPane jTabbedPane5;
    private javax.swing.JButton jbtmRemoveOrderButton;
    private javax.swing.JButton jbtnDeleteOrder;
    private javax.swing.JComboBox<String> jcbxSort;
    private javax.swing.JLabel jcmbxSortCombo;
    private javax.swing.JLabel jlbDiscount;
    private javax.swing.JLabel jlbLoggedBudgetPlan;
    private javax.swing.JLabel jlbOrderStatus;
    private javax.swing.JLabel jlbOrderTotal;
    private javax.swing.JLabel jlbTotalDescription;
    private javax.swing.JList<String> jlstOrderTab;
    private javax.swing.JProgressBar jpgbBudgetProgressBar;
    private javax.swing.JTextField jtxfBudgetBar;
    private javax.swing.JTextField jtxfSearchBar;
    // End of variables declaration//GEN-END:variables
}
