package com.kodilla.rps.players;

import com.kodilla.rps.moves.Move;

public interface Player {
    int getMove();
    Integer getScore();
    void addScore();
}
