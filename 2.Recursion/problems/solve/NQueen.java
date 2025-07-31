package solve;
import java.util.*;
public class NQueen {

    static int count = 0;

    public static boolean isSafe(char[][] board, int row, int col) {
        // Check column
        for (int i = row - 1; i >= 0; i--) {
            if (board[i][col] == 'Q') return false;
        }

        // Check left diagonal
        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == 'Q') return false;
        }

        // Check right diagonal
        for (int i = row - 1, j = col + 1; i >= 0 && j < board.length; i--, j++) {
            if (board[i][j] == 'Q') return false;
        }

        return true;
    }

    public static boolean nQueens(char[][] board, int row) {
        if (row == board.length) {
            count++;
            return true; // Return after finding the first valid solution
        }

        for (int j = 0; j < board.length; j++) {
            if (isSafe(board, row, j)) {
                board[row][j] = 'Q';
                if (nQueens(board, row + 1)) {
                    return true;
                }
                board[row][j] = 'X'; // backtrack
            }
        }

        return false;
    }

    public static void printFunc(char[][] board) {
        System.out.println("----- Chessboard -----");
        for (char[] row : board) {
            for (char cell : row) {
                System.out.print(cell + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int n = 5;
        char[][] board = new char[n][n];

        for (char[] row : board) {
            Arrays.fill(row, 'X');
        }

        if (nQueens(board, 0)) {
            System.out.println("✅ Solution found:");
            printFunc(board);
        } else {
            System.out.println("❌ No solution exists.");
        }

        System.out.println("Total solutions found: " + count);
    }
}
