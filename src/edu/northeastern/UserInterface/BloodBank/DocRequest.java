/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package edu.northeastern.UserInterface.BloodBank;

import edu.northeastern.Business.BloodBank.BloodWork;
import edu.northeastern.Business.EcoSystem;
import edu.northeastern.Business.UserAcc.UserAcc;
import edu.northeastern.Business.WorkQueue.Req_Blood;
import edu.northeastern.Business.WorkQueue.Req_BloodDir;
import java.util.ArrayList;
import java.util.Map;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author altaf
 */
public class DocRequest extends javax.swing.JPanel {

    /**
     * Creates new form DocRequest
     */
    private UserAcc userAcc;
    private EcoSystem system;
    private JPanel container;

    public DocRequest(JPanel userProcessContainer, EcoSystem system, UserAcc userAcc) {
        initComponents();
        this.system = system;
        this.container = userProcessContainer;
        this.userAcc = userAcc;
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
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        processRequest = new javax.swing.JButton();
        cancelButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(250, 249, 251));
        setPreferredSize(new java.awt.Dimension(1160, 750));

        jPanel1.setBackground(new java.awt.Color(250, 249, 251));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Name", "Location", "Status", "Response"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 140, 853, -1));

        processRequest.setBackground(new java.awt.Color(10, 132, 255));
        processRequest.setFont(new java.awt.Font("SF Pro Text", 0, 14)); // NOI18N
        processRequest.setForeground(new java.awt.Color(255, 255, 255));
        processRequest.setText("Process Request");
        processRequest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                processRequestActionPerformed(evt);
            }
        });
        jPanel1.add(processRequest, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 590, 180, 50));

        cancelButton.setBackground(new java.awt.Color(255, 69, 58));
        cancelButton.setFont(new java.awt.Font("SF Pro Text", 0, 14)); // NOI18N
        cancelButton.setForeground(new java.awt.Color(255, 255, 255));
        cancelButton.setText("Cancel");
        cancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelButtonActionPerformed(evt);
            }
        });
        jPanel1.add(cancelButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 590, 180, 50));

        jLabel1.setFont(new java.awt.Font("SF Pro Display", 1, 24)); // NOI18N
        jLabel1.setText("Process Request");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(44, 31, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void processRequestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_processRequestActionPerformed
        // TODO add your handling code here:
        AcceptReq();
    }//GEN-LAST:event_processRequestActionPerformed

    private void cancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelButtonActionPerformed
        // TODO add your handling code here:
        rejectReq();
    }//GEN-LAST:event_cancelButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancelButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton processRequest;
    // End of variables declaration//GEN-END:variables

    private void displayTable() {
        // throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        Req_BloodDir reqBlood = system.getReqBloodDir();
        ArrayList<Req_Blood> listReq = reqBlood.getBloodReqDir();
        int s = listReq.size();

        for (int i = 0; i < s; i++) {
            Req_Blood bloodReq = listReq.get(i);
            BloodWork bw = (BloodWork) (userAcc);

            if (bloodReq.getBloodBankName().matches(bw.getUserNames())) {
                DefaultTableModel table = (DefaultTableModel) jTable1.getModel();
                String s1 = String.valueOf(bloodReq.getId());
                String s2[] = {s1, bloodReq.getFirstName(), bloodReq.getStatus(), bloodReq.getBloodType(), Integer.toString(bloodReq.getUnits())};
                table.addRow(s2);
            }
        }
    }

    private boolean Verify() {
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        DefaultTableModel table = (DefaultTableModel) jTable1.getModel();
        int selectedRow = jTable1.getSelectedRow();
        int sRow = Integer.parseInt(table.getValueAt(selectedRow, 0).toString());

        Req_BloodDir bloodReq = system.getReqBloodDir();
        ArrayList<Req_Blood> listBlood = bloodReq.getBloodReqDir();

        int l = listBlood.size();
        boolean r = false;
        BloodWork bw = (BloodWork) (userAcc);
        for (int i = 0; i < l; i++) {
            Req_Blood reqBlood = listBlood.get(i);
            if (sRow == reqBlood.getId()) {

                String type = reqBlood.getBloodType();
                int num = reqBlood.getUnits();

                Map<String, Integer> inventory = bw.getLabMap();
                for (Map.Entry<String, Integer> set : inventory.entrySet()) {

                    if (set.getKey().equals(type)) {
                        if (set.getValue() > num) {

                            r = true;
                            break;
                        }
                    }
                }
            }
        }
        return r;
    }

    public void app() {
        Req_BloodDir reqBlood = system.getReqBloodDir();
        ArrayList<Req_Blood> ol = reqBlood.getBloodReqDir();

        int l = ol.size();
        BloodWork bw = (BloodWork) (userAcc);
        for (int i = 0; i < l; i++) {
            Req_Blood bloodReq = ol.get(i);
            String type = bloodReq.getBloodType();
            int unit = bloodReq.getUnits();

            Map<String, Integer> inventory = bw.getLabMap();
            for (Map.Entry<String, Integer> set : inventory.entrySet()) {

                if (set.getKey().equals(type)) {
                    int newBlood = set.getValue();
                    int total = newBlood - unit;
                    set.setValue(total);

                }
            }
        }
    }

    private void AcceptReq() {
        // throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        DefaultTableModel table = (DefaultTableModel) jTable1.getModel();
        int selectedRow = jTable1.getSelectedRow();
        if (selectedRow >= 0) {
            int srow = Integer.parseInt(table.getValueAt(selectedRow, 0).toString());

            Req_BloodDir bloodreq = system.getReqBloodDir();
            ArrayList<Req_Blood> reqList = bloodreq.getBloodReqDir();

            int u = reqList.size();
            BloodWork bw = (BloodWork) (userAcc);
            for (int i = 0; i < u; i++) {
                Req_Blood req = reqList.get(i);
                if (srow == req.getId()) {
                    if (req.getStatus().matches("In Progress")) {
                        boolean r = Verify();
                        if (r == false) {
                            req.setStatus("Cancelled");
                            JOptionPane.showMessageDialog(null, "Inadequate Inventory");

                        } else {
                            app();
                            req.setStatus("Approved");
                            JOptionPane.showMessageDialog(null, "Request Approved!!");

                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "Wrong Move!!");

                    }

                }

            }
            jTable1.setModel(new DefaultTableModel(null, new String[]{"ID", "Name", "Status", "Blood Type", "Units requested"}));
            displayTable();
        } else {
            JOptionPane.showMessageDialog(null, "Select a Row!!");
        }
    }

    private void rejectReq() {
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        DefaultTableModel table = (DefaultTableModel) jTable1.getModel();
        int selectedRow = jTable1.getSelectedRow();
        if (selectedRow >= 0) {
            int sRow = Integer.parseInt(table.getValueAt(selectedRow, 0).toString());

            Req_BloodDir reqBlood = system.getReqBloodDir();
            ArrayList<Req_Blood> reqList = reqBlood.getBloodReqDir();

            int u = reqList.size();
            BloodWork bw = (BloodWork) (userAcc);
            for (int i = 0; i < u; i++) {
                Req_Blood req = reqList.get(i);
                if (sRow == req.getId()/*&&o.getStatus().matches("Deliver Man Assigned")*/) {
                    if (req.getStatus().matches("In Progress")) {
                        req.setStatus("Cancelled");
                    } else {
                        JOptionPane.showMessageDialog(null, "Wrong Move!!");
                    }
                }
            }
            jTable1.setModel(new DefaultTableModel(null, new String[]{"ID", "Name", "Status", "Blood Type", "Units requested"}));
            displayTable();
        } else {
            JOptionPane.showMessageDialog(null, "Select a Row!!");
        }

    }
}
