package model.pieces;

import controller.BoardState;
import model.Color;
import model.board.Coordinate;

import java.util.List;

public abstract class Piece {

    protected Color color;
    protected Coordinate coordinate;
    protected List<Coordinate> possibleMoves;

    public Piece(Color color, Coordinate coordinate) {
        this.color = color;
        this.coordinate = coordinate;
        initializeStartingPossibleMoves();
    }

    public abstract void determinePossibleMoves(BoardState state);

    public abstract void initializeStartingPossibleMoves();

    public List<Coordinate> getPossibleMoves(){
        return possibleMoves;
    }

    public Color getColor() {
        return color;
    }
    public void setColor(Color color) {
        this.color = color;
    }

    public Coordinate getCoordinate() {
        return coordinate;
    }
    public void setCoordinate(Coordinate coordinate, BoardState state) {
        this.coordinate = coordinate;
        determinePossibleMoves(state);
    }
}
