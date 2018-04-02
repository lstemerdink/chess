package model.board;

import model.pieces.Piece;

public class Field {

    private final Coordinate coordinate;
    private Piece piece;

    public Field(Coordinate coordinate, Piece piece) {
        this.coordinate = coordinate;
        this.piece = piece;
    }

    public boolean isOccupied() {
        return piece != null;
    }

    public Coordinate getCoordinate() {
        return coordinate;
    }

    /**
     * Returns the piece on the field. May be null if this field is not occupied.
     */
    public Piece getPiece() {
        return piece;
    }

    /**
     * Set a piece on this field. Set null in order to "remove" a piece from the field.
     * @param piece
     */
    public void setPiece(Piece piece) {
        this.piece = piece;
    }
}
