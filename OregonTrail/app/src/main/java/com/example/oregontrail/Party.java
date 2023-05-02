package com.example.oregontrail;

import android.content.Intent;

import java.util.Random;

public class Party {
    /**
     * This class will be used to keep track of health, illnesses and other things related to
     * the well being of the party. This class will keep track of the overall health of the party
     * and the individual members. This class will also be used to name party members other than
     * the player/Hattie namely her siblings.
     */
    private int tPH = 0;
    // These 4 variables store the names of the members in the party 1-4
    private String member1 = "Hattie Campbell";
    private String member2 = "Mary Campbell";
    private String member3 = "John Campbell";
    private String member4 = "Joseph Campbell";

    //These variables will be used to keep track of individual members health
    private int m1H = 0;
    private int m2H = 0;
    private int m3H = 0;
    private int m4H = 0;

    //Tracks if a party member is diseased
    private boolean m1Ill = false;
    private boolean m2Ill = false;
    private boolean m3Ill = false;
    private boolean m4Ill = false;

    //Tracks if a party member is dead
    private boolean m1Dead = false;
    private boolean m2Dead = false;
    private boolean m3Dead = false;
    private boolean m4Dead = false;


    //Makes a reference to the wagon class which allows the methods
    //to be used in this class
    Wagon wagon;

    Trail trail;

    Random rand = new Random(System.currentTimeMillis());

    /**
     * Default Constructor
     */
    public Party() {
    }

    //Methods

    /**
     * returns the illness status of a member
     * @param memberNumber number of the member
     * @return the illness status
     */
    public boolean getIllness(int memberNumber) {
        if (memberNumber == 1) {
            return m1Ill;
        }
        if (memberNumber == 2) {
            return m2Ill;
        }
        if (memberNumber == 3) {
            return m3Ill;
        }
        if (memberNumber == 4) {
            return m4Ill;
        } else {
            return false;
        }
    }

    /**
     * makes a party member ill
     * @param memberNumber number of the member
     */
    public void setIllness(int memberNumber) {
        if (memberNumber == 1) {
            this.m1Ill = true;
        }
        if (memberNumber == 2) {
            this.m2Ill = true;
        }
        if (memberNumber == 3) {
            this.m3Ill = true;
        }
        if (memberNumber == 4) {
            this.m4Ill = true;
        }
    }

    /**
     * Mutator method to give the wagon from main to party
     * @param wagon wagon object
     */
    public void setWagon(Wagon wagon) {
        this.wagon = wagon;
    }

    /**
     * used to set the total party health
     * @param tPH the number total party health is being set to
     */
    public void settPH(int tPH) {
        this.tPH = tPH;
    }

    /**
     * Used to get a calculation of the overall health of the party taking
     * into account each individuals health. It does this by adding all member healths together and
     * then dividing the value by 4 to set it within a range.
     *
     * @return A status message within a given range of health
     */
    public String updateTotalPartyHealth() {
        tPH = (this.m1H + this.m2H + this.m3H + this.m4H) / 4;
        String Status = "";
        if (tPH >= 0 && tPH <= 34) {
            Status = "Great health";
        }
        if (tPH >= 35 && tPH <= 65) {
            Status = "Good health";
        }
        if (tPH >= 66 && tPH <= 104) {
            Status = "Poor health";
        }
        if (tPH >= 105 && tPH <= 139) {
            Status = "Terrible health";
        }
        if (tPH >= 140) {
            Status = "Approaching death";
        }
        return Status;
    }

    /**
     * returns a specific members name
     *
     * @param membernumber the member number
     * @return the members name
     */
    public String getMemberName(int membernumber) {
        if (membernumber == 1) {
            return member1;
        }
        if (membernumber == 2) {
            return member2;
        }
        if (membernumber == 3) {
            return member3;
        }
        if (membernumber == 4) {
            return member4;
        } else {
            return "Error: Please choose a party member 1-4";
        }
    }

    /**
     * used to get the total number of party members
     *
     * @return number of members
     */
    public int getMemberCount() {
        int partyCount = 0;
        if (!m1Dead) {
            partyCount++;
        }
        if (!m2Dead) {
            partyCount++;
        }
        if (!m3Dead) {
            partyCount++;
        }
        if (!m4Dead) {
            partyCount++;
        }
        return partyCount;
    }

    /**
     * Used to update health daily
     *
     * @param memberDisease checks for if the member is diseased
     * @param memberHealth  uses the current health value to update
     */
    public void updateHealth(int memberHealth, boolean memberDisease) {

        memberHealth = memberHealth - (memberHealth / 10);

        int pace = wagon.getPace();
        if (pace == 1) {
            memberHealth += 2;
        }
        if (pace == 2) {
            memberHealth += 4;
        }
        if (pace == 3) {
            memberHealth += 6;
        }

        int temp = trail.getTemperature();
        if (temp >= 85) {
            memberHealth += 2;
        }
        if (temp <= 15) {
            memberHealth += 3;
        }

        if (memberDisease) {
            memberHealth += 7;
        }

        if (wagon.getRation() == 2) {
            memberHealth += 4;
        }
        if (wagon.getRation() == 1) {
            memberHealth += 8;
        }
        if (wagon.getRation() == 0) {
            memberHealth += 12;
        }

    }

    /**
     * If the party member's health exceeds 140 then they will be checked every day to
     * see if they have died.
     */
    public boolean checkDeath() {
        int temp1 = rand.nextInt(100);
        int temp2 = rand.nextInt(100);
        int temp3 = rand.nextInt(100);
        int temp4 = rand.nextInt(100);
        if (m1H >= 140) {
            if (temp1 < 25) {
                this.m1Dead = true;
            }
        }
        if (m2H >= 140) {
            if (temp2 < 25) {
                this.m2Dead = true;
            }
        }
        if (m3H >= 140) {
            if (temp3 < 25) {
                this.m3Dead = true;
            }
        }
        if (m4H >= 140) {
            if (temp4 < 25) {
                this.m4Dead = true;
            }
        }
        if(m1Dead && m2Dead && m3Dead && m4Dead){
            return true;
        } else{
            return false;
        }
    }
}