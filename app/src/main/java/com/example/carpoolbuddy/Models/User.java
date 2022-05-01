package com.example.carpoolbuddy.Models;

public class User {

    private String email;
    private String name;
    private String[] ownedVehicles = new String[2];
    private double priceMultiplier;
    private String uid;
    private String userType;

    public User() {
        this.email = "";
        this.name = "";
        this.ownedVehicles[0] = "";
        this.ownedVehicles[1] = "";
        this.priceMultiplier = 0;
        this.uid = "";
        this.userType = "";
    }

    public User(String email, String name, String[] ownedVehicles, double priceMultiplier, String uid, String userType) {
        this.email = email;
        this.name = name;
        this.ownedVehicles = ownedVehicles;
        this.priceMultiplier = priceMultiplier;
        this.uid = uid;
        this.userType = userType;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String[] getOwnedVehicles() {
        return ownedVehicles;
    }

    public void setOwnedVehicles(String[] ownedVehicles) {
        this.ownedVehicles = ownedVehicles;
    }

    public double getPriceMultiplier() {
        return priceMultiplier;
    }

    public void setPriceMultiplier(double priceMultiplier) {
        this.priceMultiplier = priceMultiplier;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        this.userType = userType;
    }

}
