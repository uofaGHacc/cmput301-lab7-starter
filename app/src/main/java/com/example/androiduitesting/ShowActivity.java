package com.example.androiduitesting;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class ShowActivity extends AppCompatActivity {
    Button backButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show);
        backButton = findViewById(R.id.back_button);
        backButton.setOnClickListener(v -> {
            finish();
        });
        String cityName = getIntent().getStringExtra("CITY_NAME");
        TextView cityNameView = (TextView)findViewById(R.id.city_name);
        cityNameView.setText(cityName);
    }
}

// https://www.tutorialspoint.com/how-to-switch-between-different-activities-in-android
// https://stackoverflow.com/questions/2091465/how-do-i-pass-data-between-activities-in-android-application
// https://stackoverflow.com/questions/4038479/android-go-back-to-previous-activity