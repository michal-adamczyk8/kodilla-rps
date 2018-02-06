package com.kodilla.rps.game;

import com.kodilla.rps.moves.Move;

public class CompareMoves {
    public static int compareMoves(Move userMove, Move computerMove) {
        if (userMove.getName() == computerMove.getName()) {
            return 0;
        }
        else if (userMove.getName() == "Rock") {
            if (computerMove.getName() == "Scissors") {
                System.out.println("Kamień zgniata Nożyce. Zdobywasz punkt!");
                return 1;
            } else {
                System.out.println("Papier nakrywa Kamień. Komputer zdobywa punkt!");
                return 2;
            }
        }
        else if (userMove.getName() == "Scissors") {
            if (computerMove.getName() == "Paper") {
                System.out.println("Nożyce tną Papier. Zdobywasz punkt!");
                return 1;
            }
            else {
                System.out.println("Kamień zgniata Nożyce. Komputer zdobywa punkt!");
                return 2;
            }
        }
        else {
            if (computerMove.getName() == "Rock") {
                System.out.println("Papier nakrywa Kamień. Zdobywasz punkt!");
                return 1;
            }
            else {
                System.out.println("Nożyce tną papier. Komputer zdobywa punkt!");
                return 2;
            }
        }
    }
}

