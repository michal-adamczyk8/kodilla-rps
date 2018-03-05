package com.kodilla.rps.players;

import com.kodilla.rps.moves.Move;

public interface Player {
    int getMove() throws UsersChoiceOutOfRangeException;
    Integer getScore();
    void addScore();
}
