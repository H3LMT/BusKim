package com.example.visha.buskim;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.location.Location;


public class MainActivity extends AppCompatActivity {
    public static double longFinal=0.0;
    public static double latFinal=0.0;
    public static double currentLong = 0.0;
    public static double currentLat = 0.0;
    //public static Calendar c = Calendar.getInstance();
    public static int currentTime = -1;

    private TextView textView;
    private ImageButton imageButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        /*textView = (TextView) findViewById(R.id.textView2);
        Typeface type = Typeface.createFromAsset(getAssets(),"Fonts/Roboto-Black.ttf");
        textView.setTypeface(type);*/
        imageButton = (ImageButton) findViewById(R.id.imageButton);
        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, nextPage.class);
                startActivity(i);
            }
        });

    }
}
