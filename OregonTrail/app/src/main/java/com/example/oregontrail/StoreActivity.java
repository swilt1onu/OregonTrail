package com.example.oregontrail;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

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
public class StoreActivity extends AppCompatActivity {

    Wagon wagon;


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
//    Items Food = new Items(20, 1, "Food0", "food description");
//    Items Clothing = new Items(3.2, 1, "Clothing1", "Clothing Description");
//    Items CookingItems = new Items(2.5, 1, "CookingItems2", "Cooking Item Description" );
//    Items Oxen = new Items(90, 1, "Oxen", " Oxen Description3");
//    Items SpareWagonWheel = new Items(8, 1, "SpareWagonWheel4", "SpareWagonWheel Description");
//    Items MedKit = new Items(3, 1, "Medkit5", "Medkit Description");
//    Items Blankets = new Items(1, 1, "Blankets6", "Blanket Description");
//    Items SewingKit = new Items(2, 1, "SewingKit7", "SewingKit Description" );
//    Items ExtraWagonTarp = new Items(6, 1, "ExtraWagonTarp8", "Description extrawagontarp");
//    Items FireStartingKit = new Items(.60, 1, "FireStartingKit9", "fireStartingKit description");
//
//    //array of objects that contains all the items to be accessed easier within the program
//    Items[] itemsArray = {Food, Clothing,CookingItems,Oxen ,SpareWagonWheel ,MedKit ,Blankets , SewingKit,ExtraWagonTarp , FireStartingKit};
//



    //is created when the store is created.
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.store);

        wagon = new Wagon();

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
        textViewOxen.setText("cost: $50 weight 0");
        textViewSpareWagonWheel.setText("cost: $20 weight: 30");
        textViewMedKit.setText("cost/lb: 3");
        textViewBlankets.setText("cost/lb: 2");
        textViewSewingKit.setText("cost/lb: 4");
        textViewExtraWagonTarp.setText("cost: $12 weight: 2");
        textViewFireStartingKit.setText("cost/lb: $7");
        textViewWalletAndWeight.setText("Wallet: " + wagon.getWallet() + " Weight: " + wagon.getWeight());

    }


    public void foodButtonClicked(View view){ purchase(0,1); }
    public void clothesButtonClicked(View view){ purchase(1,1); }
    public void cookingItemsButtonClicked(View view){ purchase(2,1); }
    public void oxenButtonClicked(View view){ purchase(3,1); }
    public void spareWheelButtonClicked(View view){ purchase(4,1); }
    public void medKitButtonClicked(View view){ purchase(5,1);}
    public void blanketButtonClicked(View view) { purchase(6,1);}
    public void sewingKitButtonClicked(View view) { purchase(7,1);}
    public void extraTarpClicked(View view ) {purchase(8,1);}
    public void fireStartingKitButtonClicked (View view) { purchase (9,1);}

    // when storeBtn is clicked, it will go back to main activity
    public void storeBtnClicked(View view){
        Intent intent = new Intent(this, MainActivity.class);
        intent.putExtra("isFirstTime", false);
        intent.putExtra("wagon object", wagon);
        startActivity(intent);
    }

    private void purchase(int itemIndex, int itemNum){
        if(wagon.canPurchase(itemIndex,itemNum)){
            //the array for items increments by 1
            wagon.addItems(itemIndex, itemNum);
            textViewWalletAndWeight.setText("Wallet: " + wagon.getWallet() + " Weight: " + wagon.getWeight());
        }
    }
}
