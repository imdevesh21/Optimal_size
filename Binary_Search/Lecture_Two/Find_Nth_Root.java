package Binary_Search.Lecture_Two;

public class Find_Nth_Root {

  // public static long func(int b, int exp){
  //   long ans = 1;
  //   long base = b;
  //   while(exp > 0){
  //     if(exp % 2 != 0){
  //       exp--;
  //       ans = ans * base;
  //     } else {
  //       exp /= 2;
  //       base = base * base;
  //     }
  //   }
  //   return ans;
  // }

  // public static int nthRoot(int n, int m){
  //   for(int i=1; i<=m; i++){
  //     long val = func(i, n);
  //     if(val == m * 1l) return i;
  //     else if(val > m * 1l) break;
  //   }
  //   return -1;
  // }

  // uisng a binary Binary_Search
  public static int func(int mid, int n, int m){
    long ans = 1;
    for(int i=1; i<=n ; i++){
      ans = ans * mid;
      if(ans > m) return 2;
    }
    if(ans == m) return 1;
    return 0;
  }

  public static int nthRoot(int n, int m){
    int low = 1, high = m;
    while(low <= high){
      int mid = low + (high - low)/2;
      int midN = func(mid, n, m);
      if(midN == 1){
        return mid;
      } else if(midN == 0) low = mid + 1;
      else high = mid - 1;
    }
    return -1;
  }
  public static void main(String[] args) {
    int n = 3;
    int m = 27;
    int ans = nthRoot(n, m);
    System.out.println(ans);
  }
}
