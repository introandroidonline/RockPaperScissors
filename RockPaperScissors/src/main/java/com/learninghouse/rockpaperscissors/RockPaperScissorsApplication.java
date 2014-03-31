package com.learninghouse.rockpaperscissors;

import android.app.Application;

import java.util.Date;
import java.util.Random;

/**
 * Created by wesleyreisz on 3/30/14.
 */
public class RockPaperScissorsApplication extends Application {
    private int count;
    private RockPaperScissorType playerSelection;
    private RockPaperScissorType computerSelection;

    public RockPaperScissorType getPlayerSelection() {
        return playerSelection;
    }

    public void setPlayerSelection(RockPaperScissorType playerSelection) {
        this.playerSelection = playerSelection;
    }

    public RockPaperScissorType getComputerSelection() {
        count++;
        Random generator = new Random(new Date().getTime()+count);
        int selection =  generator.nextInt(3) + 1;
        if(selection==1){
            computerSelection = RockPaperScissorType.ROCK;
        }else if(selection==2){
            computerSelection = RockPaperScissorType.PAPER;
        }else{
            computerSelection = RockPaperScissorType.SCISSORS;
        }

        return computerSelection;
    }

    @Override
    public void onCreate() {
        super.onCreate();
    }

}
