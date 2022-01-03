package com.example.user.hidden_treasure;

import android.content.Intent;
import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class PlayActivity extends AppCompatActivity {

    int count=30,i,j,r1,r2,r3,put=0;
    double score=0;
    public TextView time,scoretext;
    public Button start;
    public Button[][] b = new Button[4][4];

    public void init(){

        b[0][0]=(Button)findViewById(R.id.b00);
        b[0][1]=(Button)findViewById(R.id.b01);
        b[0][2]=(Button)findViewById(R.id.b02);
        b[0][3]=(Button)findViewById(R.id.b03);
        b[1][0]=(Button)findViewById(R.id.b10);
        b[1][1]=(Button)findViewById(R.id.b11);
        b[1][2]=(Button)findViewById(R.id.b12);
        b[1][3]=(Button)findViewById(R.id.b13);
        b[2][0]=(Button)findViewById(R.id.b20);
        b[2][1]=(Button)findViewById(R.id.b21);
        b[2][2]=(Button)findViewById(R.id.b22);
        b[2][3]=(Button)findViewById(R.id.b23);
        b[3][0]=(Button)findViewById(R.id.b30);
        b[3][1]=(Button)findViewById(R.id.b31);
        b[3][2]=(Button)findViewById(R.id.b32);
        b[3][3]=(Button)findViewById(R.id.b33);
        start=(Button)findViewById(R.id.start);

        time=(TextView)findViewById(R.id.time);
        scoretext=(TextView)findViewById(R.id.score);

        start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                put = 1;
                for(i=0;i<=3;i++){

                    for(j=0;j<=3;j++){

                        b[i][j].setText("");


                    }
                }
                new CountDownTimer(31000,1000) {
                    @Override
                    public void onTick(long millisUntilFinished) {

                        time.setText("Time :"+String.valueOf(count));
                        count--;
                        if(count==0){

                            Intent gameover = new Intent(PlayActivity.this,GameOverActivity.class);
                            startActivity(gameover);

                            Intent transfer = new Intent(PlayActivity.this,GameOverActivity.class);
                            transfer.putExtra("scorevalue",scoretext.getText());
                            startActivityForResult(transfer,1);
                            score=0;
                            scoretext.setText("Score = 00");

                        }
                    }

                    @Override
                    public void onFinish() {

                    }
                }.start();


            }
        });
        b[0][0].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(put==1){

                    for(i=0;i<=3;i++){

                        for(j=0;j<=3;j++){

                            b[i][j].setText("");


                        }

                    }
                    Random r = new Random();

                    r1 = r.nextInt(10);

                    r2 = r1%10;
                    r3 = r1%100;
                    if(r2%2==0 && r1!=0){

                        score = score + r1;
                        b[0][0].setText(String.valueOf(r1)+"Coins!");
                        scoretext.setText("Score ="+String.valueOf(score));


                    }
                    else{

                        b[0][0].setText("X");

                    }


                }



            }
        });
        b[0][1].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(put==1){

                    for(i=0;i<=3;i++){

                        for(j=0;j<=3;j++){

                            b[i][j].setText("");


                        }

                    }

                    Random r = new Random();

                    r1 = r.nextInt(10);

                    r2 = r1%10;
                    r3 = r1%100;
                    if(r2%2==0 && r1!=0){

                        score = score + r1;
                        b[0][1].setText(String.valueOf(r1)+"Coins!");
                        scoretext.setText("Score ="+String.valueOf(score));


                    }
                    else{

                        b[0][1].setText("X");

                    }




                }


            }
        });
        b[0][2].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(put==1){


                    for(i=0;i<=3;i++){

                        for(j=0;j<=3;j++){

                            b[i][j].setText("");


                        }

                    }

                    Random r = new Random();

                    r1 = r.nextInt(10);

                    r2 = r1%10;
                    r3 = r1%100;
                    if(r2%2==0 && r1!=0){

                        score = score + r1;
                        b[0][2].setText(String.valueOf(r1)+"Coins!");
                        scoretext.setText("Score ="+String.valueOf(score));


                    }
                    else{

                        b[0][2].setText("X");

                    }


                }



            }
        });
        b[0][3].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(put==1){

                    for(i=0;i<=3;i++){

                        for(j=0;j<=3;j++){

                            b[i][j].setText("");


                        }

                    }

                    Random r = new Random();

                    r1 = r.nextInt(10);

                    r2 = r1%10;
                    r3 = r1%100;
                    if(r2%2==0 && r1!=0){

                        score = score + r1;
                        b[0][3].setText(String.valueOf(r1)+"Coins!");
                        scoretext.setText("Score ="+String.valueOf(score));


                    }
                    else{

                        b[0][3].setText("X");

                    }


                }



            }
        });
        b[1][0].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(put==1){

                    for(i=0;i<=3;i++){

                        for(j=0;j<=3;j++){

                            b[i][j].setText("");


                        }

                    }

                    Random r = new Random();

                    r1 = r.nextInt(10);

                    r2 = r1%10;
                    r3 = r1%100;
                    if(r2%2==0 && r1!=0){

                        score = score + r1;
                        b[1][0].setText(String.valueOf(r1)+"Coins!");
                        scoretext.setText("Score ="+String.valueOf(score));


                    }
                    else{

                        b[1][0].setText("X");

                    }




                }


            }
        });
        b[1][1].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(put==1){


                    for(i=0;i<=3;i++){

                        for(j=0;j<=3;j++){

                            b[i][j].setText("");


                        }

                    }

                    Random r = new Random();

                    r1 = r.nextInt(10);

                    r2 = r1%10;
                    r3 = r1%100;
                    if(r2%2==0 && r1!=0){

                        score = score + r1;
                        b[1][1].setText(String.valueOf(r1)+"Coins!");
                        scoretext.setText("Score ="+String.valueOf(score));


                    }
                    else{

                        b[1][1].setText("X");

                    }



                }


            }
        });
        b[1][2].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(put==1){


                    for(i=0;i<=3;i++){

                        for(j=0;j<=3;j++){

                            b[i][j].setText("");


                        }

                    }

                    Random r = new Random();

                    r1 = r.nextInt(10);

                    r2 = r1%10;
                    r3 = r1%100;
                    if(r2%2==0 && r1!=0){

                        score = score + r1;
                        b[1][2].setText(String.valueOf(r1)+"Coins!");
                        scoretext.setText("Score ="+String.valueOf(score));


                    }
                    else{

                        b[1][2].setText("X");

                    }


                }



            }
        });
        b[1][3].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(put==1){

                    for(i=0;i<=3;i++){

                        for(j=0;j<=3;j++){

                            b[i][j].setText("");


                        }

                    }

                    Random r = new Random();

                    r1 = r.nextInt(10);

                    r2 = r1%10;
                    r3 = r1%100;
                    if(r2%2==0 && r1!=0){

                        score = score + r1;
                        b[1][3].setText(String.valueOf(r1)+"Coins!");
                        scoretext.setText("Score ="+String.valueOf(score));


                    }
                    else{

                        b[1][3].setText("X");

                    }



                }


            }
        });
        b[2][0].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(put==1){


                    for(i=0;i<=3;i++){

                        for(j=0;j<=3;j++){

                            b[i][j].setText("");


                        }

                    }

                    Random r = new Random();

                    r1 = r.nextInt(10);

                    r2 = r1%10;
                    r3 = r1%100;
                    if(r2%2==0 && r1!=0){

                        score = score + r1;
                        b[2][0].setText(String.valueOf(r1)+"Coins!");
                        scoretext.setText("Score ="+String.valueOf(score));


                    }
                    else{

                        b[2][0].setText("X");

                    }


                }



            }
        });
        b[2][1].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(put==1){


                    for(i=0;i<=3;i++){

                        for(j=0;j<=3;j++){

                            b[i][j].setText("");


                        }

                    }

                    Random r = new Random();

                    r1 = r.nextInt(10);

                    r2 = r1%10;
                    r3 = r1%100;
                    if(r2%2==0 && r1!=0){

                        score = score + r1;
                        b[2][1].setText(String.valueOf(r1)+"Coins!");
                        scoretext.setText("Score ="+String.valueOf(score));


                    }
                    else{

                        b[2][1].setText("X");

                    }



                }


            }
        });
        b[2][2].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(put==1){


                    for(i=0;i<=3;i++){

                        for(j=0;j<=3;j++){

                            b[i][j].setText("");


                        }

                    }

                    Random r = new Random();

                    r1 = r.nextInt(10);

                    r2 = r1%10;
                    r3 = r1%100;
                    if(r2%2==0 && r1!=0){

                        score = score + r1;
                        b[2][2].setText(String.valueOf(r1)+"Coins!");
                        scoretext.setText("Score ="+String.valueOf(score));


                    }
                    else{

                        b[2][2].setText("X");

                    }



                }


            }
        });
        b[2][3].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                if(put==1){

                    for(i=0;i<=3;i++){

                        for(j=0;j<=3;j++){

                            b[i][j].setText("");


                        }

                    }

                    Random r = new Random();

                    r1 = r.nextInt(10);

                    r2 = r1%10;
                    r3 = r1%100;
                    if(r2%2==0 && r1!=0){

                        score = score + r1;
                        b[2][3].setText(String.valueOf(r1)+"Coins!");
                        scoretext.setText("Score ="+String.valueOf(score));


                    }
                    else{

                        b[2][3].setText("X");

                    }



                }



            }
        });
        b[3][0].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                if(put==1){

                    for(i=0;i<=3;i++){

                        for(j=0;j<=3;j++){

                            b[i][j].setText("");


                        }

                    }

                    Random r = new Random();

                    r1 = r.nextInt(10);

                    r2 = r1%10;
                    r3 = r1%100;
                    if(r2%2==0 && r1!=0){

                        score = score + r1;
                        b[3][0].setText(String.valueOf(r1)+"Coins!");
                        scoretext.setText("Score ="+String.valueOf(score));


                    }
                    else{

                        b[3][0].setText("X");

                    }


                }



            }
        });
        b[3][1].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(put==1){



                    for(i=0;i<=3;i++){

                        for(j=0;j<=3;j++){

                            b[i][j].setText("");


                        }

                    }

                    Random r = new Random();

                    r1 = r.nextInt(10);

                    r2 = r1%10;
                    r3 = r1%100;
                    if(r2%2==0 && r1!=0){

                        score = score + r1;
                        b[3][1].setText(String.valueOf(r1)+"Coins!");
                        scoretext.setText("Score ="+String.valueOf(score));


                    }
                    else{

                        b[3][1].setText("X");

                    }



                }



            }
        });
        b[3][2].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                if(put==1){



                    for(i=0;i<=3;i++){

                        for(j=0;j<=3;j++){

                            b[i][j].setText("");


                        }

                    }
                    Random r = new Random();

                    r1 = r.nextInt(10);

                    r2 = r1%10;
                    r3 = r1%100;
                    if(r2%2==0 && r1!=0){

                        score = score + r1;
                        b[3][2].setText(String.valueOf(r1)+"Coins!");
                        scoretext.setText("Score ="+String.valueOf(score));


                    }
                    else{

                        b[3][2].setText("X");

                    }





                }



            }
        });
        b[3][3].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                if(put==1){


                    for(i=0;i<=3;i++){

                        for(j=0;j<=3;j++){

                            b[i][j].setText("");


                        }

                    }

                    Random r = new Random();

                    r1 = r.nextInt(10);

                    r2 = r1%10;
                    r3 = r1%100;
                    if(r2%2==0 && r1!=0){

                        score = score + r1;
                        b[3][3].setText(String.valueOf(r1)+"Coins!");
                        scoretext.setText("Score ="+String.valueOf(score));


                    }
                    else{

                        b[3][3].setText("X");

                    }




                }



            }
        });








    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_play);
        init();
    }
}
