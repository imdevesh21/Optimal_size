package EasyProblems;

public class nextPermutation {

  public static void nextPermutations(int[] arr){
    int n = arr.length;

    int pivot = -1;

    for(int i=n-2; i>=0; i--){
      if(arr[i] < arr[i+1]){
        pivot = i;
        break;
      }
    }

    // if pivot point does't exist, reverse the whole array

    if(pivot == -1){
      reverse(arr, 0, n-1);
      return;
    }

    // find the element from the right that is greater than pivot
    for(int i=n-1; i>=pivot; i--){
      if(arr[i] > arr[pivot]){
        swap(arr, i, pivot);
        break;
      }
    }
    // reverse the element from pivot + 1 to the end
    reverse(arr, pivot+1, n-1);
  }

  // helper method to reverse Array
  public static void reverse(int[] arr, int start, int end){
    while(start < end){
      swap(arr, start++, end--);
    }
  }

  // helper method to swap two elements
  public static void swap(int[] arr, int i, int j){
    int temp = arr[i];
    arr[i] = arr[j];
    arr[j] = temp;
  }
  public static void main(String[] args) {
    int[] nums = {2, 4, 1, 7, 5, 0};
    nextPermutations(nums);
    for(int ans : nums){
      System.out.println(ans);
    }
  }
}
