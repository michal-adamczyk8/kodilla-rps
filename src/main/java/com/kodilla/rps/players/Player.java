package com.kodilla.rps.players;

import com.kodilla.rps.moves.Move;

public interface Player {
    Move getMove() throws UsersChoiceOutOfRangeException;
}
