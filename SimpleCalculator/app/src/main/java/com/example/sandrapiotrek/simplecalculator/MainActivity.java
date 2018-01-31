package com.example.sandrapiotrek.simplecalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
EditText input;
Button add2,sub2,div2,mult2;
int number1, number2, equals;
String clicked_button;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        input = findViewById(R.id.inputField);
        add2 = findViewById(R.id.add_button);
        sub2 = findViewById(R.id.substract_button);
        div2 = findViewById(R.id.divide_button);
        mult2 = findViewById(R.id.multiply_button);
    }

    // solve equasion
    public void solve_onClick(View v){
        number2 = Integer.parseInt(input.getText().toString());

            switch(clicked_button){
                case "+":
                    equals = number1 + number2;
                    break;
                case "-":
                    equals = number1 - number2;
                    break;
                case "*":
                    equals = number1 * number2;
                    break;
                case "/":
                    equals = number1 / number2;
                    break;
            }

        input.setText(String.valueOf(equals));
    }

    public void clear_onClick(View v){
        input.setText(String.valueOf(""));
    }

    public void add_onClick(View v){
        number1 = Integer.parseInt(input.getText().toString());
        input.setText(String.valueOf(""));
        clicked_button = ((Button) v).getText().toString();
    }

    public void sub_onClick(View v){
        number1 = Integer.parseInt(input.getText().toString());
        input.setText(String.valueOf(""));
        clicked_button = ((Button) v).getText().toString();
    }

    public void multi_onClick(View v){
        number1 = Integer.parseInt(input.getText().toString());
        input.setText(String.valueOf(""));
        clicked_button = ((Button) v).getText().toString();
    }

    public void div_onClick(View v){
        number1 = Integer.parseInt(input.getText().toString());
        input.setText(String.valueOf(""));
        clicked_button = ((Button) v).getText().toString();
    }
}
