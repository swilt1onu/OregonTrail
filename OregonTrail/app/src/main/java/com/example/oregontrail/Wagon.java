package com.example.oregontrail;

/**
 *stores the stats of the characters and party
 */
public class Wagon {

    /**
     * default constructor
     * Creates a wagon object to be used in the game
     */
    public Wagon(){
        int oxenCount = 4;
        double weight = 0;
        int[] itemCount = {0,0,0,0,0,0,0,0,0,0};
        int pace = 0; //set by the player
        int wallet = 0;
    }

    //Variable for the number of oxen
    public int oxenCount = 4;
    //weight of everything in the wagon
    private double weight = 0;
    //keeps track of the amount of items the party has and its index
    private int[] itemCount = {0,0,0,0,0,0,0,0,0,0};
    //set by the player (how fast they are moving)
    private int pace = 1;
    //amount of money the party has
    private int wallet = 0;

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

    /**
     * gets the weight of everything in the wagon
     * @return weight of everthing in the wagon
     */
    public double getWeight() {
        return weight;
    }

    /**
     * sets the weight of everything on the wagon
     */
    public void setWeight(){
        double temp = 0;
        for (int i = 0; i <= 10; i++){
            temp = itemCount[i]; // * itemWeight[i]; yet to be added
        }
        this.weight = temp;
    }

    /**
     *
     * @param itemIndex index number of the item
     * @return the item count as an array
     */
    public int getitemCount(int itemIndex){
        return itemCount[itemIndex];
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
    public void setWallet(int wallet) {
        this.wallet = wallet;
    }

    /**
     * sets the itemcount of the party
     * @param itemCount amount of items the party has
     */
    public void setItemCount(int[] itemCount) {
        this.itemCount = itemCount;
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
}

