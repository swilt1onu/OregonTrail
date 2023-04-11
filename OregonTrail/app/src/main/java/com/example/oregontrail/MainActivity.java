package com.example.oregontrail;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import com.example.oregontrail.R;

import java.io.Serializable;

/**
 * Class: Main Activity
 * Oregon Trail Project by Selby Wilt & Henry Charles "Renegade Raiders"
 * 4/4/2023
 *
 * starts with a long string of text explaining tne context of the situation
 * will eventually start off in the first store, allows the player to buy items
 * accessing the wagon class to store the items
 * then access the trail class to encounter the first obstacle / first day.
 * current weather and party health will be displayed more in depth in an "edittext" box
 *
 */

public class MainActivity extends AppCompatActivity {

    TextView weatherText;
    TextView dayText;
    Button enterButton;

    //contains the other classes
    Trail trail;
    Wagon wagon;

    RandomEvent randomEvent;
    Party party;

    private boolean isFirstTime = true;


    /**
     * Code executes when the program is started to initially set up the code and contains the xml
     * input, output, and button accessor. It also executes the first dialogue box of text in output box.
     * @param savedInstanceState used by android studio to save the state
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        isFirstTime = getIntent().getBooleanExtra("isFirstTime", true);

        if (isFirstTime){
            Intent intent = new Intent(this, Intro.class);
            intent.putExtra("Main Activity", this.getClass());
            startActivity(intent);
            return;
        }

        weatherText = findViewById(R.id.weatherText);
        dayText = findViewById(R.id.dayText);
        enterButton = findViewById(R.id.enterButton);

        //instantiates the needed classes that will interact with main
        trail = new Trail();
        wagon = new Wagon();
        randomEvent = new RandomEvent();
        party = new Party();

        weatherText.setText(trail.getWeather());
    }


    /**
     * Code executes when the "enter" button is pressed.
     * Will access the trail class in order to update the time and distance traveled
     * also used to confirm input from the user input box
     * @param view - Variable for the view button
     */
    public void btnClicked(View view){
        trail.day();
        weatherText.setText(trail.getWeather());
        dayText.setText(String.valueOf(trail.getDayCount()));
    }


}