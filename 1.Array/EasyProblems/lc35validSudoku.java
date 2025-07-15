package EasyProblems;

import java.util.HashSet;

public class lc35validSudoku {

  // public static boolean isValidSudoku(char[][] board){
  //   HashSet<String> seen = new HashSet<>();

  //   for(int i=0; i<9; i++){
  //     for(int j=0; j<9; j++){
  //       char curr = board[i][j];
  //       if(curr != '.'){
  //         if(!seen.add(curr + "in row" + i) || !seen.add(curr + "in col" + j) || !seen.add(curr + "in box" + (i/3) + "-" + (j/3))){
  //           return false;
  //         }
  //       }
  //     }
  //   }
  //   return true;
  // }

  // public boolean isValidSudoku(char[][] board){
  //   // Arrays to check the validity of rows, col and sub-grids
  //   boolean[][] rows = new boolean[9][9];
  //   boolean[][] cols = new boolean[9][9];
  //   boolean[][] boxs = new boolean[9][9];

  //   // Iterate over the rows and cols
  //   for(int i=0; i<9; i++){
  //     for(int j=0; j<9; j++){
  //       char currChar = board[i][j];
  //       // if curr character is dot ignore and continue to the next direction
  //       if(currChar == '.'){
  //         continue;
  //       }
  //       // convert the char to its corresponding number(1-9)
  //       int number = currChar - '0' - 1;
  //       // calculate index for the subgrids
  //       int subgridIndex = (i/3) * 3 + j/3;

  //       if(rows[i][number] || cols[j][number] || boxs[subgridIndex][number]){
  //         return false;
  //       }
  //       rows[i][number] = true;
  //       cols[j][number] = true;
  //       boxs[subgridIndex][number] = true;
  //     }
  //   }
  //   return true;
  // }

  public static boolean isValidSudoku(char[][] board){
    int n = 9;
    HashSet<Character>[] rows = new HashSet[n];
    HashSet<Character>[] cols = new HashSet[n];
    HashSet<Character>[] boxes = new HashSet[n];

    for(int i=0; i<n; i++){
      rows[i] = new HashSet<Character>();
      cols[i] = new HashSet<Character>();
      boxes[i] = new HashSet<Character>();
    }

    for(int r=0; r<board.length; r++){
      for(int c=0; c<board[0].length; c++){
        char cell = board[r][c];
        if(cell == '.'){
          continue;
        }

        if(rows[r].contains((cell))){
          return false;
        }
        rows[r].add(cell);
        if(cols[c].contains(cell)){
          return false;
        }
        cols[c].add(cell);
        int boxIndex = 3 * (r/3) + (c/3);

        if(boxes[boxIndex].contains(cell)){
          return false;
        }
        boxes[boxIndex].add(cell);
      }
    }
    return true;
  }
  public void main(String[] args) {
    char[][] board = {
      {'5','3','.','.','7','.','.','.','.'},
      {'6','.','.','1','9','5','.','.','.'},
      {'.','9','8','.','.','.','.','6','.'},
      {'8','.','.','.','6','.','.','.','3'},
      {'4','.','.','8','.','3','.','.','1'},
      {'7','.','.','.','2','.','.','.','6'},
      {'.','6','.','.','.','.','2','8','.'},
      {'.','.','.','4','1','9','.','.','5'},
      {'.','.','.','.','8','.','.','7','9'}
    };

    // You can now call your Sudoku validation function here
    // System.out.println(isValidSudoku(board));
    boolean ans = isValidSudoku(board);
    System.out.println(ans);
  }
}
