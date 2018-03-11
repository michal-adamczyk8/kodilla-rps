package com.kodilla.rps.game;

import com.kodilla.rps.players.Computer;
import com.kodilla.rps.players.User;

public class Game {

    private final boolean userWin[][] = new boolean[][]{
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

    public void start() {
        int numberOfWins = Commander.getGameCount();
        while (computer.getScore() < numberOfWins && user.getScore() < numberOfWins) {
            int userMove = user.getMove();
            int computerMove = computer.getMove();
            compareMoveAndAddScore(userMove, computerMove);
            Commander.printMove(userMove, computerMove, getRoundResult(userMove, computerMove));
        }
    }

    private int getRoundResult(int userMove, int computerMove) {
        if (userMove == computerMove) {
            return 0;
        } else if (userWin[userMove - 1][computerMove - 1]) {
            return 1;
        } else {
            return 2;
        }
    }

    private void compareMoveAndAddScore(int userMove, int computerMove) {
        if (userMove == computerMove) {
            Commander.sameMove();
            return;
        }
        if (userWin[userMove - 1][computerMove - 1]) {
            user.addScore();
        } else {
            computer.addScore();
        }
    }
}
