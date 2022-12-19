/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.northeastern.Business.WorkQueue;

import java.util.ArrayList;

/**
 *
 * @author satyajitdas
 */
public class DonateBlood_Dir {
    ArrayList<DonateBlood> donors = new ArrayList<>();

    public ArrayList<DonateBlood> getDonors() {
        return donors;
    }

    public void setDonors(ArrayList<DonateBlood> donors) {
        this.donors = donors;
    }
    public void addrequest(DonateBlood user){
        donors.add(user);
    }
    
    public void removerequest(DonateBlood user){
        donors.remove(user);
    }
}
