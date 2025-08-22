package Binary_Search.Lecture_Two;

public class KokoEatingBanana {

  public static int findMax(int[] v){
    int maxi = Integer.MIN_VALUE;
    for(int i=0; i<v.length; i++){
      maxi = Math.max(maxi, v[i]);
    }
    return maxi;
  }

  public static int calculateTotalHours(int[] v, int hourly){
    int n = v.length;
    int tHour = 0;
    for(int i=0; i<n; i++){
      tHour += Math.ceil((double)v[i] / hourly);
    }
    return tHour;
  }

  // public static int minimumRateOfEating(int[] v, int h){
  //   int maxi = findMax(v);
  //   for(int i=1; i<=maxi; i++){
  //     int reqTime = calculateTotalHours(v, i);
  //     if(reqTime <= h){
  //       return i;
  //     }
  //   }
  //   return maxi;
  // }

  // replacing the above logic with binary Binary_Search
  public static int minimumRateOfEating(int[] v, int h){
    int low = 0, high = findMax(v);

    while(low <= high){
      int mid = low + (high - low)/2;
      int tHour = calculateTotalHours(v, mid);
      if(tHour <= h){
        high = mid - 1;
      } else {
        low = mid +    1;
      }
    }
    return low;
  }
  public static void main(String[] args) {
    int[] v = {25, 10, 23, 4};
    int h = 4;
    int minHour = minimumRateOfEating(v, h);
    System.out.println("koko should eat atleast " + minHour + " bananas per hour");
  }
}
