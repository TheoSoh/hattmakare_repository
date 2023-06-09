/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package hattmakare_projekt;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.print.PageFormat;
import java.awt.print.Printable;
import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import oru.inf.InfDB;
import oru.inf.InfException;
import javax.swing.ImageIcon;

/**
 *
 * @author buggi
 */
public class openTullsedel extends javax.swing.JFrame {

    private InfDB idb;
    private String selectedOrderID;
    ImageIcon imageBarCode = new ImageIcon("BarCode.png");

    /**
     * Creates new form openTullsedel
     * @param idb
     * @param selectedOrderID
     *
     */
    public openTullsedel(InfDB idb, String selectedOrderID) {
        initComponents();
        this.idb = idb;
        this.selectedOrderID = selectedOrderID;
        GenerateRandom();
        fetchShippingDate();
        this.setLocationRelativeTo(null);
        lblBarCode.setIcon(imageBarCode);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnGoBack = new javax.swing.JButton();
        jpanelPage = new java.awt.Panel();
        lblMainHeadline = new javax.swing.JLabel();
        lblPostNord = new javax.swing.JLabel();
        lblCdId = new javax.swing.JLabel();
        lblDeclarationNumber = new javax.swing.JLabel();
        lblInstructionSwedish = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        lblInstructionEnglish = new javax.swing.JLabel();
        lblGift = new javax.swing.JLabel();
        lblDocument = new javax.swing.JLabel();
        lblSaleGoods = new javax.swing.JLabel();
        lblOther = new javax.swing.JLabel();
        lblShipmentDate = new javax.swing.JLabel();
        lblDateHeadline = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        txtfldGift = new javax.swing.JTextField();
        txtfldDocument = new javax.swing.JTextField();
        txtfldSaleGoods = new javax.swing.JTextField();
        txtfldOther = new javax.swing.JTextField();
        lblBarCode = new javax.swing.JLabel();
        btnPrint = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnGoBack.setText("Tillbaka");
        btnGoBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGoBackActionPerformed(evt);
            }
        });

        lblMainHeadline.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblMainHeadline.setText("CUSTOMS DECLARATION");

        lblPostNord.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblPostNord.setText("PostNord");

        lblCdId.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblCdId.setText("CD");

        lblDeclarationNumber.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblDeclarationNumber.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        lblInstructionSwedish.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        lblInstructionSwedish.setText("F�r �ppnas av myndigheter");

        lblInstructionEnglish.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        lblInstructionEnglish.setText("May be opened officially");

        lblGift.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        lblGift.setText("G�va/Gift");

        lblDocument.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        lblDocument.setText("Dokument/Document");

        lblSaleGoods.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        lblSaleGoods.setText("S�lda varor/Sale of goods");

        lblOther.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        lblOther.setText("Annat/Other");

        lblShipmentDate.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N

        lblDateHeadline.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblDateHeadline.setText("Date:");

        txtfldGift.setEditable(false);
        txtfldGift.setBackground(new java.awt.Color(255, 255, 255));
        txtfldGift.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtfldGiftActionPerformed(evt);
            }
        });

        txtfldDocument.setEditable(false);
        txtfldDocument.setBackground(new java.awt.Color(255, 255, 255));

        txtfldSaleGoods.setEditable(false);
        txtfldSaleGoods.setBackground(new java.awt.Color(255, 255, 255));

        txtfldOther.setEditable(false);
        txtfldOther.setBackground(new java.awt.Color(255, 255, 255));
        txtfldOther.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtfldOtherActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpanelPageLayout = new javax.swing.GroupLayout(jpanelPage);
        jpanelPage.setLayout(jpanelPageLayout);
        jpanelPageLayout.setHorizontalGroup(
            jpanelPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpanelPageLayout.createSequentialGroup()
                .addContainerGap(280, Short.MAX_VALUE)
                .addComponent(lblDeclarationNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(jpanelPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jpanelPageLayout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(jpanelPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jpanelPageLayout.createSequentialGroup()
                            .addComponent(lblDateHeadline)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(lblShipmentDate, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(178, 183, Short.MAX_VALUE))
                        .addGroup(jpanelPageLayout.createSequentialGroup()
                            .addGroup(jpanelPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jSeparator1)
                                .addComponent(jSeparator2)
                                .addComponent(lblBarCode, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jpanelPageLayout.createSequentialGroup()
                                    .addGroup(jpanelPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jpanelPageLayout.createSequentialGroup()
                                            .addComponent(txtfldSaleGoods, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(lblSaleGoods)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(txtfldOther, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(lblOther))
                                        .addGroup(jpanelPageLayout.createSequentialGroup()
                                            .addGroup(jpanelPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(lblPostNord)
                                                .addGroup(jpanelPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addGroup(jpanelPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(lblMainHeadline)
                                                        .addGroup(jpanelPageLayout.createSequentialGroup()
                                                            .addComponent(txtfldGift, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                            .addGap(8, 8, 8)
                                                            .addComponent(lblGift)
                                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                            .addComponent(txtfldDocument, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                            .addComponent(lblDocument)))
                                                    .addGroup(jpanelPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(lblInstructionEnglish)
                                                        .addComponent(lblInstructionSwedish))))
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(lblCdId)))
                                    .addGap(0, 0, Short.MAX_VALUE)))
                            .addContainerGap()))))
        );
        jpanelPageLayout.setVerticalGroup(
            jpanelPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpanelPageLayout.createSequentialGroup()
                .addContainerGap(242, Short.MAX_VALUE)
                .addComponent(lblDeclarationNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(100, 100, 100))
            .addGroup(jpanelPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jpanelPageLayout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(jpanelPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(lblDateHeadline, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblShipmentDate, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblBarCode, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(lblMainHeadline)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(jpanelPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jpanelPageLayout.createSequentialGroup()
                            .addGroup(jpanelPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lblCdId)
                                .addGroup(jpanelPageLayout.createSequentialGroup()
                                    .addComponent(lblInstructionSwedish)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(lblInstructionEnglish)))
                            .addGap(10, 10, 10))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpanelPageLayout.createSequentialGroup()
                            .addComponent(lblPostNord)
                            .addGap(18, 18, 18)))
                    .addGroup(jpanelPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblGift)
                        .addComponent(txtfldGift, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtfldDocument, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblDocument))
                    .addGap(14, 14, 14)
                    .addGroup(jpanelPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblSaleGoods)
                        .addComponent(txtfldSaleGoods, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtfldOther, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblOther))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap()))
        );

        btnPrint.setText("Skriv ut...");
        btnPrint.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrintActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jpanelPage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 3, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnGoBack)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnPrint)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGoBack)
                    .addComponent(btnPrint))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jpanelPage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

   private void fetchShippingDate(){
        try{
            String query = "Select Shipment_date from `Order` where OrderID = '"+ selectedOrderID+ "'";
            String result = idb.fetchSingle(query);
            lblShipmentDate.setText(result);
        } catch (InfException ex){
            Logger.getLogger(showOrder.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    private void btnGoBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGoBackActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_btnGoBackActionPerformed

    private void txtfldGiftActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtfldGiftActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtfldGiftActionPerformed

    private void txtfldOtherActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtfldOtherActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtfldOtherActionPerformed

    private void btnPrintActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrintActionPerformed
        // TODO add your handling code here:
               
                       PrinterJob job = PrinterJob.getPrinterJob();
        job.setJobName("Page Print");
        
        job.setPrintable(new Printable() 
        {
            public int print (Graphics pg,PageFormat pf, int pageNum) {
                
                if (pageNum>0) {
                    return Printable.NO_SUCH_PAGE;
                }
                Graphics2D g2 = (Graphics2D) pg;
                g2.translate(pf.getImageableX(), pf.getImageableY());
                g2.scale (0.24,0.24);
                
                jpanelPage.paint(g2);
                return Printable.PAGE_EXISTS;
            }
        });
        boolean ok =job.printDialog();
        if (ok){
            try{
                job.print();
            }
            catch (PrinterException ex) {}
        }
               
    }//GEN-LAST:event_btnPrintActionPerformed

    private void GenerateRandom(){
        Random number = new Random();
        int lowerbound = 10;
        int upperbound = 99;
        int genRan = number.nextInt(lowerbound, upperbound);
        lblDeclarationNumber.setText(Integer.toString(genRan));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGoBack;
    private javax.swing.JButton btnPrint;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private java.awt.Panel jpanelPage;
    private javax.swing.JLabel lblBarCode;
    private javax.swing.JLabel lblCdId;
    private javax.swing.JLabel lblDateHeadline;
    private javax.swing.JLabel lblDeclarationNumber;
    private javax.swing.JLabel lblDocument;
    private javax.swing.JLabel lblGift;
    private javax.swing.JLabel lblInstructionEnglish;
    private javax.swing.JLabel lblInstructionSwedish;
    private javax.swing.JLabel lblMainHeadline;
    private javax.swing.JLabel lblOther;
    private javax.swing.JLabel lblPostNord;
    private javax.swing.JLabel lblSaleGoods;
    private javax.swing.JLabel lblShipmentDate;
    private javax.swing.JTextField txtfldDocument;
    private javax.swing.JTextField txtfldGift;
    private javax.swing.JTextField txtfldOther;
    private javax.swing.JTextField txtfldSaleGoods;
    // End of variables declaration//GEN-END:variables
}
