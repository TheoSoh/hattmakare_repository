/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package hattmakare_projekt;

import java.awt.Color;
import static java.awt.Color.black;
import java.awt.Image;
import java.awt.Toolkit;
import java.io.File;
import static java.lang.Integer.parseInt;
import java.util.ArrayList;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import oru.inf.InfDB;
import oru.inf.InfException;

/**
 *
 * @author Oskar
 */
public class RegisterOrder extends javax.swing.JFrame {

    private InfDB idb;
    private int employeeId;
    private String pathImage = "Ingen skiss vald";
    
    
    /**
     * Creates new form RegisterOrder
     * @param idb
     */
    public RegisterOrder(InfDB idb, int employeeId) {
        initComponents();
        this.idb = idb;
        this.employeeId = employeeId;
        fillBoxWithCustomer();
//        setExtendedState(JFrame.MAXIMIZED_BOTH);  
        btnRemoveImage.setVisible(false);
        
    }

   public void calculateEstimatedPrice()
   {
    double price1 = Double.parseDouble(txtEstimatedTime.getText());
    double price2 = Double.parseDouble(txtEstimatedMaterialCost.getText());
    double price3 = Double.parseDouble(cboOptionalDiscount.getSelectedItem().toString());
    double price4 = Double.parseDouble(cboHatAmount.getSelectedItem().toString());

    double price3Percent = price3 / 100.0;
    

    double x = ((price1 * 800) + price2) * price4;
    
    double total = x - (x * price3Percent);
            
    double pricePerHat = ((price1 * 800) + price2);
            
    lblEstimatedTotalPrice.setText(String.valueOf(total));
    
    lblCostPerHat.setText(String.valueOf(pricePerHat));

    
    lblCurrency1.setText("Kostnad per hatt:");

    lblCurrency.setText("Total kostnad f�r order:");

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
            public boolean checkEmpty(JTextField aTxtField) {
        boolean isEmpty = false;
        if(aTxtField.getText().isEmpty()) {
            isEmpty = true;
        }
        return isEmpty;
    }
        public boolean checkEmpty(JTextPane aTxttField) {
        boolean isEmpty = false;
        if(aTxttField.getText().isEmpty()) {
            isEmpty = true;
        }
        return isEmpty;
    }
        
        
        public void sendEmail() {
        
        String pricePerHat = lblEstimatedTotalPrice.getText().toString();
        String customerName = cboAllCustomers.getSelectedItem().toString();
        
        
        String query = "SELECT Email_address FROM Email WHERE Email.Customer "
                + "IN (SELECT CustomerID FROM Customer WHERE Name = '" + customerName + "')";
                              

        String from = "josef.harknas@gmail.com";

        String host = "smtp.gmail.com";

        Properties properties = System.getProperties();

        properties.put("mail.smtp.host", host);
        properties.put("mail.smtp.port", "465");
        properties.put("mail.smtp.ssl.enable", "true");
        properties.put("mail.smtp.auth", "true");

        // Skickar in anv�ndarnamn/mailadress och l�senord
        Session session = Session.getInstance(properties, new javax.mail.Authenticator() {

            protected PasswordAuthentication getPasswordAuthentication() {

                return new PasswordAuthentication("josef.harknas@gmail.com", "cdvlibazkgfkxxid");

            }

        });

        session.setDebug(true);

        try {

            String to = idb.fetchSingle(query);
            
            MimeMessage message = new MimeMessage(session);

            // Fr�n
            message.setFrom(new InternetAddress(from));
            // Till
            message.addRecipient(Message.RecipientType.TO, new InternetAddress(to));

            message.setSubject("Orderbekr�ftelse");

            message.setText("Hej, " + "\n" + "Tack f�r din f�rfr�gan om att best�lla en hatt fr�n Otto och Judiths hattar. Hatten du �nskar kommer att kosta " 
                    + pricePerHat + " kr. F�r att best�lla den v�nligen svara p� detta meddelande." + "\n" + "\n" + "Mvh Otto och Judith");

            Transport.send(message);

        } catch (MessagingException mex) {
            mex.printStackTrace();
        } catch (InfException ex) {
            Logger.getLogger(SendEmail.class.getName()).log(Level.SEVERE, null, ex);
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
        lblHatSketch = new javax.swing.JLabel();
        btnSearchHatSketch = new javax.swing.JButton();
        lblRubrik = new javax.swing.JLabel();
        lblEstimatedTime = new javax.swing.JLabel();
        txtEstimatedTime = new javax.swing.JTextField();
        lblEstimatedCost = new javax.swing.JLabel();
        txtEstimatedMaterialCost = new javax.swing.JTextField();
        btnEstimatedCost = new javax.swing.JButton();
        lblEstimatedTotalPrice = new javax.swing.JLabel();
        cboOptionalDiscount = new javax.swing.JComboBox<>();
        txtChooseDiscount = new javax.swing.JLabel();
        btnRegisterOrder = new javax.swing.JButton();
        lblAmount = new javax.swing.JLabel();
        cboHatAmount = new javax.swing.JComboBox<>();
        btnBack = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtHatDescription = new javax.swing.JTextPane();
        lblCurrency = new javax.swing.JLabel();
        lblCostPerHat = new javax.swing.JLabel();
        lblResult = new javax.swing.JLabel();
        lblCurrency1 = new javax.swing.JLabel();
        lblEstimatedPriceError = new javax.swing.JLabel();
        btnRemoveImage = new javax.swing.JButton();
        lblHatAmount = new javax.swing.JLabel();
        lblShowHatAmount = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setSize(new java.awt.Dimension(100, 150));

        cboAllCustomers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboAllCustomersActionPerformed(evt);
            }
        });

