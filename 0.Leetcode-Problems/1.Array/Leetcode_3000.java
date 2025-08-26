import java.util.ArrayList;

public class Leetcode_3000 {

  public static int areaOfMaxDiagonal(int[][] dimensions){
    int n = dimensions.length;
    int maxDiag = 0;
    int maxArea = 0;

    for(int i=0; i<n; i++){
      int l = dimensions[i][0];
      int w = dimensions[i][1];

      int diag = l*l + w*w;
      int area = l*w;
      
      if(diag > maxDiag){
        maxDiag = diag;
        maxArea = area;
      } else if(diag == maxArea){
        maxArea = Math.max(maxArea, area);
      }
    }
    return maxArea;
  }
  public static void main(String[] args){
    int[][] dimensions = {{9,3}, {8,6}};
    int ans = areaOfMaxDiagonal(dimensions);
    System.out.println("The maximum area diagonal reactangle have: " + ans);
  }
}
