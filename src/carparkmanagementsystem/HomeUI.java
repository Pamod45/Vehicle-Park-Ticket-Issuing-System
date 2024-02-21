/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package carparkmanagementsystem;

import carparkmanagementsystem.dataStructures.AVLTree;
import carparkmanagementsystem.dataStructures.DailyCustomerList;
import carparkmanagementsystem.dataStructures.DayList;
import carparkmanagementsystem.dataStructures.Heap;
import com.formdev.flatlaf.themes.FlatMacLightLaf;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.UIDefaults;
import javax.swing.UIManager;

public class HomeUI extends javax.swing.JFrame {
    Heap slotminheap;
    AVLTree timeTree;
    DayList daylist;
    int numberOfSlots=8;
    String formattedDate;
    public HomeUI() {
        initComponents();
        addDefaultDays();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
        formattedDate = dateFormat.format(new Date());//"2024/02/21"
        if(daylist.getCustomerList(formattedDate)==null){
            daylist.addDay(formattedDate);
        }
        slotminheap = new Heap(numberOfSlots);
        timeTree = new AVLTree();
        for(int i=1;i<=numberOfSlots;i++){
            slotminheap.insert(i);
            timeTree.insert(i);
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        ReleaseButton = new javax.swing.JButton();
        ReserveButton = new javax.swing.JButton();
        IncomeStatusButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));
        jPanel1.setForeground(new java.awt.Color(204, 204, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setText("ABC Car Park");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(181, 181, 181)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jLabel1)
                .addContainerGap(34, Short.MAX_VALUE))
        );

        ReleaseButton.setBackground(new java.awt.Color(102, 102, 255));
        ReleaseButton.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        ReleaseButton.setForeground(new java.awt.Color(255, 255, 255));
        ReleaseButton.setText("Release Slot");
        ReleaseButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ReleaseButtonActionPerformed(evt);
            }
        });

        ReserveButton.setBackground(new java.awt.Color(102, 102, 255));
        ReserveButton.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        ReserveButton.setForeground(new java.awt.Color(255, 255, 255));
        ReserveButton.setText("Reserve Slot");
        ReserveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ReserveButtonActionPerformed(evt);
            }
        });

        IncomeStatusButton.setBackground(new java.awt.Color(102, 102, 255));
        IncomeStatusButton.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        IncomeStatusButton.setForeground(new java.awt.Color(255, 255, 255));
        IncomeStatusButton.setText("Income Status");
        IncomeStatusButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IncomeStatusButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(92, Short.MAX_VALUE)
                .addComponent(ReserveButton, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(90, 90, 90)
                .addComponent(ReleaseButton, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(107, 107, 107))
            .addGroup(layout.createSequentialGroup()
                .addGap(215, 215, 215)
                .addComponent(IncomeStatusButton, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(83, 83, 83)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ReserveButton, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ReleaseButton, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(59, 59, 59)
                .addComponent(IncomeStatusButton, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 61, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void ReserveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ReserveButtonActionPerformed
        ReserveSlotUI reserveSlot = new ReserveSlotUI(this);
        reserveSlot.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_ReserveButtonActionPerformed

    private void ReleaseButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ReleaseButtonActionPerformed
        ReleaseSlotUI releaseSlot = new ReleaseSlotUI(this);
        releaseSlot.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_ReleaseButtonActionPerformed

    private void IncomeStatusButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IncomeStatusButtonActionPerformed
        IncomeStatusUI income = new IncomeStatusUI(this);
        income.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_IncomeStatusButtonActionPerformed
    private void addDefaultDays(){
        daylist = new DayList();
        daylist.addDay("2024/02/17");
        DailyCustomerList customers = daylist.getCustomerList("2024/02/17");
        customers.addCustomer("09:05:00", "10:20:00", 300);
        customers.addCustomer("11:30:00", "12:10:00", 150);
        customers.addCustomer("17:05:00", "18:20:00", 300);
        daylist.addDay("2024/02/18");
        customers = daylist.getCustomerList("2024/02/18");
        customers.addCustomer("08:05:00", "09:20:00", 300);
        customers.addCustomer("10:30:00", "12:10:00", 300);
        customers.addCustomer("13:05:00", "14:20:00", 300);
        daylist.addDay("2024/02/19");
        customers = daylist.getCustomerList("2024/02/19");
        customers.addCustomer("08:05:00", "09:20:00", 300);
        customers.addCustomer("10:30:00", "12:10:00", 300);
        customers.addCustomer("13:05:00", "14:20:00", 300);
        daylist.addDay("2024/02/20");
        customers = daylist.getCustomerList("2024/02/20");
        customers.addCustomer("09:05:00", "10:20:00", 300);
        customers.addCustomer("11:30:00", "12:10:00", 150);
        customers.addCustomer("17:05:00", "18:20:00", 300);
        
        
    }
    public static void main(String args[]) {       
        FlatMacLightLaf.setup();
        UIDefaults defaults = UIManager.getLookAndFeelDefaults();
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HomeUI().setVisible(true);
            }
        });
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton IncomeStatusButton;
    private javax.swing.JButton ReleaseButton;
    private javax.swing.JButton ReserveButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
