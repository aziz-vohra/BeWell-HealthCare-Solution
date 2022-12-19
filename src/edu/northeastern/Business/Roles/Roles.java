/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.northeastern.Business.Roles;

import edu.northeastern.Business.EcoSystem;
import edu.northeastern.Business.UserAcc.UserAcc;
import javax.swing.JPanel;

/**
 *
 * @author altaf
 */
public abstract class Roles {

    public abstract JPanel createWorkArea(JPanel userProcessContainer,
            UserAcc account,
            EcoSystem business);

    @Override
    public String toString() {
        return this.getClass().getName();
    }

    public enum TypeOfRole {

        Admin_Pharmacy("AdminPharmacy"),
        User("User"),
        Admin_Vaccination("AdminVaccination"),
        Doctor("Doctor"),
        Admin_BloodBank("AdminBloodbank"),
        Admin_PandemicTestCenter("AdminPandemicTesting"),
        System_Admin("SysAdmin");

        private String value;

        private TypeOfRole(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return value;
        }
    }

}
