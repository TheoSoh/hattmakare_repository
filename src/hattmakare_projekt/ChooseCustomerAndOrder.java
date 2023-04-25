/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package hattmakare_projekt;

import static java.lang.Integer.parseInt;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import oru.inf.InfDB;
import oru.inf.InfException;



/**
 *
 * @author filippabostrom
 */
public class ChooseCustomerAndOrder extends javax.swing.JFrame {
    private static InfDB idb;
    private int customerId;
    private int chosenOrderId;
    
    /**
     * Creates new form ChooseCustomerAndOrder
     */
    public ChooseCustomerAndOrder(InfDB idb) {
        initComponents();
        this.idb = idb;
        fillComboBoxWithCustomers();
    }
    
    private void fillComboBoxWithCustomers() {
        String query = "SELECT Name from Customer";
        
        ArrayList <String> allCustomers;
        
        try {
            allCustomers = idb.fetchColumn(query);
            
            for(String namn:allCustomers) {
                cmbCustomerName.addItem(namn);   
            }
            
        }catch(InfException e) {
            JOptionPane.showMessageDialog(null, "fel");
        }
    }
    
    private void fillComboBoxWithOrder() {
        cmbOrderId.removeAllItems();
        String query = "SELECT OrderID from `Order` where Customer = " + customerId + ";";
        
        ArrayList <String> allOrderID;
        
        try {
            allOrderID = idb.fetchColumn(query);
            
            for(String order:allOrderID) {
                cmbOrderId.addItem(order);   
            }
            
        }catch(InfException e) {
            JOptionPane.showMessageDialog(null, "fel");
        }
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblChooseCustomer = new javax.swing.JLabel();
        lblChooseOrder = new javax.swing.JLabel();
        cmbOrderId = new javax.swing.JComboBox<>();
        cmbCustomerName = new javax.swing.JComboBox<>();
        btnChange = new javax.swing.JButton();
        btnGoBack = new javax.swing.JButton();
        lblErrorMessage = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblChooseCustomer.setFont(new java.awt.Font("Helvetica Neue", 0, 36)); // NOI18N
        lblChooseCustomer.setText("V�lja kund");

        lblChooseOrder.setFont(new java.awt.Font("Helvetica Neue", 0, 24)); // NOI18N
        lblChooseOrder.setText("V�lj order att �ndra ");

        cmbCustomerName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbCustomerNameActionPerformed(evt);
            }
        });

        btnChange.setText("�ndra");
        btnChange.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChangeActionPerformed(evt);
            }
        });

        btnGoBack.setFont(new java.awt.Font("Helvetica Neue", 0, 10)); // NOI18N
        btnGoBack.setText("Tillbaka");
        btnGoBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGoBackActionPerformed(evt);
            }
        });

        lblErrorMessage.setFont(new java.awt.Font("Helvetica Neue", 0, 10)); // NOI18N
        lblErrorMessage.setForeground(new java.awt.Color(255, 0, 0));
        lblErrorMessage.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(lblErrorMessage, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 82, Short.MAX_VALUE)
                .addComponent(btnChange)
                .addGap(25, 25, 25))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(113, 113, 113)
                            .addComponent(lblChooseCustomer))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(90, 90, 90)
                            .addComponent(lblChooseOrder))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(cmbCustomerName, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(btnGoBack, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(cmbOrderId, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(158, 158, 158))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnGoBack, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblChooseCustomer)
                .addGap(18, 18, 18)
                .addComponent(cmbCustomerName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addComponent(lblChooseOrder)
                .addGap(32, 32, 32)
                .addComponent(cmbOrderId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnChange)
                    .addComponent(lblErrorMessage, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmbCustomerNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbCustomerNameActionPerformed
        
        try {
            String customerName = cmbCustomerName.getSelectedItem().toString();
            String idQuery = "select CustomerID from Customer where Name = '" + customerName + "';";
            String id = idb.fetchSingle(idQuery);
            customerId = parseInt(id);
        }
        catch(InfException e) {
            JOptionPane.showMessageDialog(null,"databasfel!");
        }
        
        fillComboBoxWithOrder();
    }//GEN-LAST:event_cmbCustomerNameActionPerformed

    private void btnChangeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChangeActionPerformed
        String chosenOrderIdString = cmbOrderId.getSelectedItem().toString();
        chosenOrderId = parseInt(chosenOrderIdString);
        if(isConfirmedOrCompletedOrder()) {
            lblErrorMessage.setText("Ordern du valt �r under produktion!");
            return;
        }
        new ChangeOrder(idb,chosenOrderId).setVisible(true);
        dispose();
    }//GEN-LAST:event_btnChangeActionPerformed

    private void btnGoBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGoBackActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_btnGoBackActionPerformed
    
    private boolean isConfirmedOrCompletedOrder() {
        boolean isCorC = false;
        try{
            String statusQuery = "select OrderID from `Order` where Payment_status = TRUE and OrderID = " + chosenOrderId + " or Order_complete_status = TRUE and OrderID = " + chosenOrderId + ";";
            String statusResult = idb.fetchSingle(statusQuery);
            if(statusResult != null) {
                isCorC = true;
            }
        }
        catch(InfException e) {
            JOptionPane.showMessageDialog(null,"databasfel!");
        }
        return isCorC;
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnChange;
    private javax.swing.JButton btnGoBack;
    private javax.swing.JComboBox<String> cmbCustomerName;
    private javax.swing.JComboBox<String> cmbOrderId;
    private javax.swing.JLabel lblChooseCustomer;
    private javax.swing.JLabel lblChooseOrder;
    private javax.swing.JLabel lblErrorMessage;
    // End of variables declaration//GEN-END:variables
}
