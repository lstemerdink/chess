package util;

import model.board.Coordinate;

public final class CoordinateConverter {

    private CoordinateConverter(){ }

    public static String coordinateToNotation(Coordinate coordinate) {
        return coordinateToNotation(coordinate.getX(), coordinate.getY());
    }

    public static String coordinateToNotation(int x, int y) {
        char letter = (char) (x + 97);  // 'a' has ordinal value 97
        int number = Math.abs(y - 8);
        return String.valueOf(letter) + number;
    }

    public static Coordinate notationToCoordinate(String notation) {
        char letter = notation.charAt(0);
        int x = letter - 97;    // 'a' has ordinal value 97

        int number = Integer.parseInt(String.valueOf(notation.charAt(1)));
        int y = Math.abs(number - 8);

        return new Coordinate(x, y);
    }
}
