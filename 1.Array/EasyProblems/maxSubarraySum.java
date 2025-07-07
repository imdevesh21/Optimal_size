package EasyProblems;

import java.util.*;

public class maxSubarraySum {

  public static int maxSubArraySum(int[] arr) {
    int maxSubSum = Integer.MIN_VALUE;
    for (int i = 0; i < arr.length; i++) {
      for (int j = i; j < arr.length; j++) {
        int subarraySum = 0;
        for (int k = i; k <= j; k++) {
          subarraySum = subarraySum + arr[k];

          if (subarraySum > maxSubSum) {
            maxSubSum = subarraySum;
          }
        }
      }
    }
    return maxSubSum;
  }

  // we solve this problem using a kadan's algorithm with an most optimal
  // complexity sol O(n)
  // public static int maxSubArraySum(int[] arr){
  // int res = arr[0];
  // int maxEnding = arr[0];

  // for(int i=0; i<arr.length; i++){
  // maxEnding = Math.max(arr[i], maxEnding + arr[i]);

  // res = Math.max(res, maxEnding);
  // }
  // return res;
  // }
  public static void main(String[] args) {
    int[] arr = { -4, 5, 7, -6, 10, -15, 3 };
    int maxSum = maxSubArraySum(arr);
    System.out.println("The maximum subarray sum is: " + maxSum);
  }
}
