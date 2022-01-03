package com.example.user.hidden_treasure;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    public ImageButton play,exit;

    public void init(){


        play = (ImageButton) findViewById(R.id.play);
        exit = (ImageButton) findViewById(R.id.exit);

        play.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent play = new Intent(MainActivity.this,PlayActivity.class);
                startActivity(play);

            }
        });

        exit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                System.exit(0);



            }
        });



    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
    }
}
