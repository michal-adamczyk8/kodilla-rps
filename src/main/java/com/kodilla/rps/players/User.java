package com.kodilla.rps.players;

import com.kodilla.rps.moves.Move;
import com.kodilla.rps.moves.Paper;
import com.kodilla.rps.moves.Rock;
import com.kodilla.rps.moves.Scissors;

import java.util.Scanner;

public class User implements Player {

    private String name;
    private int score;

    public User(String name) {
        this.name = name;
    }

    @Override
    public Move getMove() throws UsersChoiceOutOfRangeException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Wybierz swój ruch!");
        int usersChoice = scanner.nextInt();

       if (usersChoice != 1 && usersChoice != 2 && usersChoice != 3) {
            throw new UsersChoiceOutOfRangeException();
        }

        if(usersChoice == 1){
            Rock rock = new Rock();
            System.out.println("Wybrałeś: " + rock.getName());
            return rock;
        }
        else if(usersChoice == 2){
            Paper paper = new Paper();
            System.out.println("Wybrałeś: " + paper.getName());
            return paper;
        }
        else {
            Scissors scissors = new Scissors();
            System.out.println("Wybrałeś: " + scissors.getName());
            return scissors;
        }
    }

    @Override
    public Integer getScore() {
        return score;
    }

    @Override
    public void addScore() {
        this.score++;
    }
}
