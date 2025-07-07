// package EasyProblems;
import java.util.*;

public class linearSearch {



  // Performing Linear Search:
  // Time Complexity:
  // Best Case: O(1) -> Key is found at first index
  // Average Case: O(n) -> Key is in the middle
  // Worst Case: O(n) -> Key is at end or not present
  public static int linearSearching(int[] numbers, int key) {
    for (int i = 0; i < numbers.length; i++) {
      if (numbers[i] == key) {
        return i;
      }
    }
    return -1;
  }

  public static void main(String[] args) {
    int num[] = { 2, 2, 6, 1, 8, 3, 7 };
    int key = 11;

    int ans = linearSearching(num, key);
    if (ans == -1) {
      System.out.println("The key is not found");
    } else {
      System.out.println("The key is found at index: " + ans);
    }
  }
}
