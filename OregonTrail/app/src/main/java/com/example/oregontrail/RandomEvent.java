package com.example.oregontrail;
import java.util.Random;

/**
 * allows for random events to occur, uses the percent chance and rng to find out what will happen
 */
public class RandomEvent {
    /**
     * default constructor for the random event class
     */
    public RandomEvent() {
    }

    //random event object used for rng
    Random rand = new Random(System.currentTimeMillis());

    /**
     * gets the name of the random event that occurs
     * @return the name of the random event that will occur
     */
    public String getEvent(){
        int temp = rand.nextInt(5);

        if (temp == 0){
            return "Event 0 has occurred";
        }
        if (temp == 1){
            return "Event 1 has occurred";
        }
        if (temp == 2){
            return "Event 2 has occurred";
        }
        if (temp == 3){
            return "Event 3 has occurred";
        }
        if (temp == 4){
            return "Event 4 has occurred";
        }
        if (temp == 5){
            return "Event 5 has occurred";
        }
        else {return "Error occurred";}
    }
}
