
package carparkmanagementsystem;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.Timer;

public class ReleaseSlotUI extends javax.swing.JFrame {
    HomeUI home;
    public ReleaseSlotUI(HomeUI home) {
        this.home = home ;
        initComponents();
        updateTime();
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
        releaseSlotButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        enterTimeLabel = new javax.swing.JLabel();
        printBillButton = new javax.swing.JButton();
        insertSlotField = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        priceLabel = new javax.swing.JLabel();
        leaveTimeLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));
        jPanel1.setForeground(new java.awt.Color(204, 204, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setText("Release Slot");

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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 105, Short.MAX_VALUE)
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

        releaseSlotButton.setBackground(new java.awt.Color(102, 102, 255));
        releaseSlotButton.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        releaseSlotButton.setForeground(new java.awt.Color(255, 255, 255));
        releaseSlotButton.setText("Release Slot");
        releaseSlotButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                releaseSlotButtonActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jLabel2.setText("Enter the slot number need to release");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jLabel5.setText("Entered Time");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jLabel6.setText("Leaving Time");

        enterTimeLabel.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        enterTimeLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        enterTimeLabel.setText("00:00:00");

        printBillButton.setBackground(new java.awt.Color(102, 102, 255));
        printBillButton.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        printBillButton.setForeground(new java.awt.Color(255, 255, 255));
        printBillButton.setText("Print Bill");
        printBillButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                printBillButtonActionPerformed(evt);
            }
        });

        insertSlotField.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        insertSlotField.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        insertSlotField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insertSlotFieldActionPerformed(evt);
            }
        });
        insertSlotField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                insertSlotFieldKeyReleased(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jLabel8.setText("Ticket Amount");

        priceLabel.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        priceLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        priceLabel.setText("0.0");

        leaveTimeLabel.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        leaveTimeLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        leaveTimeLabel.setText("00:00:00");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(72, 72, 72)
                        .addComponent(releaseSlotButton, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(insertSlotField, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(printBillButton, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(55, 55, 55))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(priceLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(leaveTimeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(enterTimeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(19, 19, 19)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(insertSlotField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(enterTimeLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(leaveTimeLabel))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(priceLabel))
                .addGap(55, 55, 55)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(releaseSlotButton, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(printBillButton, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(49, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void HomeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HomeButtonActionPerformed
        home.setVisible(true);
        this.setVisible(false);    }//GEN-LAST:event_HomeButtonActionPerformed

    private void insertSlotFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insertSlotFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_insertSlotFieldActionPerformed

    private void printBillButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_printBillButtonActionPerformed
            JOptionPane.showMessageDialog(this, "Bill is printed", "Information", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_printBillButtonActionPerformed

    private void releaseSlotButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_releaseSlotButtonActionPerformed
        if(home.slotminheap.size==home.numberOfSlots){
            JOptionPane.showMessageDialog(this, "All slots are released", "Error", JOptionPane.ERROR_MESSAGE);
        }
        else{
            try {
                    int slot_number = Integer.parseInt(insertSlotField.getText());
                    if(slot_number<=home.numberOfSlots && slot_number>=1 && !home.slotminheap.find(slot_number)){
                        home.daylist.getCustomerList(home.formattedDate).addCustomer(enterTimeLabel.getText(), leaveTimeLabel.getText(), Double.parseDouble(priceLabel.getText()));
                        home.slotminheap.insert(slot_number);
                        home.timeTree.updateTime(slot_number, "00:00:00");
                        enterTimeLabel.setText("00:00:00");
                        priceLabel.setText("0.0");
                        JOptionPane.showMessageDialog(this, "Slot has been released", "Slot released", JOptionPane.INFORMATION_MESSAGE);
                    }
                    else if(slot_number>home.numberOfSlots){
                        JOptionPane.showMessageDialog(this, "Please enter a slot number below "+home.numberOfSlots, "Error", JOptionPane.ERROR_MESSAGE);
                    }
                    else{
                        JOptionPane.showMessageDialog(this, "Slot is already released", "Error", JOptionPane.ERROR_MESSAGE);
                    }
            } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(this, "Not a valid slot number", "Error", JOptionPane.ERROR_MESSAGE);
           }
        }
        insertSlotField.setText("");
    }//GEN-LAST:event_releaseSlotButtonActionPerformed

    private void insertSlotFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_insertSlotFieldKeyReleased
        String text = insertSlotField.getText();
        if (text.isEmpty()) {
            priceLabel.setText("0");
            enterTimeLabel.setText("00:00:00");
        }
        else{
            try{
                int slotNumber = Integer.parseInt(insertSlotField.getText());
                if(slotNumber<=home.numberOfSlots && slotNumber>=1 && !home.slotminheap.find(slotNumber)){
                    String enteredTime = home.timeTree.search(home.timeTree.root,slotNumber).time;
                    enterTimeLabel.setText(enteredTime);
                    java.text.DateFormat df = new java.text.SimpleDateFormat("HH:mm:ss");
                    String currentTime = df.format(new Date());

                    int enteredHour = Integer.parseInt(enteredTime.substring(0, 2));
                    int enteredMinute = Integer.parseInt(enteredTime.substring(3, 5));
                    int leaveHour = Integer.parseInt(currentTime.substring(0, 2));
                    int leaveMinute = Integer.parseInt(currentTime.substring(3, 5));
                    double price = (leaveHour-enteredHour)*150;
                    if(leaveMinute-enteredMinute>0){
                        price+=150;
                    }
                    priceLabel.setText(""+price);
                }
                else{
                    enterTimeLabel.setText("00:00:00");
                    priceLabel.setText("0");
                }
            }
            catch(NumberFormatException e){
                enterTimeLabel.setText("00:00:00");
            }
        }
    }//GEN-LAST:event_insertSlotFieldKeyReleased
    private void updateTime() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");
        String formattedTime = dateFormat.format(new Date());
        leaveTimeLabel.setText(formattedTime);
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton HomeButton;
    private javax.swing.JLabel enterTimeLabel;
    private javax.swing.JTextField insertSlotField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel leaveTimeLabel;
    private javax.swing.JLabel priceLabel;
    private javax.swing.JButton printBillButton;
    private javax.swing.JButton releaseSlotButton;
    // End of variables declaration//GEN-END:variables
}
