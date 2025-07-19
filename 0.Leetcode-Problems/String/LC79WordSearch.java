public class LC79WordSearch {

  public static boolean exists(char[][] board, String word) {

    if (board == null || board.length == 0) {
      return false;
    }

    int row = board.length;
    int col = board[0].length;
    boolean[][] visited = new boolean[row][col];
    for (int i = 0; i < board.length; i++) {
      for (int j = 0; j < board[0].length; j++) {
        if (board[i][j] == word.charAt(0)) {
          if(backtrack(board, i, j, 0, word, visited)){
            return true;
          }
        }
      }
    }
    return false;
  }

  public static boolean backtrack(char[][] board, int row, int col, int index, String word, boolean[][] visited) {
    if (index == word.length()) {
      return true;
    }

    if (row < 0 || col < 0 || row >= board.length || col >= board[0].length || visited[row][col] || board[row][col] != word.charAt(index)) {
      return false;
    }
    visited[row][col] = true;
    boolean isPossible = backtrack(board, row + 1, col, index + 1, word, visited)
        || backtrack(board, row - 1, col, index + 1, word, visited)
        || backtrack(board, row, col + 1, index + 1, word, visited)
        || backtrack(board, row, col - 1, index + 1, word, visited);
    visited[row][col] = false;
    return isPossible;
  }

  public static void main(String[] args) {
    char[][] board = {
        { 'A', 'B', 'C', 'E' },
        { 'S', 'F', 'C', 'S' },
        { 'A', 'D', 'E', 'E' }
    };
    String word = "ABCCED";
    boolean ans = exists(board, word);
    System.out.println(ans);
  }
}
