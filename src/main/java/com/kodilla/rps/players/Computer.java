package com.kodilla.rps.players;

import com.kodilla.rps.moves.Move;
import com.kodilla.rps.moves.Paper;
import com.kodilla.rps.moves.Rock;
import com.kodilla.rps.moves.Scissors;

import java.util.Random;

public class Computer implements Player {

    private static final Random generator = new Random();
    private int score;

    @Override
    public int getMove() {
        int computerMove = generator.nextInt(3)+1;
        return computerMove;
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
