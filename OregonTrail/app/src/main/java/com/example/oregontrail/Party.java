package com.example.oregontrail;

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
    private String member2 = "member2";
    private String member3 = "member3";
    private String member4 = "member4";

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

    /**
     * Default Constructor
     */
    public Party(){}

    //Methods

    /**
     * Mutator method to give the wagon from main to party
     * @param wagon
     */
    public void setWagon(Wagon wagon){
        this.wagon = wagon;
    }

    /**
     * used to set the total party health
     * @param tPH
     */
    public void settPH(int tPH){
        this.tPH = tPH;
    }

    /**
     * Used to get a calculation of the overall health of the party taking
     * into account each individuals health. It does this by adding all member healths together and
     * then dividing the value by 4 to set it within a range.
     * @return A status message within a given range of health
     */
    public String updateTotalPartyHealth(){
        tPH = (this.m1H + this.m2H + this.m3H + this.m4H)/4;
        String Status = "";
        if (tPH >= 0 && tPH <= 34){
            Status = "Great health";
        }
        if (tPH >= 35 && tPH <= 65){
            Status ="Good health";
        }
        if (tPH >= 66 && tPH <= 104){
            Status = "Poor health";
        }
        if (tPH >= 105 && tPH <= 139){
            Status = "Terrible health";
        }
        if (tPH >= 140){
            Status = "Approaching death";
        }
        return Status;
    }

    /**
     * returns a specific members name
     * @param membernumber
     * @return the members name
     */
    public String getMemeberName (int membernumber){
        if (membernumber == 1){
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
        }
        else {return "Error: Please choose a party member 1-4";}
}
    /**
     * used to get the total number of party members
     * @return number of members
     */
    public int getMemberCount(){
        int partyCount = 0;
        if (!m1Dead) { partyCount++;}
        if (!m2Dead) { partyCount++;}
        if (!m3Dead) { partyCount++;}
        if (!m4Dead) { partyCount++;}
        return partyCount;
    }

    /**
     * Used to update health daily
     * @param memberDisease checks for if the member is diseased
     * @param memberHealth uses the current health value to update
     */
    public void updateHealth (int memberHealth, boolean memberDisease){

        memberHealth = memberHealth - (memberHealth/10);

        int pace = wagon.getPace();
        if (pace == 1) { memberHealth += 2;}
        if (pace == 2) { memberHealth += 4;}
        if (pace == 3) { memberHealth += 6;}

        int temp = trail.getTemperature();
        if (temp >= 85) {memberHealth += 2;}
        if (temp <= 15) {memberHealth += 3;}

        if (memberDisease) { memberHealth += 7;}

        if (wagon.getRation() == 3) {memberHealth += 0;}
        if (wagon.getRation() == 2) {memberHealth += 4;}
        if (wagon.getRation() == 1) {memberHealth += 8;}
        if (wagon.getRation() == 0) {memberHealth += 12;}

    }

}
