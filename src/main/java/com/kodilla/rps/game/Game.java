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
           compareMoveAndAddScore(userMove, computerMove);
           printMove(userMove, computerMove, getRoundResult(userMove, computerMove));
        }
    }
    private int getRoundResult(int userMove, int computerMove){
        if (userMove == computerMove){
            return 0;
        }
        else if(userWin[userMove - 1][computerMove - 1]) {
                return 1;
        }
        else {
            return 2;
        }
    }

    private void compareMoveAndAddScore(int userMove, int computerMove) {
        if(userMove == computerMove) {
            Commander.sameMove();
            return;
        }
        if(userWin[userMove - 1][computerMove - 1]) {
            user.addScore();
        }
        else {
            computer.addScore();
        }
    }

    private void printMove(int userMove, int computerMove, int roundResult) {
        String userMoveName = getMoveName(userMove);
        String computerMoveName = getMoveName(computerMove);
        switch (roundResult) {
            case 0 :
                break;
            case 1 :
                System.out.println(userMoveName + " bije " + computerMoveName + ". Zdobywasz punkt!");
                break;
            case 2 :
                System.out.println(computerMoveName + " bije " + userMoveName + ". Komputer zdobywa punkt!");
        }
    }

    private String getMoveName(int move) {
        switch(move) {
            case 1 :
                return "Kamień";
            case 2 :
                return "Papier";
            case 3 :
                return "Nożyce";
            default:
                return "";
        }
    }
}
