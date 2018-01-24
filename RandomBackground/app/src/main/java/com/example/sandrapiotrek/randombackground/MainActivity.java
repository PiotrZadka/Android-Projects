package com.example.sandrapiotrek.randombackground;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void randomBackground(View v){
        int[]Colors = {Color.BLUE, Color.GREEN, Color.RED, Color.CYAN, Color.MAGENTA, Color.GRAY};
        Random rand = new Random();
        int randomInt = rand.nextInt((Colors.length));
        this.getWindow().getDecorView().getRootView().setBackgroundColor(Colors[randomInt]);
    }
}
