package solve;

import java.util.ArrayList;
import java.util.*;

public class palindromePartitioning {

  public List<List<String>> partition(String s) {
    List<List<String>> res = new ArrayList<>();
    List<String> path = new ArrayList<>();
    helperFunc(0, s, path, res);
    return res;
  }

  // backtracking helper function
  public void helperFunc(int index, String s, List<String> path, List<List<String>> res) {
    // if we've reached the end of the string
    if (index == s.length()) {
      res.add(new ArrayList<>(path)); // add a copy of current path
      return;
    }

    // try every substring starting from index
    for (int i = index; i < s.length(); i++) {
      // only proceed if it's a palidrome
      if (isPalindrome(s, index, i)) {
        path.add(s.substring(index, i + 1)); // choose
        helperFunc(i + 1, s, path, res); // explore
        path.remove(path.size() - 1); // backtrack
      }
    }
  }

  // helper function if substring s [start...end] is a palidrome
  boolean isPalindrome(String s, int start, int end) {
    while (start <= end) {
      if (s.charAt(start++) != s.charAt(end--)) {
        return false;
      }
    } 
    return true;
  }

  public static void main(String[] args) {
    palindromePartitioning obj = new palindromePartitioning();
    String s = "aabb" ;

    List<List<String>> result = obj.partition(s);
    for(List<String> ans : result){
      System.out.println(ans);
    }
  }
}

// time-complexity
// O(2^n) * k * (n/2) >>>     O(2^n) to generate every substring and O(n/2) to check if the substring is a palidrome. O(k) is for inserting the palindrome in another data structure, where k is the average length of the palidrome list . space complexity>> O(k * x)
