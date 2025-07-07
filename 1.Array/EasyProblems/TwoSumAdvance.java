package EasyProblems;
import java.util.*;
public class TwoSumAdvance {

  // same as twosum try every pair if target value add up we just return it's indices
  // public static int[] twoSum(int[] nums, int target){
  //   for(int i=0; i<nums.length; i++){
  //     for(int j=i+1; j<nums.length; j++){
  //       if(nums[i] + nums[j] == target){
  //         return new int[]{i, j};
  //       }
  //     }
  //   }
  //   return new int[]{};
  // }

  // the more optimal approach for this sol will be using a two pointer approach
  public static int[] twoSum(int[] nums, int target){
    // int l = 0, r = nums.length-1;
    // while(l < r){
    //   int sum = nums[l] + nums[r];

    //   if(sum == target){
    //     return new int[]{l+1, r+1};
    //   } else if(sum < target){
    //     l++;
    //   } else {
    //     r--;
    //   }
    // }
    // return new int[]{-1, -1};

    HashMap<Integer, Integer> map = new HashMap<>();
    for(int i=0; i<nums.length; i++){
      int complement = target - nums[i];
      if(map.containsKey(complement)){
        return new int[]{map.get(complement), i};
      }
      map.put(nums[i],i);
    }
    return new int[]{-1, -1};
  }
  public static void main(String[] args) {
    int[] nums = {-2, 1, 4, 6};
    int target = 10;
    int[] ans = twoSum(nums, target);
    System.out.println(Arrays.toString(ans));
  }
}
