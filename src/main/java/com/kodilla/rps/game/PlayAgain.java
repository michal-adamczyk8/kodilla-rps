package com.kodilla.rps.game;

import java.util.Scanner;

public class PlayAgain {
    public boolean playAgain(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Chcesz zagrać jeszcze raz?");
        String userChoice = scanner.next();
        if (userChoice == "n") {
            return true;
        }
        else {
            return false;
        }
    }
}
