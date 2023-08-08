package com.example.bcseacalc;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Arrays;

public class scienceCalc extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.science);

        Button Submit = findViewById(R.id.Submit);
        Submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText engMarkEditText = findViewById(R.id.eng_mark);
                EditText dzoMarkEditText = findViewById(R.id.dzo_mark);
                EditText matMarkEditText = findViewById(R.id.mat_mark);
                EditText bioMarkEditText = findViewById(R.id.bio_mark);
                EditText cheMarkEditText = findViewById(R.id.che_mark);
                EditText phyMarkEditText = findViewById(R.id.phy_mark);

                String engMarkString = engMarkEditText.getText().toString();
                double engMark = Double.parseDouble(engMarkString);


                double[] marks = {
                        Double.parseDouble(matMarkEditText.getText().toString()),
                        Double.parseDouble(bioMarkEditText.getText().toString()),
                        Double.parseDouble(dzoMarkEditText.getText().toString()),
                        Double.parseDouble(cheMarkEditText.getText().toString()),
                        Double.parseDouble(phyMarkEditText.getText().toString())
                };

                Arrays.sort(marks);
                int length = marks.length;

                double thirdHighest = marks[length - 3];
                double secondHighest = marks[length - 2];
                double highest = marks[length - 1];

                double res = engMark + thirdHighest + secondHighest + highest;
                double result = res/4;


                Intent intent = new Intent(scienceCalc.this, result.class);
                intent.putExtra("result", result);
                startActivity(intent);
            }
        });
    }


}