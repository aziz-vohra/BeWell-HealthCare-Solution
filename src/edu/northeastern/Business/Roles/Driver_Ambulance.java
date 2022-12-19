/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.northeastern.Business.Roles;
//driver ambulance driver file

import edu.northeastern.Business.EcoSystem;
import edu.northeastern.Business.UserAcc.UserAcc;
import edu.northeastern.UserInterface.user.UserAreaJPanel;

import javax.swing.JPanel;

/**
 *
 * @author altaf
 */
public class Driver_Ambulance extends Roles {

    public JPanel createWorkArea(JPanel userProcessContainer, UserAcc account, EcoSystem business) {

        return new UserAreaJPanel(userProcessContainer, account, business);
    }
}
