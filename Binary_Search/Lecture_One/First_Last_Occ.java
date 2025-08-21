package Binary_Search.Lecture_One;
import java.util.*;
public class First_Last_Occ {

  // public static int[] firstAndLastOcc(int[] nums, int x){
  //   int first = -1, last = -1;
  //   for(int i=0; i<nums.length; i++){
  //     if(nums[i] == x){
  //       if(first == -1){
  //         first = i;
  //       }
  //       last = i;
  //     }
  //   }
  //   return new int[] {first, last};
  // }

  // using the binary Search
  public static int LowerBound(int[] nums, int n, int x){
    int low = 0, high = n-1;
    int ans = n;
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

  public static int UpperBound(int[] nums, int n, int x){
    int low = 0, high = n-1;
    int ans = n;
    while(low <= high){
      int mid = low + (high - low)/2;
      if(nums[mid] > x){
        ans = mid;
        high = mid - 1;
      } else {
        low = mid + 1;
      }
    }
    return ans;
  }
  
  public static int[] firstAndLastOcc(int[] arr, int n, int k){
    int lb = LowerBound(arr, n, k);
    if(lb == n || arr[lb] != k) return new int[]{-1, -1};
    int ub = UpperBound(arr, n, k) - 1;
    return new int[] {lb, ub};
  }

  public static void main(String[] args) {
    int[] nums = {2, 4, 6, 8, 8, 8, 11, 13};
    int k = 8;
    int n = nums.length;
    int[] ans = firstAndLastOcc(nums, n, k);
    System.out.println(ans[0] + ", " + ans[1]);
  }
}
