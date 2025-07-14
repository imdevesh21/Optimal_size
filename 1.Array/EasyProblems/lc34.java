package EasyProblems;

import java.util.*;

public class lc34{
  
  // function to find the lastOcc
  // public static int lastOcc(int[] nums, int x){
  //   int n = nums.length;
  //   int left = 0, right = n - 1;
  //   int last = -1;
  //   while (left <= right) {
  //     int mid = left + (right - left)/2;
      
  //     if(x == nums[mid]){
  //       last = mid;
  //       left = mid + 1;
  //     } else if(x < nums[mid]){
  //       right = mid - 1;
  //     } else {
  //       left = mid + 1;
  //     }
  //   }
  //   return last;
  // }
  // // function to find the firstOcc
  // public static int firstOcc(int[] nums, int x){
  //   int n = nums.length;
  //   int left = 0, right = n-1;

  //   // initailize firstOcc
  //   int first = -1;
  //   while(left <= right){
  //     int mid = left + (right - left)/2;

  //     // if x is equal to nums mid;
  //     if(x == nums[mid]){
  //       first = mid;
  //       right = mid - 1;
  //     }

  //     // if x is less than nums[mid] then search in the left subArr
  //     else if(x < nums[mid]){
  //       right = mid - 1;
  //     } 
  //     // if x greater than nums[mid] then search in the right subArr
  //     else {
  //       left = mid + 1;
  //     }
  //   }
  //   return first;
  // }

  public static ArrayList<Integer> find(int[] nums, int x){
    // int first = firstOcc(nums, x);
    // int last = lastOcc(nums, x);
    
    // ArrayList<Integer> res = new ArrayList<>();
    // res.add(first);
    // res.add(last);

    int first = search(nums, x, true);
    int last = search(nums, x, false);
    
    ArrayList<Integer> res = new ArrayList<>();
    res.add(first);
    res.add(last);
    return res;
  }

  // instead of using a two loop we can use a boolean findFirst, which will be true if we are seaching for the first index and false otherwise. if arr[mid] == x and findFirst is true set high=mid - 1 elese set low = mid+1 everything else works similar to above

  public static int search(int[] nums, int x, boolean findStart){
    int n = nums.length;
    int low = 0, high = n-1;

    int ind = -1;
    while(low <= high){
      int mid = low + (high - low)/2;
      if(x == nums[mid]){
        ind = mid;
        if(findStart){
          high = mid - 1;
        } else {
          low = mid + 1;
        }
      } else if(x < nums[mid]){
        high = mid - 1;
      } else {
        low = mid + 1;
      }
    }
    return ind;
  }
  public static void main(String[] args){
    int[] nums = {5, 7, 7, 8, 8, 10};
    int target = 8;
    ArrayList<Integer> ans = find(nums, target);
    System.out.println(ans.get(0) + " " + ans.get(1));
  }
}
