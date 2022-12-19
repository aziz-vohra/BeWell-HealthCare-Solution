/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package edu.northeastern.UserInterface.Pharmacy;

import edu.northeastern.Business.EcoSystem;
import edu.northeastern.Business.Pharma.Pharma;
import edu.northeastern.Business.UserAcc.UserAcc;
import java.util.Map;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author altaf
 */
public class PharmaManageMedicine extends javax.swing.JPanel {

    /**
     * Creates new form PharmaManageMedicine
     */
    private UserAcc userAcc;
    private EcoSystem system;
    private JPanel container;
    Map<String, String> medicines;

    public PharmaManageMedicine(EcoSystem system, JPanel userProcessContainer, UserAcc userAcc) {
        initComponents();
        this.system = system;
        this.container = userProcessContainer;
        this.userAcc = userAcc;
        Pharma p = (Pharma) userAcc;
        medicines = p.getMedicines();

        displayTable();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblMed = new javax.swing.JTable();
        medName = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        medCost = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        delMed = new javax.swing.JButton();
        addMed = new javax.swing.JButton();

        setBackground(new java.awt.Color(250, 249, 251));
        setPreferredSize(new java.awt.Dimension(1160, 750));

        jPanel1.setBackground(new java.awt.Color(250, 249, 251));
        jPanel1.setPreferredSize(new java.awt.Dimension(1160, 750));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tblMed.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Medicine Name", "Price ($)"
            }
        ));
        jScrollPane1.setViewportView(tblMed);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 820, 450));

        medName.setBackground(new java.awt.Color(248, 248, 249));
        jPanel2.add(medName, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 520, 220, 48));

        jLabel5.setFont(new java.awt.Font("SF Pro Text", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(73, 84, 90));
        jLabel5.setText("Name");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 480, 200, -1));

        medCost.setBackground(new java.awt.Color(248, 248, 249));
        medCost.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                medCostKeyPressed(evt);
            }
        });
        jPanel2.add(medCost, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 520, 220, 48));

        jLabel6.setFont(new java.awt.Font("SF Pro Text", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(73, 84, 90));
        jLabel6.setText("Cost ($)");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 480, 240, -1));

        delMed.setBackground(new java.awt.Color(255, 55, 95));
        delMed.setFont(new java.awt.Font("SF Pro Text", 1, 14)); // NOI18N
        delMed.setForeground(new java.awt.Color(255, 255, 255));
        delMed.setText("Delete");
        delMed.setBorder(null);
        delMed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delMedActionPerformed(evt);
            }
        });
        jPanel2.add(delMed, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 520, 140, 50));

        addMed.setBackground(new java.awt.Color(10, 132, 255));
        addMed.setFont(new java.awt.Font("SF Pro Text", 0, 14)); // NOI18N
        addMed.setForeground(new java.awt.Color(255, 255, 255));
        addMed.setText("Add");
        addMed.setBorder(null);
        addMed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addMedActionPerformed(evt);
            }
        });
        jPanel2.add(addMed, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 520, 140, 50));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 100, 820, 580));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 779, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void delMedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delMedActionPerformed
        // TODO add your handling code here:
     deleteMed();
    }//GEN-LAST:event_delMedActionPerformed

    private void addMedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addMedActionPerformed
        // TODO add your handling code here:
      addNewMed();

    }//GEN-LAST:event_addMedActionPerformed

    private void medCostKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_medCostKeyPressed
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if (Character.isLetter(c)) {
            medCost.setEditable(false);
            JOptionPane.showMessageDialog(null, "enter number");
        } else {
            medCost.setEditable(true);
        }
    }//GEN-LAST:event_medCostKeyPressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addMed;
    private javax.swing.JButton delMed;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField medCost;
    private javax.swing.JTextField medName;
    private javax.swing.JTable tblMed;
    // End of variables declaration//GEN-END:variables

    private void displayTable() {
        // throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody

        DefaultTableModel table = (DefaultTableModel) tblMed.getModel();

        table.setRowCount(0);
        for (String key : medicines.keySet()) {
            Object[] row = new Object[5];
            row[0] = key;
            row[1] = medicines.get(key);

            table.addRow(row);

        }

    }

    private void deleteMed() {
       // throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
      DefaultTableModel table = (DefaultTableModel) tblMed.getModel();
        int selectedRow = tblMed.getSelectedRow();
        if (selectedRow >= 0) {
            String key = table.getValueAt(selectedRow, 0).toString();
            medicines.remove(key);
            displayTable();
            JOptionPane.showMessageDialog(null, "Deleted Medicine Successfully!");
            
        } else {
            JOptionPane.showMessageDialog(null, "Select a row!!");
        }
    
    
    
    }

    private void addNewMed() {
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
      if (medName.getText().isEmpty() || medCost.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "All fields are mandatory!!");

        } else {
            String med = medName.getText();
            String cost = medCost.getText();
            medicines.put(med, cost);
            displayTable();
            JOptionPane.showMessageDialog(null, "Added Medicine Successfully!");
        }

    
    }
}