package com.example.oregontrail;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.oregontrail.Items;

/**
 * Contains the item data for the first 10 items in the store
 * keeps track of cost, availability, name, and description.
 * used with the items class and main activity class
 * Eventually will:
 * ask the user for the amount of item 0 (in weight or quantity) they want to purchase
 * check to see if the user has enough money
 * check to see if the amount available the user wants is available
 * adds the item amount to the wagon / inventory.
 */
public class Store extends AppCompatActivity {

    TextView textViewFood;
    TextView textViewClothing;
    TextView textViewCookingItems;
    TextView textViewOxen;
    TextView textViewSpareWagonWheel;
    TextView textViewMedKit;
    TextView textViewBlankets;
    TextView textViewSewingKit;
    TextView textViewExtraWagonTarp;
    TextView textViewFireStartingKit;

    TextView textViewWalletAndWeight;


//Creates the items in the store
    Items Food = new Items(20, 1, "Food0", "food description");
    Items Clothing = new Items(3.2, 1, "Clothing1", "Clothing Description");
    Items CookingItems = new Items(2.5, 1, "CookingItems2", "Cooking Item Description" );
    Items Oxen = new Items(90, 1, "Oxen", " Oxen Description3");
    Items SpareWagonWheel = new Items(8, 1, "SpareWagonWheel4", "SpareWagonWheel Description");
    Items MedKit = new Items(3, 1, "Medkit5", "Medkit Description");
    Items Blankets = new Items(1, 1, "Blankets6", "Blanket Description");
    Items SewingKit = new Items(2, 1, "SewingKit7", "SewingKit Description" );
    Items ExtraWagonTarp = new Items(6, 1, "ExtraWagonTarp8", "Description extrawagontarp");
    Items FireStartingKit = new Items(.60, 1, "FireStartingKit9", "fireStartingKit description");

    //array of objects that contains all the items to be accessed easier within the program
    Items[] itemsArray = {Food, Clothing,CookingItems,Oxen ,SpareWagonWheel ,MedKit ,Blankets , SewingKit,ExtraWagonTarp , FireStartingKit};




    //is created when the store is created.
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.store);

        textViewFood = findViewById(R.id.textViewFood);
        textViewClothing = findViewById(R.id.textViewClothing);
        textViewCookingItems = findViewById(R.id.textViewCookingItems);
        textViewOxen = findViewById(R.id.textViewOxen);
        textViewSpareWagonWheel = findViewById(R.id.textViewSpareWagonWheel);
        textViewMedKit = findViewById(R.id.textViewMedKit);
        textViewBlankets = findViewById(R.id.textViewBlankets);
        textViewSewingKit = findViewById(R.id.textViewSewingKit);
        textViewExtraWagonTarp = findViewById(R.id.textViewExtraWagonTarp);
        textViewFireStartingKit = findViewById(R.id.textViewFireStartingKit);
        textViewWalletAndWeight = findViewById(R.id.textViewWalletAndWeight);

        textViewFood.setText("cost/lb: $1");
        textViewClothing.setText("cost/lb: $7");
        textViewCookingItems.setText("cost/lb: $5");
        textViewOxen.setText("cost/1: $50");
        textViewSpareWagonWheel.setText("cost: $20");
        textViewMedKit.setText("cost/lb: 3");
        textViewBlankets.setText("cost/lb: 2");
        textViewSewingKit.setText("cost/lb: 4");
        textViewExtraWagonTarp.setText("cost/1: $12");
        textViewFireStartingKit.setText("cost/lb: $7");
        textViewWalletAndWeight.setText("Wallet: " + Wagon.getWallet + " Weight: " + Wagon.getWeight);

    }


    public void FoodButtonClicked(View view){
        if(Wagon.getWallet >= 1 && Wagon.getWeight >= 1){
            //the array for items increments by 1
            Wagon.addItems(0,1);
            Wagon.setWeight(?)
            textViewWalletAndWeight.setText("Wallet: " + Wagon.getWallet + " Weight: " + Wagon.getWeight);
        }
    }


    // when storeBtn is clicked, it will go back to main activity
    public void storeBtnClicked(View view){
        Intent intent = new Intent(this, MainActivity.class);
        intent.putExtra("isFirstTime", false);
        startActivity(intent);
    }

    /**
     * allows the user to purchase items they want at the beginning of the game
     * @param position the position in the array of that item(0-9).
     * @param amountOfMoney the amount of money the player currently has
     */
    public void purchaseItems(int position,int amountOfMoney){

//        userOutputBox.setText("Type the number of the item you want to purchase or type 'exit' to quit ");
//
//        while(playerExitStore == false){
//
//            userOutputStatsBox.setText("Money remaining: " + wallet stored in wagon );
//
//            for(int i = 0; i<10; i++){
//                userOutputBox.setText("cost: " + items.i.cost + " itemname: " + items.i.itemname + " - " + items.i.itemDescription);
//            }
//
//            int userSelection = Integer.parseInt(userInputBox.getText().toString());
//
//            btnClicked;
//
//            items.userSelection.amountAvailable = 0;
//
//
//
//        }




    }


    /**
     * subtracts the users total money from the cost of the item they are purchasing
     * @param position the position in the array of that item(0-9).
     * @param amountOfMoney the amount of money the player currently has
     */
    public void moneyUsed(int position,int amountOfMoney){
        itemsArray[position].moneyUsed(amountOfMoney);
    }



}
