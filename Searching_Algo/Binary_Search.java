package Searching_Algo;

public class Binary_Search {
  // Iterative bs time_complexity -- O(log n)
  // public static int binarySearch(int[] arr, int t){
  //   int n = arr.length;
  //   int low = 0, high = n - 1;
  //   while(low <= high){
  //     int mid = low + (high - low)/2;
  //     if(arr[mid] == t){
  //       return mid;
  //     } else if(arr[mid] < t){
  //       low = mid + 1;
  //     } else {
  //       high = mid - 1;
  //     }
  //   }
  //   return -1;
  // }

  // recursive binarySearch O(1) and O(log n)
  public static int binarySearch(int[] arr, int low, int high, int target){
    int mid = low + (high - low)/2;
    if(low > high){
      return -1;
    }
    if(arr[mid] == target){
      return mid;
    } else if(arr[mid] < target){
      return binarySearch(arr, mid + 1, high, target);
    } else {
      return binarySearch(arr, low, mid - 1, target);
    }
  }
  public static void main(String[] args){
    int[] arr = {2, 10, 1, 5, 4, 8};
    int target = 1;

    int ans = binarySearch(arr, 0, arr.length - 1, target);
    System.out.println(ans);
  }
}
