package EasyProblems;
import java.util.*;
import java.util.Map;
import java.util.Set;

public class containsDuplicates2 {

  public static boolean returnDuplicates(int nums[], int k){
    Map<Integer, Integer> map = new HashMap<>();
    for(int i=0; i<nums.length; i++){
      if(map.containsKey(nums[i])){
        int prevIndex = map.get(nums[i]);
        if(i - prevIndex <= k){
          return true;
        }
      }
      map.put(nums[i], i);
    }
    return false;
  }
  public static void main(String[] args) {
    int nums[] = {1, 2, 3, 1};
    int k = 3;
    boolean ans = returnDuplicates(nums, k);
    System.out.println(ans);
  }
}
