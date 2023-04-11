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

<<<<<<< HEAD

    //starts with a long string of text explaining tne context of the situation
    //from nebraska to ...
    //starts off in the first store, allows the player to buy items
    //accessing the wagon class to store the items
    //then access the trail class to encounter the first obstacle / first day.
    //current weather and party health will be displayed in an "edittext" box

=======
    //sets all the output or input boxes to null, as well as containing the enter button usage.
>>>>>>> main
    TextView OregonTrailTitleLabel = null;

    EditText userOutputBox = null;

    EditText userOutputStatsBox = null;

    EditText userInputBox;

    Button enterButton;
<<<<<<< HEAD
    // edited
=======

    //contains the other classes
    Trail trail;
    Wagon wagon;

    RandomEvent randomEvent;

    Party party;


    /**
     * Code executes when the program is started to initially set up the code and contains the xml
     * input, output, and button accessor. It also executes the first dialogue box of text in output box.
     * @param savedInstanceState used by android studio to save the state
     */
>>>>>>> main
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //boxes listed from top down
        OregonTrailTitleLabel = findViewById(R.id.OregonTrailTitleLabel);

        userOutputBox = findViewById(R.id.userOutputBox);

        userOutputStatsBox = findViewById(R.id.userOutputStatsBox);
<<<<<<< HEAD

        userInputBox = findViewById(R.id.userInputBox);

        enterButton = findViewById(R.id.enterButton);

        userOutputBox.setText("The Trail Starts off in Independence Missouri, your family consisting of You (Hattie Campbell), " +
                "and your other party members want to travel to the west in search of opportunity. You will start out going to the local store to " +
                "prepare for the trip. On the way there will be obstacles and hardship. You have saved up enough money to purchase some survival Items. Press 1 to start");

=======

        userInputBox = findViewById(R.id.userInputBox);

        enterButton = findViewById(R.id.enterButton);

        userOutputBox.setText("The Trail Starts off in Independence Missouri, your family consisting of You (Hattie Campbell), " +
                "and your other party members want to travel to the west in search of opportunity. You will start out going to the local store to " +
                "prepare for the trip. On the way there will be obstacles and hardship. You have saved up enough money to purchase some survival Items. Press 1 to start");

        //instantiates the needed classes that will interact with main
        trail = new Trail();
        wagon = new Wagon();
        randomEvent = new RandomEvent();
        party = new Party();
>>>>>>> main

    }


<<<<<<< HEAD

    public void btnClicked(View view){
        Log.i("MainActivity", userInputBox.getText().toString());

        if(Integer.parseInt(userInputBox.getText().toString()) == 1){

            userOutputBox.setText("2");
        }
        else{
            userOutputBox.setText("3");
        }
    }


}
=======
    /**
     * Code executes when the "enter" button is pressed.
     * Will access the trail class in order to update the time and distance traveled
     * also used to confirm input from the user input box
     * @param view - Variable for the view button
     */
    public void btnClicked(View view){
        Log.i("MainActivity", userInputBox.getText().toString());

        //checks to see if the user has typed 1 to start the game.
        if(Integer.parseInt(userInputBox.getText().toString()) == 1){
            //accessor for the day function in trail class
            trail.Day();
            userOutputBox.setText("User typed 1");
            userOutputStatsBox.setText("Weather: " + trail.getWeather() + "Date: " + trail.getDayCount() + "/" + trail.getMonth() + "\nDistance Travel: " + trail.getDistance() );
        }
        else{
            userOutputBox.setText("error");
        }
    }
>>>>>>> main


}