package EasyProblems;
// Problem statemant: Given n non-negative integers representing an elevation map where the width of each bar is 1, compute how much water it can trap after raining.

public class maxWaterTaping {

  // public static int trap(int[] height){
  //   int n = height.length;
  //   int maxWater = 0;
    
  //   for(int i=0; i<n; i++){
  //     int leftMax = 0, rightMax = 0;
  //     // find the tallest bar to the left (including i)

  //     for(int j=0; j<=i; j++){
  //       leftMax = Math.max(leftMax, height[j]);
  //     }

  //     // find the tallest bar from the right(including i)

  //     for(int j=i; j<n; j++){
  //       rightMax = Math.max(rightMax, height[j]);
  //     }

  //     // calculate water tapped at the center bar
  //     int waterAtI = Math.min(leftMax, rightMax) - height[i];
  //     if(waterAtI > 0){
  //       maxWater += waterAtI;
  //     }
  //   }
  //   return maxWater;
  // }

  // we use two pointer approach to solve this Problem with an efficient complexity

  public static int trap(int[] height){
    int max = 0;
    int left = 0, right = height.length-1;
    while(left < right){
      int width = right - left;
      int area = Math.min(height[left], height[right]) * width;

      max = Math.max(max, area);

      if(height[left] <= height[right]){
        left++;
      } else {
        right--;
      }
    }
    return max;
  }
  public static void main(String[] args) {
    int[] height = {1,8,6,2,5,4,8,3,7};
    int result = trap(height);
    System.out.println(result);
  }
}
