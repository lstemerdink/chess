package model.pieces;

import controller.BoardState;
import model.Color;
import model.board.Coordinate;

import java.util.ArrayList;

public class Knight extends Piece {

    public Knight(Color color, Coordinate coordinate) {
        super(color, coordinate);
    }

    public void determinePossibleMoves(BoardState state) {

    }

    public void initializeStartingPossibleMoves() {
        possibleMoves = new ArrayList<Coordinate>(6);
        if (color == Color.BLACK) {
            if (coordinate.getX() == 1 ) {
                possibleMoves.add(new Coordinate(0, 5));
                possibleMoves.add(new Coordinate(3, 5));
            } else {
                possibleMoves.add(new Coordinate(5, 5));
                possibleMoves.add(new Coordinate(7, 5));
            }
        } else {
            if (coordinate.getX() == 1 ) {
                possibleMoves.add(new Coordinate(0, 2));
                possibleMoves.add(new Coordinate(3, 2));
            } else {
                possibleMoves.add(new Coordinate(5, 2));
                possibleMoves.add(new Coordinate(7, 2));
            }
        }
    }

    @Override
    public String toString() {
        return "Kn";
    }
}
