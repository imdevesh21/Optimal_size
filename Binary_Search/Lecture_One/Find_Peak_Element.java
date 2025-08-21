package Binary_Search.Lecture_One;

public class Find_Peak_Element {

  // public static int findPeak(int[] nums){
  //   int n = nums.length;
  //   for(int i=0; i<n; i++){
  //     if((i == 0 || nums[i-1] < nums[i]) && (i == n - 1 ) || nums[i] > nums[i+1]){
  //       return i;
  //     }
  //   }
  //   return -1;
  // }

  public static int findPeak(int[] nums){
    int n = nums.length;
    if(n == 0) return 0;
    if(nums[0] > nums[1]) return 0;
    if(nums[n - 1] > nums[n - 2]) return n-1;

    int low = 1, high = n - 2;
    while(low <= high){
      int mid = low + (high - low)/2;
      // if nums[mid] is the peak
      if(nums[mid - 1] < nums[mid] && nums[mid] > nums[mid + 1]){
        return mid;
      }
      // if we are in the left
      if(nums[mid] > nums[mid - 1]){
        low = mid + 1;
      } else {
        high = mid - 1;
      }
    }
    return -1;
  }
  public static void main(String[] args) {
    int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 5, 1};
    int ans = findPeak(nums);
    System.out.println("The Peak element is: " + ans); 
  }
}
