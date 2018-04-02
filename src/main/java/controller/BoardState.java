package controller;

import model.Color;
import model.board.Field;
import model.moves.Castle;
import model.pieces.*;
import model.board.Coordinate;

import java.util.List;

public class BoardState {

    // Holds the color that should currently make a move
    private Color currentMove = Color.WHITE;

    // The board is a matrix of fields, size 8*8
    private Field[][] board = new Field[8][8];

    // True if the party whose turn it is, is check
    private boolean isCheck = false;

    // Keeps track of castles still that are allowed, based on movement of either the required Rook or King.
    // Does not hold information about whether castling is allowed in the current situation.
    private Castle[] allowed_castles = Castle.values();

    // True if the party that did the last move, set a pawn forwards two steps
    private boolean enPassantAllowed = false;

    public BoardState(){
        initializeChessBoard();
    }

    // Creates a chessboard in the starting position
    private void initializeChessBoard() {
        for (int x = 0; x < board.length; x++) {
            for (int y = 0; y < board.length; y++) {
                Piece piece = determinePieceForLocation(x, y);
                board[x][y] = new Field(new Coordinate(x,y), piece);
            }
        }
    }

    // Determines whether a certain coordinate should have a piece on it, based on the starting position
    private Piece determinePieceForLocation(int x, int y) {
        if (y > 1 && y < 6) {
            return null;
        } else if (y == 1) {
            return new Pawn(Color.BLACK, new Coordinate(x, y));
        } else if (y == 6) {
            return new Pawn(Color.WHITE, new Coordinate(x, y));
        }

        Color colorForCurrentPiece = y == 0 ? Color.BLACK : Color.WHITE;
        switch (x) {
            case 0: // Fallthrough intended
            case 7: return new Rook(colorForCurrentPiece, new Coordinate(x, y));
            case 1: // Fallthrough intended
            case 6: return new Knight(colorForCurrentPiece, new Coordinate(x, y));
            case 2: // Fallthrough intended
            case 5: return new Bishop(colorForCurrentPiece, new Coordinate(x, y));
            case 3: return new King(colorForCurrentPiece, new Coordinate(x, y));
            case 4: return new Queen(colorForCurrentPiece, new Coordinate(x, y));
            default: throw new IndexOutOfBoundsException("x is not between 0 and 7; x = " + x);
        }
    }

    public Color getCurrentMove() {
        return currentMove;
    }

    public Field[][] getBoard() {
        return board;
    }

    public boolean isCheck() {
        return isCheck;
    }

    public Castle[] getAllowed_castles() {
        return allowed_castles;
    }

    public boolean isEnPassantAllowed() {
        return enPassantAllowed;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int y = 0; y < board.length; y++) {
            for (int x = 0; x < board.length; x++) {
                Piece p = board[x][y].getPiece();
                if (p != null) {
                    sb.append(p.toString());
                } else {
                    sb.append("xx");
                }
                sb.append(" ");
            }
            sb.append("\n");
        }
        return sb.toString();
    }
}
