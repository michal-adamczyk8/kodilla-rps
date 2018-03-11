package com.kodilla.rps.players;

import com.kodilla.rps.game.Commander;
import com.kodilla.rps.moves.Move;
import com.kodilla.rps.moves.Paper;
import com.kodilla.rps.moves.Rock;
import com.kodilla.rps.moves.Scissors;

import java.util.Scanner;

public class User implements Player {


    private int score;

    @Override
    public int getMove() {
        return Commander.getMove();
    }

    @Override
    public Integer getScore() {
        return score;
    }

    @Override
    public void addScore() {
        this.score++;
    }
}
