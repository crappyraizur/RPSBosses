package com.pew.crappyraizur.rpsbosses;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class BossOne extends AppCompatActivity {
    //Rock paper scizzah against boss
    //TODO: implement boss class and use it for the user to fight the boss

    TextView userScore;
    TextView bossScore;

    TextView userChoice;
    TextView bossChoice;

    TextView gameState;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_boss_one);
    }
}
