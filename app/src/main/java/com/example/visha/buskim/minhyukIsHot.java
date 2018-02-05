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

import java.util.ArrayList;
import java.util.List;


/**
 * Created by visha on 11/7/2015.
 */
public class minhyukIsHot extends Activity {


    private static Button  button2, button7, button8, button9, button10, button11;

@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.route221east);
        button2 = (Button) findViewById(R.id.button2);
        button7 = (Button) findViewById(R.id.button7);
        button8 = (Button) findViewById(R.id.button8);
        button9 = (Button) findViewById(R.id.button9);
        button10 = (Button) findViewById(R.id.button10);
        button11 = (Button) findViewById(R.id.button11);


        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //When click button do...

                MainActivity.latFinal=47.676639;
                MainActivity.longFinal=-122.125684;
                Intent l = new Intent(minhyukIsHot.this, nishalIsGot.class);
                startActivity(l);
            }
        });

        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //When click button do...
                MainActivity.latFinal=47.697962;
                MainActivity.longFinal=-122.132310;
                Intent l = new Intent(minhyukIsHot.this, nishalIsGot.class);
                startActivity(l);
            }
        });

        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //When click button do...
                MainActivity.latFinal=47.6677831;
                MainActivity.longFinal=-122.143110;
                Intent l = new Intent(minhyukIsHot.this, nishalIsGot.class);
                startActivity(l);
            }
        });
        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //When click button do...
                MainActivity.latFinal=47.617006;
                MainActivity.longFinal=-122.132548;
                Intent l = new Intent(minhyukIsHot.this, nishalIsGot.class);
                startActivity(l);
            }
        });

        button10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //When click button do...
                MainActivity.latFinal=47.598120;
                MainActivity.longFinal=-122.121091;
                Intent l = new Intent(minhyukIsHot.this, nishalIsGot.class);
                startActivity(l);
            }
        });
        button11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //When click button do...
                MainActivity.latFinal=47.598120;
                MainActivity.longFinal=-122.153535;
                Intent l = new Intent(minhyukIsHot.this, nishalIsGot.class);
                startActivity(l);
            }
        });


    }
}
