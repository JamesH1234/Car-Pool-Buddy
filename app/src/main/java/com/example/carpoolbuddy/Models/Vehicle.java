package com.example.carpoolbuddy.Models;

public class Vehicle {
    private double basePrice;
    private int seats;
    private int model;
    private boolean open;
    private String owner;
    private String[] reservedUids = new String[2];
    private String vehicleId;
    private String vehicleType;

    public Vehicle() {
        this.basePrice = 0;
        this.seats = 0;
        this.model = 0;
        this.open = false;
        this.owner = "";
        this.reservedUids[0] = "";
        this.reservedUids[1] = "";
        this.vehicleId = "";
        this.vehicleType = "";
    }

    public Vehicle(double basePrice, int seats, int model, boolean open, String owner, String[] reservedUids, String vehicleId, String vehicleType) {
        this.basePrice = basePrice;
        this.seats = seats;
        this.model = model;
        this.open = open;
        this.owner = owner;
        this.reservedUids[0] = reservedUids[0];
        this.reservedUids[1] = reservedUids[1];
        this.vehicleId = vehicleId;
        this.vehicleType = vehicleType;
    }

    public double getBasePrice() {
        return basePrice;
    }

    public void setBasePrice(double basePrice) {
        this.basePrice = basePrice;
    }

    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }

    public int getModel() {
        return model;
    }

    public void setModel(int model) {
        this.model = model;
    }

    public boolean isOpen() {
        return open;
    }

    public void setOpen(boolean open) {
        this.open = open;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String[] getReservedUids() {
        return reservedUids;
    }

    public void setReservedUids(String[] reservedUids) {
        this.reservedUids = reservedUids;
    }

    public String getVehicleId() {
        return vehicleId;
    }

    public void setVehicleId(String vehicleId) {
        this.vehicleId = vehicleId;
    }

    public String getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(String vehicleType) {
        this.vehicleType = vehicleType;
    }
}
