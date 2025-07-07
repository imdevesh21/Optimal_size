package EasyProblems;

// public class largestNum {

//   public static int[] largestNumber(int arr[]){
//     int largest = arr[0];
//     int index = 0;
//     for(int i=1; i<arr.length; i++){
//       if(arr[i] > largest){
//         largest = arr[i];
//         index = i;
//       }
//     }
//     return new int[]{largest, index};
//   }

//   public static void main(String[] args) {
//     int[] arr = {1, 4, 6, 10, 11, 2};
//     int[] result = largestNumber(arr);
//     System.out.println("The larget Number is: " + result[0]);
//     System.out.println("The index Number is: " + result[1]);
//   }
// }

public class largestNum{

  public static int largestAndSmallest(int[] arr){
    int largest = Integer.MIN_VALUE;
    int smallest = Integer.MAX_VALUE;

    for(int i=0; i<arr.length; i++){
      // for finding the largest value
      if(arr[i] > largest){
        largest = arr[i];
      }
      // for finding the smallest value

      if(arr[i] < smallest){
        smallest = arr[i];
      }
    }
    System.out.println("The smallest value in array is: " + smallest);
    return largest;
  }
  public static void main(String[] args) {
    int[] arr = {1, 23, 21, 0, 4, 12};

    int largest = largestAndSmallest(arr);
    System.out.println("The largest element in array is: " +  largest);
  }
}
