package com.example.oregontrail;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.oregontrail.R;

public class MainActivity extends AppCompatActivity {


    //starts with a long string of text explaining tne context of the situation
    //from nebraska to ...
    //starts off in the first store, allows the player to buy items
    //accessing the wagon class to store the items
    //then access the trail class to encounter the first obstacle / first day.
    //current weather and party health will be displayed in an "edittext" box

    TextView OregonTrailTitleLabel = null;

    EditText userOutputBox = null;

    EditText userOutputStatsBox = null;

    EditText userInputBox;

    Button enterButton;
    // edited
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //boxes listed from top down
        OregonTrailTitleLabel = findViewById(R.id.OregonTrailTitleLabel);

        userOutputBox = findViewById(R.id.userOutputBox);

        userOutputStatsBox = findViewById(R.id.userOutputStatsBox);

        userInputBox = findViewById(R.id.userInputBox);

        enterButton = findViewById(R.id.enterButton);

        userOutputBox.setText("The Trail Starts off in Independence Missouri, your family consisting of You (Hattie Campbell), " +
                "and your other party members want to travel to the west in search of opportunity. You will start out going to the local store to " +
                "prepare for the trip. On the way there will be obstacles and hardship. You have saved up enough money to purchase some survival Items. Press 1 to start");


    }

Trail trail = new Trail();
    Wagon wagon = new Wagon();
    RandomEvent event = new RandomEvent();
    Party party = new Party();


    public void btnClicked(View view){
        Log.i("MainActivity", userInputBox.getText().toString());

        if(Integer.parseInt(userInputBox.getText().toString()) == 1){
            trail.Day();
            userOutputBox.setText("2");
            userOutputStatsBox.setText("Weather: " + trail.getWeather() + "Date: " + trail.getDayCount() + "/" + trail.getMonth() "/" + trai);
        }
        else{
            userOutputBox.setText("3");
        }
    }


}