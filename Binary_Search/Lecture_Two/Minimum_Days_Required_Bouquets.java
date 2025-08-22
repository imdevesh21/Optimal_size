package Binary_Search.Lecture_Two;

public class Minimum_Days_Required_Bouquets {

  public static boolean possible(int[] bloomDays, int day, int m, int k) {
    int n = bloomDays.length;
    int cnt = 0, noOfBq = 0;
    for (int i = 0; i < n; i++) {
      if (bloomDays[i] <= day) {
        cnt++;
      } else {
        noOfBq += (cnt / k);
        cnt = 0;
      }
    }
    noOfBq += (cnt / k);
    return noOfBq >= m;
  }

  public static int roseinGarden(int[] bloomDays, int k, int m) {
    long val = (long) m * k;
    int n = bloomDays.length;
    if (val > n)
      return -1;

    int mini = Integer.MAX_VALUE, maxi = Integer.MIN_VALUE;
    for (int i = 0; i < n; i++) {
      mini = Math.min(mini, bloomDays[i]);
      maxi = Math.max(maxi, bloomDays[i]);
    }

    // for (int i = mini; i <= maxi; i++) {
    //   if (possible(bloomDays, i, m, k)) {
    //     return i;
    //   }
    // }
    int low = mini, high = maxi;
    while(low <= high){
      int mid = low + (high - low)/2;
      if(possible(bloomDays, mid, m, k)){
        high = mid - 1;
      } else {
        low = mid + 1;
      }
    }
    return low;
  }

  public static void main(String[] args) {
    int[] bloomDays = { 7, 7, 7, 7, 13, 11, 12, 7 };
    int m = 2, k = 3;
    int ans = roseinGarden(bloomDays, k, m);
    if (ans == -1)
      System.out.println("We cannot make m bouquets.");
    else
      System.out.println("We can make bouquets on day " + ans);
  }
}
