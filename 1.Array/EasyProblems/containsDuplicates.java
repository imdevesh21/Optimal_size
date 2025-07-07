package EasyProblems;
import java.util.*;
public class containsDuplicates {
  // public static boolean isDuplicatePresent(int nums[]){
  //   for(int i=0; i<nums.length; i++){
  //     for(int j=i+1; j<nums.length; j++){
  //       if(nums[i] == nums[j]){
  //         return true;
  //       }
  //     }
  //   }
  //   return false;
  // }
  // usually the above solution is better when we small data in out array but still it is taking O(n2) complexity which is higher so we gonna use set to store unique element

  public static boolean isDuplicatePresent(int nums[]){
    Set<Integer> set = new HashSet<>();
    for(int num : nums){
      if(set.contains(num)) return true;
      set.add(num);
    }
    return false;
  }

  public static void main(String args[]){
    int nums[] = {1, 2, 3, 1};
    boolean result = isDuplicatePresent(nums);
    System.out.println("Is Duplicate present in array: " + result);
  }
}
