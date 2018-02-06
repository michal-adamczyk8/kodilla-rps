package com.kodilla.rps;


import com.kodilla.rps.game.GameOn;
import com.kodilla.rps.game.PlayAgain;
import com.kodilla.rps.game.Starter;
import com.kodilla.rps.players.UsersChoiceOutOfRangeException;

public class RpsRunner {
    public static void main(String[] args) throws UsersChoiceOutOfRangeException {
        Starter starter = new Starter();
        starter.letsGetStarted();
        GameOn gameOn = new GameOn();
        gameOn.gameOn();
        PlayAgain playAgain = new PlayAgain();

        if (playAgain.playAgain()){
            gameOn.gameOn();
        }
        else {
            System.out.println("Dziękujemy za grę.");
        }

    }
}
