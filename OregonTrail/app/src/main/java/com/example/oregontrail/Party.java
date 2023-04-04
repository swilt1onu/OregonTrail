package com.example.oregontrail;

public class Party {

    public Party(){}

    Trail trail = new Trail();
    Wagon wagon = new Wagon();
    Items items = new Items();

    //variables
    private int tPH = 0;
    private String member1 = "Hattie Campbell";
    private String member2 = "member2";
    private String member3 = "member3";
    private String member4 = "member4";
    private int m1H = 0;
    private int m2H = 0;
    private int m3H = 0;
    private int m4H = 0;

    //Methods
    public void settPH(int tPH){
        this.tPH = tPH;
    }

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


}
