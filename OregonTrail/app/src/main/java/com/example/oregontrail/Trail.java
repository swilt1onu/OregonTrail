package com.example.oregontrail;

import java.util.Random;

public class Trail {

    /**
     * default constructor
     * Creates a trail object to be used in the game
     */
    public Trail(){}
    Random generator = new Random(System.currentTimeMillis());
    //Variables
    private int landmarkIndex = 0;
    private int currentWeather = 0;
    private int region = 0;
    private int location = 0;
    private int randomEventIndex = 0;

    //methods
    public void randomEvent (int randomEventIndex){
        //Should make a separate class for random events to store
        //lists and different events to be used by the index
    }

    public int getCurrentWeather() {
        int temp;
        temp = generator.nextInt(100);
        if (region == 1){
            System.out.println("Placeholder, temp value would be " + temp);
        }
        if (region == 2){
            System.out.println("Placeholder, temp value would be " + temp);
        }
        if (region == 3){
            System.out.println("Placeholder, temp value would be " + temp);
        }
        if (region == 4){
            System.out.println("Placeholder, temp value would be " + temp);
        }
        if (region == 5){
            System.out.println("Placeholder, temp value would be " + temp);
        }
        if (region == 6){
            System.out.println("Placeholder, temp value would be " + temp);
        }
        return currentWeather;
    }


    public int getLandmarkIndex() {
        return landmarkIndex;
    }

    public int getRegion() {
        return region;
    }

    public int getLocation() {
        return location;
    }

    public int getRandomEventIndex() {
        return randomEventIndex;
    }

    public void setCurrentWeather(int currentWeather) {
        this.currentWeather = currentWeather;
    }

    public void setLandmarkIndex(int landmarkIndex) {
        this.landmarkIndex = landmarkIndex;
    }

    public void setLocation(int location) {
        this.location = location;
    }

    public void setRandomEventIndex(int randomEventIndex) {
        this.randomEventIndex = randomEventIndex;
    }

    public void setRegion(int region) {
        if (region > 6 || region < 1){
            System.out.println("Error: Region was set to invalid value.");
        }
        else {this.region = region;}
    }
}
