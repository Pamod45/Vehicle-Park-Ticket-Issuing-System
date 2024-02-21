package carparkmanagementsystem;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.Timer;

public class ReserveSlotUI extends javax.swing.JFrame {
HomeUI home;
    public ReserveSlotUI(HomeUI home) {
        this.home = home;
        initComponents();
        if(home.slotminheap.peek()==-1){
                nextSlotLabel.setText("Empty");
            }
            else{
                nextSlotLabel.setText(""+home.slotminheap.peek());
            }
        updateTime() ;
        Timer timer = new Timer(1000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                updateTime(); // Update the time every second
            }
        });
        timer.start();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        HomeButton = new javax.swing.JButton();
        ResesrveSlotButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        nextSlotLabel = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        enterTimeLabel = new javax.swing.JLabel();
        PrintTicketButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));
        jPanel1.setForeground(new java.awt.Color(204, 204, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setText("Reserve Slot");

        HomeButton.setBackground(new java.awt.Color(51, 51, 255));
        HomeButton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        HomeButton.setForeground(new java.awt.Color(255, 255, 255));
        HomeButton.setText("Home");
        HomeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HomeButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(193, 193, 193)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(HomeButton)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(HomeButton)))
                .addContainerGap(34, Short.MAX_VALUE))
        );

        ResesrveSlotButton.setBackground(new java.awt.Color(102, 102, 255));
        ResesrveSlotButton.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        ResesrveSlotButton.setForeground(new java.awt.Color(255, 255, 255));
        ResesrveSlotButton.setText("Reserve Slot");
        ResesrveSlotButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ResesrveSlotButtonActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jLabel2.setText("Next Free car park slot");

        nextSlotLabel.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        nextSlotLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        nextSlotLabel.setText("08");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jLabel5.setText("in minimum distance");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jLabel6.setText("Entering time");

        enterTimeLabel.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        enterTimeLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        enterTimeLabel.setText("09:30AM");

        PrintTicketButton.setBackground(new java.awt.Color(102, 102, 255));
        PrintTicketButton.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        PrintTicketButton.setForeground(new java.awt.Color(255, 255, 255));
        PrintTicketButton.setText("Print Ticket");
        PrintTicketButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PrintTicketButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(114, 114, 114)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(enterTimeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel2)
                                    .addGap(61, 61, 61)
                                    .addComponent(nextSlotLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(103, 103, 103)
                        .addComponent(ResesrveSlotButton, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(72, 72, 72)
                        .addComponent(PrintTicketButton, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(114, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(nextSlotLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(enterTimeLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 64, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ResesrveSlotButton, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PrintTicketButton, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(74, 74, 74))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void HomeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HomeButtonActionPerformed
        home.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_HomeButtonActionPerformed

    private void ResesrveSlotButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ResesrveSlotButtonActionPerformed
        if(home.slotminheap.size<=0){
            JOptionPane.showMessageDialog(this, "Car park is full.All slots are reserved.", "Error", JOptionPane.ERROR_MESSAGE);
        }
        else{
            JOptionPane.showMessageDialog(this, "Slot has been successfully Reserved", "Slot Reserved", JOptionPane.INFORMATION_MESSAGE);
            int slotnumber = home.slotminheap.delete();
            SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");
            String formattedTime = dateFormat.format(new Date());
            home.timeTree.updateTime(slotnumber, formattedTime);
            if(home.slotminheap.peek()==-1){
                nextSlotLabel.setText("Empty");
            }
            else{
                nextSlotLabel.setText(""+home.slotminheap.peek());
            }
        }
        updateTime() ;        
    }//GEN-LAST:event_ResesrveSlotButtonActionPerformed

    private void PrintTicketButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PrintTicketButtonActionPerformed
            JOptionPane.showMessageDialog(this, "Ticket has been printed", "Ticket Printed", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_PrintTicketButtonActionPerformed
    private void updateTime() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");
        String formattedTime = dateFormat.format(new Date());
        enterTimeLabel.setText(formattedTime);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton HomeButton;
    private javax.swing.JButton PrintTicketButton;
    private javax.swing.JButton ResesrveSlotButton;
    private javax.swing.JLabel enterTimeLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel nextSlotLabel;
    // End of variables declaration//GEN-END:variables
}
