package com.example.oregontrail;

/**
 *
 *
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

    //Variables
    public int oxenCount = 4;
    private double weight = 0;
    private int[] itemCount = {0,0,0,0,0,0,0,0,0,0};
    private int pace = 1; //set by the player

    private int wallet = 0;

    //methods
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

    public double getWeight() {
        return weight;
    }
    public void setWeight(){
        double temp = 0;
        for (int i = 0; i <= 10; i++){
            temp = itemCount[i]; // * itemWeight[i]; yet to be added
        }
        this.weight = temp;
    }

    public int getitemCount(int itemIndex){
        return itemCount[itemIndex];
    }

    public int getWallet() {
        return wallet;
    }

    public void setWallet(int wallet) {
        this.wallet = wallet;
    }

    public void setItemCount(int[] itemCount) {
        this.itemCount = itemCount;
    }

    public int[] getItemCount() {
        return itemCount;
    }

    public int getOxenCount() {
        return oxenCount;
    }

    public int getPace() {
        return pace;
    }

    public void setOxenCount(int oxenCount) {
        this.oxenCount = oxenCount;
    }
}

