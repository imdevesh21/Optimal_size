package EasyProblems;

import java.util.*;

public class ThreeSum {

  public static List<List<Integer>> returnTriplets(int n, int[] nums) {
    HashSet<List<Integer>> set = new HashSet<>();
    for (int i = 0; i < n; i++) {
      for (int j = i + 1; j < n; j++) {
        for (int k = j + 1; k < n; k++) {
          if (nums[i] + nums[j] + nums[k] == 0) {
            List<Integer> temp = Arrays.asList(nums[i], nums[j], nums[k]);
            temp.sort(null);
            set.add(temp);
          }
        }
      }
    }
    // store the set elements in the answer
    List<List<Integer>> ans = new ArrayList<>(set);
    return ans;
  }

  public static void main(String[] args) {
    int nums[] = { -1, 0, 1, 2, -1, -4 };
    int n = nums.length;
    List<List<Integer>> ans = returnTriplets(n, nums);
    for (List<Integer> it : ans) {
      System.out.print("[");
      for (int i = 0; i < it.size(); i++) {
        System.out.print(it.get(i));
        if (i < it.size() - 1) System.out.print(", ");
      }
      System.out.println("]");
    }
  }
}
