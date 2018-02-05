package com.example.visha.buskim;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


/**
 * Created by visha on 11/7/2015.
 */
public class jamoleisgot extends Activity {

    private Button  button3, button4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.intermediate
        );
        button3 = (Button) findViewById(R.id.button3);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //When click button do...
                Intent l = new Intent(jamoleisgot.this, minhyukIsHot.class);
                startActivity(l);
            }
        });
        button4 = (Button) findViewById(R.id.button4);
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //When click button do...
             //   Intent l = new Intent(jamoleisgot.this, MainActivity.class);
               // startActivity(l);
            }
        });

    }
}
