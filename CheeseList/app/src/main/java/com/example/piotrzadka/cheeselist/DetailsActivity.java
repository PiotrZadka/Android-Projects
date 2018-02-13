package com.example.piotrzadka.cheeselist;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

public class DetailsActivity extends AppCompatActivity {

    TextView title, details;
    ImageView cheeseImage;
    String cheeseLabel, cheeseDesc, cheeseImageName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        // get the intent
        Bundle extras = getIntent().getExtras();

        // create a cheese object from the cheese object that was passed over from
        // the MainActivity. Notice you use the key ('cheese') to retrieve the value/variable needed.
        Cheese cheese = (Cheese) extras.get("cheese");
        cheeseLabel = cheese.getName();
        cheeseDesc = cheese.getDetails();
        cheeseImageName = cheese.getName().toLowerCase();

        // Get elements from activity
        title = findViewById(R.id.cheeseLabel);
        details = findViewById(R.id.cheeseDesc);
        cheeseImage = findViewById(R.id.cheeseImg);

        // replace all spaces to -
        cheeseImageName = cheeseImageName.replaceAll(" ","-");
        String imageURL = "http://radikaldesign.co.uk/sandbox/cheese_images/"+cheeseImageName+".jpg";

        //Set image
        try {
            URL url = new URL(imageURL);
            //System.out.println(url);
            //Get image from provided website
            Bitmap bmp = BitmapFactory.decodeStream(url.openConnection().getInputStream());
            //Set elements image
            cheeseImage.setImageBitmap(bmp);

        } catch (IOException e) {
            e.printStackTrace();
        }

        // Set title and  details
        title.setText(String.valueOf(cheeseLabel));
        details.setText(String.valueOf(cheeseDesc));
    }
}
