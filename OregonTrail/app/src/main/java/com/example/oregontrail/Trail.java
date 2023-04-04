package com.example.oregontrail;
import java.util.Random;

/**
 *
 *
 *
 *
 */
public class Trail {


    private int landmarkIndex = 0;
    //variable for the current weather
    private String currentWeather = "Sunny";
    //distance the player has traveled in a section
    private int distance = 0;
    //index for a random event to occur
    private int randomEventIndex = 0;
    //number of days that have passed in a month
    private int dayCount = 0;
    //months number 0-12 in a year
    private int month = 0; //Set at the beginning
    //year the player is in
    private int year = 0; //Set by player
    //total distance traveled in the trip
    private int totalDistance = 0;
    //temperature in fahrenheit outside (changes with the seasons/months)
    private int temperature = 0;

    Wagon wagon;
    Random generator;
    /**
     * default constructor
     * Creates a trail object to be used in the game
     */
    public Trail(){
        generator = new Random(System.currentTimeMillis());
        wagon = new Wagon();
//        Items items = new Items();
        Party party = new Party();
        //Variables}
    }




    //methods
    public void randomEvent (int randomEventIndex){
        //Should make a separate class for random events to store
        //lists and different events to be used by the index
    }

    private String generateWeather() {
        int temp;
        temp = generator.nextInt(100);

        // 5% change
        if ((temp % 20) == 0) {
            if (month > 10 || month < 4) {
                currentWeather = "Snowing";
            } else {
                currentWeather = "Raining";
            }
        }
        // 1% chance
        if (temp == 0) {
            if (month > 10 || month < 4) {
                currentWeather = "Blizzard";
            } else {
                currentWeather = "Storm";
            }
        }
        else{
            currentWeather = "Sunny";
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

    public void updateDistance(int pace) {
        if (pace == 3) {this.distance = this.distance + 15;}
        if (pace == 2) {this.distance = this.distance + 10;}
        if (pace == 1) {this.distance = this.distance + 5;}
        if (pace == 0) {this.distance = this.distance + 0;}
    }

    public void setRandomEventIndex(int randomEventIndex) {
        this.randomEventIndex = randomEventIndex;
    }

    public int generateTemperature () {
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
    public int getTemperature(){
        return  temperature;
    }
    public void setTemperature(int temperature){
        this.temperature=temperature;
    }

    public int getDayCount() {
        return dayCount;
    }

    public void incrementDayCount(){
        int temp =0;
        dayCount++;
        if (dayCount == 31) {
            setDayCount(1);
            temp = getMonth();
            temp++;
            if (temp > 12) {
                temp = 1;
                this.year++;
            }
            setMonth(temp);
        }
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }

    public void setDayCount(int dayCount) {
        this.dayCount = dayCount;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void Day () {
        //This method should simulate a day
        //Rolls for weather, random events, temperature
        //Food consumption and distance is updated
        //Increments day and sets months/years accordingly to day count
        generateWeather();
        generateTemperature();
        updateDistance(wagon.getPace());
        incrementDayCount();
    }
}
