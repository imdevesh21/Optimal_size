package solve;

public class knights {

  public static int[] dy = { -1, -1, 1, 2, 2, 1, -1, -2 };
  public static int[] dx = { 1, 2, 2, 1, -1, -2, -2, -1 };

  public static boolean moves(int n, int k, int row, int col) {
    Boolean[][][] memo = new Boolean[n][n][k + 1];
    return knightMoves(n, k, row, col, memo);
  }

  public static boolean knightMoves(int n, int k, int row, int col, Boolean[][][] memo) {
    // if out of board
    if (row < 0 || row >= n || col < 0 || col >= n)
      return false;

    if (k == 0)
      return true;

    if (memo[row][col][k] != null)
      return memo[row][col][k];
    for (int i = 0; i < 8; i++) {
      int newRow = row + dx[i];
      int newCol = col + dy[i];

      if (knightMoves(n, k - 1, newRow, newCol, memo)) {
        memo[row][col][k] = true;
        return true;
      }
    }

    memo[row][col][k] = false;
    return false;
  }

  public static void main(String[] args) {

    int n = 3; // board size
    int k = 2; // allowed moves
    int row = 0;
    int col = 0;
    boolean result = moves(n, k, row, col);
    System.out.println("Can the knight stay on board after " + k + " moves? " + result);

  }
}
