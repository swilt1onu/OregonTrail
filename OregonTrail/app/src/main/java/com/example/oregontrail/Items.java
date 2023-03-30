package com.example.oregontrail;


public class Items {
    private double cost;
    private double amountAvailable;
    private String description;

    public Items(double cost, double amountAvailable, String description) {
        this.cost = cost;
        this.amountAvailable = amountAvailable;
        this.description = description;
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public static void main(String[] args) {
        Items item0 = new Items(.05, 2000, "Food");
        Items item1 = new Items(.40, 8, "Clothing");
        Items item2 = new Items(1, 20, "CookingItems");
        Items item3 = new Items(30, 6, "Oxen");
        Items item4 = new Items(8, 3, "SpareWagonWheel");
        Items item5 = new Items(3, 1, "Medkit");
        Items item6 = new Items(.50, 6, "Blankets");
        Items item7 = new Items(2, 1, "SewingKit");
        Items item8 = new Items(3, 2, "ExtraWagonTarp");
        Items item9 = new Items(.30, 4, "FireStartingKit");

        System.out.println("Item 0 - " + item0.getDescription() + ", Cost: $" + item0.getCost() + ", Available: " + item0.getAmountAvailable() + "lbs");
        System.out.println("Item 1 - " + item1.getDescription() + ", Cost: $" + item1.getCost() + ", Available: " + item1.getAmountAvailable() + "lbs");
        System.out.println("Item 2 - " + item2.getDescription() + ", Cost: $" + item2.getCost() + ", Available: " + item2.getAmountAvailable() + "lbs");
        System.out.println("Item 3 - " + item3.getDescription() + ", Cost: $" + item3.getCost() + ", Available: " + item3.getAmountAvailable() + "lbs");
        System.out.println("Item 4 - " + item4.getDescription() + ", Cost: $" + item4.getCost() + ", Available: " + item4.getAmountAvailable() + "lbs");
        System.out.println("Item 5 - " + item5.getDescription() + ", Cost: $" + item5.getCost() + ", Available: " + item5.getAmountAvailable() + "lbs");
        System.out.println("Item 6 - " + item6.getDescription() + ", Cost: $" + item6.getCost() + ", Available: " + item6.getAmountAvailable() + "lbs");
        System.out.println("Item 7 - " + item7.getDescription() + ", Cost: $" + item7.getCost() + ", Available: " + item7.getAmountAvailable() + "lbs");
        System.out.println("Item 8 - " + item8.getDescription() + ", Cost: $" + item8.getCost() + ", Available: " + item8.getAmountAvailable() + "lbs");
        System.out.println("Item 9 - " + item9.getDescription() + ", Cost: $" + item9.getCost() + ", Available: " + item9.getAmountAvailable() + "lbs");

        //ask the user for the amount of item 0 (in weight or quantity) they want to purchase
        //check to see if the user has enough money
        //check to see if the amountavailable the user wants is available
        //adds the item amount to the wagon / inventory.

    }





