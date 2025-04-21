package frames;

import classes.AccountHandler;
import classes.AdminExpenses.Expenses;
import classes.ExpenseProject;
import classes.FoodType;
import classes.OrderList;
import classes.OrderListHandler;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Insets;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.FileReader;
import java.io.FileWriter;
import java.time.LocalDate;
import java.time.temporal.WeekFields;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import javax.swing.DefaultListModel;
import javax.swing.JLabel;
import javax.swing.UIManager;
import javax.swing.table.DefaultTableModel;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;


public final class BetterAdminAnalysis extends javax.swing.JFrame {

    OrderListHandler orderHandler = new OrderListHandler();
    JSONObject expense = new JSONObject();
    JSONArray expenses = new JSONArray();
    final String FILE_PATH = "src/jsonFiles/allExpenses.json";
    
    // Models for Each table
    public DefaultTableModel model = new DefaultTableModel();
    public DefaultTableModel expensesModel = new DefaultTableModel();
    
    //Number of Expenses
    int index = 0;
    
    //list of expenses per type, daily, weekly, and monthly.
    List<Object[]> overAllExpenses = new ArrayList<>();
    
    Expenses overAll = new Expenses(null);
    
    Expenses foods = new Expenses(FoodType.FOODS);
    Expenses drinks = new Expenses(FoodType.DRINKS);
    Expenses desserts = new Expenses(FoodType.DESSERTS);
    
    public BetterAdminAnalysis() {
        
        initComponents();
        extras();
        convertExpensesToJSONArray();
        populateCashierOrder();
        populatExpensesTable();
        
        arrangeAllExpenses(overAll);
        arrangeAllExpenses(foods);
        arrangeAllExpenses(drinks);
        arrangeAllExpenses(desserts);
        
        setLocationRelativeTo(null);
        setResizable(false);
    }
    
    
    // method mostly for UI
    public final void extras () {
        

        model = (DefaultTableModel) jtblCashierOrder.getModel();
        
        Insets insets = UIManager.getInsets("TabbedPane.contentBorderInsets");
        insets.top = -1;
        insets.bottom = -1;
        insets.left = -1;
        insets.right = -1;
        UIManager.put("TabbedPane.contentBorderInsets", insets);
        
        jTabbedPane1.setLayout(new CardLayout());
        
        jButton3.setContentAreaFilled( false );
        
        final JLabel[] LABEL_BUTTONS = {jLabel20, jLabel5, jLabel6};
        final String[] LABEL_BUTTON_NAMES  = {"AdminOrder","Sales","Record","Account"};
        
        for(int i = 0; i < 3; i++) {
            
            JLabel labelButton = LABEL_BUTTONS[i];
            String labelButtonName = LABEL_BUTTON_NAMES[i];
            final int x = i;
            
            
            labelButton.addMouseListener(new MouseAdapter() {
                
            @Override
            public void mouseEntered(MouseEvent e) {
                labelButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/" + labelButtonName + "ButtonHover.png")));
            }
            
            @Override
            public void mouseExited(MouseEvent e) {
                labelButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/" + labelButtonName + "ButtonIdle.png")));
            }
            
            @Override
            public void mouseClicked(MouseEvent e) {
                if(labelButton == jLabel6) setReport();
                jTabbedPane1.setSelectedIndex(x);
            }
        });
        }
        
        jLabel18.addMouseListener(new MouseAdapter() {

            @Override
            public void mouseEntered(MouseEvent e) {
                jLabel18.setForeground(new Color(204,204,255));
            }

            @Override
            public void mouseExited(MouseEvent e) {
                jLabel18.setForeground(new Color(241,243,236));
            }
        });
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel6 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jtblCashierOrder = new javax.swing.JTable();
        jScrollPane4 = new javax.swing.JScrollPane();
        jlstSelectedOrder = new javax.swing.JList<>();
        jtbnRemovePurchase = new javax.swing.JButton();
        jbtnConfirmPurchase = new javax.swing.JButton();
        jPanel16 = new javax.swing.JPanel();
        jlbTotal = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton6 = new javax.swing.JButton();
        jtxfSearchBar = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtblExpensesTable = new javax.swing.JTable();
        jComboBox1 = new javax.swing.JComboBox<>();
        jButton7 = new javax.swing.JButton();
        jLabel26 = new javax.swing.JLabel();
        jComboBox4 = new javax.swing.JComboBox<>();
        jPanel3 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator6 = new javax.swing.JSeparator();
        jPanel9 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jlbTodayFoodOrder = new javax.swing.JLabel();
        jlbTodayDrinksOrder = new javax.swing.JLabel();
        jlbTodayDessertsOrder = new javax.swing.JLabel();
        jlbTodayFoodAvg = new javax.swing.JLabel();
        jlbTodayDessertsOrderAvg = new javax.swing.JLabel();
        jlbTodayDrinksOrderAvg = new javax.swing.JLabel();
        jlbTodayFoodSales = new javax.swing.JLabel();
        jlbTodayDrinksSales = new javax.swing.JLabel();
        jlbTodayDessertsSale = new javax.swing.JLabel();
        jlbTodayFoodSalesAvg = new javax.swing.JLabel();
        jlbTodayDrinksSalesAvg = new javax.swing.JLabel();
        jlbTodayDessertsSaleAvg = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jPanel18 = new javax.swing.JPanel();
        jPanel17 = new javax.swing.JPanel();
        jPanel12 = new javax.swing.JPanel();
        jLabel27 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jlbOverallFoodOrder = new javax.swing.JLabel();
        jlbOverallDrinksOrder = new javax.swing.JLabel();
        jlbOverallDessertsOrder = new javax.swing.JLabel();
        jlbOverallFoodSales = new javax.swing.JLabel();
        jlbOverallDrinksSales = new javax.swing.JLabel();
        jlbOverallDessertsSales = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jlbDailyOverallOrders = new javax.swing.JLabel();
        jlbDailyOverallTotalSalesAvg = new javax.swing.JLabel();
        jlbDailyOverallOrdersAvg = new javax.swing.JLabel();
        jlbDailyOverallTotalSales = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jlbWeekOverallOrder = new javax.swing.JLabel();
        jlbWeekOverallOrderAvg = new javax.swing.JLabel();
        jlbWeekOverallSales = new javax.swing.JLabel();
        jlbWeekOverallSalesAvg = new javax.swing.JLabel();
        jPanel13 = new javax.swing.JPanel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jlbWeekFoodOrder = new javax.swing.JLabel();
        jlbWeekDrinksOrder = new javax.swing.JLabel();
        jlbWeekDessertsOrder = new javax.swing.JLabel();
        jlbWeekFoodOrderAvg = new javax.swing.JLabel();
        jlbWeekDrinksOrderAvg = new javax.swing.JLabel();
        jlbWeekDessertOrderAvg = new javax.swing.JLabel();
        jlbWeekFoodSales = new javax.swing.JLabel();
        jlbWeekDrinksSales = new javax.swing.JLabel();
        jlbWeekDessertsSales = new javax.swing.JLabel();
        jlbWeekFoodSalesAvg = new javax.swing.JLabel();
        jlbWeekDrinksSalesAvg = new javax.swing.JLabel();
        jlbWeekDessertsSalesAvg = new javax.swing.JLabel();
        jPanel14 = new javax.swing.JPanel();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jlbMonthFoodOrder = new javax.swing.JLabel();
        jlbMonthDrinksOrder = new javax.swing.JLabel();
        jlbMonthDessertsOrder = new javax.swing.JLabel();
        jlbMonthFoodOrderAvg = new javax.swing.JLabel();
        jlbMonthDrinksOrderAvg = new javax.swing.JLabel();
        jlbMonthDessertsOrderAvg = new javax.swing.JLabel();
        jlbMonthFoodSales = new javax.swing.JLabel();
        jlbMonthDrinksSales = new javax.swing.JLabel();
        jlbMonthDessertsSales = new javax.swing.JLabel();
        jlbMonthFoodSalesAvg = new javax.swing.JLabel();
        jlbMonthDrinksSalesAvg = new javax.swing.JLabel();
        jlbMonthDessertsSalesAvg = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        jlbMonthOverallOrder = new javax.swing.JLabel();
        jlbMonthOverallOrderAvg = new javax.swing.JLabel();
        jlbMonthOverallSales = new javax.swing.JLabel();
        jlbMonthOverallSalesAvg = new javax.swing.JLabel();
        jPanel15 = new javax.swing.JPanel();
        jlbOverallOrder = new javax.swing.JLabel();
        jlbOverallSales = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jPanel11 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jComboBox3 = new javax.swing.JComboBox<>();
        jComboBox6 = new javax.swing.JComboBox<>();
        jComboBox7 = new javax.swing.JComboBox<>();
        jButton3 = new javax.swing.JButton();
        jTextField2 = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximizedBounds(new java.awt.Rectangle(1050, 750, 750, 750));
        setMaximumSize(new java.awt.Dimension(1050, 750));
        setMinimumSize(new java.awt.Dimension(1050, 750));
        setPreferredSize(new java.awt.Dimension(1050, 750));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(41, 88, 79));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/FoodsDatabaseIcon.png"))); // NOI18N

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/SalesButtonIdle.png"))); // NOI18N

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/RecordButtonIdle.png"))); // NOI18N

        jLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/AdminOrderButtonIdle.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(15, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel20, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel3)
                .addGap(52, 52, 52)
                .addComponent(jLabel20)
                .addGap(37, 37, 37)
                .addComponent(jLabel5)
                .addGap(34, 34, 34)
                .addComponent(jLabel6)
                .addContainerGap(383, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 160, 710));

        jTabbedPane1.setTabPlacement(javax.swing.JTabbedPane.BOTTOM);

        jPanel6.setBackground(new java.awt.Color(95, 122, 110));
        jPanel6.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 200, 1, new java.awt.Color(51, 65, 59)));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPane3.setBackground(new java.awt.Color(116, 168, 146));
        jScrollPane3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jScrollPane3.setForeground(new java.awt.Color(255, 255, 255));
        jScrollPane3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        jtblCashierOrder.setBackground(new java.awt.Color(116, 168, 146));
        jtblCashierOrder.setFont(new java.awt.Font("Tw Cen MT", 1, 14)); // NOI18N
        jtblCashierOrder.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
            },
            new String [] {
                "Username", "Total Cost", "Total Item", "Date", "Time"
            }
        ));
        jtblCashierOrder.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtblCashierOrderMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(jtblCashierOrder);

        jPanel6.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 490, 580));

        jlstSelectedOrder.setBackground(new java.awt.Color(88, 141, 118));
        jlstSelectedOrder.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 50, 3, new java.awt.Color(65, 104, 87)), "SELECTED ORDER", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tw Cen MT Condensed Extra Bold", 1, 30), new java.awt.Color(255, 255, 255))); // NOI18N
        jlstSelectedOrder.setFont(new java.awt.Font("Courier New", 1, 18)); // NOI18N
        jlstSelectedOrder.setForeground(new java.awt.Color(255, 255, 255));
        jScrollPane4.setViewportView(jlstSelectedOrder);

        jPanel6.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 80, 290, 270));

        jtbnRemovePurchase.setBackground(new java.awt.Color(51, 0, 0));
        jtbnRemovePurchase.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 24)); // NOI18N
        jtbnRemovePurchase.setForeground(new java.awt.Color(255, 255, 255));
        jtbnRemovePurchase.setText("Remove Purchase");
        jtbnRemovePurchase.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jtbnRemovePurchase.setEnabled(false);
        jtbnRemovePurchase.setFocusPainted(false);
        jtbnRemovePurchase.setFocusable(false);
        jtbnRemovePurchase.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtbnRemovePurchaseActionPerformed(evt);
            }
        });
        jPanel6.add(jtbnRemovePurchase, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 600, 190, 40));

        jbtnConfirmPurchase.setBackground(new java.awt.Color(0, 51, 0));
        jbtnConfirmPurchase.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 24)); // NOI18N
        jbtnConfirmPurchase.setForeground(new java.awt.Color(255, 255, 255));
        jbtnConfirmPurchase.setText("Confirm Purchase");
        jbtnConfirmPurchase.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jbtnConfirmPurchase.setEnabled(false);
        jbtnConfirmPurchase.setFocusPainted(false);
        jbtnConfirmPurchase.setFocusable(false);
        jbtnConfirmPurchase.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnConfirmPurchaseActionPerformed(evt);
            }
        });
        jPanel6.add(jbtnConfirmPurchase, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 540, 190, 40));

        jPanel16.setBackground(new java.awt.Color(88, 141, 118));
        jPanel16.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 50, 3, new java.awt.Color(65, 104, 87)), "TOTAL", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tw Cen MT Condensed Extra Bold", 1, 30), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel16.setForeground(new java.awt.Color(255, 255, 255));
        jPanel16.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jlbTotal.setFont(new java.awt.Font("Tw Cen MT", 1, 48)); // NOI18N
        jlbTotal.setForeground(new java.awt.Color(255, 255, 255));
        jlbTotal.setText("    P0.0");
        jPanel16.add(jlbTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, 210, 80));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("*shows discount*");
        jPanel16.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 100, 30));

        jPanel6.add(jPanel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 370, 290, 150));

        jButton6.setBackground(new java.awt.Color(255, 255, 255));
        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/searchh.png"))); // NOI18N
        jButton6.setBorder(null);
        jButton6.setFocusPainted(false);
        jButton6.setFocusable(false);
        jPanel6.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 20, -1, 40));

        jtxfSearchBar.setBackground(new java.awt.Color(255, 255, 255));
        jtxfSearchBar.setFont(new java.awt.Font("Tw Cen MT", 1, 24)); // NOI18N
        jtxfSearchBar.setForeground(new java.awt.Color(24, 57, 43));
        jtxfSearchBar.setBorder(null);
        jtxfSearchBar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxfSearchBarActionPerformed(evt);
            }
        });
        jPanel6.add(jtxfSearchBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, 170, 30));

        jLabel24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/AccountsSearchBar.png"))); // NOI18N
        jPanel6.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        jTabbedPane1.addTab("tab4", jPanel6);

        jPanel2.setBackground(new java.awt.Color(95, 122, 110));
        jPanel2.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 200, 1, new java.awt.Color(51, 65, 59)));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPane1.setBackground(new java.awt.Color(116, 168, 146));
        jScrollPane1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jScrollPane1.setForeground(new java.awt.Color(0, 0, 0));
        jScrollPane1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        jtblExpensesTable.setBackground(new java.awt.Color(116, 168, 146));
        jtblExpensesTable.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jtblExpensesTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
            },
            new String [] {
                "No", "Food Name", "Price", "Type"
            }
        ));
        jScrollPane1.setViewportView(jtblExpensesTable);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 840, 580));

        jComboBox1.setBackground(new java.awt.Color(179, 169, 145));
        jComboBox1.setFont(new java.awt.Font("Tw Cen MT", 1, 16)); // NOI18N
        jComboBox1.setForeground(new java.awt.Color(66, 60, 45));
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Overall,", "Daily,", "Weekly,", "Monthly" }));
        jComboBox1.setBorder(null);
        jComboBox1.setFocusable(false);
        jComboBox1.setLightWeightPopupEnabled(false);
        jComboBox1.setRequestFocusEnabled(false);
        jComboBox1.setVerifyInputWhenFocusTarget(false);
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        jPanel2.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 30, 110, 28));

        jButton7.setBackground(new java.awt.Color(255, 255, 255));
        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/searchh.png"))); // NOI18N
        jButton7.setBorder(null);
        jButton7.setFocusPainted(false);
        jButton7.setFocusable(false);
        jPanel2.add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 20, -1, 40));

        jLabel26.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/AccountsSearchBar.png"))); // NOI18N
        jPanel2.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        jComboBox4.setBackground(new java.awt.Color(179, 169, 145));
        jComboBox4.setFont(new java.awt.Font("Tw Cen MT", 1, 16)); // NOI18N
        jComboBox4.setForeground(new java.awt.Color(66, 60, 45));
        jComboBox4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Any,", "Food,", "Drinks,", "Desserts" }));
        jComboBox4.setBorder(null);
        jComboBox4.setFocusable(false);
        jComboBox4.setLightWeightPopupEnabled(false);
        jComboBox4.setRequestFocusEnabled(false);
        jComboBox4.setVerifyInputWhenFocusTarget(false);
        jComboBox4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox4ActionPerformed(evt);
            }
        });
        jPanel2.add(jComboBox4, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 30, 110, 28));

        jTabbedPane1.addTab("tab1", jPanel2);

        jPanel3.setBackground(new java.awt.Color(95, 122, 110));
        jPanel3.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 200, 1, new java.awt.Color(51, 65, 59)));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel5.setBackground(new java.awt.Color(245, 245, 245));
        jPanel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(213, 255, 244), 3));
        jPanel5.setForeground(new java.awt.Color(245, 245, 245));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jSeparator2.setForeground(new java.awt.Color(255, 255, 255));
        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jPanel5.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 0, 50, 660));

        jSeparator1.setForeground(new java.awt.Color(255, 255, 255));
        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jPanel5.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 10, 40, 660));

        jSeparator3.setForeground(new java.awt.Color(255, 255, 255));
        jSeparator3.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jPanel5.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 10, 20, 660));

        jSeparator6.setForeground(new java.awt.Color(255, 255, 255));
        jSeparator6.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jPanel5.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 10, 30, 660));

        jPanel9.setBackground(new java.awt.Color(88, 141, 118));
        jPanel9.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel9.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("FOODS :");
        jPanel9.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 14, -1, 17));

        jLabel9.setBackground(new java.awt.Color(255, 255, 255));
        jLabel9.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("DRINKS :");
        jPanel9.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 37, -1, -1));

        jLabel13.setBackground(new java.awt.Color(255, 255, 255));
        jLabel13.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("DESSERTS :");
        jPanel9.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 63, 81, -1));

        jlbTodayFoodOrder.setBackground(new java.awt.Color(255, 255, 255));
        jlbTodayFoodOrder.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 18)); // NOI18N
        jlbTodayFoodOrder.setForeground(new java.awt.Color(255, 255, 255));
        jlbTodayFoodOrder.setText("0");
        jPanel9.add(jlbTodayFoodOrder, new org.netbeans.lib.awtextra.AbsoluteConstraints(174, 14, -1, 17));

        jlbTodayDrinksOrder.setBackground(new java.awt.Color(255, 255, 255));
        jlbTodayDrinksOrder.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 18)); // NOI18N
        jlbTodayDrinksOrder.setForeground(new java.awt.Color(255, 255, 255));
        jlbTodayDrinksOrder.setText("0");
        jPanel9.add(jlbTodayDrinksOrder, new org.netbeans.lib.awtextra.AbsoluteConstraints(174, 39, -1, 17));

        jlbTodayDessertsOrder.setBackground(new java.awt.Color(255, 255, 255));
        jlbTodayDessertsOrder.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 18)); // NOI18N
        jlbTodayDessertsOrder.setForeground(new java.awt.Color(255, 255, 255));
        jlbTodayDessertsOrder.setText("0");
        jPanel9.add(jlbTodayDessertsOrder, new org.netbeans.lib.awtextra.AbsoluteConstraints(174, 65, -1, 17));

        jlbTodayFoodAvg.setBackground(new java.awt.Color(255, 255, 255));
        jlbTodayFoodAvg.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 18)); // NOI18N
        jlbTodayFoodAvg.setForeground(new java.awt.Color(255, 255, 255));
        jlbTodayFoodAvg.setText("0");
        jPanel9.add(jlbTodayFoodAvg, new org.netbeans.lib.awtextra.AbsoluteConstraints(317, 14, -1, 17));

        jlbTodayDessertsOrderAvg.setBackground(new java.awt.Color(255, 255, 255));
        jlbTodayDessertsOrderAvg.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 18)); // NOI18N
        jlbTodayDessertsOrderAvg.setForeground(new java.awt.Color(255, 255, 255));
        jlbTodayDessertsOrderAvg.setText("0");
        jPanel9.add(jlbTodayDessertsOrderAvg, new org.netbeans.lib.awtextra.AbsoluteConstraints(317, 65, -1, 17));

        jlbTodayDrinksOrderAvg.setBackground(new java.awt.Color(255, 255, 255));
        jlbTodayDrinksOrderAvg.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 18)); // NOI18N
        jlbTodayDrinksOrderAvg.setForeground(new java.awt.Color(255, 255, 255));
        jlbTodayDrinksOrderAvg.setText("0");
        jPanel9.add(jlbTodayDrinksOrderAvg, new org.netbeans.lib.awtextra.AbsoluteConstraints(317, 39, -1, 17));

        jlbTodayFoodSales.setBackground(new java.awt.Color(255, 255, 255));
        jlbTodayFoodSales.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 18)); // NOI18N
        jlbTodayFoodSales.setForeground(new java.awt.Color(255, 255, 255));
        jlbTodayFoodSales.setText("0");
        jPanel9.add(jlbTodayFoodSales, new org.netbeans.lib.awtextra.AbsoluteConstraints(463, 14, -1, 17));

        jlbTodayDrinksSales.setBackground(new java.awt.Color(255, 255, 255));
        jlbTodayDrinksSales.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 18)); // NOI18N
        jlbTodayDrinksSales.setForeground(new java.awt.Color(255, 255, 255));
        jlbTodayDrinksSales.setText("0");
        jPanel9.add(jlbTodayDrinksSales, new org.netbeans.lib.awtextra.AbsoluteConstraints(463, 39, -1, 17));

        jlbTodayDessertsSale.setBackground(new java.awt.Color(255, 255, 255));
        jlbTodayDessertsSale.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 18)); // NOI18N
        jlbTodayDessertsSale.setForeground(new java.awt.Color(255, 255, 255));
        jlbTodayDessertsSale.setText("0");
        jPanel9.add(jlbTodayDessertsSale, new org.netbeans.lib.awtextra.AbsoluteConstraints(463, 65, -1, 17));

        jlbTodayFoodSalesAvg.setBackground(new java.awt.Color(255, 255, 255));
        jlbTodayFoodSalesAvg.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 18)); // NOI18N
        jlbTodayFoodSalesAvg.setForeground(new java.awt.Color(255, 255, 255));
        jlbTodayFoodSalesAvg.setText("0");
        jPanel9.add(jlbTodayFoodSalesAvg, new org.netbeans.lib.awtextra.AbsoluteConstraints(605, 14, -1, 17));

        jlbTodayDrinksSalesAvg.setBackground(new java.awt.Color(255, 255, 255));
        jlbTodayDrinksSalesAvg.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 18)); // NOI18N
        jlbTodayDrinksSalesAvg.setForeground(new java.awt.Color(255, 255, 255));
        jlbTodayDrinksSalesAvg.setText("0");
        jPanel9.add(jlbTodayDrinksSalesAvg, new org.netbeans.lib.awtextra.AbsoluteConstraints(605, 39, -1, 17));

        jlbTodayDessertsSaleAvg.setBackground(new java.awt.Color(255, 255, 255));
        jlbTodayDessertsSaleAvg.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 18)); // NOI18N
        jlbTodayDessertsSaleAvg.setForeground(new java.awt.Color(255, 255, 255));
        jlbTodayDessertsSaleAvg.setText("0");
        jPanel9.add(jlbTodayDessertsSaleAvg, new org.netbeans.lib.awtextra.AbsoluteConstraints(605, 65, -1, 17));

        jPanel5.add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 10, 690, 90));

        jLabel11.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 1, 35)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(24, 57, 43));
        jLabel11.setText("TODAY");
        jPanel5.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 120, 100));

        jLabel12.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 1, 35)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(24, 57, 43));
        jLabel12.setText("WEEK");
        jPanel5.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, 120, 120));

        jLabel14.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 1, 30)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(24, 57, 43));
        jLabel14.setText("OVERALL");
        jPanel5.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 480, -1, 60));

        jLabel16.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 1, 30)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(24, 57, 43));
        jLabel16.setText("MONTH");
        jPanel5.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 320, 130, 80));

        jPanel18.setBackground(new java.awt.Color(245, 245, 245));

        javax.swing.GroupLayout jPanel18Layout = new javax.swing.GroupLayout(jPanel18);
        jPanel18.setLayout(jPanel18Layout);
        jPanel18Layout.setHorizontalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel18Layout.setVerticalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel5.add(jPanel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 460, 120, 150));

        jPanel17.setBackground(new java.awt.Color(245, 245, 245));

        javax.swing.GroupLayout jPanel17Layout = new javax.swing.GroupLayout(jPanel17);
        jPanel17.setLayout(jPanel17Layout);
        jPanel17Layout.setHorizontalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 120, Short.MAX_VALUE)
        );
        jPanel17Layout.setVerticalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 150, Short.MAX_VALUE)
        );

        jPanel5.add(jPanel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 460, 120, 150));

        jPanel12.setBackground(new java.awt.Color(88, 141, 118));
        jPanel12.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel12.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel27.setBackground(new java.awt.Color(255, 255, 255));
        jLabel27.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 18)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(255, 255, 255));
        jLabel27.setText("FOODS :");
        jPanel12.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(19, 8, -1, -1));

        jLabel30.setBackground(new java.awt.Color(255, 255, 255));
        jLabel30.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 18)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(255, 255, 255));
        jLabel30.setText("DRINKS :");
        jPanel12.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(19, 34, -1, -1));

        jLabel25.setBackground(new java.awt.Color(255, 255, 255));
        jLabel25.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 18)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(255, 255, 255));
        jLabel25.setText("DESSERTS :");
        jPanel12.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(19, 60, 81, -1));

        jlbOverallFoodOrder.setBackground(new java.awt.Color(255, 255, 255));
        jlbOverallFoodOrder.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 18)); // NOI18N
        jlbOverallFoodOrder.setForeground(new java.awt.Color(255, 255, 255));
        jlbOverallFoodOrder.setText("0");
        jPanel12.add(jlbOverallFoodOrder, new org.netbeans.lib.awtextra.AbsoluteConstraints(169, 10, -1, 17));

        jlbOverallDrinksOrder.setBackground(new java.awt.Color(255, 255, 255));
        jlbOverallDrinksOrder.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 18)); // NOI18N
        jlbOverallDrinksOrder.setForeground(new java.awt.Color(255, 255, 255));
        jlbOverallDrinksOrder.setText("0");
        jPanel12.add(jlbOverallDrinksOrder, new org.netbeans.lib.awtextra.AbsoluteConstraints(169, 36, -1, 17));

        jlbOverallDessertsOrder.setBackground(new java.awt.Color(255, 255, 255));
        jlbOverallDessertsOrder.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 18)); // NOI18N
        jlbOverallDessertsOrder.setForeground(new java.awt.Color(255, 255, 255));
        jlbOverallDessertsOrder.setText("0");
        jPanel12.add(jlbOverallDessertsOrder, new org.netbeans.lib.awtextra.AbsoluteConstraints(169, 62, -1, 17));

        jlbOverallFoodSales.setBackground(new java.awt.Color(255, 255, 255));
        jlbOverallFoodSales.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 18)); // NOI18N
        jlbOverallFoodSales.setForeground(new java.awt.Color(255, 255, 255));
        jlbOverallFoodSales.setText("0");
        jPanel12.add(jlbOverallFoodSales, new org.netbeans.lib.awtextra.AbsoluteConstraints(461, 7, 60, 20));

        jlbOverallDrinksSales.setBackground(new java.awt.Color(255, 255, 255));
        jlbOverallDrinksSales.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 18)); // NOI18N
        jlbOverallDrinksSales.setForeground(new java.awt.Color(255, 255, 255));
        jlbOverallDrinksSales.setText("0");
        jPanel12.add(jlbOverallDrinksSales, new org.netbeans.lib.awtextra.AbsoluteConstraints(461, 36, -1, 17));

        jlbOverallDessertsSales.setBackground(new java.awt.Color(255, 255, 255));
        jlbOverallDessertsSales.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 18)); // NOI18N
        jlbOverallDessertsSales.setForeground(new java.awt.Color(255, 255, 255));
        jlbOverallDessertsSales.setText("0");
        jPanel12.add(jlbOverallDessertsSales, new org.netbeans.lib.awtextra.AbsoluteConstraints(461, 62, -1, 17));

        jPanel5.add(jPanel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 460, 690, 90));

        jPanel7.setBackground(new java.awt.Color(116, 168, 146));
        jPanel7.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jlbDailyOverallOrders.setBackground(new java.awt.Color(255, 255, 255));
        jlbDailyOverallOrders.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 18)); // NOI18N
        jlbDailyOverallOrders.setForeground(new java.awt.Color(255, 255, 255));
        jlbDailyOverallOrders.setText("0");
        jPanel7.add(jlbDailyOverallOrders, new org.netbeans.lib.awtextra.AbsoluteConstraints(172, 10, -1, -1));

        jlbDailyOverallTotalSalesAvg.setBackground(new java.awt.Color(255, 255, 255));
        jlbDailyOverallTotalSalesAvg.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 18)); // NOI18N
        jlbDailyOverallTotalSalesAvg.setForeground(new java.awt.Color(255, 255, 255));
        jlbDailyOverallTotalSalesAvg.setText("0");
        jPanel7.add(jlbDailyOverallTotalSalesAvg, new org.netbeans.lib.awtextra.AbsoluteConstraints(601, 8, -1, 24));

        jlbDailyOverallOrdersAvg.setBackground(new java.awt.Color(255, 255, 255));
        jlbDailyOverallOrdersAvg.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 18)); // NOI18N
        jlbDailyOverallOrdersAvg.setForeground(new java.awt.Color(255, 255, 255));
        jlbDailyOverallOrdersAvg.setText("0");
        jPanel7.add(jlbDailyOverallOrdersAvg, new org.netbeans.lib.awtextra.AbsoluteConstraints(318, 8, -1, 24));

        jlbDailyOverallTotalSales.setBackground(new java.awt.Color(255, 255, 255));
        jlbDailyOverallTotalSales.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 18)); // NOI18N
        jlbDailyOverallTotalSales.setForeground(new java.awt.Color(255, 255, 255));
        jlbDailyOverallTotalSales.setText("0");
        jPanel7.add(jlbDailyOverallTotalSales, new org.netbeans.lib.awtextra.AbsoluteConstraints(462, 8, -1, 24));

        jPanel5.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 110, 690, 40));

        jPanel8.setBackground(new java.awt.Color(116, 168, 146));
        jPanel8.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jlbWeekOverallOrder.setBackground(new java.awt.Color(255, 255, 255));
        jlbWeekOverallOrder.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 18)); // NOI18N
        jlbWeekOverallOrder.setForeground(new java.awt.Color(255, 255, 255));
        jlbWeekOverallOrder.setText("0");
        jPanel8.add(jlbWeekOverallOrder, new org.netbeans.lib.awtextra.AbsoluteConstraints(169, 10, -1, -1));

        jlbWeekOverallOrderAvg.setBackground(new java.awt.Color(255, 255, 255));
        jlbWeekOverallOrderAvg.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 18)); // NOI18N
        jlbWeekOverallOrderAvg.setForeground(new java.awt.Color(255, 255, 255));
        jlbWeekOverallOrderAvg.setText("0");
        jPanel8.add(jlbWeekOverallOrderAvg, new org.netbeans.lib.awtextra.AbsoluteConstraints(317, 8, -1, 24));

        jlbWeekOverallSales.setBackground(new java.awt.Color(255, 255, 255));
        jlbWeekOverallSales.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 18)); // NOI18N
        jlbWeekOverallSales.setForeground(new java.awt.Color(255, 255, 255));
        jlbWeekOverallSales.setText("0");
        jPanel8.add(jlbWeekOverallSales, new org.netbeans.lib.awtextra.AbsoluteConstraints(463, 8, -1, 24));

        jlbWeekOverallSalesAvg.setBackground(new java.awt.Color(255, 255, 255));
        jlbWeekOverallSalesAvg.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 18)); // NOI18N
        jlbWeekOverallSalesAvg.setForeground(new java.awt.Color(255, 255, 255));
        jlbWeekOverallSalesAvg.setText("0");
        jPanel8.add(jlbWeekOverallSalesAvg, new org.netbeans.lib.awtextra.AbsoluteConstraints(607, 8, -1, 24));

        jPanel5.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 260, 690, 40));

        jPanel13.setBackground(new java.awt.Color(88, 141, 118));
        jPanel13.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel13.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel32.setBackground(new java.awt.Color(255, 255, 255));
        jLabel32.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 18)); // NOI18N
        jLabel32.setForeground(new java.awt.Color(255, 255, 255));
        jLabel32.setText("FOODS :");
        jPanel13.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 14, -1, 17));

        jLabel33.setBackground(new java.awt.Color(255, 255, 255));
        jLabel33.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 18)); // NOI18N
        jLabel33.setForeground(new java.awt.Color(255, 255, 255));
        jLabel33.setText("DRINKS :");
        jPanel13.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 37, -1, -1));

        jLabel34.setBackground(new java.awt.Color(255, 255, 255));
        jLabel34.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 18)); // NOI18N
        jLabel34.setForeground(new java.awt.Color(255, 255, 255));
        jLabel34.setText("DESSERTS :");
        jPanel13.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 63, 81, -1));

        jlbWeekFoodOrder.setBackground(new java.awt.Color(255, 255, 255));
        jlbWeekFoodOrder.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 18)); // NOI18N
        jlbWeekFoodOrder.setForeground(new java.awt.Color(255, 255, 255));
        jlbWeekFoodOrder.setText("0");
        jPanel13.add(jlbWeekFoodOrder, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 14, -1, 17));

        jlbWeekDrinksOrder.setBackground(new java.awt.Color(255, 255, 255));
        jlbWeekDrinksOrder.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 18)); // NOI18N
        jlbWeekDrinksOrder.setForeground(new java.awt.Color(255, 255, 255));
        jlbWeekDrinksOrder.setText("0");
        jPanel13.add(jlbWeekDrinksOrder, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 39, -1, 17));

        jlbWeekDessertsOrder.setBackground(new java.awt.Color(255, 255, 255));
        jlbWeekDessertsOrder.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 18)); // NOI18N
        jlbWeekDessertsOrder.setForeground(new java.awt.Color(255, 255, 255));
        jlbWeekDessertsOrder.setText("0");
        jPanel13.add(jlbWeekDessertsOrder, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 65, -1, 17));

        jlbWeekFoodOrderAvg.setBackground(new java.awt.Color(255, 255, 255));
        jlbWeekFoodOrderAvg.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 18)); // NOI18N
        jlbWeekFoodOrderAvg.setForeground(new java.awt.Color(255, 255, 255));
        jlbWeekFoodOrderAvg.setText("0");
        jPanel13.add(jlbWeekFoodOrderAvg, new org.netbeans.lib.awtextra.AbsoluteConstraints(318, 14, -1, 17));

        jlbWeekDrinksOrderAvg.setBackground(new java.awt.Color(255, 255, 255));
        jlbWeekDrinksOrderAvg.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 18)); // NOI18N
        jlbWeekDrinksOrderAvg.setForeground(new java.awt.Color(255, 255, 255));
        jlbWeekDrinksOrderAvg.setText("0");
        jPanel13.add(jlbWeekDrinksOrderAvg, new org.netbeans.lib.awtextra.AbsoluteConstraints(318, 39, -1, 17));

        jlbWeekDessertOrderAvg.setBackground(new java.awt.Color(255, 255, 255));
        jlbWeekDessertOrderAvg.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 18)); // NOI18N
        jlbWeekDessertOrderAvg.setForeground(new java.awt.Color(255, 255, 255));
        jlbWeekDessertOrderAvg.setText("0");
        jPanel13.add(jlbWeekDessertOrderAvg, new org.netbeans.lib.awtextra.AbsoluteConstraints(318, 65, -1, 17));

        jlbWeekFoodSales.setBackground(new java.awt.Color(255, 255, 255));
        jlbWeekFoodSales.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 18)); // NOI18N
        jlbWeekFoodSales.setForeground(new java.awt.Color(255, 255, 255));
        jlbWeekFoodSales.setText("0");
        jPanel13.add(jlbWeekFoodSales, new org.netbeans.lib.awtextra.AbsoluteConstraints(464, 14, -1, 17));

        jlbWeekDrinksSales.setBackground(new java.awt.Color(255, 255, 255));
        jlbWeekDrinksSales.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 18)); // NOI18N
        jlbWeekDrinksSales.setForeground(new java.awt.Color(255, 255, 255));
        jlbWeekDrinksSales.setText("0");
        jPanel13.add(jlbWeekDrinksSales, new org.netbeans.lib.awtextra.AbsoluteConstraints(464, 39, -1, 17));

        jlbWeekDessertsSales.setBackground(new java.awt.Color(255, 255, 255));
        jlbWeekDessertsSales.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 18)); // NOI18N
        jlbWeekDessertsSales.setForeground(new java.awt.Color(255, 255, 255));
        jlbWeekDessertsSales.setText("0");
        jPanel13.add(jlbWeekDessertsSales, new org.netbeans.lib.awtextra.AbsoluteConstraints(464, 65, -1, 17));

        jlbWeekFoodSalesAvg.setBackground(new java.awt.Color(255, 255, 255));
        jlbWeekFoodSalesAvg.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 18)); // NOI18N
        jlbWeekFoodSalesAvg.setForeground(new java.awt.Color(255, 255, 255));
        jlbWeekFoodSalesAvg.setText("0");
        jPanel13.add(jlbWeekFoodSalesAvg, new org.netbeans.lib.awtextra.AbsoluteConstraints(601, 14, 63, 17));

        jlbWeekDrinksSalesAvg.setBackground(new java.awt.Color(255, 255, 255));
        jlbWeekDrinksSalesAvg.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 18)); // NOI18N
        jlbWeekDrinksSalesAvg.setForeground(new java.awt.Color(255, 255, 255));
        jlbWeekDrinksSalesAvg.setText("0");
        jPanel13.add(jlbWeekDrinksSalesAvg, new org.netbeans.lib.awtextra.AbsoluteConstraints(601, 39, -1, 17));

        jlbWeekDessertsSalesAvg.setBackground(new java.awt.Color(255, 255, 255));
        jlbWeekDessertsSalesAvg.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 18)); // NOI18N
        jlbWeekDessertsSalesAvg.setForeground(new java.awt.Color(255, 255, 255));
        jlbWeekDessertsSalesAvg.setText("0");
        jPanel13.add(jlbWeekDessertsSalesAvg, new org.netbeans.lib.awtextra.AbsoluteConstraints(601, 65, -1, 17));

        jPanel5.add(jPanel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 160, 690, 90));

        jPanel14.setBackground(new java.awt.Color(88, 141, 118));
        jPanel14.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel14.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel35.setBackground(new java.awt.Color(255, 255, 255));
        jLabel35.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 18)); // NOI18N
        jLabel35.setForeground(new java.awt.Color(255, 255, 255));
        jLabel35.setText("FOODS :");
        jPanel14.add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 14, -1, 17));

        jLabel36.setBackground(new java.awt.Color(255, 255, 255));
        jLabel36.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 18)); // NOI18N
        jLabel36.setForeground(new java.awt.Color(255, 255, 255));
        jLabel36.setText("DRINKS :");
        jPanel14.add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 37, -1, -1));

        jLabel37.setBackground(new java.awt.Color(255, 255, 255));
        jLabel37.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 18)); // NOI18N
        jLabel37.setForeground(new java.awt.Color(255, 255, 255));
        jLabel37.setText("DESSERTS :");
        jPanel14.add(jLabel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 63, 81, -1));

        jlbMonthFoodOrder.setBackground(new java.awt.Color(255, 255, 255));
        jlbMonthFoodOrder.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 18)); // NOI18N
        jlbMonthFoodOrder.setForeground(new java.awt.Color(255, 255, 255));
        jlbMonthFoodOrder.setText("0");
        jPanel14.add(jlbMonthFoodOrder, new org.netbeans.lib.awtextra.AbsoluteConstraints(171, 14, -1, 17));

        jlbMonthDrinksOrder.setBackground(new java.awt.Color(255, 255, 255));
        jlbMonthDrinksOrder.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 18)); // NOI18N
        jlbMonthDrinksOrder.setForeground(new java.awt.Color(255, 255, 255));
        jlbMonthDrinksOrder.setText("0");
        jPanel14.add(jlbMonthDrinksOrder, new org.netbeans.lib.awtextra.AbsoluteConstraints(171, 39, -1, 17));

        jlbMonthDessertsOrder.setBackground(new java.awt.Color(255, 255, 255));
        jlbMonthDessertsOrder.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 18)); // NOI18N
        jlbMonthDessertsOrder.setForeground(new java.awt.Color(255, 255, 255));
        jlbMonthDessertsOrder.setText("0");
        jPanel14.add(jlbMonthDessertsOrder, new org.netbeans.lib.awtextra.AbsoluteConstraints(171, 65, -1, 17));

        jlbMonthFoodOrderAvg.setBackground(new java.awt.Color(255, 255, 255));
        jlbMonthFoodOrderAvg.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 18)); // NOI18N
        jlbMonthFoodOrderAvg.setForeground(new java.awt.Color(255, 255, 255));
        jlbMonthFoodOrderAvg.setText("0");
        jPanel14.add(jlbMonthFoodOrderAvg, new org.netbeans.lib.awtextra.AbsoluteConstraints(317, 14, -1, 17));

        jlbMonthDrinksOrderAvg.setBackground(new java.awt.Color(255, 255, 255));
        jlbMonthDrinksOrderAvg.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 18)); // NOI18N
        jlbMonthDrinksOrderAvg.setForeground(new java.awt.Color(255, 255, 255));
        jlbMonthDrinksOrderAvg.setText("0");
        jPanel14.add(jlbMonthDrinksOrderAvg, new org.netbeans.lib.awtextra.AbsoluteConstraints(317, 39, -1, 17));

        jlbMonthDessertsOrderAvg.setBackground(new java.awt.Color(255, 255, 255));
        jlbMonthDessertsOrderAvg.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 18)); // NOI18N
        jlbMonthDessertsOrderAvg.setForeground(new java.awt.Color(255, 255, 255));
        jlbMonthDessertsOrderAvg.setText("0");
        jPanel14.add(jlbMonthDessertsOrderAvg, new org.netbeans.lib.awtextra.AbsoluteConstraints(317, 65, -1, 17));

        jlbMonthFoodSales.setBackground(new java.awt.Color(255, 255, 255));
        jlbMonthFoodSales.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 18)); // NOI18N
        jlbMonthFoodSales.setForeground(new java.awt.Color(255, 255, 255));
        jlbMonthFoodSales.setText("0");
        jPanel14.add(jlbMonthFoodSales, new org.netbeans.lib.awtextra.AbsoluteConstraints(464, 14, -1, 17));

        jlbMonthDrinksSales.setBackground(new java.awt.Color(255, 255, 255));
        jlbMonthDrinksSales.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 18)); // NOI18N
        jlbMonthDrinksSales.setForeground(new java.awt.Color(255, 255, 255));
        jlbMonthDrinksSales.setText("0");
        jPanel14.add(jlbMonthDrinksSales, new org.netbeans.lib.awtextra.AbsoluteConstraints(464, 39, -1, 17));

        jlbMonthDessertsSales.setBackground(new java.awt.Color(255, 255, 255));
        jlbMonthDessertsSales.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 18)); // NOI18N
        jlbMonthDessertsSales.setForeground(new java.awt.Color(255, 255, 255));
        jlbMonthDessertsSales.setText("0");
        jPanel14.add(jlbMonthDessertsSales, new org.netbeans.lib.awtextra.AbsoluteConstraints(464, 65, -1, 17));

        jlbMonthFoodSalesAvg.setBackground(new java.awt.Color(255, 255, 255));
        jlbMonthFoodSalesAvg.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 18)); // NOI18N
        jlbMonthFoodSalesAvg.setForeground(new java.awt.Color(255, 255, 255));
        jlbMonthFoodSalesAvg.setText("0");
        jPanel14.add(jlbMonthFoodSalesAvg, new org.netbeans.lib.awtextra.AbsoluteConstraints(605, 14, -1, 17));

        jlbMonthDrinksSalesAvg.setBackground(new java.awt.Color(255, 255, 255));
        jlbMonthDrinksSalesAvg.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 18)); // NOI18N
        jlbMonthDrinksSalesAvg.setForeground(new java.awt.Color(255, 255, 255));
        jlbMonthDrinksSalesAvg.setText("0");
        jPanel14.add(jlbMonthDrinksSalesAvg, new org.netbeans.lib.awtextra.AbsoluteConstraints(605, 39, -1, 17));

        jlbMonthDessertsSalesAvg.setBackground(new java.awt.Color(255, 255, 255));
        jlbMonthDessertsSalesAvg.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 18)); // NOI18N
        jlbMonthDessertsSalesAvg.setForeground(new java.awt.Color(255, 255, 255));
        jlbMonthDessertsSalesAvg.setText("0");
        jPanel14.add(jlbMonthDessertsSalesAvg, new org.netbeans.lib.awtextra.AbsoluteConstraints(605, 65, -1, 17));

        jPanel5.add(jPanel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 310, 690, 90));

        jPanel10.setBackground(new java.awt.Color(116, 168, 146));
        jPanel10.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel10.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jlbMonthOverallOrder.setBackground(new java.awt.Color(255, 255, 255));
        jlbMonthOverallOrder.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 18)); // NOI18N
        jlbMonthOverallOrder.setForeground(new java.awt.Color(255, 255, 255));
        jlbMonthOverallOrder.setText("0");
        jPanel10.add(jlbMonthOverallOrder, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 10, -1, -1));

        jlbMonthOverallOrderAvg.setBackground(new java.awt.Color(255, 255, 255));
        jlbMonthOverallOrderAvg.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 18)); // NOI18N
        jlbMonthOverallOrderAvg.setForeground(new java.awt.Color(255, 255, 255));
        jlbMonthOverallOrderAvg.setText("0");
        jPanel10.add(jlbMonthOverallOrderAvg, new org.netbeans.lib.awtextra.AbsoluteConstraints(318, 8, -1, 24));

        jlbMonthOverallSales.setBackground(new java.awt.Color(255, 255, 255));
        jlbMonthOverallSales.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 18)); // NOI18N
        jlbMonthOverallSales.setForeground(new java.awt.Color(255, 255, 255));
        jlbMonthOverallSales.setText("0");
        jPanel10.add(jlbMonthOverallSales, new org.netbeans.lib.awtextra.AbsoluteConstraints(463, 10, -1, -1));

        jlbMonthOverallSalesAvg.setBackground(new java.awt.Color(255, 255, 255));
        jlbMonthOverallSalesAvg.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 18)); // NOI18N
        jlbMonthOverallSalesAvg.setForeground(new java.awt.Color(255, 255, 255));
        jlbMonthOverallSalesAvg.setText("0");
        jPanel10.add(jlbMonthOverallSalesAvg, new org.netbeans.lib.awtextra.AbsoluteConstraints(606, 10, -1, -1));

        jPanel5.add(jPanel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 410, 690, 40));

        jPanel15.setBackground(new java.awt.Color(116, 168, 146));
        jPanel15.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel15.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jlbOverallOrder.setBackground(new java.awt.Color(255, 255, 255));
        jlbOverallOrder.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 18)); // NOI18N
        jlbOverallOrder.setForeground(new java.awt.Color(255, 255, 255));
        jlbOverallOrder.setText("0");
        jPanel15.add(jlbOverallOrder, new org.netbeans.lib.awtextra.AbsoluteConstraints(171, 17, -1, 17));

        jlbOverallSales.setBackground(new java.awt.Color(255, 255, 255));
        jlbOverallSales.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 18)); // NOI18N
        jlbOverallSales.setForeground(new java.awt.Color(255, 255, 255));
        jlbOverallSales.setText("0");
        jPanel15.add(jlbOverallSales, new org.netbeans.lib.awtextra.AbsoluteConstraints(461, 17, -1, 17));

        jPanel5.add(jPanel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 560, 690, 50));

        jPanel3.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 842, 620));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Total Orders");
        jPanel3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 0, 120, 40));

        jLabel21.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setText("Total Sales");
        jPanel3.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 0, -1, 40));

        jLabel19.setFont(new java.awt.Font("MS UI Gothic", 1, 24)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("Avg");
        jPanel3.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 0, -1, 40));

        jLabel23.setFont(new java.awt.Font("MS UI Gothic", 1, 24)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(255, 255, 255));
        jLabel23.setText("Avg");
        jPanel3.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(767, 0, 60, 40));

        jTabbedPane1.addTab("tab2", jPanel3);

        jPanel4.setBackground(new java.awt.Color(95, 122, 110));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPane2.setBackground(new java.awt.Color(150, 154, 131));
        jScrollPane2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(254, 254, 180), 3));

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jTable2);

        jPanel4.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(9, 101, 400, 390));

        jPanel11.setBackground(new java.awt.Color(150, 154, 131));
        jPanel11.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jButton2.setBackground(new java.awt.Color(116, 0, 0));
        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Delete");
        jButton2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jComboBox3.setBackground(new java.awt.Color(179, 169, 145));
        jComboBox3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jComboBox3.setForeground(new java.awt.Color(255, 255, 255));
        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jComboBox6.setBackground(new java.awt.Color(179, 169, 145));
        jComboBox6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jComboBox6.setForeground(new java.awt.Color(255, 255, 255));
        jComboBox6.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jComboBox7.setBackground(new java.awt.Color(179, 169, 145));
        jComboBox7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jComboBox7.setForeground(new java.awt.Color(255, 255, 255));
        jComboBox7.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(41, Short.MAX_VALUE))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jComboBox6, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jComboBox7, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
        );

        jPanel4.add(jPanel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 160, 180, 190));

        jButton3.setBackground(new java.awt.Color(255, 255, 255));
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/searchh.png"))); // NOI18N
        jButton3.setBorder(null);
        jPanel4.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 30, -1, 40));

        jTextField2.setBackground(new java.awt.Color(255, 255, 255));
        jTextField2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jTextField2.setForeground(new java.awt.Color(150, 154, 131));
        jTextField2.setBorder(null);
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });
        jPanel4.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 36, 170, 30));

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/AccountsSearchBar.png"))); // NOI18N
        jPanel4.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 30, -1, -1));

        jTabbedPane1.addTab("tab3", jPanel4);

        getContentPane().add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 40, 890, 730));

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(241, 243, 236));
        jLabel17.setText("ADMIN");
        getContentPane().add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 0, -1, 40));

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(241, 243, 236));
        jLabel18.setText("Log Out");
        jLabel18.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel18MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 0, -1, 40));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/FoodBG.png"))); // NOI18N
        jLabel1.setMaximumSize(new java.awt.Dimension(1050, 750));
        jLabel1.setMinimumSize(new java.awt.Dimension(1050, 750));
        jLabel1.setPreferredSize(new java.awt.Dimension(1050, 750));
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 750));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    //convert expenses json file to JSONArray
    public void convertExpensesToJSONArray() {
        
        try(FileReader reader = new FileReader(FILE_PATH)) {
            expense = (JSONObject) new JSONParser().parse(reader);
            expenses = (JSONArray) expense.get("expenses");
        }
        catch(Exception e) {
            System.out.println(e);
        }
    }
    
    //populate the cashier order table
    public void populateCashierOrder () {

        for (Object o : orderHandler.getAllOrders()) {
            
            JSONObject jo = (JSONObject) o;
            
            Object[] newOrder = new Object[5];
            
            newOrder[0] = String.valueOf(jo.get("username"));
            newOrder[1] = jo.get("totalCost");
            newOrder[2] = jo.get("totalItems");
            newOrder[3] = jo.get("date");
            newOrder[4] = jo.get("time");
            
            model.addRow(newOrder);
        }
    }
    
    //add order to the cashier
    public void addCashierOrder() {
        
            JSONObject jo = (JSONObject) orderHandler.getAllOrders().getLast();
            
            Object[] newOrder = new Object[5];
            
            newOrder[0] = String.valueOf(jo.get("username"));
            newOrder[1] = jo.get("totalCost");
            newOrder[2] = jo.get("totalItems");
            newOrder[3] = jo.get("date");
            newOrder[4] = jo.get("time");
            
            model.addRow(newOrder);
    }
    
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jLabel18MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel18MouseClicked
        this.setVisible(false);
        ExpenseProject.logIn.setVisible(true);
    }//GEN-LAST:event_jLabel18MouseClicked

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    // ActionListener to when you click a row in the jtable
    private void jtblCashierOrderMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtblCashierOrderMouseClicked
         
        JSONArray selectedOrder = orderHandler.getOrderPath(jtblCashierOrder.getSelectedRow());
        JSONObject selectedDirectOrder = orderHandler.getOrder(jtblCashierOrder.getSelectedRow());
        
        jlstSelectedOrder.setModel(new DefaultListModel());
        DefaultListModel listModel = (DefaultListModel) jlstSelectedOrder.getModel();

        for(Object o : selectedOrder) {
            
            JSONObject jo = (JSONObject) o;
            int jsonItemPrice = Integer.parseInt(String.valueOf(jo.get("price")));
            listModel.addElement(jo.get("foodName") + " " + jsonItemPrice);
        }
        
        int total = Integer.parseInt(String.valueOf(selectedDirectOrder.get("totalCost")));
        
        jlbTotal.setText("%8s".formatted("P" + total));
        
        jbtnConfirmPurchase.setEnabled(true);
        jtbnRemovePurchase.setEnabled(true);
    }//GEN-LAST:event_jtblCashierOrderMouseClicked

    //IGNORE -------------------------------------------------------------------
    boolean enteredUsername = false;
    DefaultTableModel newModelTemp = null;
    int specifiedRow = 0;
    
    public void setDefault () {
        enteredUsername = false;
        newModelTemp = null;
        specifiedRow = 0;
    }
    //--------------------------------------------------------------------------
    
    //ActionListener to the Confirm Purchase Button
    private void jbtnConfirmPurchaseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnConfirmPurchaseActionPerformed
        
        jtbnRemovePurchase.setEnabled(false);
        jbtnConfirmPurchase.setEnabled(false);
        
        System.out.println(enteredUsername);
        
        int selectedRowIndex = (enteredUsername) ? 0 : jtblCashierOrder.getSelectedRow();
        
        JSONObject getOrder = (enteredUsername) ? orderHandler.getItem(specifiedRow) : orderHandler.getItem(selectedRowIndex);
        JSONArray selectedOrder = orderHandler.getOrderPath(selectedRowIndex);
        
        String username = String.valueOf(getOrder.get("username"));
        
        //save items to account expenses
        AccountHandler.addExpenses(username, selectedOrder);
        
        //save items to expenses
        expenses.addAll(selectedOrder);
        
        
        
        for (Object o : selectedOrder) {
            
            JSONObject jo = (JSONObject) o;
            
            Object[] expenseAr = new Object[5];
            
            expenseAr[0] = index++;
            expenseAr[1] = jo.get("foodName");
            expenseAr[2] = jo.get("type");
            expenseAr[3] = jo.get("price");
            expenseAr[4] = jo.get("date");
            
            System.out.println(index);
            
            expensesModel.addRow(expenseAr);
        }
        
        saveExpesnesFile();
        
        //delete order to account_order.json
        AccountHandler.updateOrderFile(username, String.valueOf(getOrder.get("orderPath")), new OrderList());
        
        //dete order to order.json
        orderHandler.removeItem(username);
        
        if(enteredUsername) {
            newModelTemp.removeRow(selectedRowIndex);
            model.removeRow(specifiedRow);
        }
        else model.removeRow(selectedRowIndex);
    }//GEN-LAST:event_jbtnConfirmPurchaseActionPerformed

    
    //Action Listener for Remove Button
    private void jtbnRemovePurchaseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtbnRemovePurchaseActionPerformed

        jtbnRemovePurchase.setEnabled(false);
        jbtnConfirmPurchase.setEnabled(false);
        
        int selectedRowIndex = jtblCashierOrder.getSelectedRow();
        
        JSONObject getOrder = (enteredUsername) ? orderHandler.getItem(specifiedRow) : orderHandler.getItem(selectedRowIndex);
        String username = String.valueOf(getOrder.get("username"));
        
        if(enteredUsername) {
            newModelTemp.removeRow(selectedRowIndex);
            model.removeRow(specifiedRow);
        }
        else model.removeRow(selectedRowIndex);
        
        AccountHandler.updateOrderFile(username, String.valueOf(getOrder.get("orderPath")), new OrderList());
        orderHandler.removeItem(username);
    }//GEN-LAST:event_jtbnRemovePurchaseActionPerformed

    // action perform for the search bar
    private void jtxfSearchBarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxfSearchBarActionPerformed

        String input = jtxfSearchBar.getText();
        
        if(input.isBlank()) {
            jtblCashierOrder.setModel(model);
            enteredUsername = false;
            return;
        }
        
        jtblCashierOrder.setModel(new DefaultTableModel(new String [] {
            "Username", "Total Cost", "Total Item", "Date", "Time"
        }, 0));
        
        DefaultTableModel newModel = (DefaultTableModel) jtblCashierOrder.getModel();
        
        int count = 0;
        
        for(Object o : orderHandler.getAllOrders()) {
            JSONObject jo = (JSONObject) o;
            
            String joUsername = (String) jo.get("username");
            
            if(joUsername.toLowerCase().trim().equals(input.toLowerCase().trim())) {
                
                enteredUsername = true;
                newModelTemp = newModel;
                
                Object[] newOrder = new Object[5];
            
                newOrder[0] = String.valueOf(jo.get("username"));
                newOrder[1] = jo.get("totalCost");
                newOrder[2] = jo.get("totalItems");
                newOrder[3] = jo.get("date");
                newOrder[4] = jo.get("time");
                
                newModel.addRow(newOrder);
                specifiedRow = count;
                return;
            }
            count++;
        }
        enteredUsername = false;
    }//GEN-LAST:event_jtxfSearchBarActionPerformed

    int currentSelectedTimeIndex = 0; 
    int currentSelectedTypeIndex = 0;
            
    private void jComboBox4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox4ActionPerformed

        currentSelectedTimeIndex = jComboBox4.getSelectedIndex();
        modifyExepenseTable(currentSelectedTimeIndex, currentSelectedTypeIndex);
    }//GEN-LAST:event_jComboBox4ActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        
        currentSelectedTypeIndex = jComboBox1.getSelectedIndex();
        modifyExepenseTable(currentSelectedTimeIndex, currentSelectedTypeIndex);
    }//GEN-LAST:event_jComboBox1ActionPerformed

    
    public void arrangeAllExpenses (Expenses typeExpenses) {
        
        //day, recent week, recent month, recentYear Now
        LocalDate dateNow = LocalDate.now();
        
        Integer recentWeek = dateNow.get(WeekFields.of(Locale.getDefault()).weekOfYear());
        Integer recentMonth = dateNow.getMonthValue();
        Integer recentYear = dateNow.getYear();
        
        //Temp Daily, Weekly, and Monthly Sum and Index
        Double totalSum = 0.0, dailySum = 0.0, weeklySum = 0.0, monthlySum = 0.0;
        
        int overAllIndex = 1, dailyIndex = -1, weeklyIndex = -1, monthlyIndex = -1;
        
        //Temp Current Day, Week, Month, and Year for Week and Month (to check if month or week is on diff year)
        String currentDay = null;
        Integer currentWeek = null;
        Integer currentMonth = null;
        Integer currentYearWeek = null;
        Integer currentYearMonth = null;
        
        //Object Arrays for Daily, Weekly, and Monthly Expenses
        Object[] newDailyExpense = null, newWeeklyExpense = null, newMonthlyExpense = null;
        
        
        //main loop
        for(Object oExpense : expenses) {
            
            JSONObject jsonExpense = (JSONObject) oExpense;

            String currentExpenseFoodName = (String) jsonExpense.get("foodName");
            Integer currentExpensePrice = Integer.valueOf(String.valueOf(jsonExpense.get("price")));
            String currentExpenseDateBought = (String) jsonExpense.get("date");
            String currentExpenseType = (String) jsonExpense.get("type");
            
            Integer currentExpenseWeekYear = Integer.valueOf(String.valueOf(jsonExpense.get("weekYearBought")));
            Integer currentExpenseMonthBought = Integer.valueOf(String.valueOf(jsonExpense.get("monthBoughtInNum")));
            Integer currentExpenseYearBought = Integer.valueOf(currentExpenseDateBought.substring(0,currentExpenseDateBought.indexOf("-")));
            
            Object[] objectExpense = new Object[5];
            
            objectExpense[0] = overAllIndex++;
            objectExpense[1] = currentExpenseFoodName;
            objectExpense[2] = currentExpensePrice;
            objectExpense[3] = currentExpenseType;
            
            
            if(typeExpenses.getType() != null) {
                if(!currentExpenseType.toLowerCase().trim().equals(typeExpenses.getType().toString().toLowerCase().trim())) {
                    continue;
                }
            }
            
            
            //Daily Code ---------------------------------------------------------------------------------------------------------------------
            if(!currentExpenseDateBought.equals(currentDay)) {
                
                currentDay = currentExpenseDateBought;
                dailyIndex++; 
                dailySum = 0.0;
                typeExpenses.getDailyPur().add(new ArrayList<>());
                newDailyExpense = new Object[5];
                typeExpenses.getDaily().add(newDailyExpense);
                
                newDailyExpense[0] = currentExpenseDateBought;
            }
            
            typeExpenses.getDailyPur().get(dailyIndex).add(objectExpense);
            
            dailySum += currentExpensePrice;
            newDailyExpense[1] = typeExpenses.getDailyPur().get(dailyIndex).size();
            newDailyExpense[2] = dailySum;
            
//            newDailyExpense[3] = dailySum / typeExpenses.getDailyPur().get(dailyIndex).size();
            
//            System.out.println(typeExpenses.getDaily());
            //-----------------------------------------------------------------------------------------------------------------------------------
        
            
            // Weekly Code ----------------------------------------------------------------------------------------------------------------------
            if(!currentExpenseWeekYear.equals(currentWeek) || !currentExpenseYearBought.equals(currentYearWeek)) {
                
                currentWeek = currentExpenseWeekYear;
                
                weeklyIndex++; 
                weeklySum = 0.0;
                typeExpenses.getWeeklyPur().add(new ArrayList<>());
                newWeeklyExpense = new Object[5];
                typeExpenses.getWeekly().add(newWeeklyExpense);
                
                newWeeklyExpense[0] = (Objects.equals(currentExpenseWeekYear, recentWeek) && Objects.equals(recentYear, currentExpenseYearBought)) ? "this week" : "" + (((((currentExpenseYearBought - recentYear) == 0) ? recentWeek - currentExpenseWeekYear : ((52 * (recentYear - currentExpenseYearBought)) + currentExpenseWeekYear) - recentWeek))) + " week ago";
                currentYearWeek = currentExpenseYearBought;
            }
            
            typeExpenses.getWeeklyPur().get(weeklyIndex).add(objectExpense);
            
            weeklySum += currentExpensePrice;
            newWeeklyExpense[1] = typeExpenses.getWeeklyPur().get(weeklyIndex).size();
            newWeeklyExpense[2] = weeklySum;
            newWeeklyExpense[3] = currentExpenseWeekYear;
            newWeeklyExpense[4] = currentExpenseYearBought;
            
//            newWeeklyExpense[2] = weeklySum / typeExpenses.getWeeklyPur().get(weeklyIndex).size();s

            //-----------------------------------------------------------------------------------------------------------------------------------
            
            
            // Monthly Code ---------------------------------------------------------------------------------------------------------------------
            if(!currentExpenseMonthBought.equals(currentMonth) || !currentExpenseYearBought.equals(currentYearMonth)) {
                
                currentMonth = currentExpenseMonthBought;
                
                monthlyIndex++; 
                monthlySum = 0.0;
                typeExpenses.getMonthlyPur().add(new ArrayList<>());
                newMonthlyExpense = new Object[5];
                typeExpenses.getMonthly().add(newMonthlyExpense);
                newMonthlyExpense[0] = (Objects.equals(currentExpenseMonthBought, recentMonth) && currentExpenseYearBought.equals(recentYear)) ? "this month" : "" + (((((currentExpenseYearBought - recentYear) == 0) ? currentExpenseMonthBought : ((12 * (recentYear - currentExpenseYearBought)) + currentExpenseMonthBought) - recentMonth))) + " month/s ago";
                currentYearMonth = currentExpenseYearBought;
            }
            
            typeExpenses.getMonthlyPur().get(monthlyIndex).add(objectExpense);
            
            monthlySum += currentExpensePrice;
            newMonthlyExpense[1] = typeExpenses.getMonthlyPur().get(monthlyIndex).size();
            newMonthlyExpense[2] = monthlySum;
            newMonthlyExpense[3] = currentExpenseMonthBought;
            newMonthlyExpense[4] = currentExpenseYearBought;
//            newMonthlyExpense[2] = monthlySum / typeExpenses.getMonthlyPur().get(monthlyIndex).size();
            
            // ----------------------------------------------------------------------------------------------------------------------------------
        
            // Overall --------------------------------------------------------------------------------------------------------------------------
            totalSum += currentExpensePrice;
            typeExpenses.getOverall().add(objectExpense);
            typeExpenses.setSum(totalSum.intValue());
            //-----------------------------------------------------------------------------------------------------------------------------------
        }
        
    }
    
    //this is to populate the expense table at start
    public void populatExpensesTable () {
        
        expensesModel = (DefaultTableModel) jtblExpensesTable.getModel();
        
        for (Object o : expenses) {
            
            JSONObject jo = (JSONObject) o;
            
            Object[] expenseAr = new Object[5];
            
            expenseAr[0] = index++;
            expenseAr[1] = jo.get("foodName");
            expenseAr[2] = jo.get("price");
            expenseAr[3] = jo.get("type");
            
            expensesModel.addRow(expenseAr);
        }
    }
    
    // this modifies the table to when we click one of the comboxes
    public void modifyExepenseTable (int index1, int index2) {
        
        Expenses list = switch(index1) {
            case 0 -> overAll;
            case 1 -> foods;
            case 2 -> drinks;
            case 3 -> desserts;
            default -> overAll;
        };
        
        String[] fields = switch(index2) {
            case 0 -> new String[]{"No","Food Name","Price","Type"};
            case 1 -> new String[]{"Date","No. Items Bought", "Total"};
            case 2 -> new String[]{"Week","No. Items Bought", "Total"};
            case 3 -> new String[]{"Month","No. Items Bought", "Total"};
            default -> new String[]{"No","Food Name","Type","Price"};
        };
        
        var timeList = switch (index2) {
            case 0 -> list.getOverall();
            case 1 -> list.getDaily();
            case 2 -> list.getWeekly();
            case 3 -> list.getMonthly();
            default -> list.getOverall();
        };
        
        jtblExpensesTable.setModel(new DefaultTableModel(fields, 0));
        
        DefaultTableModel newModel = (DefaultTableModel) jtblExpensesTable.getModel();
        
        for(var o : timeList) {
            newModel.addRow(o);
        }
    }
    
    //set report
    public void setReport() {

        setSpecificExpensesReport(foods, "Today", jlbTodayFoodOrder, jlbTodayFoodAvg, jlbTodayFoodSales, jlbTodayFoodSalesAvg);
        setSpecificExpensesReport(drinks, "Today", jlbTodayDrinksOrder, jlbTodayDrinksOrderAvg, jlbTodayDrinksSales, jlbTodayDrinksSalesAvg);
        setSpecificExpensesReport(desserts, "Today", jlbTodayDessertsOrder, jlbTodayDessertsOrderAvg, jlbTodayDessertsSale, jlbTodayDessertsSaleAvg);
        setSpecificExpensesReport(overAll, "Today", jlbDailyOverallOrders, jlbDailyOverallOrdersAvg, jlbDailyOverallTotalSales, jlbDailyOverallTotalSalesAvg);
        
        setSpecificExpensesReport(foods, "Week", jlbWeekFoodOrder, jlbWeekFoodOrderAvg, jlbWeekFoodSales, jlbWeekFoodSalesAvg);
        setSpecificExpensesReport(drinks, "Week", jlbWeekDrinksOrder, jlbWeekDrinksOrderAvg, jlbWeekDrinksSales, jlbWeekDrinksSalesAvg);
        setSpecificExpensesReport(desserts, "Week", jlbWeekDessertsOrder, jlbWeekDessertOrderAvg, jlbWeekDessertsSales, jlbWeekDessertsSalesAvg);
        setSpecificExpensesReport(overAll, "Week", jlbWeekOverallOrder, jlbWeekOverallOrderAvg, jlbWeekOverallSales, jlbWeekOverallSalesAvg);
    
        setSpecificExpensesReport(foods, "Month", jlbMonthFoodOrder, jlbMonthFoodOrderAvg, jlbMonthFoodSales, jlbMonthFoodSalesAvg);
        setSpecificExpensesReport(drinks, "Month", jlbMonthDrinksOrder, jlbMonthDrinksOrderAvg, jlbMonthDrinksSales, jlbMonthDrinksSalesAvg);
        setSpecificExpensesReport(desserts, "Month", jlbMonthDessertsOrder, jlbMonthDessertsOrderAvg, jlbMonthDessertsSales, jlbMonthDessertsSalesAvg);
        setSpecificExpensesReport(overAll, "Month", jlbMonthOverallOrder, jlbMonthOverallOrderAvg, jlbMonthOverallSales, jlbMonthOverallSalesAvg);
        
        setSpecificExpensesReport(foods, "", jlbOverallFoodOrder, null, jlbOverallFoodSales, null);
        setSpecificExpensesReport(drinks, "", jlbOverallDrinksOrder, null, jlbOverallDrinksSales, null);
        setSpecificExpensesReport(desserts, "", jlbOverallDessertsOrder, null, jlbOverallDessertsSales, null);
        setSpecificExpensesReport(overAll, "", jlbOverallOrder, null, jlbOverallSales, null);
    }
    
    public void setSpecificExpensesReport(Expenses expense, String date,
            JLabel foodOrder,
            JLabel foodOrderAvg,
            JLabel foodSale,
            JLabel foodSaleAvg
            ) {
        
        if(date.equals("Today")){
            
            String currentDate = LocalDate.now().toString();
            Object[] mostRecentExpense = expense.getRecentDay();
            String expenseRecentDate = String.valueOf(mostRecentExpense[0]);
            
            if(currentDate.equals(expenseRecentDate)){
                foodOrder.setText("" + mostRecentExpense[1]);
                foodSale.setText("P" + mostRecentExpense[2]);
            }
            
            foodOrderAvg.setText("" + expense.getDailySalesAverage());
            foodSaleAvg.setText("P" + expense.getDailyAverage());
        }
        
        else if(date.equals("Week")){
            
            LocalDate dateNow = LocalDate.now();
            Integer recentWeek = dateNow.get(WeekFields.of(Locale.getDefault()).weekOfYear());
            Integer recentYear = dateNow.getYear();
            
            Object[] mostRecentWeeklyExpense = expense.getRecentWeek();
             boolean mostRecentWeekEqualsNow = (Objects.equals(mostRecentWeeklyExpense[3], recentWeek)) && mostRecentWeeklyExpense[4].equals(recentYear);
            
            if(mostRecentWeekEqualsNow){
                foodOrder.setText("" + mostRecentWeeklyExpense[1]);
                foodSale.setText("P" + mostRecentWeeklyExpense[2]);
            }
            
            foodOrderAvg.setText("" + expense.getWeeklySalesAverage());
            foodSaleAvg.setText("P" + expense.getWeeklyAverage());
        }
        
        else if(date.equals("Month")) {
            
            Object[] mostRecentMonthlyExpense = expense.getRecentMonth();
            
            LocalDate dateNow = LocalDate.now();
            Integer recentMonth = dateNow.getMonthValue();
            Integer recentYear = dateNow.getYear();

            boolean mostRecentMonthEqualsNow = (Objects.equals(mostRecentMonthlyExpense[3], recentMonth)) && mostRecentMonthlyExpense[4].equals(recentYear);
            
            if(mostRecentMonthEqualsNow) {
                foodOrder.setText("" + mostRecentMonthlyExpense[1]);
                foodSale.setText("P" + mostRecentMonthlyExpense[2]);
            }
            foodOrderAvg.setText("" + expense.getWeeklySalesAverage());
            foodSaleAvg.setText("P" + expense.getWeeklyAverage());
        }
        
        else {
            foodSale.setText("P" + expense.getSum());
            foodOrder.setText("P" + expense.getOverall().size());
        }
    }
    
    
    
    // This method saves all of the expenses of the allExpenses.json
    public void saveExpesnesFile(){
        
        try(FileWriter writer = new FileWriter(FILE_PATH)){
            expense.put("expenses",expenses);
            writer.write(expense.toJSONString());
        }
        catch(Exception e) {
            System.out.println(e);
        }
    }
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JComboBox<String> jComboBox4;
    private javax.swing.JComboBox<String> jComboBox6;
    private javax.swing.JComboBox<String> jComboBox7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JButton jbtnConfirmPurchase;
    private javax.swing.JLabel jlbDailyOverallOrders;
    private javax.swing.JLabel jlbDailyOverallOrdersAvg;
    private javax.swing.JLabel jlbDailyOverallTotalSales;
    private javax.swing.JLabel jlbDailyOverallTotalSalesAvg;
    private javax.swing.JLabel jlbMonthDessertsOrder;
    private javax.swing.JLabel jlbMonthDessertsOrderAvg;
    private javax.swing.JLabel jlbMonthDessertsSales;
    private javax.swing.JLabel jlbMonthDessertsSalesAvg;
    private javax.swing.JLabel jlbMonthDrinksOrder;
    private javax.swing.JLabel jlbMonthDrinksOrderAvg;
    private javax.swing.JLabel jlbMonthDrinksSales;
    private javax.swing.JLabel jlbMonthDrinksSalesAvg;
    private javax.swing.JLabel jlbMonthFoodOrder;
    private javax.swing.JLabel jlbMonthFoodOrderAvg;
    private javax.swing.JLabel jlbMonthFoodSales;
    private javax.swing.JLabel jlbMonthFoodSalesAvg;
    private javax.swing.JLabel jlbMonthOverallOrder;
    private javax.swing.JLabel jlbMonthOverallOrderAvg;
    private javax.swing.JLabel jlbMonthOverallSales;
    private javax.swing.JLabel jlbMonthOverallSalesAvg;
    private javax.swing.JLabel jlbOverallDessertsOrder;
    private javax.swing.JLabel jlbOverallDessertsSales;
    private javax.swing.JLabel jlbOverallDrinksOrder;
    private javax.swing.JLabel jlbOverallDrinksSales;
    private javax.swing.JLabel jlbOverallFoodOrder;
    private javax.swing.JLabel jlbOverallFoodSales;
    private javax.swing.JLabel jlbOverallOrder;
    private javax.swing.JLabel jlbOverallSales;
    private javax.swing.JLabel jlbTodayDessertsOrder;
    private javax.swing.JLabel jlbTodayDessertsOrderAvg;
    private javax.swing.JLabel jlbTodayDessertsSale;
    private javax.swing.JLabel jlbTodayDessertsSaleAvg;
    private javax.swing.JLabel jlbTodayDrinksOrder;
    private javax.swing.JLabel jlbTodayDrinksOrderAvg;
    private javax.swing.JLabel jlbTodayDrinksSales;
    private javax.swing.JLabel jlbTodayDrinksSalesAvg;
    private javax.swing.JLabel jlbTodayFoodAvg;
    private javax.swing.JLabel jlbTodayFoodOrder;
    private javax.swing.JLabel jlbTodayFoodSales;
    private javax.swing.JLabel jlbTodayFoodSalesAvg;
    private javax.swing.JLabel jlbTotal;
    private javax.swing.JLabel jlbWeekDessertOrderAvg;
    private javax.swing.JLabel jlbWeekDessertsOrder;
    private javax.swing.JLabel jlbWeekDessertsSales;
    private javax.swing.JLabel jlbWeekDessertsSalesAvg;
    private javax.swing.JLabel jlbWeekDrinksOrder;
    private javax.swing.JLabel jlbWeekDrinksOrderAvg;
    private javax.swing.JLabel jlbWeekDrinksSales;
    private javax.swing.JLabel jlbWeekDrinksSalesAvg;
    private javax.swing.JLabel jlbWeekFoodOrder;
    private javax.swing.JLabel jlbWeekFoodOrderAvg;
    private javax.swing.JLabel jlbWeekFoodSales;
    private javax.swing.JLabel jlbWeekFoodSalesAvg;
    private javax.swing.JLabel jlbWeekOverallOrder;
    private javax.swing.JLabel jlbWeekOverallOrderAvg;
    private javax.swing.JLabel jlbWeekOverallSales;
    private javax.swing.JLabel jlbWeekOverallSalesAvg;
    private javax.swing.JList<String> jlstSelectedOrder;
    private javax.swing.JTable jtblCashierOrder;
    private javax.swing.JTable jtblExpensesTable;
    private javax.swing.JButton jtbnRemovePurchase;
    private javax.swing.JTextField jtxfSearchBar;
    // End of variables declaration//GEN-END:variables
}
