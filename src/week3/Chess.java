package week3;

/**
 *
 * @author Administrator
 */
public class Chess {

    public static void display(char[][] b) {
        for (int row = 0; row < b.length; row++) {
            for (int col = 0; col < b[row].length; col++) {
                System.out.print(b[row][col] + " ");
            }
            System.out.println("");
        }
    }

    public static void main(String[] args) {
        char[][] board = {
            {'r', 'h', 'b', 'q', 'k', 'b', 'h', 'r'},
            {'p', 'p', 'p', 'p', 'p', 'p', 'p', 'p'},
            {'-', '-', '-', '-', '-', '-', '-', '-'},
            {'-', '-', '-', '-', '-', '-', '-', '-'},
            {'-', '-', '-', '-', '-', '-', '-', '-'},
            {'-', '-', '-', '-', '-', '-', '-', '-'},
            {'P', 'P', 'P', 'P', 'P', 'P', 'P', 'P'},
            {'R', 'H', 'B', 'Q', 'K', 'B', 'H', 'R'}
        };
        display(board);
        board[0][1] = '-';
        board[2][2] = 'h';
        System.out.println("");
        display(board);
    }
}
