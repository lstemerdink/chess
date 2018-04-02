package model.pieces;

import controller.BoardState;
import model.Color;
import model.board.Coordinate;

import java.util.ArrayList;
import java.util.List;

public class Pawn extends Piece {

    public Pawn(Color color, Coordinate coordinate) {
        super(color, coordinate);
    }

    @Override
    public void determinePossibleMoves(BoardState state) {

    }

    @Override
    public void initializeStartingPossibleMoves() {
        possibleMoves = new ArrayList<Coordinate>(4); // Pawns will never have more than 4 possible moves
        int currentX = coordinate.getX();
        int currentY = coordinate.getY();
        if (color == Color.BLACK) {
            possibleMoves.add(new Coordinate(currentX, currentY - 1));
            possibleMoves.add(new Coordinate(currentX, currentY - 2));
        } else {
            possibleMoves.add(new Coordinate(currentX, currentY + 1));
            possibleMoves.add(new Coordinate(currentX, currentY + 2));
        }
    }

    @Override
    public String toString() {
        return "pa";
    }
}
