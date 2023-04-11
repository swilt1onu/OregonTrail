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

    Trail trail;
    Wagon wagon;
    //random event object used for rng
    Random rand = new Random(System.currentTimeMillis());

    /**
     * gets the name of the random event that occurs
     * @return the name of the random event that will occur
     */
    public void getEventNumber(){
        int temp = rand.nextInt(99);
        temp++;
        if (temp == 1){
            //wrong trail
            System.out.println("Your party took the wrong trail!");
            trail.setDistance(trail.getDistance() - 10);
        }
        if ((temp % 10) == 0){
            //foraged food
            wagon.addItems(0, rand.nextInt(20));
            System.out.println("Your party foraged food!");
        }
        if ((temp % 50) == 0){
            //fire in the wagon
            System.out.println("Wagon fire! Some items were lost....");
            wagon.subtractItems(rand.nextInt(10), rand.nextInt(3));
            wagon.subtractItems(rand.nextInt(10), rand.nextInt(3));
            wagon.subtractItems(rand.nextInt(10), rand.nextInt(3));
        }
        if ((temp % 7) == 0){
            //storm/blizzard
            if (trail.getTemperature() <= 32){System.out.println("A blizzard draws near! Your party hunkers down");}
            else {System.out.print("A hail storm draws near! Your party hunkers down.");}
            if (wagon.getPace() == 3) {trail.setDistance(trail.getDistance()-15);}
            if (wagon.getPace() == 2) {trail.setDistance(trail.getDistance()-10);}
            if (wagon.getPace() == 1) {trail.setDistance(trail.getDistance()-5);}
            System.out.println("A days worth of travel is lost");

        }
        if (temp == 34){
            //lose party member, needs more of the party class setup beforehand
         //  int temp2 = rand.nextInt(2) + 2;
         //  if (temp2 == 2)

        }
        if (temp == 5){
            //lose Ox
        }
        else {return;}
    }
}
