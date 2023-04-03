package com.example.oregontrail;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    //starts with a long string of text explaining tne context of the situation
    //from nebraska to ...
    //starts off in the first store, allows the player to buy items
    //accessing the wagon class to store the items
    //then access the trail class to encounter the first obstacle / first day.
    //current weather and party health will be displayed in an "edittext" box




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


