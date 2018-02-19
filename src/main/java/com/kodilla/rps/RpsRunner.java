package com.kodilla.rps;


import com.kodilla.rps.game.GameOn;
import com.kodilla.rps.game.Commander;
import com.kodilla.rps.players.Computer;
import com.kodilla.rps.players.User;
import com.kodilla.rps.players.UsersChoiceOutOfRangeException;

public class RpsRunner {
    public static void main(String[] args) throws UsersChoiceOutOfRangeException {
        Commander.startInfo();
        String name = Commander.getUserName();
        boolean startGame = true;
        while (startGame) {
            User user = new User(name);
            Computer computer = new Computer();
            System.out.println("Do ilu zwycięstw chciałbyś zagrać?");
            GameOn gameOn = new GameOn(user, computer);
            gameOn.gameOn();
            System.out.println("Czy chcesz zagrać jeszcze raz? T/N");
            if(!Commander.playAgain()) {
                startGame = false;
                System.out.println("Dziękujemy za grę.");
            }
        }
    }
}
