package com.example.oregontrail;

/**
 * Allows the items to be constructed, serves as an outline for the items in the game.
 */
public class Items {

    //default constructor
    public Items() {
    }
<<<<<<< HEAD

=======
>>>>>>> main

    //cost in dollars of each item
    private double cost;
    //amount of the item available
    private double amountAvailable;
    //name of the item with the index number
    private String itemName;
    //brief description of the item with historical context
    private String itemDescription;

<<<<<<< HEAD

=======
    //constructor for the items with their parameters
>>>>>>> main
    public Items(double cost, double amountAvailable, String itemName, String itemDescription) {
        this.cost = cost;
        this.amountAvailable = amountAvailable;
        this.itemName = itemName;
        this.itemDescription = itemDescription;
    }

<<<<<<< HEAD
    public void moneyUsed(double amountOfMoney){
        amountAvailable -= amountOfMoney;
    }

=======
    /**
     * method takes the money away from the players wallet when they buy items
     * @param amountOfMoney amount of money the player currently has
     */
    public void moneyUsed(double amountOfMoney){
        
        amountAvailable -= amountOfMoney;
    }
>>>>>>> main

    /**
     * gets cost of the item
     * @return cost of the item
     */
    public double getCost() {
        return cost;
    }

<<<<<<< HEAD
=======
    /**
     * sets cost of item
     * @param cost cost of the item
     */
>>>>>>> main
    public void setCost(double cost) {
        this.cost = cost;
    }

<<<<<<< HEAD

=======
    /**
     * gets the amount available of the item
     * @return the amount available of the item
     */
>>>>>>> main
    public double getAmountAvailable() {
        return amountAvailable;
    }

<<<<<<< HEAD
=======
    /**
     * sets the amount available of the item
     * @param amountAvailable the amount available of the item
     */
>>>>>>> main
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

<<<<<<< HEAD
=======
    /**
     * sets the name of the item
     * @param itemName name of the item
     */
>>>>>>> main
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







<<<<<<< HEAD
    public String getItemDescription() {
        return itemDescription;
    }

    public void setItemDescription(String itemDescription) {
        this.itemDescription = itemDescription;
    }
}

//
//    public static void main(String[] args) {
//        Items item0 = new Items(.05, 2000, "Food", "food description");
//        Items item1 = new Items(.40, 8, "Clothing", "Clothing Description");
//        Items item2 = new Items(1, 20, "CookingItems", "Cooking Item Description" );
//        Items item3 = new Items(30, 6, "Oxen", " Oxen Description");
//        Items item4 = new Items(8, 3, "SpareWagonWheel", "SpareWagonWheel Description");
//        Items item5 = new Items(3, 1, "Medkit", "Medkit Description");
//        Items item6 = new Items(.50, 6, "Blankets", "Blanket Description");
//        Items item7 = new Items(2, 1, "SewingKit", "SewingKit Description" );
//        Items item8 = new Items(3, 2, "ExtraWagonTarp", "Description extrawagontarp");
//        Items item9 = new Items(.30, 4, "FireStartingKit", "fireStartingKit description");
//
//
//        System.out.println("Item 0 - " + item0.getItemName() + ", Cost: $" + item0.getCost() + ", Available: " + item0.getAmountAvailable() + "lbs" + " : "+ item0.getItemDescription());
//        System.out.println("Item 1 - " + item1.getItemName() + ", Cost: $" + item1.getCost() + ", Available: " + item1.getAmountAvailable() + "lbs" + " : "+ item1.getItemDescription());
//        System.out.println("Item 2 - " + item2.getItemName() + ", Cost: $" + item2.getCost() + ", Available: " + item2.getAmountAvailable() + "lbs" + " : "+ item2.getItemDescription());
//        System.out.println("Item 3 - " + item3.getItemName() + ", Cost: $" + item3.getCost() + ", Available: " + item3.getAmountAvailable() + "lbs" + " : "+ item3.getItemDescription());
//        System.out.println("Item 4 - " + item4.getItemName() + ", Cost: $" + item4.getCost() + ", Available: " + item4.getAmountAvailable() + "lbs" + " : "+ item4.getItemDescription());
//        System.out.println("Item 5 - " + item5.getItemName() + ", Cost: $" + item5.getCost() + ", Available: " + item5.getAmountAvailable() + "lbs" + " : "+ item5.getItemDescription());
//        System.out.println("Item 6 - " + item6.getItemName() + ", Cost: $" + item6.getCost() + ", Available: " + item6.getAmountAvailable() + "lbs" + " : "+ item6.getItemDescription());
//        System.out.println("Item 7 - " + item7.getItemName() + ", Cost: $" + item7.getCost() + ", Available: " + item7.getAmountAvailable() + "lbs" + " : "+ item7.getItemDescription());
//        System.out.println("Item 8 - " + item8.getItemName() + ", Cost: $" + item8.getCost() + ", Available: " + item8.getAmountAvailable() + "lbs" + " : "+ item8.getItemDescription());
//        System.out.println("Item 9 - " + item9.getItemName() + ", Cost: $" + item9.getCost() + ", Available: " + item9.getAmountAvailable() + "lbs" + " : "+ item9.getItemDescription());
//
//
//
//        //ask the user for the amount of item 0 (in weight or quantity) they want to purchase
//        //check to see if the user has enough money
//        //check to see if the amount available the user wants is available
//        //adds the item amount to the wagon / inventory.
//
//    }
=======
>>>>>>> main





