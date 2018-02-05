package com.example.visha.buskim;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Typeface;
import android.location.Location;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 * Created by visha on 11/7/2015.
 */
public class nishalIsGot extends AppCompatActivity {

private static Button button2;
private Context context;

    // A shared variable between your threads
    // Call this code in a while loop with a sleep (eg wait 2s before each loop)
//    MyLocation myLocation = new MyLocation();
//    myLocation.getLocation(this, locationResult);
    //take the whole location result block and put it in the loop
    // in the gotLocation set the shared variable
    // optionally you can run the code that you would run when the location updates in this block
@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    context = this;
        setContentView(R.layout.distance);
    button2 = (Button) findViewById(R.id.button2);
           button2.setText("Loading...");
        //Thread.sleep(10000);
        final MyLocation.LocationResult locationResult = new MyLocation.LocationResult() {
            @Override
            //   if(MainActivity.Time)
            public void gotLocation(Location location) {
                //Got the location!

                MainActivity.currentLat = location.getLatitude();
                MainActivity.currentLong = location.getLongitude();
                Log.d("test", "lat: " + location.getLatitude() + " lon: " + location.getLongitude());
            }

        };
        MyLocation myLocation = new MyLocation();
        myLocation.getLocation(this, locationResult);


    //double distance = Math.sqrt((MainActivity.currentLat - MainActivity.latFinal) * (MainActivity.currentLat - MainActivity.latFinal) + (MainActivity.currentLong - MainActivity.longFinal) * (MainActivity.currentLong - MainActivity.longFinal)) * 63.474249;
    double distanceCorrect = distFrom(MainActivity.currentLat,MainActivity.currentLong,MainActivity.latFinal,MainActivity.longFinal);
    double roundedDistance = Math.round((distanceCorrect * 100) * 10) / 1000.0;
    button2.setText("Distance: " + roundedDistance + " miles");
        button2.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            //When click button do...

            MyLocation myLocation = new MyLocation();
            myLocation.getLocation(context, locationResult);

            double distanceCorrect = distFrom(MainActivity.currentLat,MainActivity.currentLong,MainActivity.latFinal,MainActivity.longFinal);
            double roundedDistance = Math.round((distanceCorrect * 100) * 10) / 1000.0;
            button2.setText("Distance: " + roundedDistance + " miles");
            //Intent l = new Intent(minhyukIsHot.this, MainActivity.class);
            //startActivity(l);

        }
    });



    }


    public static double distFrom(double lat1, double lng1, double lat2, double lng2) {
        double earthRadius = 3958.75; // miles (or 6371.0 kilometers)
        double dLat = Math.toRadians(lat2-lat1);
        double dLng = Math.toRadians(lng2-lng1);
        double sindLat = Math.sin(dLat / 2);
        double sindLng = Math.sin(dLng / 2);
        double a = Math.pow(sindLat, 2) + Math.pow(sindLng, 2)
                * Math.cos(Math.toRadians(lat1)) * Math.cos(Math.toRadians(lat2));
        double c = 2 * Math.atan2(Math.sqrt(a), Math.sqrt(1-a));
        double dist = earthRadius * c;

        return dist;
    }
}
