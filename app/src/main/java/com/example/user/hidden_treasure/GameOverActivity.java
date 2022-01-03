package com.example.user.hidden_treasure;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class GameOverActivity extends AppCompatActivity {

    public TextView result;
    public Button restart;

    public void init(){

        result = (TextView)findViewById(R.id.result);
        restart = (Button)findViewById(R.id.restart);


                Intent r = getIntent();
                String r2 = r.getStringExtra("scorevalue");
                result.setText(String.valueOf(r2));

        restart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent backspace = new Intent(GameOverActivity.this,PlayActivity.class);
                startActivity(backspace);

            }
        });







    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game_over);
        init();
    }
}
