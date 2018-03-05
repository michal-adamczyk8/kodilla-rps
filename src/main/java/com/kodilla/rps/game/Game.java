package com.kodilla.rps.game;

import com.kodilla.rps.moves.Move;
import com.kodilla.rps.players.Computer;
import com.kodilla.rps.players.User;
import com.kodilla.rps.players.UsersChoiceOutOfRangeException;

import java.util.Scanner;

public class Game {

    private final boolean userWin[][] = new boolean[][] {
            {false, false, true},
            {true, false, false},
            {false, true, false}
    };
    private User user;
    private Computer computer;

    public Game(User user, Computer computer) {
        this.user = user;
        this.computer = computer;
    }

    public void start() throws UsersChoiceOutOfRangeException {
        int numberOfWins = Commander.getGameCount();
        while (computer.getScore() < numberOfWins && user.getScore() < numberOfWins) {
            int userMove = user.getMove();
            int computerMove = computer.getMove();
            Commander.pointInformation(userMove, computerMove);
            compareMoveAndAddScore(userMove, computerMove);
        }
    }

    private void compareMoveAndAddScore(int userMove, int computerMove) {
        if(userMove == computerMove) {
            Commander.sameMove();
            return;
        }
        if(userWin[userMove-1][computerMove-1]) {
            user.addScore();
        }
        else {
            computer.addScore();
        }
    }
}