        lblChooseCustomer.setText("V�lj kund:");

        lblHatSize.setText("Storlek:");

        txtHatSize.setForeground(new java.awt.Color(153, 153, 153));
        txtHatSize.setText("Hattstorlek i centimeter");
        txtHatSize.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtHatSizeFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtHatSizeFocusLost(evt);
            }
        });
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

        lblRubrik.setFont(new java.awt.Font("Helvetica Neue", 1, 24)); // NOI18N
        lblRubrik.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblRubrik.setText("Registrera order");
        lblRubrik.setMaximumSize(new java.awt.Dimension(234, 44));
        lblRubrik.setMinimumSize(new java.awt.Dimension(234, 44));
        lblRubrik.setPreferredSize(new java.awt.Dimension(234, 44));
        lblRubrik.setSize(new java.awt.Dimension(20, 20));

        lblEstimatedTime.setText("Uppskattad arbetstid:");

        txtEstimatedTime.setForeground(new java.awt.Color(153, 153, 153));
        txtEstimatedTime.setText("Antal timmar per hatt");
        txtEstimatedTime.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtEstimatedTimeFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtEstimatedTimeFocusLost(evt);
            }
        });
        txtEstimatedTime.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEstimatedTimeActionPerformed(evt);
            }
        });
        txtEstimatedTime.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtEstimatedTimeKeyPressed(evt);
            }
        });

        lblEstimatedCost.setText("Uppskattad materialkostnad:");

        txtEstimatedMaterialCost.setForeground(new java.awt.Color(153, 153, 153));
        txtEstimatedMaterialCost.setText("Kostnad i kronor per hatt");
        txtEstimatedMaterialCost.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtEstimatedMaterialCostFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtEstimatedMaterialCostFocusLost(evt);
            }
        });
        txtEstimatedMaterialCost.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEstimatedMaterialCostActionPerformed(evt);
            }
        });

        btnEstimatedCost.setText("Uppskatta kostnad");
        btnEstimatedCost.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEstimatedCostActionPerformed(evt);
            }
        });

        lblEstimatedTotalPrice.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);

        cboOptionalDiscount.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "V�lj", "0", "5", "10", "15", "20", "25" }));
        cboOptionalDiscount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboOptionalDiscountActionPerformed(evt);
            }
        });

        txtChooseDiscount.setText("V�lj rabatt i procent:");

        btnRegisterOrder.setText("Registrera order!");
        btnRegisterOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegisterOrderActionPerformed(evt);
            }
        });

        lblAmount.setText("Antal:");

        cboHatAmount.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "V�lj", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));

        btnBack.setText("Tillbaka");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        jScrollPane1.setViewportView(txtHatDescription);

        lblCurrency.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblCurrency.setToolTipText("");

        lblCurrency1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);

        btnRemoveImage.setText("Ta bort...");
        btnRemoveImage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoveImageActionPerformed(evt);
            }
        });

        lblHatAmount.setText("Antal tidigare best�llda hattar:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(71, 71, 71)
                .addComponent(btnBack)
                .addGap(3, 3, 3)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblHatColor)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblHatSize)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(lblAmount)
                                .addComponent(lblHatDescription)
                                .addComponent(btnRemoveImage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnSearchHatSketch, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(lblChooseCustomer)
                            .addComponent(lblHatAmount))
                        .addGap(43, 43, 43)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblHatSketch, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jScrollPane1)
                                        .addComponent(txtHatSize, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                                        .addComponent(cboHatColor, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(cboHatAmount, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(cboAllCustomers, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addComponent(lblShowHatAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 64, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblEstimatedCost)
                                    .addComponent(lblEstimatedTime)
                                    .addComponent(txtChooseDiscount)
                                    .addComponent(btnEstimatedCost))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(cboOptionalDiscount, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtEstimatedTime, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtEstimatedMaterialCost, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(btnRegisterOrder)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(179, 179, 179))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblCurrency, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblCurrency1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblCostPerHat, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblEstimatedTotalPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(167, 167, 167))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblResult, javax.swing.GroupLayout.PREFERRED_SIZE, 386, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(lblEstimatedPriceError, javax.swing.GroupLayout.PREFERRED_SIZE, 371, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addGap(439, 439, 439)
                .addComponent(lblRubrik, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(lblRubrik, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnBack)
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cboAllCustomers, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblChooseCustomer))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblHatAmount, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblShowHatAmount, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblEstimatedTime)
                        .addComponent(txtEstimatedTime, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtEstimatedMaterialCost, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtHatSize, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblHatSize)
                    .addComponent(lblEstimatedCost))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(cboOptionalDiscount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblHatColor)
                        .addComponent(txtChooseDiscount))
                    .addComponent(cboHatColor, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cboHatAmount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblAmount)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(btnEstimatedCost))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblCurrency1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblCostPerHat, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEstimatedTotalPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCurrency, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblHatDescription)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblEstimatedPriceError, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnSearchHatSketch)
                        .addGap(18, 18, 18)
                        .addComponent(btnRemoveImage))
                    .addComponent(lblHatSketch, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnRegisterOrder)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblResult, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(22, 22, 22))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cboAllCustomersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboAllCustomersActionPerformed
        
        
        String customerName = cboAllCustomers.getSelectedItem().toString();
        try{
        String idQuery = "Select CustomerID from Customer where Name = '" + customerName + "';" ;
        String stringId = idb.fetchSingle(idQuery);
        int id = parseInt(stringId);
        
        String orderQuery = "Select Sum(Amount) from `Order` where Customer = " + id + ";";
        String hatAmount = idb.fetchSingle(orderQuery);
        
        if(hatAmount==null) {
            lblShowHatAmount.setText("0");
            return;
        }
        
        lblShowHatAmount.setText(hatAmount);
        
        
        }
        catch (InfException e) {
            
            JOptionPane.showMessageDialog(null, "System error");
            System.out.println("Fel" + e.getMessage());
             
        }
       
        
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
    pathImage = path;
    
    
    Image im = Toolkit.getDefaultToolkit().createImage(path);
    im = im.getScaledInstance(lblHatSketch.getWidth(), lblHatSketch.getHeight(), lblHatSketch.getHorizontalAlignment());
    ImageIcon ii = new ImageIcon(im);
    lblHatSketch.setIcon(ii);
    
    btnRemoveImage.setVisible(true);
    }//GEN-LAST:event_btnSearchHatSketchActionPerformed

    private void txtEstimatedTimeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEstimatedTimeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEstimatedTimeActionPerformed

    private void txtEstimatedMaterialCostActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEstimatedMaterialCostActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEstimatedMaterialCostActionPerformed

    private void btnEstimatedCostActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEstimatedCostActionPerformed
        
        
                      lblEstimatedPriceError.setForeground(Color.RED);
        if(cboHatAmount.getSelectedItem().equals("V�lj")) {
            lblEstimatedPriceError.setText("V�lj antal hattar");
            return;
        } 
        if(checkEmpty(txtEstimatedTime)) {
             lblEstimatedPriceError.setText("V�nligen ange en uppskattad arbetstid f�r hatten");
          return;
        }
        if(txtEstimatedTime.getText().equals("Antal timmar per hatt")){
            lblEstimatedPriceError.setText("V�nligen ange en uppskattad arbetstid f�r hatten");
          return;
        }
        if(checkEmpty(txtEstimatedMaterialCost)) {
             lblEstimatedPriceError.setText("V�nligen ange en uppskattad materialkostnad f�r hatten");
          return;
        }
        if(txtEstimatedMaterialCost.getText().equals("Kostnad i kronor per hatt")){
            lblEstimatedPriceError.setText("V�nligen ange en uppskattad materialkostnad f�r hatten");
          return;
        } 
        
        if(cboOptionalDiscount.getSelectedItem().equals("V�lj")) {
            lblEstimatedPriceError.setText("Ange en rabattsats");
        return;
        }
        else calculateEstimatedPrice();
        lblEstimatedPriceError.setText("");
        
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
    String pricePerHat = lblCostPerHat.getText().toString();
    String estimatedPrice = lblEstimatedTotalPrice.getText();
    String sketch = pathImage.toString();
    String materialCost = txtEstimatedMaterialCost.getText();
    String hourPerHat = txtEstimatedTime.getText();
    
              lblResult.setForeground(Color.RED);
        if(cboAllCustomers.getSelectedItem().equals("V�lj")) {
            lblResult.setText("V�nligen v�lj en kund");
            return;
        }
        if(checkEmpty(txtHatSize)) {
            lblResult.setText("V�nligen skriv in en storlek");
            return;
        }
        if(txtHatSize.getText().equals("Hattstorlek i centimeter")){
            lblResult.setText("V�nligen skriv in en storlek");
          return;
        } 
        
        if(cboHatColor.getSelectedItem().equals("V�lj")) {
            lblResult.setText("V�nligen v�lj en f�rg");
            return;
        }
        if(cboHatAmount.getSelectedItem().equals("V�lj")) {
            lblResult.setText("V�nligen v�lj antal hattar");
            return;
        } 
         if(checkEmpty(txtHatDescription)) {
            lblResult.setText("V�nligen ange en beskrivning");
            return;
        }
        if(checkEmpty(txtEstimatedTime)) {
             lblResult.setText("V�nligen ange en uppskattad arbetstid f�r hatten");
          return;
        }
        if(txtEstimatedTime.getText().equals("Antal timmar per hatt")){
            lblResult.setText("V�nligen ange en uppskattad arbetstid f�r hatten");
          return;
        }
        if(checkEmpty(txtEstimatedMaterialCost)) {
             lblResult.setText("V�nligen ange en uppskattad materialkostnad f�r hatten");
          return;
        }
        if(txtEstimatedMaterialCost.getText().equals("Kostnad i kronor per hatt")){
            lblResult.setText("V�nligen ange en uppskattad materialkostnad f�r hatten");
          return;
        } 
        
        if(cboOptionalDiscount.getSelectedItem().equals("V�lj")) {
            lblResult.setText("V�nligen ange en rabattsats");
        return;
        }
        
        if(lblCostPerHat.getText().isEmpty()){
            lblResult.setText("Uppskatta kostnaden f�r hatten"); 
        }
