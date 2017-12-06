package com.pew.crappyraizur.rpsbosses;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.ViewGroup;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.media.MediaPlayer;
import android.widget.Toast;
import java.util.Timer;

public class BossTwo extends AppCompatActivity {
    //Rock paper scizzah against boss
    //TODO: implement boss class and use it for the user to fight the boss

    TextView userScore;
    TextView bossScore;

    TextView userChoice;
    TextView bossChoice;

    TextView gameState;

    Button rock;
    Button paper;
    Button scissor;

    Context context = this;
    MediaPlayer mp;
    MediaPlayer hit;

    ImageView bossImage;

    String[] returnedStat;

    int userDataScore = 0;
    int bossDataScore= 0;

    String bossHand;


    BossClass boss = new BossClass(2);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_boss_two);

        mp = MediaPlayer.create(context, R.raw.regularbattle);
        hit = MediaPlayer.create(context, R.raw.hit);

        userScore = findViewById(R.id.userScore);
        bossScore = findViewById(R.id.bossScore);

        userChoice = findViewById(R.id.userChoice);
        bossChoice = findViewById(R.id.bossChoice);

        gameState = findViewById(R.id.GameState);

        rock = findViewById(R.id.rock);
        paper = findViewById(R.id.paper);
        scissor = findViewById(R.id.scissor);

        bossImage = findViewById(R.id.bossPic);

        mp.start();


        rock.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                play("R");
                userChoice.setText("Rock");


            }
        });

        paper.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                play("P");
                userChoice.setText("Paper");
            }
        });

        scissor.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                play("S");
                userChoice.setText("Scissor");
            }
        });


    }

    public void play(String userClick){

        // userScore = findViewById(R.id.userScore);
        //  bossScore = findViewById(R.id.bossScore);

        // userChoice = findViewById(R.id.userChoice);
        // bossChoice = findViewById(R.id.userChoice);

        // gameState = findViewById(R.id.GameState);

        // rock = findViewById(R.id.rock);
        // paper = findViewById(R.id.paper);
        // scissor = findViewById(R.id.scissor);


        returnedStat = boss.play(userClick);


        bossHand = bossActionToWord(returnedStat[1]);
        bossChoice.setText(bossHand);



        if(returnedStat[0].contains("won")){
            userDataScore++;
            userScore.setText("your score: " + userDataScore);
            Animation anishake = AnimationUtils.loadAnimation(this, R.anim.shake);
            findViewById(R.id.bossPic).startAnimation(anishake);
            hit.start();
        }

        else if (returnedStat[0].contains("lost")){
            bossDataScore++;
            bossScore.setText("boss score: " + bossDataScore);
        }

        if (userDataScore >= 3){
            Toast.makeText(getApplicationContext(), "You won, you are now able to access the second boss!", Toast.LENGTH_LONG).show();
            mp.stop();
            Intent menuToLevel = new Intent(BossTwo.this, LevelScreen.class);
            startActivity(menuToLevel);
        }

        else if (bossDataScore >=3){
            mp.stop();
            Toast.makeText(getApplicationContext(), "You lost, win against the boss to unlock the next one!", Toast.LENGTH_LONG).show();
            Intent menuToLevel = new Intent(BossTwo.this, LevelScreen.class);
            startActivity(menuToLevel);
        }

        // bossChoice.setText("" + returnedStat[1]);

        gameState.setText("" + returnedStat[0]);

    }

    // the boss is too dumb so you need to transfer his words into real words
    public String bossActionToWord(String bossHand){
        if(bossHand.equals("P"))
            return "Paper";
        else if (bossHand.equals("R"))
            return "Rock";
        else if (bossHand.equals("S"))
            return "Scissor";

        return "You should not get this far";
    }

    public void onDestroy() {
        super.onDestroy();
        mp.stop();

    }

}