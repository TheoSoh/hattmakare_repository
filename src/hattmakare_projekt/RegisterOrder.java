/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package hattmakare_projekt;

import java.awt.Image;
import java.awt.Toolkit;
import java.io.File;
import static java.lang.Integer.parseInt;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import oru.inf.InfDB;
import oru.inf.InfException;

/**
 *
 * @author Oskar
 */
public class RegisterOrder extends javax.swing.JFrame {

    private InfDB idb;
    private int employeeId;
    
    
    /**
     * Creates new form RegisterOrder
     * @param idb
     */
    public RegisterOrder(InfDB idb, int employeeId) {
        initComponents();
        this.idb = idb;
        this.employeeId = employeeId;
        fillBoxWithCustomer();
        setExtendedState(JFrame.MAXIMIZED_BOTH);  
        
    }

   
    
    
    private void fillBoxWithCustomer() {
        
         
        String fraga = "SELECT Name from Customer";
        
        ArrayList <String> allCustomerNames;
        
        try {
            allCustomerNames = idb.fetchColumn(fraga);
            
            for(String aName:allCustomerNames) {
                cboAllCustomers.addItem(aName);   
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

        jPopupMenu1 = new javax.swing.JPopupMenu();
        cboAllCustomers = new javax.swing.JComboBox<>();
        lblChooseCustomer = new javax.swing.JLabel();
        lblHatSize = new javax.swing.JLabel();
        txtHatSize = new javax.swing.JTextField();
        lblHatColor = new javax.swing.JLabel();
        cboHatColor = new javax.swing.JComboBox<>();
        lblHatDescription = new javax.swing.JLabel();
        txtHatDescription = new javax.swing.JTextField();
        lblHatSketch = new javax.swing.JLabel();
        btnSearchHatSketch = new javax.swing.JButton();
        lblRubrik = new javax.swing.JLabel();
        lblEstimatedTime = new javax.swing.JLabel();
        txtEstimatedTime = new javax.swing.JTextField();
        lblEstimatedCost = new javax.swing.JLabel();
        txtEstimatedMaterialCost = new javax.swing.JTextField();
        btnEstimatedCost = new javax.swing.JButton();
        lblEstimatedPrice = new javax.swing.JLabel();
        cboOptionalDiscount = new javax.swing.JComboBox<>();
        txtChooseDiscount = new javax.swing.JLabel();
        btnRegisterOrder = new javax.swing.JButton();
        lblAmount = new javax.swing.JLabel();
        cboHatAmount = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1235, 1235));
        setSize(new java.awt.Dimension(100, 150));

        cboAllCustomers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboAllCustomersActionPerformed(evt);
            }
        });

        lblChooseCustomer.setText("V�lj kund:");

        lblHatSize.setText("Storlek (cm)");

        txtHatSize.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtHatSizeActionPerformed(evt);
            }
        });

        lblHatColor.setText("F�rg:");

        cboHatColor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "V�lj", "Bl�", "Brun", "Gr�", "Gr�n", "Gul", "Guld", "Lila", "Orange", "Rosa", "R�d", "Silver", "Svart", "Turkos", "Violett", "Vit" }));
        cboHatColor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboHatColorActionPerformed(evt);
            }
        });

        lblHatDescription.setText("Beskrivning:");

        btnSearchHatSketch.setText("Skiss..");
        btnSearchHatSketch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchHatSketchActionPerformed(evt);
            }
        });

        lblRubrik.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblRubrik.setText("Registrera order");
        lblRubrik.setMaximumSize(new java.awt.Dimension(234, 44));
        lblRubrik.setMinimumSize(new java.awt.Dimension(234, 44));
        lblRubrik.setPreferredSize(new java.awt.Dimension(234, 44));
        lblRubrik.setSize(new java.awt.Dimension(20, 20));

        lblEstimatedTime.setText("Uppskattad arbetstid (h):");

        txtEstimatedTime.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEstimatedTimeActionPerformed(evt);
            }
        });

        lblEstimatedCost.setText("Uppskattad materialkostnad (kr):");

        txtEstimatedMaterialCost.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEstimatedMaterialCostActionPerformed(evt);
            }
        });

        btnEstimatedCost.setText("Uppskattad kostnad:");
        btnEstimatedCost.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEstimatedCostActionPerformed(evt);
            }
        });

        lblEstimatedPrice.setText("jLabel1");

        cboOptionalDiscount.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0%", "5%", "10%", "15%", "20%", "25%" }));
        cboOptionalDiscount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboOptionalDiscountActionPerformed(evt);
            }
        });

        txtChooseDiscount.setText("V�lj rabatt:");

        btnRegisterOrder.setText("Skicka");
        btnRegisterOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegisterOrderActionPerformed(evt);
            }
        });

        lblAmount.setText("Antal:");

        cboHatAmount.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "v�lj", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblAmount)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnEstimatedCost))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(lblChooseCustomer)
                                        .addComponent(lblHatSize))
                                    .addGap(70, 70, 70)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(cboAllCustomers, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(txtHatSize))
                                    .addGap(5, 5, 5))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cboHatAmount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cboHatColor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(lblHatColor))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtChooseDiscount))
                    .addComponent(lblRubrik, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnSearchHatSketch)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblHatDescription)
                                .addGap(66, 66, 66)
                                .addComponent(txtHatDescription, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btnRegisterOrder))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblEstimatedTime, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblEstimatedCost, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(37, 37, 37)
                            .addComponent(txtEstimatedTime, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtEstimatedMaterialCost, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(cboOptionalDiscount, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(lblEstimatedPrice)))
                .addGap(622, 622, 622))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lblHatSketch, javax.swing.GroupLayout.PREFERRED_SIZE, 749, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(336, 336, 336))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(lblRubrik, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblChooseCustomer)
                    .addComponent(cboAllCustomers, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblEstimatedTime)
                    .addComponent(txtEstimatedTime, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEstimatedCost)
                    .addComponent(txtEstimatedMaterialCost, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblHatSize)
                            .addComponent(txtHatSize, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblHatColor)
                            .addComponent(cboHatColor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtChooseDiscount)
                            .addComponent(cboOptionalDiscount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cboHatAmount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnEstimatedCost)
                        .addComponent(lblEstimatedPrice)
                        .addComponent(lblAmount)))
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblHatDescription)
                    .addComponent(txtHatDescription, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblHatSketch, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnSearchHatSketch)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnRegisterOrder)))
                .addGap(18, 60, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cboAllCustomersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboAllCustomersActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cboAllCustomersActionPerformed

    private void txtHatSizeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtHatSizeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtHatSizeActionPerformed

    private void cboHatColorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboHatColorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cboHatColorActionPerformed

    private void btnSearchHatSketchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchHatSketchActionPerformed
    JFileChooser chooser = new JFileChooser();
    chooser.showOpenDialog(null);
    File file = chooser.getSelectedFile();
    String path = file.getAbsolutePath();
    
    Image im = Toolkit.getDefaultToolkit().createImage(path);
    im = im.getScaledInstance(lblHatSketch.getWidth(), lblHatSketch.getHeight(), lblHatSketch.getHorizontalAlignment());
    ImageIcon ii = new ImageIcon(im);
    lblHatSketch.setIcon(ii);
    }//GEN-LAST:event_btnSearchHatSketchActionPerformed

    private void txtEstimatedTimeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEstimatedTimeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEstimatedTimeActionPerformed

    private void txtEstimatedMaterialCostActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEstimatedMaterialCostActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEstimatedMaterialCostActionPerformed

    private void btnEstimatedCostActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEstimatedCostActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEstimatedCostActionPerformed

    private void cboOptionalDiscountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboOptionalDiscountActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cboOptionalDiscountActionPerformed

    private void btnRegisterOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegisterOrderActionPerformed
    
    String size = txtHatSize.getText();
    String color = cboHatColor.getSelectedItem().toString();
    String description = txtHatDescription.getText();
    String amount = cboHatAmount.getSelectedItem().toString();
    String customerName = cboAllCustomers.getSelectedItem().toString();
   
   
 


    
    try{
        
        
    String customer = "Select CustomerID from Customer where Name = '" + customerName + "'";
    String result =  idb.fetchSingle(customer);
    int customerInt = parseInt(result);
        
        String nextHatId = "(SELECT MAX(HatID) FROM Hat)";
        String nextOrderId = "(SELECT MAX(OrderID) FROM Order)";
       
        String hatQuery = "INSERT INTO Hat (Size,Price,Color,Description) VALUES ('" + size + "', null, '" + color + "', '" + description + "')";
        
        String orderQuery = "INSERT INTO Order (Amount,Total_Price,Order_date,Shipment_date,Invoice_sent_status,Payment_status , Order_complete_status, Created_by_employee,Customer,Picture_exist) VALUES (" + amount + ",null, curdate(), null, 0 , 0 , 0 ," + employeeId + "," + customerInt + ",null)"; 
        
        
        
        
        String orderAndHatQuery = "INSERT INTO Hat_in_order (HatID,OrderID) VALUES (" + nextHatId + ", " + nextOrderId + ")";
        
        
        
      
        idb.insert(hatQuery);
        idb.insert(orderQuery);
        idb.insert(orderAndHatQuery);
        
        
            JOptionPane.showMessageDialog(null, "Din f�rfr�gan �r skapad! <3");

              

        }
        
       
        
        
        catch(Exception e) {
            JOptionPane.showMessageDialog(null, "System error");
            System.out.println("Fel" + e.getMessage());
        }
    }//GEN-LAST:event_btnRegisterOrderActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEstimatedCost;
    private javax.swing.JButton btnRegisterOrder;
    private javax.swing.JButton btnSearchHatSketch;
    private javax.swing.JComboBox<String> cboAllCustomers;
    private javax.swing.JComboBox<String> cboHatAmount;
    private javax.swing.JComboBox<String> cboHatColor;
    private javax.swing.JComboBox<String> cboOptionalDiscount;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JLabel lblAmount;
    private javax.swing.JLabel lblChooseCustomer;
    private javax.swing.JLabel lblEstimatedCost;
    private javax.swing.JLabel lblEstimatedPrice;
    private javax.swing.JLabel lblEstimatedTime;
    private javax.swing.JLabel lblHatColor;
    private javax.swing.JLabel lblHatDescription;
    private javax.swing.JLabel lblHatSize;
    private javax.swing.JLabel lblHatSketch;
    private javax.swing.JLabel lblRubrik;
    private javax.swing.JLabel txtChooseDiscount;
    private javax.swing.JTextField txtEstimatedMaterialCost;
    private javax.swing.JTextField txtEstimatedTime;
    private javax.swing.JTextField txtHatDescription;
    private javax.swing.JTextField txtHatSize;
    // End of variables declaration//GEN-END:variables

 
    
    private static class image {

        public image() {
        }
    }
}
