package Binary_Search.Lecture_One;

public class Search_Insert_Position {
  public static int findPlace(int[] nums, int x){
    int n = nums.length;
    int low = 0, high = n-1;
    int ans = n;

    // applying LowerBound
    while(low <= high){
      int mid = low + (high - low)/2;
      if(nums[mid] >= x){
        ans = mid;
        high = mid - 1;
      } else {
        low = mid + 1;
      }
    }
    return ans;
  }
  public static void main(String[] args) {
    int[] nums = {1, 2, 4, 7};
    int ans = findPlace(nums, 6);
    System.out.println(ans);
  }
}
