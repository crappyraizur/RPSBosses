package com.pew.crappyraizur.rpsbosses;

/**
 * Created by ziizo on 12/5/2017.
 */
import java.util.Random;


public class BossClass {
    int bossLevel;
    int bossChoice = 1;
    Random rand = new Random();
    String play;
    public BossClass(int level){
        bossLevel = level;
    }

    public String play(String userInput){
        String[] choicesRPS = {"R", "P", "S"};
        String[] choicesRS = {"R", "S"};
        String[] choicesPS = {"P", "S"};
        String[] choicesRP = {"R", "P"};
        if (bossLevel == 1){
            switch(bossChoice) {
                case 1:
                    bossChoice = 2;
                    return "R";
                case 2:
                    bossChoice = 3;
                    return "P";
                case 3:
                    bossChoice = 1;
                    return "S";
            }
        }
        else if (bossLevel == 2){
            switch(bossChoice) {
                case 1:
                    bossChoice = 2;
                    return "P";
                case 2:
                    bossChoice = 3;
                    return "S";
                case 3:
                    bossChoice = 1;
                    return "R";
            }
        }
        else if (bossLevel == 3){
            switch(bossChoice) {
                case 1:
                    bossChoice = 2;
                    return choicesRS[randNum(1,0)];
                case 2:
                    bossChoice = 3;
                    return choicesPS[randNum(1,0)];
                case 3:
                    bossChoice = 1;
                    return "S";
            }
        }
        else if (bossLevel == 4){
            switch(bossChoice) {
                case 1:
                    bossChoice = 2;
                    return choicesRP[randNum(1,0)];
                case 2:
                    bossChoice = 3;
                    return "P";
                case 3:
                    bossChoice = 1;
                    return choicesPS[randNum(1,0)];
            }
        }
        else if (bossLevel == 5){
            switch(bossChoice) {
                case 1:
                    bossChoice = 2;
                    return choicesRPS[randNum(2,0)];
                case 2:
                    bossChoice = 3;
                    return choicesRPS[randNum(2,0)];
                case 3:
                    bossChoice = 1;
                    return choicesRPS[randNum(2,0)];
            }
        }
        return "NOPE";
    }

    private int randNum(int max, int min){
        int  n = rand.nextInt(max) + min;
        return n;
    }

}
