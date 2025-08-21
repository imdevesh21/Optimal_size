package Binary_Search.Lecture_One;

public class find_minimum_rotated_sorted {

  public static int findMin(int[] nums, int n){
    int low = 0, high = n - 1, ans = Integer.MAX_VALUE;
    while(low <= high){
      int mid = low + (high - low)/2;

      if(nums[low] <= nums[high]){
        ans = Math.min(ans, nums[low]);
        break;
      }

      if(nums[low] <= nums[mid]){
        ans = Math.min(ans, nums[low]);
        low = mid + 1;
      } else {
        ans = Math.min(ans, nums[low]);
        high = mid - 1;
      }
    }
    return ans;
  }
  public static void main(String[] args) {
    int[] nums = {7, 8, 0, 2, 3, 3, 3, 4, 5, 6};
    int ans = findMin(nums, nums.length-1);
    System.out.println("The minimum element is: " + ans);
  }
}
