package com.pew.crappyraizur.rpsbosses;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class BossOne extends AppCompatActivity {
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

    BossClass boss = new BossClass(1);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_boss_one);

        userScore = findViewById(R.id.userScore);
        bossScore = findViewById(R.id.bossScore);

        userChoice = findViewById(R.id.userChoice);
        bossChoice = findViewById(R.id.userChoice);

        gameState = findViewById(R.id.GameState);

        rock = findViewById(R.id.rock);
        paper = findViewById(R.id.paper);
        scissor = findViewById(R.id.scissor);

    }
}
