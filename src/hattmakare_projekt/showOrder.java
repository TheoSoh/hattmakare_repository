/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package hattmakare_projekt;

import java.util.logging.Level;
import java.util.logging.Logger;
import oru.inf.InfDB;
import oru.inf.InfException;


public class showOrder extends javax.swing.JFrame {

    private InfDB hattdb;
   
    /**
     * Creates new form showOrder
     */
    public showOrder() {
        initComponents();
        fetchCustomer();
        fetchColor();
        fetchSize();
        fetchAmount();
        fetchPicture();
        fetchDescription();
        fetchTotalPrice();
        fetchShippingDate();
        fetchOrderDate();
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblOrderIDHeadline = new javax.swing.JLabel();
        lblStatusHeadline = new javax.swing.JLabel();
        lblCustomerNameHeadline = new javax.swing.JLabel();
        lblOrderDateHeadline = new javax.swing.JLabel();
        lblDescriptionHeadline = new javax.swing.JLabel();
        lblColorHeadline = new javax.swing.JLabel();
        lblSizeHeadline = new javax.swing.JLabel();
        lblAmountHeadline = new javax.swing.JLabel();
        lblTotalPriceHeadline = new javax.swing.JLabel();
        lblOrderID = new javax.swing.JLabel();
        lblOrderStatus = new javax.swing.JLabel();
        lblCustomerName = new javax.swing.JLabel();
        lblHatColor = new javax.swing.JLabel();
        lblHatSize = new javax.swing.JLabel();
        lblAmount = new javax.swing.JLabel();
        lblHatDescription = new javax.swing.JLabel();
        lblTotalPrice = new javax.swing.JLabel();
        lblShippmentDateHeadline = new javax.swing.JLabel();
        lblPictureHeadline = new javax.swing.JLabel();
        lblPictureStatus = new javax.swing.JLabel();
        lblOrderDate = new javax.swing.JLabel();
        lblShippingDate = new javax.swing.JLabel();
        btnBackToSearch = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblOrderIDHeadline.setText("Ordernummer:");

        lblStatusHeadline.setText("Status:");

        lblCustomerNameHeadline.setText("Kundnamn:");

        lblOrderDateHeadline.setText("Beställningsdatum:");

        lblDescriptionHeadline.setText("Hattbeskrivning:");

        lblColorHeadline.setText("Färg:");

        lblSizeHeadline.setText("Storlek:");

        lblAmountHeadline.setText("Antal:");

        lblTotalPriceHeadline.setText("Totalpris:");

        lblShippmentDateHeadline.setText("Leveransdatum:");

        lblPictureHeadline.setText("Bild:");

        btnBackToSearch.setFont(new java.awt.Font("Helvetica Neue", 0, 10)); // NOI18N
        btnBackToSearch.setText("Tillbaka");
        btnBackToSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackToSearchActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(lblDescriptionHeadline)
                        .addGap(18, 18, 18)
                        .addComponent(lblHatDescription, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(37, 37, 37))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblOrderDateHeadline)
                            .addComponent(lblShippmentDateHeadline, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblShippingDate, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblOrderDate, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblTotalPriceHeadline)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblTotalPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(14, 14, 14))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(btnBackToSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(lblCustomerNameHeadline, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblColorHeadline, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblSizeHeadline, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblAmountHeadline, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblPictureHeadline, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(lblPictureStatus, javax.swing.GroupLayout.DEFAULT_SIZE, 127, Short.MAX_VALUE)
                                    .addComponent(lblCustomerName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblHatColor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblHatSize, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblAmount, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(17, 17, 17)
                                .addComponent(lblOrderIDHeadline)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lblOrderID, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(lblStatusHeadline)
                                .addGap(18, 18, 18)
                                .addComponent(lblOrderStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(22, 22, 22))))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblOrderIDHeadline)
                    .addComponent(lblStatusHeadline)
                    .addComponent(lblOrderID, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblOrderStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBackToSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCustomerNameHeadline)
                    .addComponent(lblCustomerName, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblHatColor, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblColorHeadline, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblHatSize, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblSizeHeadline))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblAmountHeadline))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblPictureHeadline)
                    .addComponent(lblPictureStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblDescriptionHeadline)
                    .addComponent(lblHatDescription, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblOrderDateHeadline)
                    .addComponent(lblOrderDate, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTotalPriceHeadline)
                    .addComponent(lblTotalPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblShippmentDateHeadline)
                    .addComponent(lblShippingDate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    
    private void btnBackToSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackToSearchActionPerformed
        
        new searchOrder().setVisible();
        dispose();
        
    }//GEN-LAST:event_btnBackToSearchActionPerformed

    
    private void fetchCustomer(){
        try{
            String query = "Select Name from Customer JOIN `Order` O on Customer.CustomerID = O.Customer where OrderID = '" + lblOrderID.getText() + "'";
            String result = hattdb.fetchSingle(query);
            lblCustomerName.setText(result);
        } catch (InfException ex) {
            Logger.getLogger(showOrder.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    private void fetchColor() {
        try{
           
        String query = "Select Color from Hat JOIN Hat_in_order Hio on Hat.HatID = Hio.HatID JOIN `Order` O on O.OrderID = Hio.OrderID where O.OrderID = '"+ lblOrderID.getText()+ "'";
        String result = hattdb.fetchSingle(query);
        lblHatColor.setText(result);
        } catch (InfException ex) {
            Logger.getLogger(showOrder.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    private void fetchSize(){
        try{
            String query = "Select Size from Hat JOIN Hat_in_order Hio on Hat.HatID = Hio.HatID JOIN `Order` O on O.OrderID = Hio.OrderID where O.OrderID = '"+ lblOrderID.getText()+ "'";
            String result = hattdb.fetchSingle(query);
            lblHatSize.setText(result);
        } catch (InfException ex) {
            Logger.getLogger(showOrder.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    private void fetchAmount(){
        try{
            String query = "Select Amount from `Order`where OrderID = '" + lblOrderID.getText() + "'";
            String result = hattdb.fetchSingle(query);
            lblAmount.setText(result);
            
        } catch(InfException ex){
            Logger.getLogger(showOrder.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    private void fetchPicture(){
        try{
            String query = "Select Picture_exist from `Order` where OrderID = '"+ lblOrderID.getText()+ "'";
            String result = hattdb.fetchSingle(query);
            lblPictureStatus.setText(result);
        } catch (InfException ex){
            Logger.getLogger(showOrder.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    private void fetchDescription(){
        try{
            String query = "Select Description from Hat JOIN Hat_in_order Hio on Hat.HatID = Hio.HatID JOIN `Order` O on O.OrderID = Hio.OrderID where O.OrderID = '"+ lblOrderID.getText()+ "'";
            String result = hattdb.fetchSingle(query);
            lblHatDescription.setText(result);
        } catch (InfException ex){
            Logger.getLogger(showOrder.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    private void fetchTotalPrice(){
        try{
            String query = "Select Totoal_Price from `Order` where OrderID = '"+ lblOrderID.getText()+ "'";
            String result = hattdb.fetchSingle(query);
            lblTotalPrice.setText(result);
        } catch (InfException ex){
            Logger.getLogger(showOrder.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    private void fetchOrderDate(){
        try{
            String query = "Select Order_date from `Order` where OrderID = '"+ lblOrderID.getText()+ "'";
            String result = hattdb.fetchSingle(query);
            lblOrderDate.setText(result);
        } catch (InfException ex){
            Logger.getLogger(showOrder.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    private void fetchShippingDate(){
        try{
            String query = "Select Shipment_date from `Order` where OrderID = '"+ lblOrderID.getText()+ "'";
            String result = hattdb.fetchSingle(query);
            lblShippingDate.setText(result);
        } catch (InfException ex){
            Logger.getLogger(showOrder.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBackToSearch;
    private javax.swing.JLabel lblAmount;
    private javax.swing.JLabel lblAmountHeadline;
    private javax.swing.JLabel lblColorHeadline;
    private javax.swing.JLabel lblCustomerName;
    private javax.swing.JLabel lblCustomerNameHeadline;
    private javax.swing.JLabel lblDescriptionHeadline;
    private javax.swing.JLabel lblHatColor;
    private javax.swing.JLabel lblHatDescription;
    private javax.swing.JLabel lblHatSize;
    private javax.swing.JLabel lblOrderDate;
    private javax.swing.JLabel lblOrderDateHeadline;
    private javax.swing.JLabel lblOrderID;
    private javax.swing.JLabel lblOrderIDHeadline;
    private javax.swing.JLabel lblOrderStatus;
    private javax.swing.JLabel lblPictureHeadline;
    private javax.swing.JLabel lblPictureStatus;
    private javax.swing.JLabel lblShippingDate;
    private javax.swing.JLabel lblShippmentDateHeadline;
    private javax.swing.JLabel lblSizeHeadline;
    private javax.swing.JLabel lblStatusHeadline;
    private javax.swing.JLabel lblTotalPrice;
    private javax.swing.JLabel lblTotalPriceHeadline;
    // End of variables declaration//GEN-END:variables
}
