package com.kodilla.rps.game;

import java.util.Scanner;

public class Commander {

    private static Scanner scanner = new Scanner(System.in);

    public static void startInfo(){
        System.out.println("Witamy w grze: Kamień, Papier, Nożyce");
        System.out.println("Jak masz na imię?");
        System.out.println(getUserName() + "! Sterowanie w grze jest następujące:");
        System.out.println("Jeśli chcesz wybrać \"Kamień\" naciśnij \"1\"");
        System.out.println("Jeśli chcesz wybrać \"Papier\" naciśnij \"2\"");
        System.out.println("Jeśli chcesz wybrać \"Nożyce\" naciśnij \"3\"");
    }

    public static String getUserName() {
        String userName = scanner.nextLine();
        return userName;
    }

    public static int getGameCount() {
        boolean correctChoice = false;
        do {
            String number = scanner.nextLine();
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
        boolean correctChoice = false;
        boolean playAgain = false;
        do {
            String userChoice = scanner.nextLine();
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
}
