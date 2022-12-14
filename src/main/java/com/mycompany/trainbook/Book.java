/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package com.mycompany.trainbook;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Java
 */
public class Book extends javax.swing.JInternalFrame {

    /**
     * Creates new form addcustomer
     */
    public Book() throws SQLException {
        initComponents();
        autoId();
    }
Connection con;
    PreparedStatement pt;
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel6 = new javax.swing.JLabel();
        jDayChooser1 = new com.toedter.calendar.JDayChooser();
        jRadioButton2 = new javax.swing.JRadioButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        textField1 = new java.awt.TextField();
        kGradientPanel1 = new com.k33ptoo.components.KGradientPanel();
        jLabel3 = new javax.swing.JLabel();
        ticketid = new javax.swing.JLabel();
        txtsource = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txtdestination = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        txtcustid = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        txtfirstname = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtlastname = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        traintable = new javax.swing.JTable();
        kGradientPanel2 = new com.k33ptoo.components.KGradientPanel();
        jLabel12 = new javax.swing.JLabel();
        trainno = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        trainname = new javax.swing.JLabel();
        txtdoj = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        departure = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        arrival = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        txtclas = new javax.swing.JComboBox<>();
        jLabel20 = new javax.swing.JLabel();
        seats = new javax.swing.JSpinner();
        jLabel9 = new javax.swing.JLabel();
        txtprice = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        txttotal = new javax.swing.JLabel();
        kButton1 = new com.k33ptoo.components.KButton();
        kButton2 = new com.k33ptoo.components.KButton();
        jLabel11 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();

        jLabel6.setText("jLabel6");

        jRadioButton2.setText("jRadioButton2");

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        textField1.setText("textField1");

