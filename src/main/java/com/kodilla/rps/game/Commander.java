package com.kodilla.rps.game;

import com.kodilla.rps.players.Computer;
import com.kodilla.rps.players.Player;
import com.kodilla.rps.players.User;

import java.util.Scanner;

public class Commander {

    private static Scanner scanner = new Scanner(System.in);

    public static void startInfo(){
        System.out.println("Witamy w grze: Kamień, Papier, Nożyce");
        System.out.println("Witaj " + getUserName() + "!");
        System.out.println("Sterowanie w grze jest następujące:");
        System.out.println("Jeśli chcesz wybrać \"Kamień\" naciśnij \"1\"");
        System.out.println("Jeśli chcesz wybrać \"Papier\" naciśnij \"2\"");
        System.out.println("Jeśli chcesz wybrać \"Nożyce\" naciśnij \"3\"");
    }

    public static String getUserName() {
        System.out.println("Jak masz na imię?");
        String userName = scanner.nextLine();
        return userName;
    }

    public static int getGameCount() {
        System.out.println("Do ilu zwycięstw chciałbyś zagrać?");
        boolean correctChoice = false;
        do {
            String number = scanner.next();
            try {
                correctChoice = true;
                return Integer.parseInt(number);
            } catch (NumberFormatException e) {
                System.out.println("Niepoprawna wartość. Podaj liczbę: ");
                correctChoice = false;
            }
        } while (!correctChoice);
        return 0;
    }

    public static boolean playAgain() {
        System.out.println("Czy chcesz zagrać jeszcze raz? T/N");
        boolean correctChoice = false;
        boolean playAgain = false;
        do {
            String userChoice = scanner.next();
            if (userChoice.equalsIgnoreCase("t")) {
                playAgain = true;
                correctChoice = true;
            } else if (userChoice.equalsIgnoreCase("n")) {
                playAgain = false;
                correctChoice = true;
            } else {
                correctChoice = false;
                System.out.println("Niewłaściwy wybór. Czy chcesz zagrać jeszcze raz? T/N");
            }
        } while (!correctChoice);
        return playAgain;
    }

    public static void finishGame() {
        System.out.println("Dziękujemy za grę.");
    }

    public static int getMove() {
        System.out.println("Wybierz swój ruch!");
        boolean correctMove = false;
        do {
            String userMove = scanner.next();
            switch(userMove) {
                case "1" :
                    correctMove = true;
                    return 1;
                case "2" :
                    correctMove = true;
                    return 2;
                case "3" :
                    correctMove = true;
                    return 3;
                default :
                    System.out.println("Nieprawidłowy ruch. Proszę wybrać: 1, 2 lub 3!");
            }
        } while(!correctMove);
    return -1;
    }

    public static void sameMove() {
        System.out.println("Ruch komputera i użytkownika są takie same! Mamy remis!");
    }

    public static void finishStatement(int userScore, int computerScore) {
        if(userScore > computerScore) {
            System.out.println("Gratulacje!!! Wygrałeś! Wynik gracza: " + userScore + ". Wynik komputera: "
                    + computerScore);
        }
        else {
            System.out.println("Niestety! Tym razem musisz przełknąć smak porażki :( Spróbuj jeszcze raz. " +
                    "Wynik gracza: " + userScore + ". Wynik komputera: " + computerScore);
        }
    }
}
