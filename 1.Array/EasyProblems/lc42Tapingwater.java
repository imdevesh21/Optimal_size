package EasyProblems;

public class lc42Tapingwater {

  // Brute-force approach (commented out)
  /*
  public static int waterTapped(int[] height){
    int tlWaler = 0;

    for(int i=0; i<height.length; i++){
      int leftMax = 0, rightMax = 0;
      for(int j=0; j<=i; j++){
        leftMax = Math.max(leftMax, height[j]);
      }
      for(int j=i; j<height.length; j++){
        rightMax = Math.max(rightMax, height[j]);
      }

      int waterAtI = Math.min(leftMax, rightMax) - height[i];
      tlWaler += waterAtI;
    }
    return tlWaler;
  }
  */

  // // ✅ Optimal Two Pointer Approach
  // public static int trap(int[] nums){
  //   int n = nums.length;
  //   int left = 0, right = n - 1;
  //   int leftMax = 0, rightMax = 0;
  //   int water = 0;

  //   while(left < right){
  //     if(nums[left] < nums[right]){
  //       if(nums[left] > leftMax){
  //         leftMax = nums[left];
  //       } else {
  //         water += leftMax - nums[left];
  //       }
  //       left++;
  //     } else {
  //       if(nums[right] > rightMax){
  //         rightMax = nums[right];
  //       } else {
  //         water += rightMax - nums[right];
  //       }
  //       right--;
  //     }
  //   }

  //   return water;
  // }

  // using prefix and suffix max for each index

  public static int trap(int[] nums){
    int n = nums.length;
    int[] left = new int[n];
    int[] right = new int[n];
    int res = 0;
    // fill the left array
    left[0] = nums[0];
    for(int i=1; i<n; i++){
      left[i] = Math.max(left[i-1], nums[i]);
    }

    // fill the right array
    right[n-1] = nums[n-1];
    for(int i=n-2; i>=0; i--){
      right[i] = Math.max(right[i+1], nums[i]);
    }

    for(int i=0; i<n-1; i++){
      int minOf2 = Math.min(left[i], right[i]);
      res += minOf2 - nums[i];
    }
    return res;
  }
  public static void main(String[] args) {
    int[] height = {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
    System.out.println("Total tapped water: " + trap(height));  // Output: 6
  }
}
