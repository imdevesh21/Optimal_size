import java.util.*;
public class redix_sort{
  // a utility function get maximum digit of arr
  public static int getMax(int[] arr, int n){
    int maxDigit = arr[0];
    for(int i=0; i<n; i++){
      if(arr[i] > maxDigit){
        maxDigit = arr[i];
      }
    }
    return maxDigit;
  }

  public static void countSort(int[] arr, int n, int exp){
    int[] output = new int[n];
    int[] count = new int[10];
    Arrays.fill(count, 0);
    int i;
    // store the count of occurrence in count
    for(i = 0; i < n; i++){
      count[(arr[i] / exp) % 10]++;
    }

    // change count[i] so that count[i] now contains
    // actual postion of this digit in output[]
    for(i=1; i<10; i++){
      count[i] += count[i-1];
    }

    // build the output Arrays
    for(i=n-1; i>=0; i--){
      output[count[(arr[i] / exp) % 10] - 1] = arr[i];
      count[(arr[i] / exp) % 10]--;
    }
    // copy the output array to arr[], so that arr[] now
    // contains sorted number according to current digit
    for(i=0; i<n; i++){
      arr[i] = output[i];
    }
  }

  public static void radixSort(int[] arr, int n){
    int m = getMax(arr, n);

    // do counting sort for every digit note that instead of passing digit number, exp is passed exp is 10^i where i is current digit number
    for(int exp = 1; m / exp > 0; exp *= 10){
      countSort(arr, n, exp);
    }
  }

  public static void print(int[] arr, int n){
    for(int i=0; i<n; i++){
      System.out.print(arr[i] + " ");
    }
    System.out.println();
  }
  public static void main(String[] args){
    int[] arr = {29, 83, 471, 36, 91, 8};
    int n = arr.length;
     System.out.println("Before Sorting:");
        print(arr, n);

        radixSort(arr, n);

        System.out.println("After Sorting:");
        print(arr, n);
  }
}
