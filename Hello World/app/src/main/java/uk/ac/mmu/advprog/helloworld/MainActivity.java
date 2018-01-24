package uk.ac.mmu.advprog.helloworld;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void changeRed(View v){
        this.getWindow().getDecorView().getRootView().setBackgroundColor(Color.RED);
    }

    public void changeBlue(View v){
        this.getWindow().getDecorView().getRootView().setBackgroundColor(Color.BLUE);
    }


}
