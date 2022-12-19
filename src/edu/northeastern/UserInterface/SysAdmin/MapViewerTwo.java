/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package edu.northeastern.UserInterface.SysAdmin;

import edu.northeastern.Utility.MapCoordinates;
import com.teamdev.jxbrowser.browser.Browser;
import com.teamdev.jxbrowser.engine.Engine;
import com.teamdev.jxbrowser.engine.EngineOptions;
import static com.teamdev.jxbrowser.engine.RenderingMode.HARDWARE_ACCELERATED;
import com.teamdev.jxbrowser.view.swing.BrowserView;
import java.awt.CardLayout;
import java.awt.Color;
import javax.swing.JPanel;

/**
 *
 * @author altaf
 */
public class MapViewerTwo extends javax.swing.JPanel {

    /**
     * Creates new form MapViewerTwo
     */
    JPanel userProcessContainer;
    Browser browser;
    String lattitude;
    String longitude;

    public MapViewerTwo(JPanel userProcessContainer, String lattitude, String longitude) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.lattitude = lattitude;
        this.longitude = longitude;
        EngineOptions options
                = EngineOptions.newBuilder(HARDWARE_ACCELERATED).licenseKey("6P830J66YBX4K4T23MK7PO6PO66ADMBK1VPQ7A2G6T59FH2WI0L5NPEGHUZ96ZYCMGAX").build();
        Engine engine = Engine.newInstance(options);
        browser = engine.newBrowser();
        BrowserView view = BrowserView.newInstance(browser);
        browser.navigation().loadUrl("https://maps.google.com/?q=" + lattitude + "," + longitude);
        mapCanvas.add(view, "a");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSplitPane1 = new javax.swing.JSplitPane();
        jPanel1 = new javax.swing.JPanel();
        setLocationBtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        mapCanvas = new javax.swing.JPanel();

        setBackground(new java.awt.Color(250, 249, 251));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jSplitPane1.setOrientation(javax.swing.JSplitPane.VERTICAL_SPLIT);
        jSplitPane1.setPreferredSize(new java.awt.Dimension(1160, 750));

        jPanel1.setBackground(new java.awt.Color(250, 249, 251));
        jPanel1.setForeground(new java.awt.Color(25, 56, 82));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        setLocationBtn.setBackground(new java.awt.Color(153, 153, 255));
        setLocationBtn.setFont(new java.awt.Font("SF Pro Text", 1, 12)); // NOI18N
        setLocationBtn.setForeground(new java.awt.Color(255, 255, 255));
        setLocationBtn.setText("Go Back");
        setLocationBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                setLocationBtnActionPerformed(evt);
            }
        });
        jPanel1.add(setLocationBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 6, 201, 50));
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 41, -1, -1));

        jSplitPane1.setTopComponent(jPanel1);

        mapCanvas.setBackground(new java.awt.Color(255, 255, 255));
        mapCanvas.setLayout(new java.awt.CardLayout());
        jSplitPane1.setRightComponent(mapCanvas);

        add(jSplitPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1280, 980));
    }// </editor-fold>//GEN-END:initComponents

    private void setLocationBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_setLocationBtnActionPerformed

        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);

    }//GEN-LAST:event_setLocationBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JPanel mapCanvas;
    private javax.swing.JButton setLocationBtn;
    // End of variables declaration//GEN-END:variables
}
