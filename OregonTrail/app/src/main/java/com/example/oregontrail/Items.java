package com.example.oregontrail;

/**
 * Allows the items to be constructed, serves as an outline for the items in the game.
 */
public class Items {

    //default constructor
    public Items() {
    }

    //cost in dollars of each item
    private double cost;
    //amount of the item available
    private double amountAvailable;
    //name of the item with the index number
    private String itemName;
    //brief description of the item with historical context
    private String itemDescription;

    //constructor for the items with their parameters
    public Items(double cost, double amountAvailable, String itemName, String itemDescription) {
        this.cost = cost;
        this.amountAvailable = amountAvailable;
        this.itemName = itemName;
        this.itemDescription = itemDescription;
    }

    /**
     * method takes the money away from the players wallet when they buy items
     * @param amountOfMoney amount of money the player currently has
     */
    public void moneyUsed(double amountOfMoney){
        amountAvailable -= amountOfMoney;
    }

    /**
     * gets cost of the item
     * @return cost of the item
     */
    public double getCost() {
        return cost;
    }

    /**
     * sets cost of item
     * @param cost cost of the item
     */
    public void setCost(double cost) {
        this.cost = cost;
    }

    /**
     * gets the amount available of the item
     * @return the amount available of the item
     */
    public double getAmountAvailable() {
        return amountAvailable;
    }

    /**
     * sets the amount available of the item
     * @param amountAvailable the amount available of the item
     */
    public void setAmountAvailable(double amountAvailable) {
        this.amountAvailable = amountAvailable;
    }

    /**
     * gets the item name
     * @return the item name
     */
    public String getItemName() {
        return itemName;
    }

    /**
     * sets the name of the item
     * @param itemName name of the item
     */
    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    /**
     * gets the item description
     * @return the item description
     */
    public String getItemDescription() {
        return itemDescription;
    }

    /**
     * sets the item description
     * @param itemDescription the description of the item
     */
    public void setItemDescription(String itemDescription) {
        this.itemDescription = itemDescription;
    }
}












