package com.example.oregontrail;
import java.util.Random;

/**
 * Creates a "Trail" object in the game that is in charge of multiple game events
 * such as weather, temperature, time and landmarks.
 * This class will eventually be able to keep track of the distance that the
 * player is traveling and should be able to detect when the player reaches landmarks/obstacles.
 */
public class Trail {

    //variable for the current weather
    private String currentWeather = "Sunny";

    //distance the player has traveled in a section
    private int distance = 0;

    //number of days that have passed in a month
    private int dayCount = 0;
    //months number 0-12 in a year

    private int month = 0; //Set at the beginning

    //year the player is in
    private int year = 0;//Set by player

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

    /**
     * Used to generate a weather condition for the day.
     * @return weather condition
     */
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

    /**
     * Returns the current weather
     * @return current weather
     */
    public String getWeather() {
        return currentWeather;
    }


    /**
     * Returns distance
     * @return distance
     */
    public int getDistance() {
        return distance;
    }

    public void setDistance(int distance){this.distance = distance;}

    /**
     * Gets the total distance of the trail
     * @return the total distance
     */
    public int getTotalDistance() {
        return totalDistance;
    }

    /**
     * Used to set the current weather
     * @param currentWeather
     */
    public void setCurrentWeather(String currentWeather) {
        this.currentWeather = currentWeather;
    }


    /**
     * This should update the distance depending on the pace the player chose
     * @param pace
     */
    public void updateDistance(int pace) {
        if (pace == 3) {this.distance = this.distance + 15;}
        if (pace == 2) {this.distance = this.distance + 10;}
        if (pace == 1) {this.distance = this.distance + 5;}
        if (pace == 0) {this.distance = this.distance + 0;}
    }

    /**
     * Used to generate a temperature based on the month, each month has a baseline
     * and a value of 0-15 is chosen to be either added or subtracted to the baseline.
     * @return temperature generated
     */
    public int generateTemperature () {
        int temperature = 0;
        int temp1 = 0;
        int temp2 = 0;
        if (month > 11 && month < 3) {
            temperature = 20;
            temp1 = generator.nextInt(20);
            temp2 = generator.nextInt(2);
            if ((temp2 % 2) == 0) {
                temperature -= temp1;
            } else {
                temperature += temp1;
            }
        }
        if (month > 2 && month < 6) {
            temperature = 50;
            temp1 = generator.nextInt(25);
            temp2 = generator.nextInt(2);
            if ((temp2 % 2) == 0) {
                temperature -= temp1;
            } else {
                temperature += temp1;
            }
        }
        if (month > 5 && month < 9) {
            temperature = 70;
            temp1 = generator.nextInt(25);
            temp2 = generator.nextInt(2);
            if ((temp2 % 2) == 0) {
                temperature -= temp1;
            } else {
                temperature += temp1;
            }
        }
        if (month > 8 && month < 12) {
            temperature = 40;
            temp1 = generator.nextInt(25);
            temp2 = generator.nextInt(2);
            if ((temp2 % 2) == 0) {
                temperature -= temp1;
            } else {
                temperature += temp1;
            }
        }
        return temperature;
    }

    /**
     * Accesses the generated temperature
     * @return temperature
     */
    public int getTemperature(){
        return  temperature;
    }

    /**
     * Sets the temperature
     * @param temperature
     */
    public void setTemperature(int temperature){
        this.temperature=temperature;
    }

    /**
     * Accesses the day count
     * @return
     */
    public int getDayCount() {
        return dayCount;
    }

    /**
     * Used to increment the day, currently each month is tracked as an assumed 30 days.
     * After reaching 31 the day count is set to 1 and the month count is incremented. If the
     * month is equal to 13 when incremented then it is set to 1 and the year is incremented instead.
     */
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

    /**
     * gets the month count
     * @return month
     */

    public int getMonth() {
        return month;
    }

    /**
     * gets the year
     * @return year
     */
    public int getYear() {
        return year;
    }

    /**
     * sets the day count
     * @param dayCount
     */

    public void setDayCount(int dayCount) {
        this.dayCount = dayCount;
    }

    /**
     * sets the month
     * @param month
     */

    public void setMonth(int month) {
        this.month = month;
    }

    /**
     * sets the year
     * @param year
     */
    public void setYear(int year) {
        this.year = year;
    }

    /**
     * This method should simulate a day, generating weather, temperature
     * and incrementing the day count. This method is really for ease of access as using this shortens down
     * lines of code needed in main as this can be used rather than individually calling these methods.
     */
    public void day () {
        generateWeather();
        generateTemperature();
        updateDistance(wagon.getPace());
        incrementDayCount();
    }
}
