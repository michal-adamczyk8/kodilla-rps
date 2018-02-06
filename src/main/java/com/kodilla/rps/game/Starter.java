package com.kodilla.rps.game;

import java.util.Scanner;

public class Starter {
    private String userName;

    public String getUserName() {
        return userName;
    }

    public void letsGetStarted(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Witamy w grze: Kamień, Papier, Nożyce");

        System.out.println("Jak masz na imię?");

        String userName = scanner.nextLine();





        System.out.println(userName + "! Strowanie w grze jest następujące:");
        System.out.println("Jeśli chcesz wybrać \"Kamień\" naciśnij \"1\"");
        System.out.println("Jeśli chcesz wybrać \"Papier\" naciśnij \"2\"");
        System.out.println("Jeśli chcesz wybrać \"Nożyce\" naciśnij \"3\"");
        System.out.println("Jeśli chcesz zakończyć grę naciścij \"x\"");
        System.out.println("Jeśli chcesz zacząć grę od nowa naciśnij \"n\"");
    }
}
