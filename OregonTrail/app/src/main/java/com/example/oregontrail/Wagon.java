package com.example.oregontrail;

import java.io.Serializable;

/**
 *stores the stats of the characters and party
 */
public class Wagon implements Serializable {
    Party party;

    private final int MAX_WEIGHT = 200;

    private int oxenCount;

    //weight of everything in the wagon
    private double weight;

    //keeps track of the amount of items the party has and its index
    private int[] itemCount = {0,0,0,0,0,0,0,0,0,0};
    private int[] itemCost = {1,7,5,50,20,3,2,4,12,7};
    private int[] itemWeight = {1,1,1,0,30,1,1,1,2,1};

    //set by the player (how fast they are moving)
    private int pace;

    //amount of money the party has
    private int wallet;

    // ration size
    private int ration;


    /**
     * default constructor
     * Creates a wagon object to be used in the game
     */
    public Wagon(){
        oxenCount = 4;
        weight = 0;
        pace = 1; //set by the player
        wallet = 200;
    }

    public Boolean canPurchase(int itemIndex, int itemNum){
        return (wallet - itemCost[itemIndex]*itemNum >= 0 && weight + itemWeight[itemIndex]*itemNum <= MAX_WEIGHT);
    }


    /**
     * Sets the pace of the party which affects how much they are able to move each day
     * this will be set by the player and determine other stats
     * @param pace how much the party can move per day
     */
    public void setPace(int pace){
        if (pace == 3){
            this.pace=pace; //Grueling pace
            System.out.println("Pace set to Grueling.");
        }
        else if (pace == 2) {
            this.pace = pace; //Strenuous pace
            System.out.println("Pace set to Strenuous.");
        }
        else if (pace == 1) {
            this.pace = pace;//Steady pace
            System.out.println("Pace set to Steady.");
        }
        else if (pace == 0) {
            this.pace = pace; //Resting pace
            System.out.println("Your wagon is now resting.");
        }
        else {
            System.out.println("Please pick a number between 3-0.");
        }
    }

    // add the weight
    public void addWeight(int weight){
        this.weight += weight;
    }

    /**
     * gets the weight of everything in the wagon
     * @return weight of everything in the wagon
     */
    public double getWeight() {
        return weight;
    }

    /**
     * sets the weight of everything on the wagon
     */
//    public void setWeight(){
//        double temp = 0;
//        for (int i = 0; i <= 10; i++){
//            temp = itemCount[i]; // * itemWeight[i]; yet to be added
//        }
//        this.weight = temp;
//    }

    /**
     *
     * @param itemIndex index number of the item
     * @return the item count as an array
     */
    public int getItemCount(int itemIndex){
        return itemCount[itemIndex];
    }

    public int getItemCost(int itemIndex){
        return itemCost[itemIndex];
    }

    public int getItemWeight(int itemIndex){
        return itemWeight[itemIndex];
    }

    /**
     * gets the amount of money the party has
     * @return the amount of money the party gas
     */
    public int getWallet() {
        return wallet;
    }

    /**
     * sets the amount of money the party has
     * @param wallet the amount of money the party has
     */
//    public void setWallet(int wallet) {
//        this.wallet = wallet;
//    }

    /**
     * sets the itemcount of the party
     * @param itemCount amount of items the party has
     */
    public void setItemCount(int[] itemCount) {
        this.itemCount = itemCount;
    }

    public void addItems(int itemIndex, int itemNum)
    {
        wallet -= itemCost[itemIndex]*itemNum;
        weight += itemWeight[itemIndex]*itemNum;
        itemCount[itemIndex] += itemNum;
    }

    public void subtractItems(int itemIndex, int itemNum)
    {
        itemCount[itemIndex] -= itemNum;
        if (itemCount[itemIndex] < 0){
            itemCount[itemIndex] =0;
        }
    }


    /**
     * gets the amount of items the player has
     * @return the amount of items the player has
     */
    public int[] getItemCount() {
        return itemCount;
    }

    /**
     * gets the number of oxen the party has
     * @return the number of oxen the party has
     */
    public int getOxenCount() {
        return oxenCount;
    }

    /**
     * gets the pace of the party
     * @return the pace of the party
     */
    public int getPace() {
        return pace;
    }

    /**
     * sets the number of oxen
     * @param oxenCount number of oxen in the party
     */
    public void setOxenCount(int oxenCount) {
        this.oxenCount = oxenCount;
    }

    /**
     * Sets the ration size of the party, set by the player
     * to control how much food is eaten
     * @param ration size of ration on a 0-3 scale
     */
    public void setRation(int ration) {
        if (ration > 3 || ration < 0) {
            System.out.println("Please select 0-3.");
        }
        else {this.ration = ration;}
    }

    /**
     * gets the ration size
     * return ration
     */
    public int getRation(){
        return this.ration;
    }

    /**
     * Consumes food based on the ration size
     * @param ration size of ration
     */
    public void meal (int ration){
        if (ration == 3) {
            itemCount[0] = itemCount[0] - (party.getMemberCount() * 6);
        }
        if (ration == 2) {
            itemCount[0] = itemCount[0] - (party.getMemberCount() * 4);
        }
        if (ration == 1) {
            itemCount[0] = itemCount[0] - (party.getMemberCount() * 2);
        }
        if (ration == 0) {
            itemCount[0] = itemCount[0] - (party.getMemberCount() * 0);
        }
        if (itemCount[0] <= 0) { setRation(0); itemCount[0] = 0;}
    }

}

