package classes;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import javax.swing.BoxLayout;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.JTextArea;

public class FoodItem {
    
    private final String imagePath;
    private final String name;
    private final String type;
    private final Integer price;
    private final int amountBought;
    
    public static OrderList referencedList;
    public static DefaultListModel list;
    public static boolean alreadyHaveAnOrder;
    public static Double budgetGoal;
    
    private JProgressBar progressBar;
    private final JPanel panel;

    {
        panel = new JPanel();
    }
    
    public FoodItem(String imagePath, String name, String type, Integer price, int amountBought) {
        
        this.imagePath = imagePath;
        this.name = name;
        this.type = type;
        this.price = price;
        this.amountBought = amountBought;
    }
    
    public FoodItem(String empty) {
        this("",empty, "", 0, 0);
    }
    
    public JPanel getPanel () {
        
        if("Empty".equals(name)) {
            JPanel emptyPanel = new JPanel();
            emptyPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(155,27,58), 7));
            return emptyPanel;
        }
        
        panel.setSize(200,300);
        panel.setLayout(new FlowLayout());
        panel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(155,27,58), 7));
        panel.setSize(new Dimension(200, 85));
        panel.setMinimumSize(new Dimension(200, 85));
        panel.setMaximumSize(new Dimension(200, 85));
        
        JPanel panelImage = new JPanel();
        panelImage.setSize(new Dimension(150, 85));
        panelImage.setMinimumSize(new Dimension(150, 85));
        panelImage.setMaximumSize(new Dimension(150, 85));
        panelImage.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        panelImage.setBackground(new Color(253,240,253));
        
        
        JLabel icon = new JLabel();
        icon.setSize(new Dimension(150, 65));
        icon.setMinimumSize(new Dimension(150, 85));
        icon.setMaximumSize(new Dimension(150, 85));
        icon.setIcon(new ImageIcon(getClass().getResource("/images/TempIcon2.png")));
        panelImage.add(icon);
        
        
        JPanel panelName = new JPanel();
        panelName.setMaximumSize(new Dimension(200, 15));
        
        JTextArea labelName = new JTextArea();
        labelName.setSize(130,80);
        labelName.setMinimumSize(new Dimension(130, 80));
        labelName.setMaximumSize(new Dimension(130, 80));
        labelName.setText(name);
        labelName.setLineWrap(true);
        labelName.setFont(new java.awt.Font("Segoe UI", 1, 15));
        labelName.setEditable(false);
        labelName.setFocusable(false);
        
        panelName.add(labelName);
        
        
        JPanel panelPrice = new JPanel();
        panelPrice.setMinimumSize(new Dimension(200, 33));
        panelPrice.setMaximumSize(new Dimension(200, 33));
//        panelPrice.setBackground(Color.pink);
        
        JLabel labelPrice = new JLabel("Price: P" + price);
        labelPrice.setFont(new java.awt.Font("Segoe UI", 1, 15));
        panelPrice.add(labelPrice);
        
        JButton addButton = new JButton("ADD");
        addButton.setFont(new java.awt.Font("Tahoma", 1, 10));
        addButton.setForeground(new java.awt.Color(0, 0, 0));
        addButton.setBackground(new Color(171,171,255));
        addButton.setMinimumSize(new Dimension(22, 15));
        addButton.setMaximumSize(new Dimension(22, 15));
        
        addButton.addActionListener(e -> {
            
            if(alreadyHaveAnOrder) {
                JOptionPane.showMessageDialog(null, "You Currently have a Pending Order", "Message", JOptionPane.WARNING_MESSAGE);
                return;
            }
            
            referencedList.addFoodItem(this, budgetGoal);
            
            list.addElement("%-15s :  %s".formatted(this.name.toUpperCase(), "P" + this.price));
            
            progressBar.setValue(referencedList.getTotalPrice());
            if(referencedList.getTotalPrice() <= progressBar.getMaximum()) {
                progressBar.setForeground(new Color(0,224,0));
            }
            else {
                progressBar.setForeground(new Color(204,0,0));
            }
            
        });
        
        panelPrice.add(addButton);      

        panelPrice.setBackground(Color.white);
        panelName.setBackground(Color.white);
        panel.add(panelPrice);
        panel.add(panelImage);
        panel.add(panelName);

        
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        
        return panel;
    }

    public String getImagePath() {
        return imagePath;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public Integer getPrice() {
        return price;
    }

    public int getAmountBought() {
        return amountBought;
    }

    public void setReferencedList(OrderList referencedList) {
        this.referencedList = referencedList;
    }

    public void setProgressBar(JProgressBar progressBar) {
        this.progressBar = progressBar;
    }

    public void setList(DefaultListModel list) {
        this.list = list;
    }
    
    public void setAlreadyHaveAnOrder(boolean value) {
        this.alreadyHaveAnOrder = value;
    }
    
    @Override
    public String toString () {
        return "Name : " + name;
    }
}
