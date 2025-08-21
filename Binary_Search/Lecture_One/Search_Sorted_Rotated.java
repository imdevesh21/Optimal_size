package Binary_Search.Lecture_One;

import java.util.ArrayList;
import java.util.Arrays;

public class Search_Sorted_Rotated {

  public static int search(ArrayList<Integer> arr, int n, int k){
    int low = 0, high = n-1;
    while(low <= high){
      int mid = low + (high - low)/2;
      if(arr.get(mid) == k)
        return mid;
      if(arr.get(low) <= arr.get(mid)){
        if(arr.get(low) <= k && k <= arr.get(mid)){
          high = mid - 1;
        } else {
          low = mid + 1;
        }
      }
      else {
        if(arr.get(mid) <= k && k <= arr.get(high)){
          low = mid + 1;
        } else {
          high = mid - 1;
        }
      }
    }
    return -1;
  }
  public static void main(String[] args){
    ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(7, 8, 9, 1, 2, 3, 4, 5, 6));
    int n = 9, k = 1;
    int ans = search(arr, n, k);
    if(ans == -1){
      System.out.println("Target is not found");
    } else {
      System.out.println("Target is found at index: "+ ans);
    }
  }
}
