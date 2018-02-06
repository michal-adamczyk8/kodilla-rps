package com.kodilla.rps.players;

import com.kodilla.rps.moves.Move;
import com.kodilla.rps.moves.Paper;
import com.kodilla.rps.moves.Rock;
import com.kodilla.rps.moves.Scissors;

import java.util.Random;

public class Computer implements Player {


    @Override
    public Move getMove() {
        Paper paper = new Paper();
        Scissors scissors = new Scissors();
        Rock rock   = new Rock();
        Random generator = new Random();
        Move[] moves = new Move[]{paper, scissors, rock};
        int index = generator.nextInt(moves.length);
        System.out.println("Komputer wybrał: " + moves[index].getName());
        return moves[index];
    }
}
