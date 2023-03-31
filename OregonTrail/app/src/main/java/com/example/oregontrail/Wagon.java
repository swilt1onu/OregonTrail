package com.example.oregontrail;

public class Wagon {

    /**
     * default constructor
     * Creates a wagon object to be used in the game
     */
    public Wagon(){}

    //Variables
    public int oxenCount = 4;
    private double weight = 0;
    private int[] itemCount = {0,0,0,0,0,0,0,0,0,0};
    private int pace = 0; //set by the player

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
        else if (pace > 3 || pace < 0){
            System.out.println("Please pick a number between 3-0.");
        }
    }

    public double getWeight() {
        return weight;
    }
    public void setWeight(){
        double temp;
        for (int i; i <= 10; i++){
            temp = itemCount[i]; // * itemWeight[i]; yet to be added
        }
        this.weight = temp;
    }

    public int getitemCount(int itemIndex){
        return itemCount[itemIndex];
    }
}
