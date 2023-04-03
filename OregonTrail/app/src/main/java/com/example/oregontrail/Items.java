package com.example.oregontrail;


public class Items {

    //default constructor
    public Items() {
        double cost;
        double amountAvailable;
        String itemName;
        String itemDescription;
    }


    private double cost;
    private double amountAvailable;
    private String itemName;
    private String itemDescription;


    public Items(double cost, double amountAvailable, String itemName, String itemDescription) {
        this.cost = cost;
        this.amountAvailable = amountAvailable;
        this.itemName = itemName;
        this.itemDescription = itemDescription;
    }


    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }


    public double getAmountAvailable() {
        return amountAvailable;
    }

    public void setAmountAvailable(double amountAvailable) {
        this.amountAvailable = amountAvailable;
    }


    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }


    public String getItemDescription() {
        return itemDescription;
    }

    public void setItemDescription(String itemDescription) {
        this.itemDescription = itemDescription;
    }
}