        kGradientPanel1.setkEndColor(new java.awt.Color(0, 204, 255));
        kGradientPanel1.setkStartColor(new java.awt.Color(51, 0, 51));
        kGradientPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("PNR No.");
        kGradientPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        ticketid.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        ticketid.setForeground(new java.awt.Color(255, 255, 255));
        ticketid.setText("001");
        kGradientPanel1.add(ticketid, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 20, -1, -1));

        txtsource.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Mumbai", "Delhi", "Banglore", "Pune", "Delhi", "Surat", "Ahmedabad", "Burhanpur", "Bhopal", "Jaipur", "Kolkata", "Chennai" }));
        kGradientPanel1.add(txtsource, new org.netbeans.lib.awtextra.AbsoluteConstraints(17, 85, -1, -1));

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("From");
        kGradientPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(17, 57, -1, -1));

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("To");
        kGradientPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(147, 57, -1, -1));

        txtdestination.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Mumbai", "Delhi", "Banglore", "Pune", "Delhi", "Surat", "Ahmedabad", "Burhanpur", "Bhopal", "Jaipur", "Kolkata", "Chennai" }));
        txtdestination.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtdestinationActionPerformed(evt);
            }
        });
        kGradientPanel1.add(txtdestination, new org.netbeans.lib.awtextra.AbsoluteConstraints(147, 85, 102, -1));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Customer Detail");
        kGradientPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 30, -1, -1));

        jButton1.setBackground(new java.awt.Color(153, 255, 51));
        jButton1.setText("Search Train");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        kGradientPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 150, 127, -1));

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Customer Id");
        kGradientPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 70, -1, -1));
        kGradientPanel1.add(txtcustid, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 90, 73, -1));

        jButton4.setBackground(new java.awt.Color(153, 255, 102));
        jButton4.setText("Search");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        kGradientPanel1.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 90, -1, -1));

        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("First Name");
        kGradientPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 130, -1, -1));

        txtfirstname.setForeground(new java.awt.Color(255, 255, 255));
        txtfirstname.setText("---");
        kGradientPanel1.add(txtfirstname, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 130, -1, -1));

        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Last Name");
        kGradientPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 160, -1, -1));

        txtlastname.setForeground(new java.awt.Color(255, 255, 255));
        txtlastname.setText("---");
        kGradientPanel1.add(txtlastname, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 160, -1, -1));

        traintable.setBackground(new java.awt.Color(0, 51, 102));
        traintable.setForeground(new java.awt.Color(255, 255, 255));
        traintable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "trainno", "trainname", "source", "destination", "departure", "arrival", "date", "price"
            }
        ));
        traintable.setSelectionBackground(new java.awt.Color(0, 102, 51));
        traintable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                traintableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(traintable);

        kGradientPanel2.setkEndColor(new java.awt.Color(0, 204, 255));
        kGradientPanel2.setkStartColor(new java.awt.Color(0, 0, 51));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Train no.");

        trainno.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        trainno.setForeground(new java.awt.Color(255, 255, 255));
        trainno.setText("----");

        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Train name");

        trainname.setForeground(new java.awt.Color(255, 255, 255));
        trainname.setText("----");

        txtdoj.setForeground(new java.awt.Color(255, 255, 255));
        txtdoj.setText("----");

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Date of Journey");

        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Departure");

        departure.setForeground(new java.awt.Color(255, 255, 255));
        departure.setText("----");

        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Arriavl");

        arrival.setForeground(new java.awt.Color(255, 255, 255));
        arrival.setText("----");

        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setText("Class");

        txtclas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "3AC", "2AC", "SL", "CC", "2S" }));

        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText("Seat");

        seats.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                seatsStateChanged(evt);
            }
        });

        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Price per seat");

        txtprice.setForeground(new java.awt.Color(255, 255, 255));
        txtprice.setText("----");

        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setText("Ticket Price");

        txttotal.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        txttotal.setForeground(new java.awt.Color(255, 255, 255));
        txttotal.setText("---");

        kButton1.setText("BOOK");
        kButton1.setToolTipText("");
        kButton1.setkStartColor(new java.awt.Color(0, 204, 51));
        kButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kButton1ActionPerformed(evt);
            }
        });

        kButton2.setText("Cancel");
        kButton2.setkStartColor(new java.awt.Color(255, 0, 51));
        kButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kButton2ActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Gill Sans MT", 1, 20)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Train");

        jLabel17.setFont(new java.awt.Font("Gill Sans MT", 0, 18)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("Ticket Booking");

        javax.swing.GroupLayout kGradientPanel2Layout = new javax.swing.GroupLayout(kGradientPanel2);
        kGradientPanel2.setLayout(kGradientPanel2Layout);
        kGradientPanel2Layout.setHorizontalGroup(
            kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel2Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(kGradientPanel2Layout.createSequentialGroup()
                        .addGroup(kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel14)
                            .addComponent(jLabel16))
                        .addGap(85, 85, 85))
                    .addGroup(kGradientPanel2Layout.createSequentialGroup()
                        .addGroup(kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(kGradientPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(45, 45, 45))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel2Layout.createSequentialGroup()
                                .addGroup(kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel13)
                                    .addComponent(jLabel12))
                                .addGap(66, 66, 66)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtdoj)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(trainno)
                                    .addComponent(trainname)))
                            .addComponent(arrival)
                            .addComponent(departure))
                        .addGap(58, 58, 58)))
                .addGroup(kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addComponent(jLabel21)
                    .addComponent(jLabel20)
                    .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(kButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 51, Short.MAX_VALUE)
                .addGroup(kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(txtclas, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(seats, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtprice)
                    .addComponent(txttotal, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(kButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17))
        );
        kGradientPanel2Layout.setVerticalGroup(
            kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel2Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(kGradientPanel2Layout.createSequentialGroup()
                        .addGroup(kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(kGradientPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel21)
                                .addGap(14, 14, 14)
                                .addComponent(jLabel20))
                            .addGroup(kGradientPanel2Layout.createSequentialGroup()
                                .addComponent(txtclas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(7, 7, 7)
                                .addComponent(seats, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(9, 9, 9)
                        .addGroup(kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addComponent(txtprice))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel22)
                            .addComponent(txttotal)))
                    .addGroup(kGradientPanel2Layout.createSequentialGroup()
                        .addGroup(kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(kGradientPanel2Layout.createSequentialGroup()
                                .addComponent(trainno)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(trainname)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtdoj)
                                .addGap(6, 6, 6)
                                .addComponent(departure)
                                .addGap(6, 6, 6)
                                .addComponent(arrival))
                            .addGroup(kGradientPanel2Layout.createSequentialGroup()
                                .addGroup(kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel12)
                                    .addGroup(kGradientPanel2Layout.createSequentialGroup()
                                        .addGap(28, 28, 28)
                                        .addComponent(jLabel13)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel4)))
                                .addGap(6, 6, 6)
                                .addComponent(jLabel14)
                                .addGap(6, 6, 6)
                                .addComponent(jLabel16)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGroup(kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(kGradientPanel2Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(kButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(kButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(59, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel2Layout.createSequentialGroup()
                        .addGroup(kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(kGradientPanel2Layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(kGradientPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 518, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 518, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(kGradientPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(kGradientPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(kGradientPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

     public void autoId() throws SQLException{
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/train","root","");
            
            Statement s =   con.createStatement();
            ResultSet rs;
            rs = s.executeQuery("select MAX(id) from ticket");
            rs.next();
            rs.getString("MAX(id)");
            
            if(rs.getString("MAX(id)")==null){
                ticketid.setText("001");
            }
            else{
                long id = Long.parseLong(rs.getString("MAX(id)"));
                    id++;
                    ticketid.setText(String.format("%03d",id));
                
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(addcustomer.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    private void txtdestinationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtdestinationActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtdestinationActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        String source = txtsource.getSelectedItem().toString();
        String destination = txtdestination.getSelectedItem().toString();

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/train","root","");
            pt =con.prepareStatement("select * from traininfo where source =? and destination =?" );

            pt.setString(1,source);
            pt.setString(2,destination);

            ResultSet rs = pt.executeQuery();

            ResultSetMetaData rm = rs.getMetaData();
            int c ;
            c = rm.getColumnCount();

            DefaultTableModel tab = (DefaultTableModel) traintable.getModel();
            tab.setRowCount(0);
            while(rs.next()){
                Vector vect;
                vect = new Vector();
                for(int i =1; i<=c ; i++){
                    vect.add(rs.getString("trainno"));
                    vect.add(rs.getString("trainname"));
                    vect.add(rs.getString("source"));
                    vect.add(rs.getString("destination"));
                    vect.add(rs.getString("departure"));
                    vect.add(rs.getString("arrival"));
                    vect.add(rs.getString("date"));
                    vect.add(rs.getString("price"));

                }
                tab.addRow(vect);
            }

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Book.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Book.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:

        String id = txtcustid.getText();

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/train","root","");

            pt= con.prepareStatement("select * from addcustomer where id=?");
            pt.setString(1,id);

            ResultSet rs = pt.executeQuery();

            if(rs.next()== false){
                JOptionPane.showMessageDialog(this,"record not present");
            }
            else{
                String firstname = rs.getString("firstname");
                String lastname = rs.getString("lastname");

                

                txtfirstname.setText(firstname);
                txtlastname.setText(lastname);

                

            }

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(addcustomer.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(addcustomer.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void traintableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_traintableMouseClicked
        // TODO add your handling code here:
        DefaultTableModel tab = (DefaultTableModel) traintable.getModel();
        int selected= traintable.getSelectedRow();
        trainno.setText( tab.getValueAt(selected, 0).toString());
        trainname.setText( tab.getValueAt(selected, 1).toString());
        departure.setText( tab.getValueAt(selected, 4).toString());
        arrival.setText( tab.getValueAt(selected, 5).toString());
        txtprice.setText( tab.getValueAt(selected, 7).toString());
        txtdoj.setText( tab.getValueAt(selected, 6).toString());

    }//GEN-LAST:event_traintableMouseClicked

    private void seatsStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_seatsStateChanged
        // TODO add your handling code here:
        int price = Integer.parseInt(txtprice.getText());
        int no = Integer.parseInt(seats.getValue().toString());
        int total = price*no;
        txttotal.setText(String.valueOf(total));
    }//GEN-LAST:event_seatsStateChanged

    private void kButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kButton1ActionPerformed
        // TODO add your handling code here:
        // TODO add your handling code here:
        String id = ticketid.getText();
        String trainn = trainno.getText();
        String customerid = txtcustid.getText();
        String clas = txtclas.getSelectedItem().toString();
        String seat = seats.getValue().toString();
        String price = txttotal.getText();
        String date = txtdoj.getText();

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/train","root","");
            pt =con.prepareStatement("insert into ticket (id,trainno,custid,class,seat,price,date) value(?,?,?,?,?,?,?)");

            pt.setString(1,id);
            pt.setString(2,trainn);
            pt.setString(3,customerid);
            pt.setString(4,clas);
            pt.setString(5,seat);
            pt.setString(6,price);
            pt.setString(7,date);

            pt.executeUpdate();

            JOptionPane.showMessageDialog(null, "Ticket Booked successfully !!! ");

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(addcustomer.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(addcustomer.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_kButton1ActionPerformed

    private void kButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kButton2ActionPerformed
        // TODO add your handling code here:
        this.hide();
    }//GEN-LAST:event_kButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel arrival;
    private javax.swing.JLabel departure;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton4;
    private com.toedter.calendar.JDayChooser jDayChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JScrollPane jScrollPane1;
    private com.k33ptoo.components.KButton kButton1;
    private com.k33ptoo.components.KButton kButton2;
    private com.k33ptoo.components.KGradientPanel kGradientPanel1;
    private com.k33ptoo.components.KGradientPanel kGradientPanel2;
    private javax.swing.JSpinner seats;
    private java.awt.TextField textField1;
    private javax.swing.JLabel ticketid;
    private javax.swing.JLabel trainname;
    private javax.swing.JLabel trainno;
    private javax.swing.JTable traintable;
    private javax.swing.JComboBox<String> txtclas;
    private javax.swing.JTextField txtcustid;
    private javax.swing.JComboBox<String> txtdestination;
    private javax.swing.JLabel txtdoj;
    private javax.swing.JLabel txtfirstname;
    private javax.swing.JLabel txtlastname;
    private javax.swing.JLabel txtprice;
    private javax.swing.JComboBox<String> txtsource;
    private javax.swing.JLabel txttotal;
    // End of variables declaration//GEN-END:variables
}
