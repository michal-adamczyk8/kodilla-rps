package com.kodilla.rps.game;

import com.kodilla.rps.moves.Move;
import com.kodilla.rps.players.Computer;
import com.kodilla.rps.players.User;
import com.kodilla.rps.players.UsersChoiceOutOfRangeException;

import java.util.Scanner;

public class GameOn {

    private User user;
    private Computer computer;

    public GameOn(User user, Computer computer) {
        this.user = user;
        this.computer = computer;
    }

    public void gameOn() throws UsersChoiceOutOfRangeException {
        int numberOfWins = Commander.getGameCount();
        while (computer.getScore() < numberOfWins && user.getScore() < numberOfWins) {
            Move userMove = null;
            try {
                userMove = user.getMove();
            } catch (UsersChoiceOutOfRangeException e) {
                System.out.println("Nieprawidłowy wybór. Proszę wybrać liczbę: 1, 2 lub 3.");
                userMove = user.getMove();
            }
            Move computerMove = computer.getMove();
            int compareMoves = CompareMoves.compareMoves(userMove, computerMove);
            if (compareMoves == 0) {
                System.out.println("Mamy remis spróbuj jeszcze raz!");
            }
            else if (compareMoves == 1) {
                user.addScore();
            }
            else {
                computer.addScore();
            }
        }

        if (user.getScore() > computer.getScore()) {
            System.out.println("Gratulacje!!! Wygrałeś! Wynik gracza: " + user.getScore() + ". Wynik komputera: " + computer.getScore());
        }
        else {
            System.out.println("Niestety! Tym razem musisz przełknąć smak porażki :( Spróbuj jeszcze raz. " +
                    "Wynik gracza: " + user.getScore() + ". Wynik komputera: " + computer.getScore());
        }
    }
}
