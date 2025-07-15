package EasyProblems;

import java.lang.reflect.Array;
import java.util.Arrays;

public class lc4medianTwoSorted {

  private static double findMedian(int[] num1, int[] num2){

    if(num1.length > num2.length) {
      return findMedian(num2, num1);
    }
    // concat two nums together to form one Arrays

    int[] num3 = new int[num1.length + num2.length];
    System.arraycopy(num1, 0, num3, 0, num1.length);
    System.arraycopy(num2, 0, num3, num1.length, num2.length);

    Arrays.sort(num3);

    int n = num3.length;
    if(n % 2 == 1){
      return num3[n/2];
    } else {
      return (num3[n/2-1] + num3[n/2])/2.0;
    }
  }
  public static void main(String[] args){
    int[] num1 = {1, 3};
    int[] num2 = {2};
    double ans = findMedian(num1, num2);
    System.out.println(ans);
  }
}
