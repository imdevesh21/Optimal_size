package Binary_Search.Lecture_Two;

public class Find_Sqrt_Integer {
  // public static int findSqrt(double n){
  //   return (int) Math.floor(Math.sqrt(n));
  // }

  // public static int findSqrt(int n){
  //   int ans = 1;
  //   for(int i=0; i<=n; i++){
  //     if(i * i <= n){
  //       ans = i;
  //     } else {
  //       break;
  //     }
  //   }
  //   return ans;
  // }

  // using a binary Binary_Search
  public static int findSqrt(int n){
    int low = 1, high = n;
    int ans = 1;
    while(low <= high){
      int mid = low + (high - low)/2;
      if((mid * mid) <= n){
        ans = mid;
        low = mid + 1;
      } else {
        high = mid - 1;
      }
    }
    return ans;
  }
  public static void main(String[] args) {
    int n = 28;
    int ans  = findSqrt(n);
    System.out.println(ans);
  }
}
