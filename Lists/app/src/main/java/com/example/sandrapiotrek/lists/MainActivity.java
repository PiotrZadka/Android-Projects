package com.example.sandrapiotrek.lists;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String[] fruits = {"banana", "orange", "apple", "cherry", "pineapple", "coconut", "blackcurrant", "strawberry",
        "pomegranate","lime","kiwi","melon","fruit1","fruit2","fruit3","fruit4"};
        ListView myList = findViewById(R.id.fruitList);

        // an array adapter to do all the hard work just tell it the (context, the layout, and the data)
        ArrayAdapter arrayAdapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, fruits);
        //set the adapter to the listview
        myList.setAdapter(arrayAdapter);

    }
}
