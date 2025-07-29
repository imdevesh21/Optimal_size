package solve;

import java.util.*;

public class combinationSum2 {

  public static void findCombinations(int ind, int[] nums, int t, List<List<Integer>> ans, List<Integer> ds) {
    if (t == 0) {
      ans.addFirst(new ArrayList<>(ds));
      return;
    }
    for (int i = ind; i < nums.length; i++) {
      if (i > ind && nums[i] == nums[i - 1])
        continue;
      if (nums[i] > t)
        break;
      ds.add(nums[i]);
      findCombinations(i + 1, nums, t - nums[i], ans, ds);
      ds.remove(ds.size() - 1);
    }
  }

  public static void main(String[] args) {
    int[] nums = { 10, 1, 2, 7, 6, 1, 5 };
    int target = 8;
    Arrays.sort(nums);

    List<List<Integer>> ans = new ArrayList<>();
    List<Integer> ds = new ArrayList<>();

    findCombinations(0, nums, target, ans, ds);

    for (List<Integer> res : ans) {
      System.out.println(res);
    }
  }
}
