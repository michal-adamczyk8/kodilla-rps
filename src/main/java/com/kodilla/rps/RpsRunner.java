package com.kodilla.rps;


import com.kodilla.rps.game.Game;
import com.kodilla.rps.game.Commander;
import com.kodilla.rps.players.Computer;
import com.kodilla.rps.players.User;
import com.kodilla.rps.players.UsersChoiceOutOfRangeException;

public class RpsRunner {
    public static void main(String[] args) throws UsersChoiceOutOfRangeException {
        Commander.startInfo();
        boolean startGame = true;
        while (startGame) {
            User user = new User();
            Computer computer = new Computer();
            Game game = new Game(user, computer);
            game.start();
            Commander.finishStatement(user.getScore(), computer.getScore());
            if(!Commander.playAgain()) {
                startGame = false;
                Commander.finishGame();
            }
        }
    }
}
