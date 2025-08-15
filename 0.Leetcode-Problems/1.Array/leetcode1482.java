public class leetcode1482 {

  // public static boolean possible(int[] bloomDays, int numBouquets, int bouquetSize, int currentDay) {
  //   int bouquetsMade = 0, flowerInBouqutes = 0;
  //   for (int day : bloomDays) {
  //     // if the flower is bloomed by current day include in the current bouquets
  //     if (day <= currentDay) {
  //       flowerInBouqutes++;
  //       // if we've gathered enough flower for a bouquets, increase the count and reset
  //       if (flowerInBouqutes == bouquetSize) {
  //         bouquetsMade++;
  //         flowerInBouqutes = 0;
  //       }
  //     } else {
  //       // flower is not bloomed reset for the current bouquets
  //       flowerInBouqutes = 0;
  //     }
  //   }
  //   // check if we have made lest no of bouquets requires
  //   return bouquetsMade >= numBouquets;
  // }

  // public static int minBloomDays(int[] bloomDays, int m, int k) {
  //   int n = bloomDays.length;
  //   if (m * k > n) {
  //     return -1;
  //   }
  //   int minDays = Integer.MAX_VALUE;
  //   int maxDays = Integer.MIN_VALUE;

  //   for (int i = 0; i < n; i++) {
  //     minDays = Math.min(minDays, bloomDays[i]);
  //     maxDays = Math.max(maxDays, bloomDays[i]);
  //   }

  //   int left = minDays, right = maxDays;
  //   while (left < right) {
  //     int mid = left + (right - left) / 2;
  //     if (possible(bloomDays, m, k, mid)) {
  //       right = mid; // try earlier day
  //     } else {
  //       left = mid + 1; // try later day
  //     }
  //   }
  //   return left;
  // }

  public static boolean possible(int[] bloomDays, int day, int m, int k){
    int n = bloomDays.length;
    int cnt=0, noOfbq = 0;
    for(int i=0; i<n; i++){
      if(bloomDays[i] <= day){
        cnt++;
      } else {
        noOfbq += (cnt/k);
        cnt = 0;
      }
    }
    noOfbq += (cnt/k);
    return noOfbq >= m;
  }

  public static int minBloomDays(int[] bloomDays, int m, int k){
    int n = bloomDays.length;
    if((long)m * k > n) return -1;
    
    int maxi = Integer.MIN_VALUE, mini = Integer.MAX_VALUE;
    for(int day : bloomDays){
      maxi = Math.min(maxi, day);
      mini = Math.min(mini, day);
    }

    int low = mini, high = maxi;
    while(low < high){
      int mid = low + (high - low)/2;
      if(possible(bloomDays, mid, mini, k)){
        high = mid;
      } else {
        low = mid + 1;
      }
    }
    return low;
  }
  public static void main(String[] args) {
    int[] bloomDays = { 1, 10, 3, 10, 2 };
    int m = 3; // no of bouquets we wants to create
    int k = 1; // no of adjacent flower to create one bouquets
    int ans = minBloomDays(bloomDays, m, k);
    System.out.println(ans);
  }
}
 