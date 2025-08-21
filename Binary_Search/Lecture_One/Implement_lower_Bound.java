package Binary_Search.Lecture_One;

public class Implement_lower_Bound {

  public static int findLowerBound(int[] arr, int target) {
    int n = arr.length;
    int ans = n;
    int low = 0, high = n - 1;
    while (low <= high) {
      int mid = (low + high) / 2;
      if (arr[mid] >= target) {
        ans = mid;
        high = mid - 1;
      } else {
        low = mid + 1;
      }
    }
    return ans;
  }

  public static void main(String[] args) {
    int[] arr = { 3, 5, 8, 15, 19 };
    System.out.println(findLowerBound(arr, 5)); // 1
    System.out.println(findLowerBound(arr, 7)); // 2
    System.out.println(findLowerBound(arr, 20));
  }
}
