package EasyProblems;
// leetcode problem 238 
// problem statement Given an integer array nums, return an array answer such that answer[i] is equal to the product of all the elements of nums except nums[i]. 238. Product of Array Except Self

import java.lang.reflect.Array;
import java.util.Arrays;

// The product of any prefix or suffix of nums is guaranteed to fit in a 32-bit integer.

// You must write an algorithm that runs in O(n) time and without using the division operation.

 

// Example 1:

// Input: nums = [1,2,3,4]
// Output: [24,12,8,6]
public class productArraySelf {

  public static int[] productExceptSelf(int[] nums){
    int[] result = new int[nums.length];
    Arrays.fill(result, 1);
    int pre = 1, post = 1;
    for(int i=0; i<nums.length; i++){
      result[i] = pre;
      pre = nums[i] * pre; 
    }
    for(int i=nums.length-1; i>=0; i--){
      result[i] = result[i] * post;
      post = nums[i] * post;
    }
    return result;
  }
  public static void main(String[] args) {
    int[] nums = {1, 2, 3, 4};

    int[] result = productExceptSelf(nums);
    for(int i=0; i<result.length; i++){
      System.out.println(result[i]);
    }
  }
}
