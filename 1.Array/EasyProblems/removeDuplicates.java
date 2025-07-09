package EasyProblems;

import java.util.Arrays;
import java.util.HashSet;

public class removeDuplicates {

  public static int remove(int[] nums){
    // int n = nums.length;
    // int idx = 1;
    // for(int i=1; i<n; i++){
    //   if(nums[i] != nums[i-1]){
    //     nums[idx++] = nums[i];
    //   }
    // }
    // return idx;

    // using hashSet 
    HashSet<Integer> s = new HashSet<>();
    int idx = 0;
    for(int i=0; i<nums.length; i++){
      if(!s.contains(nums[i])){
        s.add(nums[i]);
        nums[idx++] = nums[i];
      }
    }
    return idx;
  }
  public static void main(String[] args) {
    int[] nums = {1, 1, 2, 3, 5, 7};
    int len = remove(nums);
    for(int i = 0; i < len; i++){
      System.out.print(nums[i] + " ");
    }
    System.out.println();
  }
}
