package com.kodilla.rps.game;

import com.kodilla.rps.moves.Move;
import com.kodilla.rps.players.Computer;
import com.kodilla.rps.players.User;
import com.kodilla.rps.players.UsersChoiceOutOfRangeException;

import java.util.Scanner;

public class GameOn {
    private int userScore = 0;
    private int computerScore = 0;
    Scanner scanner = new Scanner(System.in);
    User user = new User();
    Computer computer = new Computer();


    public void gameOn() throws UsersChoiceOutOfRangeException {
        System.out.println("Do ilu zwycięstw chcesz zagrac?");
        int numberOfWins = scanner.nextInt();
        //Dlaczego tutaj działa "&&"  a nie "||"
        while (computerScore < numberOfWins && userScore < numberOfWins) {
            Move userMove = null;
            try {
                userMove = user.getMove();
            } catch (UsersChoiceOutOfRangeException e) {
                System.out.println("Nieprawidłowy wybór. Proszę wybrać liczbę: 1, 2 lub 3.");
                userMove = user.getMove();
            }
            Move computerMove = computer.getMove();
            if (CompareMoves.compareMoves(userMove, computerMove) == 0) {
                System.out.println("Mamy remis spróbuj jeszcze raz!");
            }
            else if (CompareMoves.compareMoves(userMove, computerMove) == 1) {
                userScore += 1;
            }
            else {
                computerScore += 1;
            }
        }

        if (userScore > computerScore) {
            System.out.println("Gratulacje!!! Wygrałeś! Wynik gracza: " + userScore + ". Wynik komputera: " + computerScore);
        }
        else {
            System.out.println("Niestety! Tym razem musisz przełknąć smak porażki :( Spróbuj jeszcze raz.");
        }
    }
}