//        if(lblHatSketch.) {
//            lblResult.setText("");
//        return;
//        }
        else {
    
        
    try{
        
        
    String customer = "Select CustomerID from Customer where Name = '" + customerName + "'";
    String result =  idb.fetchSingle(customer);
    int customerInt = parseInt(result);
        
        String nextHatId = "(SELECT MAX(HatID) FROM Hat)";
        
        String nextOrderId = "(SELECT MAX(OrderID) FROM `Order`)";
       
        String hatQuery = "INSERT INTO Hat (Size, Price, Color, Description, image, material_cost, hour_per_hat) VALUES ('" + size + "', '" + pricePerHat + "', '" + color + "', '" + description + "', '" + sketch + "', '" + materialCost + "', '" + hourPerHat + "')";
        
        String orderQuery = "INSERT INTO `Order` (Amount, Total_Price, Order_date, Shipment_date, Invoice_sent_status, Payment_status, Order_complete_status, Created_by_employee, Customer, Picture_exist) VALUES (" + amount + ", " + estimatedPrice + ", curdate(), null, 0, 0, 0, " + employeeId + ", " + customerInt + ", null)";
        
        String orderAndHatQuery = "INSERT INTO Hat_in_order (HatID,OrderID) VALUES (" + nextHatId + ", " + nextOrderId + ")";
        
//        String sketchQuery = "INSERT INTO Hat (image) VALUES ('" + sketch + "')";
      
        idb.insert(hatQuery);
        idb.insert(orderQuery);
        idb.insert(orderAndHatQuery);

            sendEmail();
            JOptionPane.showMessageDialog(null, "Ordern �r registrerad och mailbekr�ftelse har skickats!");

        }
        
       
        
    
        catch(Exception e) {
            JOptionPane.showMessageDialog(null, "System error");
            System.out.println("Fel" + e.getMessage());
           
        }
        }
    }//GEN-LAST:event_btnRegisterOrderActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        dispose();
    }//GEN-LAST:event_btnBackActionPerformed

    private void txtEstimatedTimeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEstimatedTimeKeyPressed
        
    }//GEN-LAST:event_txtEstimatedTimeKeyPressed

    private void txtEstimatedTimeFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtEstimatedTimeFocusGained
    if(txtEstimatedTime.getText().equals("Antal timmar per hatt"))
        {
            txtEstimatedTime.setText("");
            txtEstimatedTime.setForeground(new Color(0,0,0));
            
        }
    }//GEN-LAST:event_txtEstimatedTimeFocusGained

    private void txtEstimatedMaterialCostFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtEstimatedMaterialCostFocusGained
    if(txtEstimatedMaterialCost.getText().equals("Kostnad i kronor per hatt"))
        {
            txtEstimatedMaterialCost.setText("");
            txtEstimatedMaterialCost.setForeground(new Color(0,0,0));

        }
    }//GEN-LAST:event_txtEstimatedMaterialCostFocusGained

    private void txtHatSizeFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtHatSizeFocusGained
        if(txtHatSize.getText().equals("Hattstorlek i centimeter"))
        {
            txtHatSize.setText("");
            txtHatSize.setForeground(new Color(0,0,0));

        }
    }//GEN-LAST:event_txtHatSizeFocusGained

    private void txtEstimatedTimeFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtEstimatedTimeFocusLost
        if(txtEstimatedTime.getText().equals(""))
        {
            txtEstimatedTime.setText("Antal timmar per hatt");
            txtEstimatedTime.setForeground(new Color(153,153,153));
        }
    }//GEN-LAST:event_txtEstimatedTimeFocusLost

    private void txtEstimatedMaterialCostFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtEstimatedMaterialCostFocusLost
        if(txtEstimatedMaterialCost.getText().equals(""))
        {
            txtEstimatedMaterialCost.setText("Kostnad i kronor per hatt");
            txtEstimatedMaterialCost.setForeground(new Color(153,153,153));

        }
    }//GEN-LAST:event_txtEstimatedMaterialCostFocusLost

    private void txtHatSizeFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtHatSizeFocusLost
        if(txtHatSize.getText().equals(""))
        {
            txtHatSize.setText("Hattstorlek i centimeter");
            txtHatSize.setForeground(new Color(153,153,153));

        }
    }//GEN-LAST:event_txtHatSizeFocusLost

    private void btnRemoveImageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoveImageActionPerformed
        lblHatSketch.setIcon(null);
        pathImage = "Ingen skiss vald";
    }//GEN-LAST:event_btnRemoveImageActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnEstimatedCost;
    private javax.swing.JButton btnRegisterOrder;
    private javax.swing.JButton btnRemoveImage;
    private javax.swing.JButton btnSearchHatSketch;
    private javax.swing.JComboBox<String> cboAllCustomers;
    private javax.swing.JComboBox<String> cboHatAmount;
    private javax.swing.JComboBox<String> cboHatColor;
    private javax.swing.JComboBox<String> cboOptionalDiscount;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblAmount;
    private javax.swing.JLabel lblChooseCustomer;
    private javax.swing.JLabel lblCostPerHat;
    private javax.swing.JLabel lblCurrency;
    private javax.swing.JLabel lblCurrency1;
    private javax.swing.JLabel lblEstimatedCost;
    private javax.swing.JLabel lblEstimatedPriceError;
    private javax.swing.JLabel lblEstimatedTime;
    public javax.swing.JLabel lblEstimatedTotalPrice;
    private javax.swing.JLabel lblHatAmount;
    private javax.swing.JLabel lblHatColor;
    private javax.swing.JLabel lblHatDescription;
    private javax.swing.JLabel lblHatSize;
    private javax.swing.JLabel lblHatSketch;
    private javax.swing.JLabel lblResult;
    private javax.swing.JLabel lblRubrik;
    private javax.swing.JLabel lblShowHatAmount;
    private javax.swing.JLabel txtChooseDiscount;
    private javax.swing.JTextField txtEstimatedMaterialCost;
    private javax.swing.JTextField txtEstimatedTime;
    private javax.swing.JTextPane txtHatDescription;
    private javax.swing.JTextField txtHatSize;
    // End of variables declaration//GEN-END:variables

 
    
    private static class image {

        public image() {
        }
    }
}
