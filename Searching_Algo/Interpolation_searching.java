package Searching_Algo;

public class Interpolation_searching {

  public static int interpolationSearch(int[] arr, int data){
    int low = 0, high = arr.length-1;
    while(low <= high && data >= arr[low] && data <= arr[high]){
      if(low == high){
        if(arr[low] == data) return low;
        return -1;
      }

      int mid = low + ((data - arr[low]) * (high - low)) / (arr[high] - arr[low]);
      if(arr[mid] == data){
        return mid;
      } else if(arr[mid] < data){
        low = mid + 1;
      } else {
        high = mid - 1;
      }
    }
    return -1;
  }
  public static void main(String[] args){
    int[] arr = {1, 2, 5, 6, 7, 10}; // Sorted array
    int target = 10;
    int ans = interpolationSearch(arr, target);
    System.out.println(ans);
  }
}
