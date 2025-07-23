import java.util.*;

public class minOperation {

  public static List<Long> minOperations(int[] nums, int[] queries){
    int n = nums.length;
    Arrays.sort(nums);

    long[] prefixSum = new long[n+1];
    for(int i=0; i<n; i++){
      prefixSum[i+1] = prefixSum[i] + nums[i];
    }

    List<Long> result = new ArrayList<>();
    for(int q : queries){
      int idx = lowerBound(nums, q);
      long leftOps = (long) q * idx - prefixSum[idx];
      long rightOps = prefixSum[n] - prefixSum[idx] - (long) q * (n - idx);

      result.add(leftOps + rightOps);
    }
    return result;
  }

  public static int lowerBound(int[] nums, int target){
    int left = 0, right = nums.length;
    while (left < right) {
      int mid = left + (right - left)/2;
      if(nums[mid] < target){
        left = mid + 1;
      } else {
        right = mid;
      }
    }
    return left;
  }

  public static void main(String[] args){
    int[] nums = {1, 3, 2, 4};
    int[] queries = {1, 5};
    List<Long> ans = minOperations(nums, queries);
    System.out.println(ans);
  }
}
