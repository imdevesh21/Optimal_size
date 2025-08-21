package Binary_Search.Lecture_One;

public class how_many_times_rotated {

  public static int findRotated(int[] nums){
    int n = nums.length;
    int low = 0, high = n-1, ans = Integer.MAX_VALUE;
    int index = -1;
    while(low <= high){
      int mid = low + (high - low)/2;
      if(nums[low] <= nums[high]){
        if(nums[low] < ans){
          index = low;
          ans = nums[low];
        }
        break;
      }
      if(nums[low] <= nums[mid]){
        if(nums[low] < ans){
          index = low;
          ans = nums[low];
        }
        low = mid + 1;
      } else {
        if(nums[mid] < ans){
          index = mid;
          ans = nums[mid];
        }
        high = mid - 1;
      }
    }
    return index;
  }
  public static void main(String[] args) {
    int[] nums = {3, 4, 5, 1, 2};
    int ans = findRotated(nums);
    System.out.println("The array is roteted " + ans + " times");
  }
}
