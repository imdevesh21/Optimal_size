package Binary_Search.Lecture_One;

public class Implement_Upper_Bound {

  public static int upperBound(int[] arr, int x, int n){
    int low = 0, high = n-1;
    int ans = n;
    while(low <= high){
      int mid = low + (high - low)/2;
      if(arr[mid] > x){
        ans = mid;
        high = mid - 1;
      } else {
        low = mid + 1;
      }
    }
    return ans;
  }
  public static void main(String[] args){
    int[] arr = {3, 5, 8, 9, 15, 19};
    int x = 9;
    int n = 6;
    int ind = upperBound(arr, x, n);
    System.out.println("The upper bound is the index: " + ind);
  }
}
