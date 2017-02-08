package week3;

/**
 *
 * @author Administrator
 */
public class ChessBoard {

    protected char[][] board;
    protected int count;

    public ChessBoard() {
        reset();
    }

    public void move(int rowFrom, int colFrom, int rowTo, int colTo) {
        board[rowTo][colTo] = board[rowFrom][colFrom];
        board[rowFrom][colFrom] = '-';
        count++;
    }

    public void reset() {
        char[][] tempBoard = {
            {'r', 'h', 'b', 'q', 'k', 'b', 'h', 'r'},
            {'p', 'p', 'p', 'p', 'p', 'p', 'p', 'p'},
            {'-', '-', '-', '-', '-', '-', '-', '-'},
            {'-', '-', '-', '-', '-', '-', '-', '-'},
            {'-', '-', '-', '-', '-', '-', '-', '-'},
            {'-', '-', '-', '-', '-', '-', '-', '-'},
            {'P', 'P', 'P', 'P', 'P', 'P', 'P', 'P'},
            {'R', 'H', 'B', 'Q', 'K', 'B', 'H', 'R'}
        };
        this.board = tempBoard;
        count = 0;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("");
        for (int row = 0; row < board.length; row++) {
            for (int col = 0; col < board[row].length; col++) {
                sb.append(board[row][col]).append(" ");
            }
            sb.append("\n");
        }
        return sb.toString();
    }
}
