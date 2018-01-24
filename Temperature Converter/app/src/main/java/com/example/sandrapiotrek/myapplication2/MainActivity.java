package com.example.sandrapiotrek.myapplication2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void convert_onClick(View v){
        // convert temp based on radio button that is selected
        EditText displayTemp = findViewById(R.id.convertField);
        RadioButton farTemp = findViewById(R.id.farRadio);
        double temperature = Double.parseDouble(displayTemp.getText().toString());
        double convTemp;

        if(farTemp.isChecked()){
            //Celsius to Fahrenheit	° F = 9/5 ( ° C) + 32
            convTemp = 9.0 / 5 * temperature + 32;
            displayTemp.setText(String.valueOf(convTemp));

        }
        else{
            //Fahrenheit to Celcius ° C = 5/9 (° F - 32)
            convTemp =  ((temperature - 32)*5)/9;
            displayTemp.setText(String.valueOf(convTemp));
        }
    }

    public void setTextFar_onClick(View v){
        EditText displayTemp = findViewById(R.id.convertField);
        RadioButton farTemp = findViewById(R.id.farRadio);

        displayTemp.setHint("Celcius");
        farTemp.setChecked(true);
    }

    public void setTextCelc_onClick(View v) {
        EditText displayTemp = findViewById(R.id.convertField);
        RadioButton celcTemp = findViewById(R.id.celcRadio);

        displayTemp.setHint("Fahrenheit");
        celcTemp.setChecked(true);
    }
}
