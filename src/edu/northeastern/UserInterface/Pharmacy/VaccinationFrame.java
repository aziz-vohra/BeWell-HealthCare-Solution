/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package edu.northeastern.UserInterface.Pharmacy;

import edu.northeastern.Business.EcoSystem;
import edu.northeastern.Business.Pharma.Pharma;
import edu.northeastern.Business.UserAcc.UserAcc;
import edu.northeastern.Business.WorkQueue.VacRequest_Dir;
import edu.northeastern.Business.WorkQueue.VacRequest;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author altaf
 */
public class VaccinationFrame extends javax.swing.JPanel {

    /**
     * Creates new form VaccinationFrame
     */
    private UserAcc userAcc;
    private EcoSystem system;
    private JPanel container;

    public VaccinationFrame(EcoSystem system, JPanel userProcessContainer, UserAcc userAcc) {
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

        jScrollPane3 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        buttonComplete = new javax.swing.JButton();

        setBackground(new java.awt.Color(250, 249, 251));
        setPreferredSize(new java.awt.Dimension(1160, 750));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Name", "Status", "Vaccination", "Date", "Time"
            }
        ));
        jScrollPane3.setViewportView(jTable2);

        add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, 1090, 520));

        buttonComplete.setBackground(new java.awt.Color(255, 153, 153));
        buttonComplete.setFont(new java.awt.Font("SF Pro", 1, 14)); // NOI18N
        buttonComplete.setForeground(new java.awt.Color(255, 255, 255));
        buttonComplete.setText("Mark as complete");
        buttonComplete.setBorder(null);
        buttonComplete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCompleteActionPerformed(evt);
            }
        });
        add(buttonComplete, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 620, 230, 60));
    }// </editor-fold>//GEN-END:initComponents

    private void buttonCompleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCompleteActionPerformed
        // TODO add your handling code here:
        markCompleteVac();

    }//GEN-LAST:event_buttonCompleteActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonComplete;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable2;
    // End of variables declaration//GEN-END:variables

    private void displayTable() {
        // throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        VacRequest_Dir vacReq = system.getVaccReqDir();
        ArrayList<VacRequest> vacReqList = vacReq.getRequests();
        int l = vacReqList.size();

        for (int i = 0; i < l; i++) {

            VacRequest vaccineReq = vacReqList.get(i);

            Pharma pharmacy = (Pharma) (userAcc);

            if ((vaccineReq.getPharmacy().matches(pharmacy.getPharmaName()) && (vaccineReq.getStatus().matches("Approved") == true || vaccineReq.getStatus().matches("Done"))) == true) {
                DefaultTableModel table = (DefaultTableModel) jTable2.getModel();
                String r1 = String.valueOf(vaccineReq.getVacId());

                String r2[] = {r1, vaccineReq.getFirst_name(), vaccineReq.getStatus(), vaccineReq.getVaccination(), vaccineReq.getDate(), vaccineReq.getTime()};
                table.addRow(r2);
            }

        }

    }

    private void markCompleteVac() {
        // throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody

        DefaultTableModel table = (DefaultTableModel) jTable2.getModel();
        int selectedRow = jTable2.getSelectedRow();
        if (selectedRow >= 0) {
            int sRow = Integer.parseInt(table.getValueAt(selectedRow, 0).toString());

            VacRequest_Dir vacReqDir = system.getVaccReqDir();
            ArrayList<VacRequest> vacReq = vacReqDir.getRequests();
            int l = vacReq.size();
            for (int i = 0; i < l; i++) {
                VacRequest vaccinereq = vacReq.get(i);
                if (sRow == vaccinereq.getVacId()) {

                    vaccinereq.setStatus("Done");

                }
            }
            jTable2.setModel(new DefaultTableModel(null, new String[]{"ID", "Name", "Status", "Vaccination", "Date", "Time"}));
            displayTable();

        } else {
            JOptionPane.showMessageDialog(null, "Select a Row");
        }
    }
}
