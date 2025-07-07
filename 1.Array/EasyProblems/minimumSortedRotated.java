package EasyProblems;

public class minimumSortedRotated {

  public static int findMini(int[] nums){
    // int mini = Integer.MAX_VALUE;
    // for(int i=0; i<nums.length; i++){
    //   if(nums[i] < mini){
    //     mini = nums[i];
    //   }
    // }
    // return mini;

    // using binary search
    int left = 0, right = nums.length-1;
    while(left < right){
      int mid = left + (right - left)/2;
      if(nums[mid] > nums[right]){
        left = mid + 1;
      } else {
        right = mid;
      }
    }
    return nums[left];
  }
  public static void main(String[] args) {
    int[] nums = {4, 5, 6, 7, 0, 1, 2, 3};
    int ans = findMini(nums);
    System.out.println("The minimum in sorted rotated array is: " + ans);
  }
}
