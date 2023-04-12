package com.example.oregontrail;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class Intro extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.intro);
    }

    public void introBtnClicked(View view){
        Intent intent = new Intent(this, Store.class);
        startActivity(intent);
    }
}
