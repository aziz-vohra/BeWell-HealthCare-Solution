/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.northeastern.Business.EmergencyPolice;

import edu.northeastern.Business.Roles.Police_Officer;
import edu.northeastern.Business.UserAcc.UserAcc;

/**
 *
 * @author satyajitdas
 */
public class Police extends UserAcc {
        String name;
    String Location;
    String phonenumber;
    String userid;
    String password;

    public Police(String name, String Location, String phonenumber, String userid, String password) {
        this.name = name;
        this.Location = Location;
        this.phonenumber = phonenumber;
        this.userid = userid;
        this.password = password;
        setUserName(userid);
        setPwd(password);
        setRole(new Police_Officer());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return Location;
    }

    public void setLocation(String Location) {
        this.Location = Location;
    }

    public String getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber;
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
