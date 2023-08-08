package com.example.bcseacalc;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class result extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.result);

        // Retrieve the value of 'result' from the intent
        double result = getIntent().getDoubleExtra("result",0 );

        // Find the TextView in the layout
        TextView resultPercentage = findViewById(R.id.resultPercentage);

        // Set the result value to the TextView
        resultPercentage.setText(String.valueOf(result) + "%");
    }
}