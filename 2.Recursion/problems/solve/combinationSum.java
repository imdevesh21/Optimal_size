package solve;

import java.util.*;

public class combinationSum {

  public static void combinations(int index, int[] nums, int target, List<Integer> ds, List<List<Integer>> ans) {
    // if (index == nums.length) {
      if (target == 0) {
        ans.add(new ArrayList<>(ds));
        return;
      }
    // }
    // Arrays.sort(nums);
    // pick up the current element if it is does not exceed the target
    // if (nums[index] <= target) {
    //   ds.add(nums[index]);
    //   // stay at the same index since the repitations are allower
    //   combinations(index, nums, target - nums[index], ds, ans);
    //   ds.remove(ds.size() - 1); // backtrack
    // }
    // // not pick-up the element and move to the next index
    // combinations(index + 1, nums, target, ds, ans);

    // storing combination also skiping duplicate at same level
    for(int i=index; i<nums.length; i++){
      if(i > index && nums[i] == nums[i - 1]) continue;
      if(nums[i] > target) break;

      ds.add(nums[i]);
      combinations(i, nums, target-nums[i], ds, ans);
      ds.remove(ds.size() - 1);
    }
  }

  public static void main(String[] args) {
    int[] nums = { 2, 2, 3, 7 };
    int target = 7;

    List<List<Integer>> ans = new ArrayList<>();
    List<Integer> ds = new ArrayList<>();

    // Optional: sort to handle duplicates in cleaner way (not needed for repetition
    // problems, but good habit)
    Arrays.sort(nums);

    combinations(0, nums, target, ds, ans);

    // Print all combinations
    for (List<Integer> comb : ans) {
      System.out.println(comb);
    }
  }
}
