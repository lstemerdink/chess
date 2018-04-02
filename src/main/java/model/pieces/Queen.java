package model.pieces;

import controller.BoardState;
import model.Color;
import model.board.Coordinate;

import java.util.Collections;

public class Queen extends Piece {

    public Queen(Color color, Coordinate coordinate) {
        super(color, coordinate);
    }

    public void determinePossibleMoves(BoardState state) {

    }

    public void initializeStartingPossibleMoves() {
        possibleMoves = Collections.emptyList();
    }

    @Override
    public String toString() {
        return "Qu";
    }
}

