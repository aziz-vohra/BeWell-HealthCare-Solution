/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.northeastern.Business.EmergencyFire;

import java.util.ArrayList;

/**
 *
 * @author satyajitdas
 */
public class FireDir {

    ArrayList<Fire> fireEngines = new ArrayList<Fire>();

    public ArrayList<Fire> getFireEngines() {
        return fireEngines;
    }

    public void setFireEngines(ArrayList<Fire> fireEngines) {
        this.fireEngines = fireEngines;
    }

    public void addNewFire(Fire newFire) {
        fireEngines.add(newFire);
    }

    public void removeFire(Fire fire) {
        fireEngines.remove(fire);
    }

}
