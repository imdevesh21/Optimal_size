package solve;
import java.util.*;

public class rateMaze {

  // public static void solve(int i, int j, int[][] a, int n, ArrayList<String> ans, String moves, int visited[][]){
  //   if(i == n-1 && j == n-1){
  //     ans.add(moves);
  //     return;
  //   }

  //   // Mark the current cell as visited
  //   visited[i][j] = 1;

  //   // Move Down
  //   if(i + 1 < n && visited[i+1][j] == 0 && a[i+1][j] == 1)
  //     solve(i+1, j, a, n, ans, moves + 'D', visited);

  //   // Move Left
  //   if(j - 1 >= 0 && visited[i][j-1] == 0 && a[i][j-1] == 1)
  //     solve(i, j-1, a, n, ans, moves + 'L', visited);

  //   // Move Right
  //   if(j + 1 < n && visited[i][j+1] == 0 && a[i][j+1] == 1)
  //     solve(i, j+1, a, n, ans, moves + 'R', visited);

  //   // Move Up
  //   if(i - 1 >= 0 && visited[i-1][j] == 0 && a[i-1][j] == 1)
  //     solve(i-1, j, a, n, ans, moves + 'U', visited);

  //   // Backtrack
  //   visited[i][j] = 0;
  // }
  public static void solve(int i, int j, int[][] m, int n, ArrayList<String> ans, String move, int[][] vis){
    if(i == n-1 && j == n-1){
      ans.add(move);
      return;
    }

    int[] di = {1, 0, 0, -1};
    int[] dj = {0, -1, 1, 0};

    String dir = "DLRU";

    for(int ind=0; ind<4; ind++){
      int nexti = i + di[ind];
      int nextj = j + dj[ind];

      if(nexti >= 0 && nextj >= 0 && nexti < n && nextj < n && vis[nexti][nextj] == 0 && m[nexti][nextj] == 1){
        vis[i][j] = 1;
        solve(nexti, nextj, m, n, ans, move + dir.charAt(ind), vis);
        vis[i][j] = 0;
      }
    }
  }
  public static ArrayList<String> findPath(int[][] m, int n){
    ArrayList<String> ans = new ArrayList<>();
    int[][] vis = new int[n][n];

    if(m[0][0] == 1)
      solve(0, 0, m, n, ans, "", vis);

    return ans;
  }

  public static void main(String[] args){
    // int n = 4;
    int[][] m = {
      {1, 0, 0, 0},
      {1, 1, 0, 1},
      {1, 1, 0, 0},
      {0, 1, 1, 1}
    };

    // ArrayList<String> res = findPath(a, n);

    // if(res.size() > 0){
    //   for(String path : res)
    //     System.out.print(path + " ");
    //   System.out.println();
    // } else {
    //   System.out.println(-1);
    // }
    ArrayList<String> result = findPath(m, m.length);
    System.out.println("Paths: " + result);
  }
}
