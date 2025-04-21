
package frames;


import classes.AccountHandler;
import classes.ComparatorClasses;
import classes.ExpenseProject;
import classes.SimplifiedAccount;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.FileReader;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.WeekFields;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.table.JTableHeader;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class BetterStudentProfile extends javax.swing.JFrame {

    private SimplifiedAccount loggedAccount;

    private int goalFulfilled = 0;
    private int goalMissed = 0;
    
    public BetterStudentProfile() {
        
        initComponents();
        System.out.println("asdasd");
        extras();
        setLocationRelativeTo(null);
        setResizable(false);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator2 = new javax.swing.JSeparator();
        jLabel24 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jbtnMenu = new javax.swing.JButton();
        jbtnDetails = new javax.swing.JButton();
        jbtnLogOut = new javax.swing.JButton();
        jbtnGoal = new javax.swing.JButton();
        jbtnExpenses = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        jSeparator6 = new javax.swing.JSeparator();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jPanel11 = new javax.swing.JPanel();
        jlbCurrentGoal = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jtxfLogInBudgetGoal = new javax.swing.JTextField();
        jLabel29 = new javax.swing.JLabel();
        jlbWarning = new javax.swing.JLabel();
        jPanel22 = new javax.swing.JPanel();
        jPanel23 = new javax.swing.JPanel();
        jbtnAddBudgetGoal = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jlbMonday = new javax.swing.JLabel();
        jlbSunday = new javax.swing.JLabel();
        jlbTuesday = new javax.swing.JLabel();
        jlbWednesday = new javax.swing.JLabel();
        jlbThursday = new javax.swing.JLabel();
        jlbFriday = new javax.swing.JLabel();
        jlbSaturday = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jlbMoneyTree = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        jlbRUI = new javax.swing.JLabel();
        jlbRank = new javax.swing.JLabel();
        jlbWarning1 = new javax.swing.JLabel();
        jpgbrLevel = new javax.swing.JProgressBar();
        jLabel6 = new javax.swing.JLabel();
        jlbRank1 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel23 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jlbTodayText = new javax.swing.JLabel();
        jlbTodayAvg = new javax.swing.JLabel();
        jlbWeekText = new javax.swing.JLabel();
        jlbMonthText = new javax.swing.JLabel();
        jlbWeekAvg = new javax.swing.JLabel();
        jlbMonthAvg = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jlbToday = new javax.swing.JLabel();
        jlbWeek = new javax.swing.JLabel();
        jlbMonth = new javax.swing.JLabel();
        jlbTodayAvgView = new javax.swing.JLabel();
        jlbWeekAvgText = new javax.swing.JLabel();
        jlbMonthAvgText = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        jPanel12 = new javax.swing.JPanel();
        jPanel13 = new javax.swing.JPanel();
        jPanel15 = new javax.swing.JPanel();
        jlbOverall = new javax.swing.JLabel();
        jlbOverallText = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtblAccountExpenseTable = new javax.swing.JTable();
        jcmbExpenseSortBy2 = new javax.swing.JComboBox<>();
        jcmbExpenseSortBy1 = new javax.swing.JComboBox<>();
        jbtnBack = new javax.swing.JButton();
        jlbRUI1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jpwrdDetailsPassword = new javax.swing.JPasswordField();
        jpwrdDetailsNewPassword = new javax.swing.JPasswordField();
        jlbUsernameDetails = new javax.swing.JLabel();
        jPanel16 = new javax.swing.JPanel();
        jPanel17 = new javax.swing.JPanel();
        jPanel18 = new javax.swing.JPanel();
        jPanel14 = new javax.swing.JPanel();
        jlbDetailsRankDiscount = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jlbDetailsGoalsMisses = new javax.swing.JLabel();
        jlbDetailsGoalsFulfilled = new javax.swing.JLabel();
        jlbDetailsRank = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jlbDetailsLevel = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jPanel19 = new javax.swing.JPanel();
        jPanel20 = new javax.swing.JPanel();
        jPanel21 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jrbtnDetailsUpdate = new javax.swing.JRadioButton();
        jbtnDetailsUpdate = new javax.swing.JButton();
        jLabel20 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        jLabel24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/GradientRedBG.png"))); // NOI18N
        jLabel24.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jLabel24.setMaximumSize(new java.awt.Dimension(760, 411));
        jLabel24.setMinimumSize(new java.awt.Dimension(760, 411));
        jLabel24.setPreferredSize(new java.awt.Dimension(760, 411));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1050, 750));
        setMinimumSize(new java.awt.Dimension(1050, 750));
        setPreferredSize(new java.awt.Dimension(1050, 750));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(241, 243, 236));
        jLabel3.setText("PROFILE");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        jbtnMenu.setBackground(new java.awt.Color(43, 71, 44));
        jbtnMenu.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jbtnMenu.setForeground(new java.awt.Color(241, 243, 236));
        jbtnMenu.setText("Menu");
        jbtnMenu.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jbtnMenu.setFocusPainted(false);
        jbtnMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnMenuActionPerformed(evt);
            }
        });
        getContentPane().add(jbtnMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 10, 70, 30));

        jbtnDetails.setBackground(new java.awt.Color(43, 71, 44));
        jbtnDetails.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jbtnDetails.setForeground(new java.awt.Color(241, 243, 236));
        jbtnDetails.setText("Details");
        jbtnDetails.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jbtnDetails.setFocusPainted(false);
        jbtnDetails.setFocusable(false);
        jbtnDetails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnDetailsActionPerformed(evt);
            }
        });
        getContentPane().add(jbtnDetails, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 10, 90, 30));

        jbtnLogOut.setBackground(new java.awt.Color(43, 71, 44));
        jbtnLogOut.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jbtnLogOut.setForeground(new java.awt.Color(241, 243, 236));
        jbtnLogOut.setText("Log Out");
        jbtnLogOut.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jbtnLogOut.setFocusPainted(false);
        jbtnLogOut.setFocusable(false);
        jbtnLogOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnLogOutActionPerformed(evt);
            }
        });
        getContentPane().add(jbtnLogOut, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 10, 80, 30));

        jbtnGoal.setBackground(new java.awt.Color(43, 71, 44));
        jbtnGoal.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jbtnGoal.setForeground(new java.awt.Color(241, 243, 236));
        jbtnGoal.setText("Goal");
        jbtnGoal.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jbtnGoal.setFocusPainted(false);
        jbtnGoal.setFocusable(false);
        jbtnGoal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnGoalActionPerformed(evt);
            }
        });
        getContentPane().add(jbtnGoal, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 10, 80, 30));

        jbtnExpenses.setBackground(new java.awt.Color(43, 71, 44));
        jbtnExpenses.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jbtnExpenses.setForeground(new java.awt.Color(241, 243, 236));
        jbtnExpenses.setText("Expenses");
        jbtnExpenses.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jbtnExpenses.setFocusPainted(false);
        jbtnExpenses.setFocusable(false);
        jbtnExpenses.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnExpensesActionPerformed(evt);
            }
        });
        getContentPane().add(jbtnExpenses, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 10, 100, 30));

        jSeparator1.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator1.setForeground(new java.awt.Color(255, 255, 255));
        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 10, 270, 30));

        jSeparator3.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator3.setForeground(new java.awt.Color(255, 255, 255));
        jSeparator3.setOrientation(javax.swing.SwingConstants.VERTICAL);
        getContentPane().add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 10, 130, 30));

        jSeparator4.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator4.setForeground(new java.awt.Color(255, 255, 255));
        jSeparator4.setOrientation(javax.swing.SwingConstants.VERTICAL);
        getContentPane().add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 10, 120, 30));

        jSeparator5.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator5.setForeground(new java.awt.Color(255, 255, 255));
        jSeparator5.setOrientation(javax.swing.SwingConstants.VERTICAL);
        getContentPane().add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 10, 140, 30));

        jSeparator6.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator6.setForeground(new java.awt.Color(255, 255, 255));
        jSeparator6.setOrientation(javax.swing.SwingConstants.VERTICAL);
        getContentPane().add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 10, 100, 30));

        jTabbedPane1.setTabPlacement(javax.swing.JTabbedPane.BOTTOM);

        jPanel1.setBackground(new java.awt.Color(105, 11, 34));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel11.setBackground(new java.awt.Color(167, 37, 55));
        jPanel11.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 3));
        jPanel11.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jlbCurrentGoal.setFont(new java.awt.Font("Tw Cen MT", 1, 45)); // NOI18N
        jlbCurrentGoal.setForeground(new java.awt.Color(255, 255, 255));
        jlbCurrentGoal.setText("     P0.0");
        jPanel11.add(jlbCurrentGoal, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, 220, 40));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/RUIInGame.gif"))); // NOI18N
        jPanel11.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 20, 150, 140));

        jtxfLogInBudgetGoal.setBackground(new java.awt.Color(255, 249, 227));
        jtxfLogInBudgetGoal.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jtxfLogInBudgetGoal.setForeground(new java.awt.Color(137, 137, 137));
        jtxfLogInBudgetGoal.setText(" Set New Goal");
        jtxfLogInBudgetGoal.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(216, 226, 204), 2));
        jtxfLogInBudgetGoal.setMinimumSize(new java.awt.Dimension(64, 40));
        jtxfLogInBudgetGoal.setPreferredSize(new java.awt.Dimension(64, 30));
        jPanel11.add(jtxfLogInBudgetGoal, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 310, 190, 40));

        jLabel29.setFont(new java.awt.Font("Tw Cen MT", 1, 30)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(255, 255, 255));
        jLabel29.setText("Daily Goal :");
        jPanel11.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 180, 170, 50));

        jlbWarning.setFont(new java.awt.Font("MS UI Gothic", 1, 17)); // NOI18N
        jlbWarning.setForeground(new java.awt.Color(255, 255, 255));
        jPanel11.add(jlbWarning, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 420, 200, 40));

        jPanel22.setBackground(new java.awt.Color(167, 49, 49));
        jPanel22.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 7, 7, new java.awt.Color(102, 30, 30)));

        javax.swing.GroupLayout jPanel22Layout = new javax.swing.GroupLayout(jPanel22);
        jPanel22.setLayout(jPanel22Layout);
        jPanel22Layout.setHorizontalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 221, Short.MAX_VALUE)
        );
        jPanel22Layout.setVerticalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jPanel11.add(jPanel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 230, -1));

        jPanel23.setBackground(new java.awt.Color(167, 49, 49));
        jPanel23.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 6, 6, new java.awt.Color(102, 30, 30)));

        jbtnAddBudgetGoal.setBackground(new java.awt.Color(35, 32, 19));
        jbtnAddBudgetGoal.setFont(new java.awt.Font("Tw Cen MT", 1, 22)); // NOI18N
        jbtnAddBudgetGoal.setForeground(new java.awt.Color(254, 254, 180));
        jbtnAddBudgetGoal.setText("Add");
        jbtnAddBudgetGoal.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(254, 254, 180)));
        jbtnAddBudgetGoal.setFocusPainted(false);
        jbtnAddBudgetGoal.setFocusable(false);

        javax.swing.GroupLayout jPanel23Layout = new javax.swing.GroupLayout(jPanel23);
        jPanel23.setLayout(jPanel23Layout);
        jPanel23Layout.setHorizontalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel23Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jbtnAddBudgetGoal, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(16, Short.MAX_VALUE))
        );
        jPanel23Layout.setVerticalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel23Layout.createSequentialGroup()
                .addContainerGap(58, Short.MAX_VALUE)
                .addComponent(jbtnAddBudgetGoal, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
        );

        jPanel11.add(jPanel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 300, 230, 120));

        jPanel1.add(jPanel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 20, 270, 570));

        jPanel3.setBackground(new java.awt.Color(105, 11, 34));
        jPanel3.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 200, 1, new java.awt.Color(83, 0, 0)));
        jPanel3.setMaximumSize(new java.awt.Dimension(728, 347));
        jPanel3.setMinimumSize(new java.awt.Dimension(728, 347));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel3.add(jlbMonday, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 420, 60, 70));
        jPanel3.add(jlbSunday, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 420, 70, 70));
        jPanel3.add(jlbTuesday, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 420, 60, 70));
        jPanel3.add(jlbWednesday, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 420, 60, 70));
        jPanel3.add(jlbThursday, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 420, 70, 70));
        jPanel3.add(jlbFriday, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 420, 60, 70));
        jPanel3.add(jlbSaturday, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 420, 60, 60));

        jLabel19.setFont(new java.awt.Font("Segoe UI Semibold", 1, 35)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(63, 61, 62));
        jLabel19.setText("RUI's Budget Tree");
        jPanel3.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 0, 290, 70));

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/BudgetWeeks.png"))); // NOI18N
        jLabel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 0, 0), 3));
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 10, 680, 510));

        jlbMoneyTree.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Test4.png"))); // NOI18N
        jPanel3.add(jlbMoneyTree, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, -50, 280, 430));

        jPanel9.setBackground(new java.awt.Color(216, 226, 204));

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 680, Short.MAX_VALUE)
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 510, Short.MAX_VALUE)
        );

        jPanel3.add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 10, 680, 510));

        jlbRUI.setFont(new java.awt.Font("Segoe UI Semilight", 1, 15)); // NOI18N
        jlbRUI.setForeground(new java.awt.Color(204, 255, 255));
        jlbRUI.setText("@RUI");
        jPanel3.add(jlbRUI, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 520, 200, 40));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 1050, 560));

        jlbRank.setFont(new java.awt.Font("Tw Cen MT", 1, 37)); // NOI18N
        jlbRank.setForeground(new java.awt.Color(255, 255, 153));
        jlbRank.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/RankBronze.png"))); // NOI18N
        jlbRank.setText(" PREMIUM");
        jPanel1.add(jlbRank, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 0, 220, 80));

        jlbWarning1.setFont(new java.awt.Font("MS UI Gothic", 1, 16)); // NOI18N
        jlbWarning1.setForeground(new java.awt.Color(255, 255, 255));
        jlbWarning1.setText("Follow Daily Goals to Rank Up and get Discount!");
        jPanel1.add(jlbWarning1, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 0, 370, 50));

        jpgbrLevel.setForeground(new java.awt.Color(255, 255, 153));
        jpgbrLevel.setMaximum(7);
        jpgbrLevel.setToolTipText("Your Level Progress");
        jpgbrLevel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel1.add(jpgbrLevel, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 40, 430, 20));
        jpgbrLevel.getAccessibleContext().setAccessibleDescription("");

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/GradientRedBG.png"))); // NOI18N
        jLabel6.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jLabel6.setMaximumSize(new java.awt.Dimension(760, 411));
        jLabel6.setMinimumSize(new java.awt.Dimension(760, 411));
        jLabel6.setPreferredSize(new java.awt.Dimension(760, 411));
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 1090, 660));

        jlbRank1.setFont(new java.awt.Font("Tw Cen MT", 1, 24)); // NOI18N
        jlbRank1.setForeground(new java.awt.Color(255, 255, 255));
        jlbRank1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/RankBronze.png"))); // NOI18N
        jlbRank1.setText("BRONZE");
        jPanel1.add(jlbRank1, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, -30, 140, 100));

        jTabbedPane1.addTab("tab1", jPanel1);

        jPanel4.setBackground(new java.awt.Color(105, 11, 34));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel23.setFont(new java.awt.Font("Tw Cen MT", 1, 45)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(241, 243, 236));
        jLabel23.setText("MY SPENDINGS");
        jPanel4.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 0, 360, 80));

        jPanel6.setBackground(new java.awt.Color(167, 37, 55));
        jPanel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 225), 3));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jlbTodayText.setFont(new java.awt.Font("Tw Cen MT", 1, 30)); // NOI18N
        jlbTodayText.setForeground(new java.awt.Color(255, 255, 204));
        jlbTodayText.setText("Today");
        jPanel6.add(jlbTodayText, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 110, 40));

        jlbTodayAvg.setFont(new java.awt.Font("MS UI Gothic", 1, 18)); // NOI18N
        jlbTodayAvg.setForeground(new java.awt.Color(255, 204, 0));
        jlbTodayAvg.setText("P0.0");
        jPanel6.add(jlbTodayAvg, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 170, 130, -1));

        jlbWeekText.setFont(new java.awt.Font("Tw Cen MT", 1, 30)); // NOI18N
        jlbWeekText.setForeground(new java.awt.Color(255, 255, 204));
        jlbWeekText.setText("Week");
        jPanel6.add(jlbWeekText, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, -1, 50));

        jlbMonthText.setFont(new java.awt.Font("Tw Cen MT", 1, 30)); // NOI18N
        jlbMonthText.setForeground(new java.awt.Color(255, 255, 204));
        jlbMonthText.setText("Month");
        jPanel6.add(jlbMonthText, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 320, -1, 40));

        jlbWeekAvg.setFont(new java.awt.Font("MS UI Gothic", 1, 18)); // NOI18N
        jlbWeekAvg.setForeground(new java.awt.Color(255, 204, 51));
        jlbWeekAvg.setText("P0.0");
        jPanel6.add(jlbWeekAvg, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 260, 120, 40));

        jlbMonthAvg.setFont(new java.awt.Font("MS UI Gothic", 1, 18)); // NOI18N
        jlbMonthAvg.setForeground(new java.awt.Color(255, 204, 0));
        jlbMonthAvg.setText("P0.0");
        jPanel6.add(jlbMonthAvg, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 360, -1, 30));

        jLabel22.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(241, 243, 236));
        jPanel6.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(108, 213, 74, -1));

        jlbToday.setFont(new java.awt.Font("Tw Cen MT", 1, 30)); // NOI18N
        jlbToday.setForeground(new java.awt.Color(255, 255, 255));
        jlbToday.setText("P0.0");
        jPanel6.add(jlbToday, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 120, 130, 40));

        jlbWeek.setFont(new java.awt.Font("Tw Cen MT", 1, 30)); // NOI18N
        jlbWeek.setForeground(new java.awt.Color(255, 255, 255));
        jlbWeek.setText("P0.0");
        jPanel6.add(jlbWeek, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 220, 150, 50));

        jlbMonth.setFont(new java.awt.Font("Tw Cen MT", 1, 30)); // NOI18N
        jlbMonth.setForeground(new java.awt.Color(255, 255, 255));
        jlbMonth.setText("P0.0");
        jPanel6.add(jlbMonth, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 310, 150, 60));

        jlbTodayAvgView.setFont(new java.awt.Font("MS UI Gothic", 1, 18)); // NOI18N
        jlbTodayAvgView.setForeground(new java.awt.Color(255, 255, 204));
        jlbTodayAvgView.setText("Daily Avg : ");
        jPanel6.add(jlbTodayAvgView, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 120, -1));

        jlbWeekAvgText.setFont(new java.awt.Font("MS UI Gothic", 1, 18)); // NOI18N
        jlbWeekAvgText.setForeground(new java.awt.Color(255, 255, 204));
        jlbWeekAvgText.setText("Weekly Avg :");
        jPanel6.add(jlbWeekAvgText, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, -1, 40));

        jlbMonthAvgText.setFont(new java.awt.Font("MS UI Gothic", 1, 18)); // NOI18N
        jlbMonthAvgText.setForeground(new java.awt.Color(255, 255, 204));
        jlbMonthAvgText.setText("Monthly Avg :");
        jPanel6.add(jlbMonthAvgText, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 360, -1, 30));

        jLabel9.setFont(new java.awt.Font("Tw Cen MT", 1, 45)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("SUMMARY");
        jPanel6.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 210, 50));

        jPanel10.setBackground(new java.awt.Color(167, 49, 49));
        jPanel10.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 6, 6, new java.awt.Color(102, 30, 30)));

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel6.add(jPanel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 250, 90));

        jPanel12.setBackground(new java.awt.Color(167, 49, 49));
        jPanel12.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 6, 6, new java.awt.Color(102, 30, 30)));

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel6.add(jPanel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 310, 250, 90));

        jPanel13.setBackground(new java.awt.Color(167, 49, 49));
        jPanel13.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 6, 6, new java.awt.Color(102, 30, 30)));

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel6.add(jPanel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, 250, 90));

        jPanel15.setBackground(new java.awt.Color(167, 49, 49));
        jPanel15.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 7, 7, new java.awt.Color(102, 30, 30)));

        jlbOverall.setFont(new java.awt.Font("Tw Cen MT", 1, 40)); // NOI18N
        jlbOverall.setForeground(new java.awt.Color(255, 255, 136));
        jlbOverall.setText("P0.0");

        jlbOverallText.setFont(new java.awt.Font("Tw Cen MT", 1, 35)); // NOI18N
        jlbOverallText.setForeground(new java.awt.Color(255, 255, 204));
        jlbOverallText.setText("Overall");

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jlbOverall, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(45, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel15Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jlbOverallText)
                .addGap(67, 67, 67))
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel15Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jlbOverallText, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jlbOverall, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
        );

        jPanel6.add(jPanel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 410, 250, 130));

        jPanel4.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 20, 270, 570));

        jPanel2.setBackground(new java.awt.Color(105, 11, 34));
        jPanel2.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 200, 1, new java.awt.Color(83, 0, 0)));

        jScrollPane1.setBackground(new java.awt.Color(216, 226, 204));
        jScrollPane1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jtblAccountExpenseTable.setBackground(new java.awt.Color(216, 226, 204));
        jtblAccountExpenseTable.setFont(new java.awt.Font("Tw Cen MT", 1, 22)); // NOI18N
        jtblAccountExpenseTable.setForeground(new java.awt.Color(0, 0, 0));
        jtblAccountExpenseTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jtblAccountExpenseTable.setUpdateSelectionOnSort(false);
        jScrollPane1.setViewportView(jtblAccountExpenseTable);

        jcmbExpenseSortBy2.setBackground(new java.awt.Color(43, 71, 44));
        jcmbExpenseSortBy2.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        jcmbExpenseSortBy2.setForeground(new java.awt.Color(255, 255, 255));
        jcmbExpenseSortBy2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Newest", "Oldest", "Most Spent", "Least Spent" }));
        jcmbExpenseSortBy2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(254, 254, 180)));
        jcmbExpenseSortBy2.setFocusable(false);

        jcmbExpenseSortBy1.setBackground(new java.awt.Color(43, 71, 44));
        jcmbExpenseSortBy1.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        jcmbExpenseSortBy1.setForeground(new java.awt.Color(255, 255, 255));
        jcmbExpenseSortBy1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Overall", "Daily", "Weekly", "Monthly" }));
        jcmbExpenseSortBy1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(254, 254, 180)));
        jcmbExpenseSortBy1.setFocusable(false);

        jbtnBack.setBackground(new java.awt.Color(255, 153, 153));
        jbtnBack.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jbtnBack.setForeground(new java.awt.Color(255, 255, 255));
        jbtnBack.setText("Back");
        jbtnBack.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(254, 254, 180)));
        jbtnBack.setEnabled(false);

        jlbRUI1.setFont(new java.awt.Font("Segoe UI Semilight", 1, 15)); // NOI18N
        jlbRUI1.setForeground(new java.awt.Color(204, 255, 255));
        jlbRUI1.setText("@RUI");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(338, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 678, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jcmbExpenseSortBy1, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addComponent(jcmbExpenseSortBy2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34)
                        .addComponent(jbtnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(145, 145, 145)))
                .addGap(32, 32, 32))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlbRUI1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 453, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jcmbExpenseSortBy1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jcmbExpenseSortBy2, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jbtnBack, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jlbRUI1)
                .addContainerGap())
        );

        jPanel4.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 1050, 560));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/GradientRedBG.png"))); // NOI18N
        jLabel4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jLabel4.setMaximumSize(new java.awt.Dimension(760, 411));
        jLabel4.setMinimumSize(new java.awt.Dimension(760, 411));
        jLabel4.setPreferredSize(new java.awt.Dimension(760, 411));
        jPanel4.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 1090, 660));

        jTabbedPane1.addTab("tab2", jPanel4);

        jPanel5.setBackground(new java.awt.Color(105, 11, 34));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel7.setBackground(new java.awt.Color(105, 11, 34));
        jPanel7.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 200, 3, new java.awt.Color(83, 0, 0)));
        jPanel7.setMaximumSize(new java.awt.Dimension(728, 347));
        jPanel7.setMinimumSize(new java.awt.Dimension(728, 347));
        jPanel7.setPreferredSize(new java.awt.Dimension(728, 347));
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel8.setBackground(new java.awt.Color(183, 31, 49));
        jPanel8.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 50, 3, new java.awt.Color(102, 30, 30)), "DETAILS", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 40), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setFont(new java.awt.Font("Tw Cen MT", 1, 30)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 204));
        jLabel7.setText("Username");
        jPanel8.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 80, 140, 40));

        jLabel27.setFont(new java.awt.Font("Tw Cen MT", 1, 30)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(255, 255, 204));
        jLabel27.setText("Password");
        jPanel8.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 170, 150, 60));

        jLabel28.setFont(new java.awt.Font("Tw Cen MT", 1, 30)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(255, 255, 204));
        jLabel28.setText("New Password");
        jPanel8.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 280, 210, 70));

        jpwrdDetailsPassword.setBackground(new java.awt.Color(255, 255, 255));
        jpwrdDetailsPassword.setFont(new java.awt.Font("Tw Cen MT", 0, 18)); // NOI18N
        jpwrdDetailsPassword.setForeground(new java.awt.Color(0, 0, 0));
        jpwrdDetailsPassword.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(255, 255, 153), null, new java.awt.Color(3, 50, 0)));
        jPanel8.add(jpwrdDetailsPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 230, 210, 30));

        jpwrdDetailsNewPassword.setBackground(new java.awt.Color(255, 255, 255));
        jpwrdDetailsNewPassword.setFont(new java.awt.Font("Tw Cen MT", 0, 18)); // NOI18N
        jpwrdDetailsNewPassword.setForeground(new java.awt.Color(0, 0, 0));
        jpwrdDetailsNewPassword.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(255, 255, 153), null, new java.awt.Color(3, 50, 0)));
        jPanel8.add(jpwrdDetailsNewPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 340, 210, 30));

        jlbUsernameDetails.setFont(new java.awt.Font("Courier New", 1, 25)); // NOI18N
        jlbUsernameDetails.setForeground(new java.awt.Color(255, 255, 255));
        jPanel8.add(jlbUsernameDetails, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, 240, 50));

        jPanel16.setBackground(new java.awt.Color(167, 49, 49));
        jPanel16.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 6, 6, new java.awt.Color(102, 30, 30)));

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 282, Short.MAX_VALUE)
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 92, Short.MAX_VALUE)
        );

        jPanel8.add(jPanel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 290, 100));

        jPanel17.setBackground(new java.awt.Color(167, 49, 49));
        jPanel17.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 6, 6, new java.awt.Color(102, 30, 30)));

        javax.swing.GroupLayout jPanel17Layout = new javax.swing.GroupLayout(jPanel17);
        jPanel17.setLayout(jPanel17Layout);
        jPanel17Layout.setHorizontalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel17Layout.setVerticalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel8.add(jPanel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 290, 100));

        jPanel18.setBackground(new java.awt.Color(167, 49, 49));
        jPanel18.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 6, 6, new java.awt.Color(102, 30, 30)));

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

        jPanel8.add(jPanel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, 290, 110));

        jPanel7.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 20, 330, 460));

        jPanel14.setBackground(new java.awt.Color(183, 31, 49));
        jPanel14.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 50, 3, new java.awt.Color(102, 30, 30)), "LEVEL/RANK", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 40), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel14.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jlbDetailsRankDiscount.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 1, 25)); // NOI18N
        jlbDetailsRankDiscount.setForeground(new java.awt.Color(255, 255, 255));
        jlbDetailsRankDiscount.setText("0.0");
        jPanel14.add(jlbDetailsRankDiscount, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 210, 90, 40));

        jLabel12.setFont(new java.awt.Font("Tw Cen MT", 1, 35)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 204, 51));
        jLabel12.setText("Goals");
        jPanel14.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 260, 100, 40));

        jlbDetailsGoalsMisses.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 1, 40)); // NOI18N
        jlbDetailsGoalsMisses.setForeground(new java.awt.Color(255, 255, 255));
        jlbDetailsGoalsMisses.setText("0");
        jPanel14.add(jlbDetailsGoalsMisses, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 330, 50, 70));

        jlbDetailsGoalsFulfilled.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 1, 40)); // NOI18N
        jlbDetailsGoalsFulfilled.setForeground(new java.awt.Color(255, 255, 255));
        jlbDetailsGoalsFulfilled.setText("0");
        jPanel14.add(jlbDetailsGoalsFulfilled, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 290, 50, 60));

        jlbDetailsRank.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 1, 45)); // NOI18N
        jlbDetailsRank.setForeground(new java.awt.Color(255, 255, 255));
        jlbDetailsRank.setText("PREMIUM");
        jPanel14.add(jlbDetailsRank, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 160, 190, 70));

        jLabel15.setFont(new java.awt.Font("Tw Cen MT", 1, 35)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 204));
        jLabel15.setText("Rank :");
        jPanel14.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, 110, 50));

        jlbDetailsLevel.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 1, 60)); // NOI18N
        jlbDetailsLevel.setForeground(new java.awt.Color(255, 255, 255));
        jlbDetailsLevel.setText("0");
        jPanel14.add(jlbDetailsLevel, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 70, 100, 80));

        jLabel16.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 204));
        jLabel16.setText("Discount :");
        jPanel14.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, 80, 40));

        jLabel8.setFont(new java.awt.Font("Tw Cen MT", 1, 35)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 204));
        jLabel8.setText("Level :");
        jPanel14.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 100, 60));

        jPanel19.setBackground(new java.awt.Color(167, 49, 49));
        jPanel19.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 6, 6, new java.awt.Color(102, 30, 30)));

        javax.swing.GroupLayout jPanel19Layout = new javax.swing.GroupLayout(jPanel19);
        jPanel19.setLayout(jPanel19Layout);
        jPanel19Layout.setHorizontalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 282, Short.MAX_VALUE)
        );
        jPanel19Layout.setVerticalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 72, Short.MAX_VALUE)
        );

        jPanel14.add(jPanel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 290, 80));

        jPanel20.setBackground(new java.awt.Color(167, 49, 49));
        jPanel20.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 6, 6, new java.awt.Color(102, 30, 30)));

        javax.swing.GroupLayout jPanel20Layout = new javax.swing.GroupLayout(jPanel20);
        jPanel20.setLayout(jPanel20Layout);
        jPanel20Layout.setHorizontalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel20Layout.setVerticalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel14.add(jPanel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, 290, 100));

        jPanel21.setBackground(new java.awt.Color(167, 49, 49));
        jPanel21.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 6, 6, new java.awt.Color(102, 30, 30)));

        jLabel13.setFont(new java.awt.Font("Tw Cen MT", 3, 25)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 209));
        jLabel13.setText("Fulfilled :");

        jLabel14.setFont(new java.awt.Font("Tw Cen MT", 3, 25)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 209));
        jLabel14.setText("Misses :");

        javax.swing.GroupLayout jPanel21Layout = new javax.swing.GroupLayout(jPanel21);
        jPanel21.setLayout(jPanel21Layout);
        jPanel21Layout.setHorizontalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel21Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel21Layout.setVerticalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel21Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel14.add(jPanel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 270, 290, 130));

        jPanel7.add(jPanel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 20, 330, 460));

        jrbtnDetailsUpdate.setBackground(new java.awt.Color(83, 0, 0));
        jrbtnDetailsUpdate.setFont(new java.awt.Font("SimSun", 1, 25)); // NOI18N
        jrbtnDetailsUpdate.setForeground(new java.awt.Color(238, 240, 233));
        jrbtnDetailsUpdate.setText("Update");
        jrbtnDetailsUpdate.setFocusPainted(false);
        jrbtnDetailsUpdate.setFocusable(false);
        jPanel7.add(jrbtnDetailsUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 500, -1, 30));

        jbtnDetailsUpdate.setBackground(new java.awt.Color(0, 51, 0));
        jbtnDetailsUpdate.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jbtnDetailsUpdate.setForeground(new java.awt.Color(254, 254, 180));
        jbtnDetailsUpdate.setText("Click");
        jbtnDetailsUpdate.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(254, 254, 180)));
        jbtnDetailsUpdate.setFocusPainted(false);
        jbtnDetailsUpdate.setFocusable(false);
        jPanel7.add(jbtnDetailsUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 500, 80, 30));

        jPanel5.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 1050, 560));

        jLabel20.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 1, 50)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(217, 225, 198));
        jLabel20.setText("Details");
        jPanel5.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 10, 150, 50));

        jLabel25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/GradientRedBG.png"))); // NOI18N
        jLabel25.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jLabel25.setMaximumSize(new java.awt.Dimension(760, 411));
        jLabel25.setMinimumSize(new java.awt.Dimension(760, 411));
        jLabel25.setPreferredSize(new java.awt.Dimension(760, 411));
        jPanel5.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 1100, 660));

        jTabbedPane1.addTab("tab3", jPanel5);

        getContentPane().add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-20, 50, 1070, 740));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/FoodBG.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1050, 750));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    //For Providing Account ----------------------------------------------------
    public void setAccount (JSONObject loggedAccount) {
        
        this.loggedAccount = new SimplifiedAccount(loggedAccount);
        
        setExpense();
        setGoalDetails();
        setDetails();
    }
    //--------------------------------------------------------------------------
    
    //Ignore -------------------------------------------------------------------
    private ActionEvent evtAnnoyingThingy (ActionEvent evt) {
        return(evt);
    }
    //--------------------------------------------------------------------------
    
    //For Getting To Menu ------------------------------------------------------
    private void jbtnMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnMenuActionPerformed
        evtAnnoyingThingy(evt);
        
        this.setVisible(false);
        BetterFoodMenu newMenu = new BetterFoodMenu();
        newMenu.setLoggedAccount(loggedAccount);
        newMenu.studentProfile = this;
    }//GEN-LAST:event_jbtnMenuActionPerformed
    //--------------------------------------------------------------------------
    
    //For Logging Out ---------------------------------------------------------
    private void jbtnLogOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnLogOutActionPerformed
        evtAnnoyingThingy(evt);
        
        this.dispose();
        ExpenseProject.logIn.setVisible(true);
    }//GEN-LAST:event_jbtnLogOutActionPerformed
    //--------------------------------------------------------------------------
    
    
    //TABBED PANE ==============================================================
    //2 = Details --------------------------------------------------------------
    private void jbtnDetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnDetailsActionPerformed
        evtAnnoyingThingy(evt);
        
        jTabbedPane1.setSelectedIndex(2);
        jbtnDetails.setForeground(new Color(241,235,210));
    }//GEN-LAST:event_jbtnDetailsActionPerformed
    
    //0 = Goal -----------------------------------------------------------------
    private void jbtnGoalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnGoalActionPerformed
        evtAnnoyingThingy(evt);
        
        jTabbedPane1.setSelectedIndex(0);
        jbtnGoal.setForeground(new Color(241,235,210));
    }//GEN-LAST:event_jbtnGoalActionPerformed
    
    //1 = Expenses -------------------------------------------------------------
    private void jbtnExpensesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnExpensesActionPerformed
        evtAnnoyingThingy(evt);
        
        jTabbedPane1.setSelectedIndex(1);
        jbtnExpenses.setForeground(new Color(241,235,210));
    }//GEN-LAST:event_jbtnExpensesActionPerformed
    //--------------------------------------------------------------------------
    //==========================================================================
    
    private double spentToday = 0;
    
    //Tab 1 - Set Goal Tab Details ---------------------------------------------
    private void setGoalDetails () {
        
        if(loggedAccount.getBudgetGoal() == 0.0) { // if DOES NOT have a budget goal which is required
            
            jlbWarning.setText("*Required To Continue*");
            jbtnAddBudgetGoal.setText("Add");
            
            //Disable Buttons
            for (JButton button : new JButton[]{jbtnExpenses, jbtnDetails, jbtnMenu}) {
                button.setEnabled(false);
            }
        }
        else { //if has a budget goal
            
            jlbWarning.setText("");
            jbtnAddBudgetGoal.setText("Update");
            
            //Set Text Box with the Budget Goal
            jlbCurrentGoal.setText("%9s".formatted("P" + loggedAccount.getBudgetGoal()));
            
            //Set Weekly Money Tree Game ------------------------------------------------------------------------------------------------------|
            int countFalse = 0;
            int index = 0;
            
            DayOfWeek dayOfWeek = DayOfWeek.from(LocalDate.now());
            
            Object result = loggedAccount.getDayInWeeeklyPerformance(dayOfWeek.toString());

            
            // Conditional Statements for the Gamified Budget System Game
            if(spentToday >= loggedAccount.getBudgetGoal() * .7) {

                if(spentToday <= loggedAccount.getBudgetGoal()){
                    
                    if(loggedAccount.getDayInWeeeklyPerformance(dayOfWeek.toString()) != null) {
                        
                        if(!loggedAccount.getDayInWeeeklyPerformance(dayOfWeek.toString()).equals(true)){
                            
                            result = (spentToday <= loggedAccount.getBudgetGoal());
                        
                            System.out.println("from true actually true");
                            AccountHandler.updateJSONFile(loggedAccount.getUsername(), "level", loggedAccount.getLevel() + 1);
                            loggedAccount.setLevel(loggedAccount.getLevel() + 1);
                        }
                    }
                    else {
                        
                        result = (spentToday <= loggedAccount.getBudgetGoal());
                        
                        System.out.println("from true actually true");
                        AccountHandler.updateJSONFile(loggedAccount.getUsername(), "level", loggedAccount.getLevel() + 1);
                        loggedAccount.setLevel(loggedAccount.getLevel() + 1);
                    }
                }
                else {
                    
                    if(loggedAccount.getDayInWeeeklyPerformance(dayOfWeek.toString()) != null) {
                        
                        if(!loggedAccount.getDayInWeeeklyPerformance(dayOfWeek.toString()).equals(false)){
                            
                            result = (spentToday <= loggedAccount.getBudgetGoal());

                            int deduction = ((loggedAccount.getLevel() - 2) < 0) ? 0 :  loggedAccount.getLevel();
                            AccountHandler.updateJSONFile(loggedAccount.getUsername(), "level", deduction);
                            loggedAccount.setLevel(deduction);
                        }
                    }
                    else {
                        
                        result = (spentToday <= loggedAccount.getBudgetGoal());
                        
                        int deduction = ((loggedAccount.getLevel() - 2) < 0) ? 0 :  loggedAccount.getLevel();
                        AccountHandler.updateJSONFile(loggedAccount.getUsername(), "level", deduction);
                        loggedAccount.setLevel(deduction);
                    }
                }
            }

            
            AccountHandler.updateWeeklyPerformance(loggedAccount.getUsername(), dayOfWeek.toString(), result);
            loggedAccount.setDayInWeeklyPerformance(dayOfWeek.toString(), result);

            for(JLabel labelDays : new JLabel[]{jlbMonday, jlbTuesday, jlbWednesday, jlbThursday, jlbFriday, jlbSaturday, jlbSunday}) {
                
                Object dayByDayPerformance = loggedAccount.getWeeklyPerformance().get(index++);
                
                if(dayByDayPerformance == null) {
                    labelDays.setIcon(null);
                }
                else if(false == (boolean) dayByDayPerformance) {
                    labelDays.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Broke.png"))); countFalse++;
                }
                else if (true == (boolean) dayByDayPerformance) labelDays.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/GoldCoin.png"))); 
            }
            
            switch (countFalse) {
                case 0 -> jlbMoneyTree.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/MoneyTree1.png")));
                case 1 -> jlbMoneyTree.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/MoneyTree2.png")));
                case 2 -> jlbMoneyTree.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/MoneyTree3.png"))); 
                case 3 -> jlbMoneyTree.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/MoneyTree4.png"))); 
                case 4 -> jlbMoneyTree.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/MoneyTree5.png"))); 
                case 5 -> jlbMoneyTree.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/MoneyTree6.png"))); 
                case 6 -> jlbMoneyTree.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/MoneyTree7.png"))); 
                case 7 -> jlbMoneyTree.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/MoneyTree8.png"))); 
            }
            //---------------------------------------------------------------------------------------------------------------------------------|
        
            //Set Level and Rank 
            System.out.println(loggedAccount.getLevel() % 7);
            jpgbrLevel.setValue(loggedAccount.getLevel() % 7);
            
            jlbRank.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Rank" +  loggedAccount.getRank().toString() + ".png"))); 
            jlbRank.setText(" " + loggedAccount.getRank().toString());
        }
        
        jbtnAddBudgetGoal.addActionListener(e -> {
            
            
            double setBudgetGoal;
            
            try {
                
                setBudgetGoal = (double) Integer.parseInt(jtxfLogInBudgetGoal.getText());
                
                if(setBudgetGoal > 40 && setBudgetGoal < 10000 && setBudgetGoal != loggedAccount.getBudgetGoal()) {
                    
                    AccountHandler.updateJSONFile(loggedAccount.getUsername(), "budgetGoal", setBudgetGoal);
                    JOptionPane.showMessageDialog(this, "Budget Goal has been Set");
                    
                    loggedAccount.setBudgetGoal(setBudgetGoal);
                    jlbCurrentGoal.setText("%9s".formatted("P" + loggedAccount.getBudgetGoal()));
                    
                    for (JButton button : new JButton[]{jbtnExpenses, jbtnDetails, jbtnMenu}) {
                        button.setEnabled(true);
                    }
                    
                    setExpense();
                    
                }
                else JOptionPane.showMessageDialog(this, "Invalid Budget Goal");
                
            }
            catch(HeadlessException | NumberFormatException ex){
                JOptionPane.showMessageDialog(this, "Invalid Budget Goal");
            }
        });
    }
    //--------------------------------------------------------------------------
    
    
    //Tab 2 Set Expense Details ------------------------------------------------
    
    //Current List, Sorting, and Fields Being Shown in the JTable
    private List<Object[]> selectedListOfExpenses = null;
    private Comparator selectedSortingOperation  = null;
    private String[] tableFields = new String[4];
    
    //Previous List, Sorting, and Fields that WAS shown in the JTable upon Viewing Purchases
    private List<Object[]> prevSelectedListOfExpenses = null;
    private Comparator prevSelectedSortingOperation = null;
    private String[] prevTableFields = null;
    
    //Temp Boolean Values IGNORE!!!
    private boolean getTotal = false;
    private boolean fromWeeklyAndMonthy = false;
    private boolean prevFromWeeklyAndMonthy = false;
    
    // Set Expense Metohd ==============================================================================================================================================
    private void setExpense() {
        
        //Getting the Designated Expense JSONFile for the Logged Account -----------------------------------
        JSONArray accountExpense = new JSONArray();
        
        try(FileReader reader = new FileReader(loggedAccount.getExpensesPath())) {
            accountExpense = (JSONArray) ((JSONObject) new JSONParser().parse(reader)).get("expenses");
        }
        catch(Exception e) {
            System.out.println(e);
        }
        // --------------------------------------------------------------------------------------------------
        
        //List of Overall, Daily, Weekly, and Monthly Expenses Summary
        List<Object[]> overAllExpenses = new ArrayList<>(), dailyExpenses = new ArrayList<>(), weeklyExpenses = new ArrayList<>(), monthlyExpenses = new ArrayList<>();
        
        //List of Purchases/Expenses per Daily, Weekly, and Monthly
        List<List<Object[]>> dailyExpensePurchases = new ArrayList<>(), weeklyExpensePurchases = new ArrayList<>(), monthlyExpensePurchases = new ArrayList<>();
        
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
        for(Object expense : accountExpense) {
            
            JSONObject jsonExpense = (JSONObject) expense;

            String currentExpenseFoodName = (String) jsonExpense.get("foodName");
            Integer currentExpensePrice = Integer.valueOf(String.valueOf(jsonExpense.get("price")));
            String currentExpenseDateBought = (String) jsonExpense.get("date");
            Integer currentBudgetGoal = Integer.valueOf(String.valueOf(jsonExpense.get("budgetGoal")));
            
            Integer currentExpenseWeekYear = Integer.valueOf(String.valueOf(jsonExpense.get("weekYearBought")));
            Integer currentExpenseMonthBought = Integer.valueOf(String.valueOf(jsonExpense.get("monthBoughtInNum")));
            Integer currentExpenseYearBought = Integer.valueOf(currentExpenseDateBought.substring(0,currentExpenseDateBought.indexOf("-")));
            
            Object[] objectExpense = new Object[4];
            
            objectExpense[0] = overAllIndex++;
            objectExpense[1] = currentExpenseFoodName;
            objectExpense[2] = currentExpensePrice;
            objectExpense[3] = (currentExpensePrice <= loggedAccount.getBudgetGoal());
            
            
            
            //Daily Code ---------------------------------------------------------------------------------------------------------------------
            if(!currentExpenseDateBought.equals(currentDay)) {
                
                currentDay = currentExpenseDateBought;
                dailyIndex++; 
                dailySum = 0.0;
                dailyExpensePurchases.add(new ArrayList<>());
                newDailyExpense = new Object[7];
                dailyExpenses.add(newDailyExpense);
                newDailyExpense[0] = dailyIndex + 1;
                newDailyExpense[1] = currentExpenseDateBought;
            }
            
            dailyExpensePurchases.get(dailyIndex).add(objectExpense);
            
            dailySum += currentExpensePrice;
            newDailyExpense[2] = dailySum / dailyExpensePurchases.get(dailyIndex).size();
            
            if(dailySum >= (currentBudgetGoal * .7)) {
                newDailyExpense[3] = dailySum <= currentBudgetGoal;
            }
            else newDailyExpense[3] = "neither";
            
            newDailyExpense[4] = dailySum;
            newDailyExpense[5] = dailyExpensePurchases.get(dailyIndex).size();
            newDailyExpense[6] = currentBudgetGoal;
            //-----------------------------------------------------------------------------------------------------------------------------------
        
            
            // Weekly Code ----------------------------------------------------------------------------------------------------------------------
            if(!currentExpenseWeekYear.equals(currentWeek) || !currentExpenseYearBought.equals(currentYearWeek)) {
                
                currentWeek = currentExpenseWeekYear;
                
                weeklyIndex++; 
                weeklySum = 0.0;
                weeklyExpensePurchases.add(new ArrayList<>());
                newWeeklyExpense = new Object[6];
                weeklyExpenses.add(newWeeklyExpense);
                newWeeklyExpense[0] = weeklyIndex + 1;
                
                newWeeklyExpense[1] = (Objects.equals(currentExpenseWeekYear, recentWeek) && Objects.equals(recentYear, currentExpenseYearBought)) ? "this week" : "" + (((((currentExpenseYearBought - recentYear) == 0) ? recentWeek - currentExpenseWeekYear : ((52 * (recentYear - currentExpenseYearBought)) + currentExpenseWeekYear) - recentWeek))) + " week ago";
                currentYearWeek = currentExpenseYearBought;
            }
            
            weeklyExpensePurchases.get(weeklyIndex).add(objectExpense);
            
            weeklySum += currentExpensePrice;
            newWeeklyExpense[2] = weeklySum / weeklyExpensePurchases.get(weeklyIndex).size();
            newWeeklyExpense[3] = (Double) newWeeklyExpense[2] <= currentBudgetGoal;
            newWeeklyExpense[4] = weeklySum;
            newWeeklyExpense[5] = weeklyExpensePurchases.get(weeklyIndex).size();
            //-----------------------------------------------------------------------------------------------------------------------------------
            
            
            // Monthly Code ---------------------------------------------------------------------------------------------------------------------
            if(!currentExpenseMonthBought.equals(currentMonth) || !currentExpenseYearBought.equals(currentYearMonth)) {
                
                currentMonth = currentExpenseMonthBought;
                
                monthlyIndex++; 
                monthlySum = 0.0;
                monthlyExpensePurchases.add(new ArrayList<>());
                newMonthlyExpense = new Object[6];
                monthlyExpenses.add(newMonthlyExpense);
                newMonthlyExpense[0] = monthlyIndex + 1;
                newMonthlyExpense[1] = (Objects.equals(currentExpenseMonthBought, recentMonth) && currentExpenseYearBought.equals(recentYear)) ? "this month" : "" + (((((currentExpenseYearBought - recentYear) == 0) ? currentExpenseMonthBought : ((12 * (recentYear - currentExpenseYearBought)) + currentExpenseMonthBought) - recentMonth))) + " month/s ago";
                currentYearMonth = currentExpenseYearBought;
            }
            
            monthlyExpensePurchases.get(monthlyIndex).add(objectExpense);
            
            monthlySum += currentExpensePrice;
            newMonthlyExpense[2] = monthlySum / monthlyExpensePurchases.get(monthlyIndex).size();
            newMonthlyExpense[3] = (Double) newMonthlyExpense[2] < loggedAccount.getBudgetGoal();
            newMonthlyExpense[4] = monthlySum;
            newMonthlyExpense[5] = monthlyExpensePurchases.get(monthlyIndex).size();
            // ----------------------------------------------------------------------------------------------------------------------------------
        
            // Overall --------------------------------------------------------------------------------------------------------------------------
            totalSum += currentExpensePrice;
            overAllExpenses.add(objectExpense);
            //-----------------------------------------------------------------------------------------------------------------------------------

        }
        
        //Setting Goals and Misses (Here because I can't access the daily expense outside :()
        for (Object[] o : dailyExpenses) {
                
                if(o[3] != null && !String.valueOf(o[3]).equals("neither")) {
                    if((boolean) o[3]) goalFulfilled++;
                    else goalMissed++;
                }
            }
        
        //SET SORTING COMBO BOX =================================================================================================================
        
        // First JTable Set Up
        showSortedList(overAllExpenses, ComparatorClasses.getComparator(0), false, false, "No", "Food Name", "Price");

        // For the First Sorting Combo Box - By Overall, Daily, Weekly, and Monthly Expenses
        jcmbExpenseSortBy1.addActionListener(e -> {
                
            switch (jcmbExpenseSortBy1.getSelectedIndex()) {
                
                case 0 -> showSortedList(overAllExpenses, selectedSortingOperation, false, false, "No", "Food Name", "Price");
                case 1 -> showSortedList(dailyExpenses, selectedSortingOperation, true, false, "Date", "Items", "Total", "Budget Goal", "Goal");
                case 2 -> showSortedList(weeklyExpenses, selectedSortingOperation, true, true, "Week", "Items", "Total", "Avg");
                case 3 -> showSortedList(monthlyExpenses, selectedSortingOperation, true, true, "Month", "Items", "Total", "Avg");
            }
        });
        
        // For the Second Sorting Combo Box - By Newest, Oldest, Most Bought, Least Bought
        jcmbExpenseSortBy2.addActionListener(e -> {
            
            switch (jcmbExpenseSortBy2.getSelectedIndex()) {
               case 0 -> showSortedList(selectedListOfExpenses, ComparatorClasses.getComparator(0), getTotal, fromWeeklyAndMonthy, tableFields);
               case 1 -> showSortedList(selectedListOfExpenses, ComparatorClasses.getComparator(1), getTotal, fromWeeklyAndMonthy, tableFields);
               case 2 -> showSortedList(selectedListOfExpenses, ComparatorClasses.getComparator(2), getTotal, fromWeeklyAndMonthy, tableFields);
               case 3 -> showSortedList(selectedListOfExpenses, ComparatorClasses.getComparator(3), getTotal, fromWeeklyAndMonthy, tableFields);
           }
        });
        
        //Back Button
        jbtnBack.addActionListener(e -> {
            getTotal = true;
//            if(prevSelectedListOfExpenses == dailyExpenses) ComparatorClasses.fromDaily = true;z
            showSortedList(prevSelectedListOfExpenses, prevSelectedSortingOperation, getTotal, prevFromWeeklyAndMonthy, prevTableFields);
            jbtnBack.setEnabled(false);
        });
        
        //Mouse Listener to when we click on Daily, Weekly, and Monthly to view Food Items for that Date..
         jtblAccountExpenseTable.addMouseListener(new MouseAdapter() {
                
            @Override
            public void mouseClicked(MouseEvent e) {
                
                if(selectedListOfExpenses.equals(dailyExpenses) || selectedListOfExpenses.equals(weeklyExpenses) || selectedListOfExpenses.equals(monthlyExpenses)) {

                    prevSelectedListOfExpenses = selectedListOfExpenses;
                    prevSelectedSortingOperation = selectedSortingOperation;
                    prevTableFields = tableFields;
                    prevFromWeeklyAndMonthy = fromWeeklyAndMonthy;

                    jbtnBack.setEnabled(true);

                    int selectedExpense = jtblAccountExpenseTable.getSelectedRow();

                    int index = (int) selectedListOfExpenses.get(selectedExpense)[0];

                    switch (jcmbExpenseSortBy1.getSelectedIndex()) {
                        case 1 -> showSortedList(dailyExpensePurchases.get(index - 1), selectedSortingOperation, false, false, "No", "Food Name", "Price");
                        case 2 -> showSortedList(weeklyExpensePurchases.get(index - 1), selectedSortingOperation, false, false, "No", "Food Name", "Price");
                        case 3 -> showSortedList(monthlyExpensePurchases.get(index - 1), selectedSortingOperation, false, false, "No", "Food Name", "Price");
                    }
                }
            }
        });
         
         
        // Set Summary =======================================================================================
        
        
        JSONObject recentExpense = (!accountExpense.isEmpty()) ? (JSONObject) accountExpense.getLast() : null;    
        
        if(recentExpense == null) {
            
            jlbToday.setText("P0.0");
            jlbTodayAvg.setText("P0.0");
            jlbWeek.setText("P0.0");
            jlbWeekAvg.setText("P0.0");
            jlbMonth.setText("P0.0");
            jlbMonthAvg.setText("P0.0");
            jlbOverall.setText("P0.0");
            return;
        }
         
        Integer recentExpenseWeek = Integer.valueOf(String.valueOf(recentExpense.get("weekYearBought")));
        Integer recentExpenseMonth = Integer.valueOf(String.valueOf(recentExpense.get("monthBoughtInNum")));
        Integer mostRecentYearInExpense = Integer.valueOf(((String)recentExpense.get("date")).substring(0,((String)recentExpense.get("date")).indexOf("-")));

        // Today Summary -------------------------------------------------------------------------------------
        
        Object[] mostRecentDailyExpense = (!dailyExpenses.isEmpty()) ? dailyExpenses.getLast(): null;
        
         if(mostRecentDailyExpense != null) {
             
            String mostRecentDailyExpenseDate = (String) mostRecentDailyExpense[1];
            boolean mostRecentDayEqualsNow = (mostRecentDailyExpenseDate.equals(dateNow.toString()));
            
            jlbToday.setText((mostRecentDayEqualsNow) ? "P" + ((Double) mostRecentDailyExpense[4]) : "P0");
            spentToday = (mostRecentDayEqualsNow) ? (Double) mostRecentDailyExpense[4] : 0.0;
         }
         else jlbToday.setText("P0");
         
         jlbTodayAvg.setText("P%.2f".formatted(getAverageFromListAr(dailyExpenses)));
         // ---------------------------------------------------------------------------------------------------
         
          // Week Summary -------------------------------------------------------------------------------------
        Object[] mostRecentWeeklyExpense = weeklyExpenses.getLast();
        boolean mostRecentWeekEqualsNow = (Objects.equals(recentExpenseWeek, recentWeek)) && mostRecentYearInExpense.equals(recentYear);


        jlbWeek.setText((mostRecentWeekEqualsNow) ? "P" + ((Double) mostRecentWeeklyExpense[4]) : "P0");
        jlbWeekAvg.setText("P%.2f".formatted(getAverageFromListAr(weeklyExpenses)));
         // ---------------------------------------------------------------------------------------------------

         // Monthly Summary -------------------------------------------------------------------------------------
        Object[] mostRecentMonthlyExpense = monthlyExpenses.getLast();
        boolean mostRecentMonthEqualsNow = (Objects.equals(recentExpenseMonth, recentMonth)) && mostRecentYearInExpense.equals(recentYear);


        jlbMonth.setText((mostRecentMonthEqualsNow) ? "P" + ((Double) mostRecentMonthlyExpense[4]) : "P0");
         // ---------------------------------------------------------------------------------------------------
         
         // Overall -------------------------------------------------------------------------------------------
         jlbOverall.setText("P" + totalSum);
         jlbMonthAvg.setText("P%.2f".formatted(getAverageFromListAr(monthlyExpenses)));
         // ---------------------------------------------------------------------------------------------------
    }
    
    // Shows The Selected List To The Table Along With The Selected Sorting Operation
    private void showSortedList (List<Object[]> listToSort, Comparator sortOperation, boolean getTotal, boolean fromWeeklyAndMonthy, String... tableFieldArguments) {
        
        if(selectedListOfExpenses != null) {
            if(sortOperation.getClass().equals(selectedSortingOperation.getClass()) && listToSort.equals(selectedListOfExpenses)) {
                return;
            }
        }
        
        Comparator localSortOperation = sortOperation;
        
        ComparatorClasses.indexOfValueField = (getTotal) ? 4 : 2;
        
        ComparatorClasses.fromDaily = (!fromWeeklyAndMonthy && getTotal);
        
        if(fromWeeklyAndMonthy) {
            if(sortOperation.getClass().equals(ComparatorClasses.getComparator(0).getClass())) localSortOperation = ComparatorClasses.getComparator(1);
            else if(sortOperation.getClass().equals(ComparatorClasses.getComparator(1).getClass()))localSortOperation = ComparatorClasses.getComparator(0);
        }
        
        listToSort.sort(localSortOperation);
        
        Object[][] mainExpenseToShow = convertListToObject2D(listToSort, getTotal, fromWeeklyAndMonthy);
        String[] showFields;
        
        if(fromWeeklyAndMonthy) showFields = new String[]{tableFieldArguments[0], tableFieldArguments[1], tableFieldArguments[2], tableFieldArguments[3]};
        else if(getTotal)showFields = new String[]{tableFieldArguments[0], tableFieldArguments[1], tableFieldArguments[2], tableFieldArguments[3], tableFieldArguments[4]};
        else showFields = new String[]{tableFieldArguments[0], tableFieldArguments[1], tableFieldArguments[2]};
        
        jtblAccountExpenseTable.setModel(new javax.swing.table.DefaultTableModel(
            mainExpenseToShow,
            showFields
        ));
        
        // UI Design -----------------------------------------------------------------
        jtblAccountExpenseTable.setRowHeight(30);
        
        if (fromWeeklyAndMonthy) {
            jtblAccountExpenseTable.getColumnModel().getColumn(0).setPreferredWidth(105);
            jtblAccountExpenseTable.getColumnModel().getColumn(1).setPreferredWidth(25);
            jtblAccountExpenseTable.getColumnModel().getColumn(2).setPreferredWidth(40);
            jtblAccountExpenseTable.getColumnModel().getColumn(3).setPreferredWidth(40);
        }
        else if(getTotal) {
            jtblAccountExpenseTable.getColumnModel().getColumn(0).setPreferredWidth(110);
            jtblAccountExpenseTable.getColumnModel().getColumn(1).setPreferredWidth(50);
            jtblAccountExpenseTable.getColumnModel().getColumn(2).setPreferredWidth(50);
        }
        else {
            jtblAccountExpenseTable.getColumnModel().getColumn(0).setPreferredWidth(15);
            jtblAccountExpenseTable.getColumnModel().getColumn(1).setPreferredWidth(145);
            jtblAccountExpenseTable.getColumnModel().getColumn(2).setPreferredWidth(40);
        }

        JTableHeader header = jtblAccountExpenseTable.getTableHeader();
        header.setFont(new Font("Serif", Font.BOLD, 25));
        header.setForeground(new Color(255,255,255));
        header.setBackground(new Color(43,71,44));
        
        jtblAccountExpenseTable.setDefaultEditor(Object.class, null);
        // ---------------------------------------------------------------------------
        
        selectedListOfExpenses = listToSort;
        selectedSortingOperation = sortOperation;
        tableFields = tableFieldArguments;
        this.getTotal = getTotal;
        this.fromWeeklyAndMonthy = fromWeeklyAndMonthy;
    }
    
    // Convers the List<Object[]> to 2D Object Array To Be Set in the JTable
    private Object[][] convertListToObject2D (List<Object[]> listObjectAr, boolean getTotal, boolean fromWeeklyAndMonthy) {
        
        Object[][] new2DObject = new Object[listObjectAr.size()][];
        
        for (int i = 0; i < new2DObject.length; i++) {
            
            if (fromWeeklyAndMonthy) {
                Object[] currentAr = listObjectAr.get(i);
                new2DObject[i] = new Object[]{currentAr[1], currentAr[5], currentAr[4], "%.2f".formatted((Double) currentAr[2])};
            }
            else if(getTotal) {
                Object[] currentAr = listObjectAr.get(i);
                new2DObject[i] = new Object[]{currentAr[1], currentAr[5], "%.2f".formatted((Double) currentAr[4]), currentAr[6], currentAr[3]};
            }
            else new2DObject[i] = listObjectAr.get(i);
        }
        
        return new2DObject;
    }
    
    private Double getAverageFromListAr (List<Object[]> listObjectAr) {
        
        double sum = 0.0;
        
        for (Object[] objectAr : listObjectAr) {
            Double getTotalOfObjectAr = (Double) objectAr[4];
            sum += getTotalOfObjectAr;
        }
        
        return (sum / listObjectAr.size());
    }
    // =====================================================================================================================================
    // =====================================================================================================================================
    
    
    private void setDetails () {
        
        jlbUsernameDetails.setText("%11s".formatted(loggedAccount.getUsername().toUpperCase()));
        jlbDetailsLevel.setText("" + loggedAccount.getLevel());
        jlbDetailsRank.setText(loggedAccount.getRank().toString());
        jlbDetailsRankDiscount.setText("%%%d".formatted((int) (loggedAccount.getRank().getDiscount() * 100)));
        jlbDetailsGoalsFulfilled.setText("" + goalFulfilled);
        jlbDetailsGoalsMisses.setText("" + goalMissed);
        
        jbtnDetailsUpdate.addActionListener(e -> {
            
            if(jrbtnDetailsUpdate.isSelected()) {

                String newPassword = jpwrdDetailsNewPassword.getText();
                String currentPassword = loggedAccount.getPassword();
                
                if(jpwrdDetailsPassword.getText().equals(currentPassword)) {
                    
                    if(!newPassword.isBlank() && newPassword.length() >= 5) {
                        AccountHandler.updateJSONFile(loggedAccount.getUsername(), "password", jpwrdDetailsNewPassword.getText());
                        AccountHandler.saveJSONFile();
                        JOptionPane.showMessageDialog(this, "Successfully Updated Passowrd");
                    }
                    else JOptionPane.showMessageDialog(this, "New Password is too Short (Min : 5)");
                }
                else JOptionPane.showMessageDialog(this, "Wrong Password");
            }
            else JOptionPane.showMessageDialog(this, "Click the Radio Button First");
        });
        
    }
    
    
    //Extra Codes (Mostly For UI Design) ---------------------------------------
    public final void extras() {
        
        jScrollPane1.getViewport().setBackground(new Color(205,65,82));
        jTabbedPane1.setLayout(new CardLayout());
        
        JButton[] buttons = {jbtnMenu,jbtnDetails,jbtnLogOut,jbtnGoal,jbtnExpenses};
        
        for(JButton button : buttons) {
            button.setContentAreaFilled( false );
            button.setBorder( null );
            
            button.addMouseListener(new MouseAdapter() {
                
            @Override
            public void mouseEntered(MouseEvent e) {
                button.setForeground(new Color(204,204,255));
            }
            
            @Override
            public void mouseExited(MouseEvent e) {
                button.setForeground(new Color(241,243,236));
            }
        });
        }
        
        jScrollPane1.getVerticalScrollBar().setPreferredSize(new Dimension(10, 0));
        jScrollPane1.getVerticalScrollBar().setBackground(new Color(35,35,35));
        
        jtxfLogInBudgetGoal.addMouseListener(new MouseAdapter(){
            
            @Override
            public void mouseEntered(MouseEvent e) {
                jtxfLogInBudgetGoal.setText("");
            }
        });
    }
    //--------------------------------------------------------------------------
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
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
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel20;
    private javax.swing.JPanel jPanel21;
    private javax.swing.JPanel jPanel22;
    private javax.swing.JPanel jPanel23;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JButton jbtnAddBudgetGoal;
    private javax.swing.JButton jbtnBack;
    private javax.swing.JButton jbtnDetails;
    private javax.swing.JButton jbtnDetailsUpdate;
    private javax.swing.JButton jbtnExpenses;
    private javax.swing.JButton jbtnGoal;
    private javax.swing.JButton jbtnLogOut;
    private javax.swing.JButton jbtnMenu;
    private javax.swing.JComboBox<String> jcmbExpenseSortBy1;
    private javax.swing.JComboBox<String> jcmbExpenseSortBy2;
    private javax.swing.JLabel jlbCurrentGoal;
    private javax.swing.JLabel jlbDetailsGoalsFulfilled;
    private javax.swing.JLabel jlbDetailsGoalsMisses;
    private javax.swing.JLabel jlbDetailsLevel;
    private javax.swing.JLabel jlbDetailsRank;
    private javax.swing.JLabel jlbDetailsRankDiscount;
    private javax.swing.JLabel jlbFriday;
    private javax.swing.JLabel jlbMonday;
    private javax.swing.JLabel jlbMoneyTree;
    private javax.swing.JLabel jlbMonth;
    private javax.swing.JLabel jlbMonthAvg;
    private javax.swing.JLabel jlbMonthAvgText;
    private javax.swing.JLabel jlbMonthText;
    private javax.swing.JLabel jlbOverall;
    private javax.swing.JLabel jlbOverallText;
    private javax.swing.JLabel jlbRUI;
    private javax.swing.JLabel jlbRUI1;
    private javax.swing.JLabel jlbRank;
    private javax.swing.JLabel jlbRank1;
    private javax.swing.JLabel jlbSaturday;
    private javax.swing.JLabel jlbSunday;
    private javax.swing.JLabel jlbThursday;
    private javax.swing.JLabel jlbToday;
    private javax.swing.JLabel jlbTodayAvg;
    private javax.swing.JLabel jlbTodayAvgView;
    private javax.swing.JLabel jlbTodayText;
    private javax.swing.JLabel jlbTuesday;
    private javax.swing.JLabel jlbUsernameDetails;
    private javax.swing.JLabel jlbWarning;
    private javax.swing.JLabel jlbWarning1;
    private javax.swing.JLabel jlbWednesday;
    private javax.swing.JLabel jlbWeek;
    private javax.swing.JLabel jlbWeekAvg;
    private javax.swing.JLabel jlbWeekAvgText;
    private javax.swing.JLabel jlbWeekText;
    private javax.swing.JProgressBar jpgbrLevel;
    private javax.swing.JPasswordField jpwrdDetailsNewPassword;
    private javax.swing.JPasswordField jpwrdDetailsPassword;
    private javax.swing.JRadioButton jrbtnDetailsUpdate;
    private javax.swing.JTable jtblAccountExpenseTable;
    private javax.swing.JTextField jtxfLogInBudgetGoal;
    // End of variables declaration//GEN-END:variables
}
