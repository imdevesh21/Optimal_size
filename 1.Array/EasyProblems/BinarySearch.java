package EasyProblems;
import java.util.*;
public class BinarySearch {
  // iterative approach

  // int binarySearch(int arr[], int x) {
  // int low = 0, high = arr.length - 1;
  // while (low <= high) {
  // int mid = low + (high - low) / 2;

  // if (arr[mid] == x)
  // return mid;

  // if (arr[mid] < x)
  // low = mid + 1;
  // else
  // high = mid - 1;

  // }
  // return -1;
  // }

  // recursive approach

  int binarySearch(int arr[], int low, int high, int x) {
    if (high >= low) {
      int mid = low + (high - low) / 2;
      if(arr[mid] == x) return mid;

      if(arr[mid] > x) return binarySearch(arr, low, mid-1, x);
      else return binarySearch(arr, mid + 1, high, x);
    }
    return -1;
  }

  public static void main(String[] args) {
    int arr[] = { 2, 3, 4, 10, 40 };
    int n = arr.length;
    int x = 10;
    BinarySearch ob = new BinarySearch();
    // int index = ob.binarySearch(arr, x);
    int index = ob.binarySearch(arr, 0, n - 1, x);
    if (index != -1) {
      System.out.println("element found at index: " + index);
    } else {
      System.out.println("element is not found");
    }
  }
}
