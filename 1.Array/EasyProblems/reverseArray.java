package EasyProblems;

public class reverseArray {
// Two Pointer approach
  // public static void reverseArrays(int arr[]){
  //   int start = 0, end = arr.length - 1;

  //   while(start < end){
  //     int temp = arr[start];
  //     arr[start] = arr[end];
  //     arr[end] = temp;

  //     start++;
  //     end--;
  //   }
  // }

// recursive Approach

  public static void reverseArrays(int arr[], int start, int end){
    if(start >= end){
      return;
    }

    // swap
    int temp = arr[start];
    arr[start] = arr[end];
    arr[end] = temp;

    // recursive call
    reverseArrays(arr, start+1, end-1);
  }
  public static void main(String args[]){
    int arr[] = {1, 2, 3, 4, 5, 6};
    System.out.println("Original Array:");
    for(int num : arr){
      System.out.println(num + " ");
    }
    reverseArrays(arr, 0, arr.length-1);
    System.out.println("\nReversed Array");
    for(int num : arr){
      System.out.println(num + " ");
    }
  }
}
