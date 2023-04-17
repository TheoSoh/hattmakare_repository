/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package hattmakare_projekt;

import java.awt.Color;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import oru.inf.InfDB;
import oru.inf.InfException;

public class searchOrder extends javax.swing.JFrame {
    
    private InfDB idb;
    
    /**
     * Creates new form searchOrder
     * @param idb
     */
    public searchOrder(InfDB idb) {
        initComponents();
        this.idb = idb;
        fillCustomerBox();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblChooseCustomerHeadline = new javax.swing.JLabel();
        lblHeadline = new javax.swing.JLabel();
        cmbChooseCustomer = new javax.swing.JComboBox<>();
        lblChooseOrderHeadline = new javax.swing.JLabel();
        cmbChooseOrder = new javax.swing.JComboBox<>();
        btnShowOrder = new javax.swing.JButton();
        btnChooseCustomer = new javax.swing.JButton();
        btnGoBack = new javax.swing.JButton();
        lblError = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblChooseCustomerHeadline.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        lblChooseCustomerHeadline.setText("V�lj den kund som lagt best�llning du s�ker");

        lblHeadline.setFont(new java.awt.Font("Helvetica Neue", 0, 24)); // NOI18N
        lblHeadline.setText("Visa en best�llning");

        lblChooseOrderHeadline.setText("V�lj vilken av denna kunds best�llningar du vill visa");

        cmbChooseOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbChooseOrderActionPerformed(evt);
            }
        });

        btnShowOrder.setText("Visa");
        btnShowOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnShowOrderActionPerformed(evt);
            }
        });

        btnChooseCustomer.setText("V�lj kund");
        btnChooseCustomer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChooseCustomerActionPerformed(evt);
            }
        });

        btnGoBack.setFont(new java.awt.Font("Helvetica Neue", 0, 10)); // NOI18N
        btnGoBack.setText("Tillbaka");
        btnGoBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGoBackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(96, 96, 96)
                        .addComponent(lblHeadline, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(123, 123, 123)
                        .addComponent(cmbChooseCustomer, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(121, 121, 121)
                        .addComponent(cmbChooseOrder, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnGoBack))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblChooseCustomerHeadline)
                            .addComponent(lblChooseOrderHeadline)
                            .addComponent(lblError, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(144, 144, 144)
                        .addComponent(btnChooseCustomer))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(142, 142, 142)
                        .addComponent(btnShowOrder)))
                .addContainerGap(76, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(btnGoBack, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(lblHeadline, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblChooseCustomerHeadline)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cmbChooseCustomer, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnChooseCustomer)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblChooseOrderHeadline)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cmbChooseOrder, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnShowOrder)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblError, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


 public String chosenOrder(){
     String chosenOrderID = cmbChooseOrder.getSelectedItem().toString();
        
     
     return chosenOrderID;
 }
 private void fillCustomerBox() {
        
         
        String query = "SELECT name from Customer";
        
        ArrayList <String> allaKundNamn;
        
        try {
            allaKundNamn = idb.fetchColumn(query);
            
            for(String name:allaKundNamn) {
                cmbChooseCustomer.addItem(name);   
            }
            
        }catch(InfException e) {
            JOptionPane.showMessageDialog(null, "fel");
        }
    }   
    
    private void btnShowOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnShowOrderActionPerformed
        // TODO add your handling code here:
        if(cmbChooseOrder.getSelectedItem() == null){
        lblError.setForeground(Color.red);
        lblError.setText("V�nligen v�lj en order f�r att kunna visa");
        } else{
            
            String selectedOrderID = chosenOrder();
        new showOrder(idb, selectedOrderID).setVisible(true);
        dispose();
        }
        
    }//GEN-LAST:event_btnShowOrderActionPerformed

    private void btnChooseCustomerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChooseCustomerActionPerformed
        // TODO add your handling code here:
        String chosenCustomer = cmbChooseCustomer.getSelectedItem().toString();
        String query = "SELECT OrderID FROM `Order` JOIN customer on customer.CustomerID = `order`.Customer WHERE NAME = '" + chosenCustomer + "'";
        
        ArrayList <String> allOrdersForCustomer  ;
        
        try {
            
            allOrdersForCustomer = idb.fetchColumn(query);
            
            for(String orders:allOrdersForCustomer) {
                cmbChooseOrder.addItem(orders);
                
        }
  
        } catch (InfException ex) {
            Logger.getLogger(searchOrder.class.getName()).log(Level.SEVERE, null, ex);
        } 
        
    }//GEN-LAST:event_btnChooseCustomerActionPerformed

    private void cmbChooseOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbChooseOrderActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_cmbChooseOrderActionPerformed

    private void btnGoBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGoBackActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_btnGoBackActionPerformed

    
    
    
    /**
     * @param args the command line arguments
     */
    public searchOrder(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(searchOrder.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(searchOrder.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(searchOrder.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(searchOrder.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new searchOrder(idb).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnChooseCustomer;
    private javax.swing.JButton btnGoBack;
    private javax.swing.JButton btnShowOrder;
    private javax.swing.JComboBox<String> cmbChooseCustomer;
    private javax.swing.JComboBox<String> cmbChooseOrder;
    private javax.swing.JLabel lblChooseCustomerHeadline;
    private javax.swing.JLabel lblChooseOrderHeadline;
    private javax.swing.JLabel lblError;
    private javax.swing.JLabel lblHeadline;
    // End of variables declaration//GEN-END:variables

    void setVisible() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
