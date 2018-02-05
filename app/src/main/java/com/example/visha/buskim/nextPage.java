package com.example.visha.buskim;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

/**
 * Created by visha on 11/7/2015.
 */
public class nextPage extends Activity {

    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tinaisnothot);
        button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //When click button do...
            }
        });
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //When click button do....
                Intent i = new Intent(nextPage.this, jamoleisgot.class);
                startActivity(i);
            }
        });
      /*  imageButton2 = (ImageButton) findViewById(R.id.imageButton2);
      imageButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(nextPage.this, MainActivity.class);
                startActivity(i);
            }
        });*/
}
}
