package EasyProblems;

import java.util.Scanner;

public class PalindromeCheck {
  private static boolean isPalindrome(int[] nums, int start, int end) {
    if (start >= end) {
      return true;
    }
    if (nums[start] != nums[end]) {
      return false;
    }
    return isPalindrome(nums, start + 1, end - 1);
  }

  public static void main(String[] args) {
    int[] nums = {1, 1, 1, 1};
    boolean ans = isPalindrome(nums, 0, nums.length - 1);
    System.out.println(ans);  // Output: false
  }
}
