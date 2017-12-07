package com.pew.crappyraizur.rpsbosses;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class LevelScreen extends AppCompatActivity {
    //TODO: Ability to choose first boss then it unlocks second one after you beat them
    //TODO: if all bosses are dead you can choose which one to play against.

    Button level1;
    Button level2;
    Button level3;
    Button level4;
    Button level5;
    Button home;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_level_screen);

        level1 = findViewById(R.id.levelOneButton);
        level2 = findViewById(R.id.levelTwoButton);
        level3 = findViewById(R.id.levelThreeButton);
        level4 = findViewById(R.id.levelFourButton);
        level5 = findViewById(R.id.levelFiveButton);
        home = findViewById(R.id.home);

        level1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent menuToLevel = new Intent(LevelScreen.this, BossOne.class);
                startActivity(menuToLevel);
            }
        });

        level2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent menuToLevel = new Intent(LevelScreen.this, BossTwo.class);
                startActivity(menuToLevel);
            }
        });

        level3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent menuToLevel = new Intent(LevelScreen.this, BossThree.class);
                startActivity(menuToLevel);
            }
        });

        level4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent menuToLevel = new Intent(LevelScreen.this, BossFour.class);
                startActivity(menuToLevel);
            }
        });

        level5.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent menuToLevel = new Intent(LevelScreen.this, BossFive.class);
                startActivity(menuToLevel);
            }
        });

        home.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent menuToLevel = new Intent(LevelScreen.this, MainMenu.class);
                startActivity(menuToLevel);
            }
        });


    }
}
