package com.pew.crappyraizur.rpsbosses;

/**
 * Created by ziizo on 12/5/2017.
 */
import java.util.Random;


public class BossClass {
    int bossLevel;
    int bossChoice = 1;
    Random rand = new Random();
    String bossHand;
    public BossClass(int level){
        bossLevel = level;
    }

    public String[] play(String userInput){
        String[] choicesRPS = {"R", "P", "S"};
        String[] choicesRS = {"R", "S"};
        String[] choicesPS = {"P", "S"};
        String[] choicesRP = {"R", "P"};
        if (bossLevel == 1){
            switch(bossChoice) {
                case 1:
                    bossChoice = 2;
                    bossHand = "R";
                    if(userInput.equals("P"))
                        return new String[] { "You won", bossHand};
                    else if(userInput.equals(bossHand))
                        return new String[] { "Draw", bossHand};
                    return new String[] { "You lost", bossHand};
                case 2:
                    bossChoice = 3;
                    bossHand = "P";
                    if(userInput.equals("S"))
                        return new String[] { "You won", bossHand};
                    else if(userInput.equals(bossHand))
                        return new String[] { "Draw", bossHand};
                    return new String[] { "You lost", bossHand};

                case 3:
                    bossChoice = 1;
                    bossHand = "S";
                    if(userInput.equals("R"))
                        return new String[] { "You won", bossHand};
                    else if(userInput.equals(bossHand))
                        return new String[] { "Draw", bossHand};
                    return new String[] { "You lost", bossHand};

            }
        }
        else if (bossLevel == 2){
            switch(bossChoice) {
                case 1:
                    bossChoice = 2;
                    bossHand = "P";
                    if(userInput.equals("S"))
                        return new String[] { "You won", bossHand};
                    else if(userInput.equals(bossHand))
                        return new String[] { "Draw", bossHand};
                    return new String[] { "You lost", bossHand};

                case 2:
                    bossChoice = 3;
                    bossHand = "S";
                    if(userInput.equals("R"))
                        return new String[] { "You won", bossHand};
                    else if(userInput.equals(bossHand))
                        return new String[] { "Draw", bossHand};
                    return new String[] { "You lost", bossHand};

                case 3:
                    bossChoice = 1;
                    bossHand = "R";
                    if(userInput.equals("P"))
                        return new String[] { "You won", bossHand};
                    else if(userInput.equals(bossHand))
                        return new String[] { "Draw", bossHand};
                    return new String[] { "You lost", bossHand};

            }
        }
        else if (bossLevel == 3){
            switch(bossChoice) {
                case 1:
                    bossChoice = 2;
                    bossHand = choicesRS[randNum(1,0)];
                    if((userInput.equals("P") && bossHand.equals("R")) || (userInput.equals("R") && bossHand.equals("S")))
                        return new String[] { "You won", bossHand};
                    else if(userInput.equals(bossHand))
                        return new String[] { "Draw", bossHand};
                    return new String[] { "You lost", bossHand};

                case 2:
                    bossChoice = 3;
                    bossHand = choicesPS[randNum(1,0)];
                    if((userInput.equals("S") && bossHand.equals("P")) || (userInput.equals("R") && bossHand.equals("S")))
                        return new String[] { "You won", bossHand};
                    else if(userInput.equals(bossHand))
                        return new String[] { "Draw", bossHand};
                    return new String[] { "You lost", bossHand};

                case 3:
                    bossChoice = 1;
                    bossHand = "S";
                    if(userInput.equals("R"))
                        return new String[] { "You won", bossHand};
                    else if(userInput.equals(bossHand))
                        return new String[] { "Draw", bossHand};
                    return new String[] { "You lost", bossHand};

            }
        }
        else if (bossLevel == 4){
            switch(bossChoice) {
                case 1:
                    bossChoice = 2;
                    bossHand = choicesRP[randNum(1,0)];
                    if((userInput.equals("S") && bossHand.equals("P")) || (userInput.equals("P") && bossHand.equals("R")))
                        return new String[] { "You won", bossHand};
                    else if(userInput.equals(bossHand))
                        return new String[] { "Draw", bossHand};
                    return new String[] { "You lost", bossHand};

                case 2:
                    bossChoice = 3;
                    bossHand = "P";
                    if(userInput.equals("S"))
                        return new String[] { "You won", bossHand};
                    else if(userInput.equals(bossHand))
                        return new String[] { "Draw", bossHand};
                    return new String[] { "You lost", bossHand};

                case 3:
                    bossChoice = 1;
                    bossHand = choicesPS[randNum(1,0)];
                    if((userInput.equals("S") && bossHand.equals("P")) || (userInput.equals("R") && bossHand.equals("S")))
                        return new String[] { "You won", bossHand};
                    else if(userInput.equals(bossHand))
                        return new String[] { "Draw", bossHand};
                    return new String[] { "You lost", bossHand};

            }
        }
        else if (bossLevel == 5){
            switch(bossChoice) {
                case 1:
                    bossChoice = 2;
                    bossHand = choicesRPS[randNum(2,0)];
                    if((userInput.equals("S") && bossHand.equals("P")) || (userInput.equals("R") && bossHand.equals("S")) || (userInput.equals("P") && bossHand.equals("R")))
                        return new String[] { "You won", bossHand};
                    else if(userInput.equals(bossHand))
                        return new String[] { "Draw", bossHand};
                    return new String[] { "You lost", bossHand};

                case 2:
                    bossChoice = 3;
                    bossHand = choicesRPS[randNum(2,0)];
                    if((userInput.equals("S") && bossHand.equals("P")) || (userInput.equals("R") && bossHand.equals("S")) || (userInput.equals("P") && bossHand.equals("R")))
                        return new String[] { "You won", bossHand};
                    else if(userInput.equals(bossHand))
                        return new String[] { "Draw", bossHand};
                    return new String[] { "You lost", bossHand};

                case 3:
                    bossChoice = 1;
                    bossHand = choicesRPS[randNum(2,0)];
                    if((userInput.equals("S") && bossHand.equals("P")) || (userInput.equals("R") && bossHand.equals("S")) || (userInput.equals("P") && bossHand.equals("R")))
                        return new String[] { "Draw", bossHand};
                    else if(userInput.equals(bossHand))
                        return new String[] { "Draw", bossHand};
                    return new String[] { "You lost", bossHand};

            }
        }
        return new String[] { "ERROR", "404"};
    }

    private int randNum(int max, int min){
        int  n = rand.nextInt(max) + min;
        return n;
    }

}
