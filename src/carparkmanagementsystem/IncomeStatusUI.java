
package carparkmanagementsystem;

import carparkmanagementsystem.dataStructures.DailyCustomerList;
import carparkmanagementsystem.dataStructures.DayList;
import java.awt.Color;
import java.awt.Component;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellRenderer;

public class IncomeStatusUI extends javax.swing.JFrame {
    HomeUI home;
    DayList sortedList;
    public IncomeStatusUI(HomeUI home) {
        this.home = home;
        initComponents();
        fillTable();
        sortedList = cloneOrgList(home.daylist);
        sortedList.head = mergeSort(sortedList.head);
        DailyCustomerList c = sortedList.head;
        if(c!=null){
            while(c.next!=null){
                c = c.next;
            }
            sortedList.tail = c ;
            sortedList.head.previous = null ;
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        homeButton = new javax.swing.JButton();
        sortButton = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        dailyIncomeTable = new javax.swing.JTable();
        sortByDateRadio = new javax.swing.JRadioButton();
        sortByPriceRadio = new javax.swing.JRadioButton();
        sortDateCombo = new javax.swing.JComboBox<>();
        sortPriceCombo = new javax.swing.JComboBox<>();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));
        jPanel1.setForeground(new java.awt.Color(204, 204, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setText("Income Status");

        homeButton.setBackground(new java.awt.Color(51, 51, 255));
        homeButton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        homeButton.setForeground(new java.awt.Color(255, 255, 255));
        homeButton.setText("Home");
        homeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homeButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(193, 193, 193)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 120, Short.MAX_VALUE)
                .addComponent(homeButton)
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
                        .addComponent(homeButton)))
                .addContainerGap(34, Short.MAX_VALUE))
        );

        sortButton.setBackground(new java.awt.Color(102, 102, 255));
        sortButton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        sortButton.setForeground(new java.awt.Color(255, 255, 255));
        sortButton.setText("Sort");
        sortButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sortButtonActionPerformed(evt);
            }
        });

        dailyIncomeTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Date", "Price"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane2.setViewportView(dailyIncomeTable);

        buttonGroup1.add(sortByDateRadio);
        sortByDateRadio.setText("SortByDate");

        buttonGroup1.add(sortByPriceRadio);
        sortByPriceRadio.setText("SortByPrice");

        sortDateCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ascending", "Descending" }));

        sortPriceCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Min", "Max" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(sortButton, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sortByDateRadio, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sortByPriceRadio, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sortDateCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sortPriceCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(sortByDateRadio)
                        .addGap(7, 7, 7)
                        .addComponent(sortDateCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(sortByPriceRadio)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(sortPriceCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34)
                        .addComponent(sortButton)))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    public void fillTable(){
        String[] columnNames = {"Date", "Price"};
        DefaultTableModel model = new DefaultTableModel(columnNames,0);
        DailyCustomerList current = home.daylist.head;
        while(current!=null){
            Object[] row = {current.date,current.dailyTotal};
            model.addRow(row);
            current = current.next;
        }       
        dailyIncomeTable.setModel(model);
        dailyIncomeTable.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
                @Override
                public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
                    // Get the default renderer component
                    Component component = super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);

                    // Change row color based on row index
                    if (row % 2 == 0) {
                        component.setBackground(Color.pink);
                    } else {
                        component.setBackground(table.getBackground());
                    }

                    return component;
                }
            });
    }
    public void fillTableDescending(){
        String[] columnNames = {"Date", "Price"};
        DefaultTableModel model = new DefaultTableModel(columnNames,0);
        DailyCustomerList current = home.daylist.tail;
        while(current!=null){
            Object[] row = {current.date,current.dailyTotal};
            model.addRow(row);
            current = current.previous;
        }       
        dailyIncomeTable.setModel(model);
    }
    public void fillTableByMinPrice(){
        //sortList();      
        String[] columnNames = {"Date", "Price"};
        DefaultTableModel model = new DefaultTableModel(columnNames,0);
        DailyCustomerList current = sortedList.head;
        while(current!=null){
            Object[] row = {current.date,current.dailyTotal};
            model.addRow(row);
            current = current.next;
        }   
        dailyIncomeTable.setModel(model);        
    }
    public void fillTableByMaxPrice(){    
       // sortList();
        String[] columnNames = {"Date", "Price"};
        DefaultTableModel model = new DefaultTableModel(columnNames,0);
        DailyCustomerList current = sortedList.tail;
        while(current!=null){
            Object[] row = {current.date,current.dailyTotal};
            model.addRow(row);
            current = current.previous;
        }       
        dailyIncomeTable.setModel(model);
    }
    private void homeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homeButtonActionPerformed
        home.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_homeButtonActionPerformed

    private void sortButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sortButtonActionPerformed
        if(sortByDateRadio.isSelected()){
            String selected = sortDateCombo.getSelectedItem().toString();
            if(selected=="Ascending"){
                fillTable();
            }
            else if(selected=="Descending"){
                fillTableDescending();
            }
        }
        else if(sortByPriceRadio.isSelected()){
            String selected = sortPriceCombo.getSelectedItem().toString();
            if(selected=="Min"){
                fillTableByMinPrice();
            }
            else if(selected=="Max"){
                fillTableByMaxPrice();
            }        
        }
    }//GEN-LAST:event_sortButtonActionPerformed
    DailyCustomerList sortedMerge(DailyCustomerList left, DailyCustomerList right)
    {
        DailyCustomerList result = null;
        if (left == null)
            return right;
        if (right == null)
            return left;
        
        if (left.dailyTotal <= right.dailyTotal) {
            result = left;
            result.next = sortedMerge(left.next, right);
        }
        else {
            result = right;
            result.next = sortedMerge(left, right.next);
        }
        if(result.next!=null){
            result.next.previous = result;
        }
        return result;
    }
 
    DailyCustomerList mergeSort(DailyCustomerList h)
    {
        if (h == null || h.next == null) {
            return h;
        }
 
        DailyCustomerList middle = getMiddle(h);
        DailyCustomerList nextofmiddle = middle.next;
 
        middle.next = null;
 
        DailyCustomerList left = mergeSort(h);
        DailyCustomerList right = mergeSort(nextofmiddle);
        
        DailyCustomerList sortedlist = sortedMerge(left, right);
        return sortedlist;
    }
    
    public DailyCustomerList getMiddle(DailyCustomerList head)
    {
        if (head == null)
            return head;
 
        DailyCustomerList slow = head, fast = head;
 
        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
    
    public static DayList cloneOrgList(DayList orig) {
	    DailyCustomerList origCurr = orig.head; 
	    DayList copy = new DayList(); 
	    DailyCustomerList prevCopyNode = null;
	    
	    while (origCurr != null) {
	        DailyCustomerList newCopyNode = new DailyCustomerList(); 
                                newCopyNode.dailyTotal = origCurr.dailyTotal;
                                newCopyNode.date = origCurr.date;
                                newCopyNode.head = origCurr.head;
	        if (prevCopyNode != null) {
	            prevCopyNode.next = newCopyNode; 
	        } else {
	            copy.head = newCopyNode; 
	        }
	        prevCopyNode = newCopyNode; 
	        origCurr = origCurr.next; 
	    }

	    return copy; 
    }
    
    public void sortList(){
        sortedList = new DayList();
        DailyCustomerList current = home.daylist.head;
        while(current!=null){
            if(sortedList.head==null){
                DailyCustomerList temp = new DailyCustomerList();
                temp.date = current.date;
                temp.dailyTotal = current.dailyTotal;
                sortedList.head = sortedList.tail = temp ;                
            }
            else{
                DailyCustomerList temp = sortedList.head;
                DailyCustomerList lastLesserNode = sortedList.head;
                while(temp!=null && temp.dailyTotal<=current.dailyTotal){
                    lastLesserNode = temp ;
                    temp = temp.next;
                }
                DailyCustomerList list = new DailyCustomerList();
                list.dailyTotal = current.dailyTotal;
                list.date = current.date;
                if(temp == sortedList.head){
                    temp.previous = list;
                    list.next = temp ;
                    sortedList.head = list;
                }else{
                    lastLesserNode.next = list ;
                    list.previous = lastLesserNode;
                    list.next = temp;
                    if(temp!=null){
                        temp.previous=list;
                    }                    
                }
                if(lastLesserNode==sortedList.tail){
                        sortedList.tail = list;
                }
            }
            current = current.next;
        }
    }

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JTable dailyIncomeTable;
    private javax.swing.JButton homeButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton sortButton;
    private javax.swing.JRadioButton sortByDateRadio;
    private javax.swing.JRadioButton sortByPriceRadio;
    private javax.swing.JComboBox<String> sortDateCombo;
    private javax.swing.JComboBox<String> sortPriceCombo;
    // End of variables declaration//GEN-END:variables
}
