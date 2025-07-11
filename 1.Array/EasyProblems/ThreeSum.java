package EasyProblems;

import java.util.*;

public class ThreeSum {

  public static List<List<Integer>> returnTriplets(int n, int[] nums) {
    // HashSet<List<Integer>> set = new HashSet<>();
    // for (int i = 0; i < n; i++) {
    //   for (int j = i + 1; j < n; j++) {
    //     for (int k = j + 1; k < n; k++) {
    //       if (nums[i] + nums[j] + nums[k] == 0) {
    //         List<Integer> temp = Arrays.asList(nums[i], nums[j], nums[k]);
    //         temp.sort(null);
    //         set.add(temp);
    //       }
    //     }
    //   }
    // }
    // // store the set elements in the answer
    // List<List<Integer>> ans = new ArrayList<>(set);
    // return ans;

    // optimal solution
    List<List<Integer>> ans = new ArrayList<>();
    Arrays.sort(nums);

    for(int i=0; i<n; i++){
      // Since array is sorted, break if current number is > 0
      if (nums[i] > 0) break;
      // Skip duplicate elements to avoid duplicate triplets in the result
      if (i > 0 && nums[i] == nums[i - 1])
        continue;
      int j = i + 1;
      int k = n - 1;
      while (j < k) {
        int sum = nums[i] + nums[j] + nums[k];
        if (sum < 0) {
          j++;
        } else if (sum > 0) {
          k--;
        } else {
          List<Integer> temp = Arrays.asList(nums[i], nums[j], nums[k]);
          ans.add(temp);
          j++;
          k--;

          // Skip duplicates for both j and k pointers
          while (j < k && nums[j] == nums[j - 1]) j++;
          while (j < k && nums[k] == nums[k + 1]) k--;
        }
      }
    }
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
