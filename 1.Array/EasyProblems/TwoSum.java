package EasyProblems;
import java.util.*;
public class TwoSum {
  // public static int[] twoSum(int[] nums, int target){
  //   for(int i=0; i<nums.length; i++){
  //     for(int j=i+1; j<nums.length; j++){
  //       if(nums[i] + nums[j] == target){
  //         return new int[]{i,j};
  //       }
  //     }
  //   }
  //   return new int[]{};
  // }

  public static int[] twoSum(int[] arr, int target){
    HashMap<Integer, Integer> map = new HashMap<>();
    for(int i=0; i<arr.length; i++){
      int complement = target - arr[i];
      if(map.containsKey(complement)){
        return new int[] {map.get(complement), i};
      }
      map.put(arr[i], i);
    }
    return new int[]{};
  }
  public static void main(String[] args) {
    int[] nums = {1, 2, 7, 10};
    int target = 9;
    int[] ans = twoSum(nums, target);
    System.out.println(Arrays.toString(ans));
  }
}
