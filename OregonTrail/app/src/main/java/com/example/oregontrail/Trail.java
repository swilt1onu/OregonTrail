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
    private String currentWeather = "Sunny";
    private int distance = 0;
    private int randomEventIndex = 0;

    private int dayCount = 0;

    private int month = 0; //Set at the beginning

    private int year = 0; //Set by player

    private int totalDistance = 0; //Ideally set to the total distance of the trip

    //methods
    public void randomEvent (int randomEventIndex){
        //Should make a separate class for random events to store
        //lists and different events to be used by the index
    }

    public String getCurrentWeather() {
        int temp;
        temp = generator.nextInt(100);

        if ((temp % 20) == 0) {
            if (month > 10 || month < 4) {
                currentWeather = "Snowing";
            } else {
                currentWeather = "Raining";
            }
        }
        if (temp == 0) {
            if (month > 10 || month < 4) {
                currentWeather = "Blizzard";
            } else {
                currentWeather = "Storm";
            }
        }
        return currentWeather;
    }

    public String getWeather() {
        return currentWeather;
    }


    public int getLandmarkIndex() {
        return landmarkIndex;
    }


    public int getDistance() {
        return distance;
    }

    public int getTotalDistance() {
        return totalDistance;
    }

    public int getRandomEventIndex() {
        return randomEventIndex;
    }

    public void setCurrentWeather(String currentWeather) {
        this.currentWeather = currentWeather;
    }

    public void setLandmarkIndex(int landmarkIndex) {
        this.landmarkIndex = landmarkIndex;
    }

    public void setDistance(int pace) {
        if (pace == 3) {this.distance = this.distance + 15;}
        if (pace == 2) {this.distance = this.distance + 10;}
        if (pace == 1) {this.distance = this.distance + 5;}
        if (pace == 0) {this.distance = this.distance + 0;}
    }

    public void setRandomEventIndex(int randomEventIndex) {
        this.randomEventIndex = randomEventIndex;
    }

    public int getTemperature () {
        int temperature = 0;
        int temp1 = 0;
        int temp2 = 0;
        if (month > 11 && month < 3) {
            temperature = 20;
            temp1 = generator.nextInt(15);
            temp2 = generator.nextInt(2);
            if ((temp2 % 2) == 0) {
                temperature -= temp1;
            } else {
                temperature += temp1;
            }
        }
        if (month > 2 && month < 6) {
            temperature = 50;
            temp1 = generator.nextInt(15);
            temp2 = generator.nextInt(2);
            if ((temp2 % 2) == 0) {
                temperature -= temp1;
            } else {
                temperature += temp1;
            }
        }
        if (month > 5 && month < 9) {
            temperature = 70;
            temp1 = generator.nextInt(15);
            temp2 = generator.nextInt(2);
            if ((temp2 % 2) == 0) {
                temperature -= temp1;
            } else {
                temperature += temp1;
            }
        }
        if (month > 8 && month < 12) {
            temperature = 40;
            temp1 = generator.nextInt(15);
            temp2 = generator.nextInt(2);
            if ((temp2 % 2) == 0) {
                temperature -= temp1;
            } else {
                temperature += temp1;
            }
        }
        return temperature;
    }

    public void Day () {
        //This method should simulate a day
        //Rolls for weather, random events, temperature
        //Food consumption and distance is updated
        //Increments day and sets months/years accordingly to day count

    }
}
