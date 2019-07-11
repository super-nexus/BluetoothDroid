package com.andrija.bluetoothdroid;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

import java.util.ArrayList;

public class SetupActivity extends AppCompatActivity {

    ArrayList<Integer> pins;
    final static int numberOfPins = 31;

    private int currentlySelected = 1;
    boolean pwmEnabled = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_setup);

        Spinner pinSpinner = findViewById(R.id.pinSpinner);
        Spinner pwmSpinner = findViewById(R.id.pwmSpinner);

        ArrayAdapter<String> pwmAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, getResources().getStringArray(R.array.pwm));
        pwmAdapter.setDropDownViewResource(R.layout.support_simple_spinner_dropdown_item);

        fillPins();

        pinSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                currentlySelected = i;
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
            }
        });

        pwmSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                if(i == 1){
                    pwmEnabled = true;
                    return;
                }
                pwmEnabled = false;
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

        ArrayAdapter<Integer> pinsAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, pins);
        pinsAdapter.setDropDownViewResource(R.layout.support_simple_spinner_dropdown_item);

        pinSpinner.setAdapter(pinsAdapter);
        pwmSpinner.setAdapter(pwmAdapter);

        Button addButton = findViewById(R.id.addButton);

        addButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

    }

    protected void fillPins(){

        pins = new ArrayList<>();

        for (int i = 0; i < numberOfPins; i++){
            pins.add(i);
        }
    }

}
