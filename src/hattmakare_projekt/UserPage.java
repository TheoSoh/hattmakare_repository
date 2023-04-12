/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package hattmakare_projekt;
import oru.inf.InfDB;
import oru.inf.InfException;
/**
 *
 * @author theosohlman
 */
public class UserPage extends javax.swing.JFrame {
    private static InfDB idb;
    

    /**
     * Creates new form UserPage
     */
    public UserPage(InfDB idb) {
        initComponents();
        this.idb = idb;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblHeader = new javax.swing.JLabel();
        lblHeaderSecond = new javax.swing.JLabel();
        btnRegisterCustomer = new javax.swing.JButton();
        btnRegisterOrder = new javax.swing.JButton();
        btnChangeOrderInfo = new javax.swing.JButton();
        btnShowOrderInfo = new javax.swing.JButton();
        btnShowCustomerInfo = new javax.swing.JButton();
        btnChangeInfoCustomer = new javax.swing.JButton();
        btnChangeOrderStatus = new javax.swing.JButton();
        btnShowStatistics = new javax.swing.JButton();
        btnCreateInvoice = new javax.swing.JButton();
        btnPrint = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblHeader.setFont(new java.awt.Font("Helvetica Neue", 0, 48)); // NOI18N
        lblHeader.setText("V�lkommen");

        lblHeaderSecond.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        lblHeaderSecond.setText("Vad vill du g�ra?");

        btnRegisterCustomer.setText("Registera ny kund");
        btnRegisterCustomer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegisterCustomerActionPerformed(evt);
            }
        });

        btnRegisterOrder.setText("Registrera f�rfr�gan");
        btnRegisterOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegisterOrderActionPerformed(evt);
            }
        });

        btnChangeOrderInfo.setText("�ndra i order");

        btnShowOrderInfo.setText("Visa order");
        btnShowOrderInfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnShowOrderInfoActionPerformed(evt);
            }
        });

        btnShowCustomerInfo.setText("Se information om kund");

        btnChangeInfoCustomer.setText("�ndra information om kund");

        btnChangeOrderStatus.setText("�ndra status p� order");

        btnShowStatistics.setText("Se statistik");

        btnCreateInvoice.setText("Skapa faktura");

        btnPrint.setText("Skriv ut frakt och tullsedel");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(97, 97, 97)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblHeaderSecond, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnRegisterCustomer)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnRegisterOrder)
                                    .addComponent(btnChangeOrderInfo)
                                    .addComponent(btnChangeOrderStatus))
                                .addGap(61, 61, 61)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnPrint)
                                    .addComponent(btnCreateInvoice)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnShowCustomerInfo)
                                    .addComponent(btnChangeInfoCustomer))
                                .addGap(77, 77, 77)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnShowOrderInfo)
                                    .addComponent(btnShowStatistics)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(87, 87, 87)
                        .addComponent(lblHeader)))
                .addContainerGap(290, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addComponent(lblHeader)
                .addGap(18, 18, 18)
                .addComponent(lblHeaderSecond)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRegisterCustomer)
                    .addComponent(btnShowOrderInfo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnShowCustomerInfo)
                    .addComponent(btnShowStatistics))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnChangeInfoCustomer)
                .addGap(67, 67, 67)
                .addComponent(btnRegisterOrder)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnChangeOrderInfo)
                    .addComponent(btnCreateInvoice))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnPrint)
                    .addComponent(btnChangeOrderStatus))
                .addContainerGap(129, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegisterCustomerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegisterCustomerActionPerformed
        new RegistreraKund(idb).setVisible(true);
    }//GEN-LAST:event_btnRegisterCustomerActionPerformed

    private void btnRegisterOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegisterOrderActionPerformed
      new RegisterOrder(idb).setVisible(true);
    }//GEN-LAST:event_btnRegisterOrderActionPerformed

    private void btnShowOrderInfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnShowOrderInfoActionPerformed
        // TODO add your handling code here:
        new searchOrder(idb).setVisible(true);
    }//GEN-LAST:event_btnShowOrderInfoActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnChangeInfoCustomer;
    private javax.swing.JButton btnChangeOrderInfo;
    private javax.swing.JButton btnChangeOrderStatus;
    private javax.swing.JButton btnCreateInvoice;
    private javax.swing.JButton btnPrint;
    private javax.swing.JButton btnRegisterCustomer;
    private javax.swing.JButton btnRegisterOrder;
    private javax.swing.JButton btnShowCustomerInfo;
    private javax.swing.JButton btnShowOrderInfo;
    private javax.swing.JButton btnShowStatistics;
    private javax.swing.JLabel lblHeader;
    private javax.swing.JLabel lblHeaderSecond;
    // End of variables declaration//GEN-END:variables
}
