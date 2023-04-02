package com.example.oregontrail;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {




    //ask the user for the amount of item 0 (in weight or quantity) they want to purchase
    //check to see if the user has enough money
    //check to see if the amount available the user wants is available
    //adds the item amount to the wagon / inventory.




    // edited
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //boxes listed from top down
        final TextView OregonTrailTitleLabel = findViewById(R.id.OregonTrailTitleLabel);

        final EditText userOutputBox = findViewById(R.id.userOutputBox);

        final EditText userOutputStatsBox = findViewById(R.id.userOutputStatsBox);

        final EditText userInputBox = findViewById(R.id.userInputBox);

        
    }

}


