public class Leetcode_3195 {

  public int minAreaRec(int[][] grid){
    int row = grid.length;
    int col = grid[0].length;
    int minRow = row, maxRow = -1;
    int minCol = col, maxCol = -1;

    for(int i=0; i<row; i++){
      for(int j=0; j<col; j++){
        if(grid[i][j] == 1){
          minRow = Math.min(minRow, i);
          maxRow = Math.max(maxRow, i);

          minCol = Math.min(minCol, j);
          maxCol = Math.max(maxCol, j);
        }
      }
    }
    if(maxRow == -1) return 0;
    int height = maxRow - minRow + 1;
    int width = maxCol - minCol + 1;
    return height * width;
  }
  public void main(String[] args) {
    int[][] grid = {{0, 1, 0}, {1, 0, 1}};
    Leetcode_3195 sol = new Leetcode_3195();
    System.out.println(sol.minAreaRec(grid));
  }
}
