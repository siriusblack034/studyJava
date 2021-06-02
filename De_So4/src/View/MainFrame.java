/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Controller.IOFile;
import Model.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Admin88
 */
public class MainFrame extends javax.swing.JFrame {

    List<CongNhan> listCN;
    List<SanPham> listSP;
    List<BangTinhCong> listDs;
    DefaultTableModel modelCN1;
    DefaultTableModel modelCN2;
    DefaultTableModel modelCN3;
    DefaultTableModel modelSP1;
    DefaultTableModel modelSP2;
    DefaultTableModel modelDS;
    IOFile f;
    int idSp, idNv;

    /**
     * Creates new form MainFrame
     */
    public MainFrame() {
        initComponents();
        listCN = new ArrayList<>();
        listDs = new ArrayList<>();
        listSP = new ArrayList<>();
        modelCN1 = (DefaultTableModel) tbCN1.getModel();
        modelCN2 = (DefaultTableModel) tbCN2.getModel();
        modelCN3 = (DefaultTableModel) tbCN3.getModel();
        modelSP1 = (DefaultTableModel) tbSP1.getModel();
        modelSP2 = (DefaultTableModel) tbSP2.getModel();
        modelDS = (DefaultTableModel) tbDs.getModel();
        f = new IOFile();
        showDataNV();
        showDataSP();
        showDataDs();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbCN1 = new javax.swing.JTable();
        tTenCN = new javax.swing.JTextField();
        tDiaChi = new javax.swing.JTextField();
        cbCa = new javax.swing.JComboBox<>();
        label1 = new java.awt.Label();
        label2 = new java.awt.Label();
        label3 = new java.awt.Label();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbSP1 = new javax.swing.JTable();
        tTenSp = new javax.swing.JTextField();
        tDonGia = new javax.swing.JTextField();
        label4 = new java.awt.Label();
        label6 = new java.awt.Label();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tbCN2 = new javax.swing.JTable();
        jScrollPane4 = new javax.swing.JScrollPane();
        tbSP2 = new javax.swing.JTable();
        tSl = new javax.swing.JTextField();
        label5 = new java.awt.Label();
        jButton5 = new javax.swing.JButton();
        jScrollPane5 = new javax.swing.JScrollPane();
        tbDs = new javax.swing.JTable();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane6 = new javax.swing.JScrollPane();
        tbCN3 = new javax.swing.JTable();
        jButton9 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tbCN1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Ma CN", "Ho Ten", "Dia Chi", "Ca"
            }
        ));
        jScrollPane1.setViewportView(tbCN1);
        if (tbCN1.getColumnModel().getColumnCount() > 0) {
            tbCN1.getColumnModel().getColumn(2).setHeaderValue("Dia Chi");
            tbCN1.getColumnModel().getColumn(3).setHeaderValue("Ca");
        }

        cbCa.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Sang", "Chieu", "Dem" }));

        label1.setText("Ten");

        label2.setText("Ca San Xuat");

        label3.setText("Dia Chi");

        jButton1.setText("Them");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Xoa");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 621, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(90, 90, 90)
                        .addComponent(label2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(66, 66, 66))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(label3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(56, 56, 56)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(tDiaChi, javax.swing.GroupLayout.DEFAULT_SIZE, 205, Short.MAX_VALUE)
                    .addComponent(tTenCN)
                    .addComponent(cbCa, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addGap(49, 49, 49))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(59, 59, 59)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(tTenCN, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton1))
                    .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(tDiaChi, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton2))
                    .addComponent(label3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(54, 54, 54)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cbCa, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(116, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Cong Nhan", jPanel1);

        jButton3.setText("Them");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("Xoa");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        tbSP1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Ma Sp", "ten SP", "Don Gia"
            }
        ));
        jScrollPane2.setViewportView(tbSP1);
        if (tbSP1.getColumnModel().getColumnCount() > 0) {
            tbSP1.getColumnModel().getColumn(2).setResizable(false);
        }

        label4.setText("Ten");

        label6.setText("Don Giai");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 621, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(104, 104, 104)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(label4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(56, 56, 56)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(tDonGia, javax.swing.GroupLayout.DEFAULT_SIZE, 205, Short.MAX_VALUE)
                    .addComponent(tTenSp))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton3)
                    .addComponent(jButton4))
                .addGap(49, 49, 49))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(59, 59, 59)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(tTenSp, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton3))
                    .addComponent(label4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(tDonGia, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton4))
                    .addComponent(label6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(200, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("San Pham", jPanel2);

        tbCN2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Ma CN", "Ho Ten", "Ca"
            }
        ));
        jScrollPane3.setViewportView(tbCN2);
        if (tbCN2.getColumnModel().getColumnCount() > 0) {
            tbCN2.getColumnModel().getColumn(2).setHeaderValue("Ca");
        }

        tbSP2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Ma Sp", "ten SP", "Don Gia"
            }
        ));
        jScrollPane4.setViewportView(tbSP2);
        if (tbSP2.getColumnModel().getColumnCount() > 0) {
            tbSP2.getColumnModel().getColumn(2).setResizable(false);
        }

        label5.setText("So Luong");

        jButton5.setText("Them");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        tbDs.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Ten Cn", "Ten SP", "SL"
            }
        ));
        jScrollPane5.setViewportView(tbDs);
        if (tbDs.getColumnModel().getColumnCount() > 0) {
            tbDs.getColumnModel().getColumn(2).setHeaderValue("Ca");
        }

        jButton6.setText("Xoa");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton7.setText("SX Ho Ten Cong Nhan");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton8.setText("SX SL san Pham");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(130, 130, 130)
                        .addComponent(label5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(44, 44, 44)
                        .addComponent(tSl, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(243, 243, 243)
                        .addComponent(jButton5))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 519, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton6))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(93, 93, 93)
                        .addComponent(jButton7)
                        .addGap(115, 115, 115)
                        .addComponent(jButton8)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tSl, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jButton5)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton7)
                            .addComponent(jButton8))
                        .addContainerGap(33, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton6)
                        .addGap(127, 127, 127))))
        );

        jTabbedPane1.addTab("Bang Tinh Cong", jPanel3);

        tbCN3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Ma CN", "Ho Ten"
            }
        ));
        jScrollPane6.setViewportView(tbCN3);

        jButton9.setText("Thong Ke");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane6, javax.swing.GroupLayout.DEFAULT_SIZE, 621, Short.MAX_VALUE)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(212, 212, 212)
                .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(56, 56, 56)
                .addComponent(jButton9)
                .addGap(0, 293, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Thong Ke", jPanel4);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        int index = tbCN1.getSelectedRow();
        if (index == -1) {
            JOptionPane.showMessageDialog(rootPane, "Chon data de xoa");
            return;
        }
        listCN.remove(index);
        showData(modelCN1, listCN);
        showData(modelCN2, listCN);
        f.writeFile(listCN, "CN.txt");
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        int index = tbSP1.getSelectedRow();
        if (index == -1) {
            JOptionPane.showMessageDialog(rootPane, "Chon data de xoa");
            return;
        }
        listSP.remove(index);
        showData(modelSP1, listSP);
        showData(modelSP2, listSP);
        f.writeFile(listSP, "SP.txt");
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        int index = tbDs.getSelectedRow();
        if (index == -1) {
            JOptionPane.showMessageDialog(rootPane, "Chon data de xoa");
            return;
        }
        listDs.remove(index);
        showData(modelDS, listDs);

        f.writeFile(listDs, "DS.txt");
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String ten = tTenCN.getText().trim();
        String diaChi = tDiaChi.getText().trim();
        String ca = cbCa.getSelectedItem().toString();
        if (ten.length() != 0 && diaChi.length() != 0) {
            listCN.add(new CongNhan(idNv, ten, diaChi, ca));
            showData(modelCN1, listCN);
            showData(modelCN2, listCN);
            showData(modelCN3, listCN);
            f.writeFile(listCN, "CN.txt");
            idNv++;
        } else {
            JOptionPane.showMessageDialog(rootPane, "Khong duoc bo trong thong tin!");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        String ten = tTenSp.getText().trim();
        try {
            double gia = Double.parseDouble(tDonGia.getText().trim());
            if (gia >= 0) {
                if (ten.length() != 0) {
                    listSP.add(new SanPham(idSp, ten, gia));
                    showData(modelSP1, listSP);
                    showData(modelSP2, listSP);
                    f.writeFile(listSP, "SP.txt");
                    idSp++;
                } else {
                    JOptionPane.showMessageDialog(rootPane, "Khong duoc de trong ten");
                }
            } else {
                JOptionPane.showMessageDialog(rootPane, "Gia khong am");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, "Khong duoc de trong gia va gia la so ");
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        int index1 = tbCN2.getSelectedRow();
        int index2 = tbSP2.getSelectedRow();
        if (index1 == -1 || index2 == -1) {
            JOptionPane.showMessageDialog(rootPane, "Chon Data o 2 bang tren");
            return;
        }
        SanPham sp = listSP.get(index2);
        CongNhan nv = listCN.get(index1);
        try {
            int sl = Integer.parseInt(tSl.getText().trim());
            if (sl < 0) {
                JOptionPane.showMessageDialog(rootPane, "SL khong am");
                throw new Exception();
            }
            
            List<BangTinhCong> list1 = listDs.stream().filter(ds -> ds.getCongNhan().getMa() == nv.getMa()).collect(Collectors.toList());
            System.out.println(list1.size());
            if (list1.size() <= 5) {
                int check = 1;
                for (BangTinhCong ds : list1) {
                    if (sp.getMa() == ds.getSp().getMa()) {
                        sl += ds.getSoLuong();
                        ds.setSoLuong(sl);
                        check =0;
                    }
                }
                if(check ==1 && list1.size() <5){
                    listDs.add(new BangTinhCong(nv, sp, sl));
                }
                if(list1.size() ==5){
                    JOptionPane.showMessageDialog(rootPane, "Moi cong nhan toi da 5 loai khac nhau");
                }
            } else {
                JOptionPane.showMessageDialog(rootPane, "Moi cong nhan toi da 5 loai khac nhau");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, "Nhap So Luong");
        }
        showData(modelDS, listDs);
        f.writeFile(listDs, "DS.txt");

    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        Collections.sort(listDs, new Comparator<BangTinhCong>() {
            @Override
            public int compare(BangTinhCong o1, BangTinhCong o2) {
                return o1.getCongNhan().getTen().compareToIgnoreCase(o2.getCongNhan().getTen());
            }
        }); 
            
        showData(modelDS, listDs);
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        Collections.sort(listDs, new Comparator<BangTinhCong>() {
            @Override
            public int compare(BangTinhCong o1, BangTinhCong o2) {
                return o1.getSoLuong() <= o2.getSoLuong() ?1 :-1;
            }
        });
        showData(modelDS, listDs);
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        int index = tbCN3.getSelectedRow();
        if(index ==-1){
            JOptionPane.showMessageDialog(rootPane, "Chon Data bang tren");
            return;
        }
        BangTinhCong cn = listDs.get(index);
        List<BangTinhCong> list1 = listDs.stream().filter(ds -> ds.getCongNhan().getMa() == cn.getCongNhan().getMa()).collect(Collectors.toList());
        ThongKe thongKe = new ThongKe(list1);
        thongKe.setVisible(true);
        thongKe.setLocationRelativeTo(null);
    }//GEN-LAST:event_jButton9ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
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
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cbCa;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JTabbedPane jTabbedPane1;
    private java.awt.Label label1;
    private java.awt.Label label2;
    private java.awt.Label label3;
    private java.awt.Label label4;
    private java.awt.Label label5;
    private java.awt.Label label6;
    private javax.swing.JTextField tDiaChi;
    private javax.swing.JTextField tDonGia;
    private javax.swing.JTextField tSl;
    private javax.swing.JTextField tTenCN;
    private javax.swing.JTextField tTenSp;
    private javax.swing.JTable tbCN1;
    private javax.swing.JTable tbCN2;
    private javax.swing.JTable tbCN3;
    private javax.swing.JTable tbDs;
    private javax.swing.JTable tbSP1;
    private javax.swing.JTable tbSP2;
    // End of variables declaration//GEN-END:variables

    private void showDataNV() {
        listCN = f.readFile("CN.txt");
        if (listCN.size() > 0) {
            idNv = listCN.get(listCN.size() - 1).getMa() + 1;
        } else {
            idNv = 10000;
        }
        showData(modelCN1, listCN);
        showData(modelCN2, listCN);
        showData(modelCN3, listCN);
    }

    private void showDataSP() {
        listSP = f.readFile("SP.txt");
        if (listSP.size() > 0) {
            idSp = listSP.get(listSP.size() - 1).getMa() + 1;
        } else {
            idSp = 10000;
        }
        showData(modelSP1, listSP);
        showData(modelSP2, listSP);
    }

    private void showDataDs() {
        listDs = f.readFile("DS.txt");
        showData(modelDS, listDs);
    }

    private void showData(DefaultTableModel model, List list) {
        model.setRowCount(0);
        for (Object t : list) {
            if (t instanceof CongNhan) {
                model.addRow(new Object[]{
                    ((CongNhan) t).getMa(), ((CongNhan) t).getTen(), ((CongNhan) t).getDiaChi(), ((CongNhan) t).getCaSx()
                });
            }
            if (t instanceof SanPham) {
                model.addRow(new Object[]{
                    ((SanPham) t).getMa(), ((SanPham) t).getTen(), ((SanPham) t).getGia()});
            }
            if (t instanceof BangTinhCong) {
                model.addRow(new Object[]{
                    ((BangTinhCong) t).getCongNhan().getTen(), ((BangTinhCong) t).getSp().getTen(), ((BangTinhCong) t).getSoLuong()
                });
            }
        }
    }

}