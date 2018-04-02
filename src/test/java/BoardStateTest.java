import controller.BoardState;
import org.junit.Assert;
import org.junit.Test;

public class BoardStateTest {

    @Test
    public void testChessBoardToString() {
        BoardState chessBoard = new BoardState();
        String chessBoardString = chessBoard.toString();
        Assert.assertEquals("Chessboards are not the same",
                "Ro Kn Bi Ki Qu Bi Kn Ro \npa pa pa pa pa pa pa pa \nxx xx xx xx xx xx xx xx \nxx xx xx xx xx xx xx xx \nxx xx xx xx xx xx xx xx \nxx xx xx xx xx xx xx xx \npa pa pa pa pa pa pa pa \nRo Kn Bi Ki Qu Bi Kn Ro \n",
                chessBoardString);
    }
}
