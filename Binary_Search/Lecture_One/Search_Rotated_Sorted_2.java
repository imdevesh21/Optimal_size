package Binary_Search.Lecture_One;

public class Search_Rotated_Sorted_2 {

  public static boolean search(int[] nums, int x){
    int n = nums.length;
    int low = 0, high = n-1;
    while(low <= high){
      int mid = low + (high - low)/2;
      // if target is at mid 
      if(nums[mid] == x)return true;
      // edge case
      if(nums[low] == nums[mid] && nums[mid] == nums[high]){
        low += 1;
        high -= 1;
        continue;
      }

      // if left part is sorted
      if(nums[low] <= nums[mid]){
        if(nums[low] <= x && x <= nums[mid]){
          // element exists
          high = mid - 1;
        } else {
          // element does not exists
          low = mid + 1;
        }
      } else {
        // if right part is sorted
        if(nums[mid] <= x && x <= nums[high]){
          low = mid + 1;
        } else {
          high = mid - 1;
        }
      }
    }
    return false;
  }
  public static void main(String[] args) {
    int[] nums = {7, 8, 1, 2, 3, 3, 3, 4, 5, 6};
    int x = 3;
    boolean ans = search(nums, x);
    if(ans == false){
      System.out.println("Target is not found");
    } else {
      System.out.println("Target is found in an array");
    }
  }
}
