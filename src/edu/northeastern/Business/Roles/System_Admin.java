/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.northeastern.Business.Roles;

import edu.northeastern.Business.EcoSystem;
import edu.northeastern.Business.UserAcc.UserAcc;
import edu.northeastern.UserInterface.SysAdmin.SysAdminWorkAreaJPanel;
import javax.swing.JPanel;

/**
 *
 * @author altaf
 */
public class System_Admin extends Roles{

    public JPanel createWorkArea(JPanel userProcessContainer, UserAcc account, EcoSystem system) {
        return new SysAdminWorkAreaJPanel(userProcessContainer, system);
        //simple sysadmin return for jpanel
    }
}
