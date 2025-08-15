public class Insertion_Sort {

  public static void insertionSort(int[] arr){
    // int n = arr.length;
    // for(int i=1; i<n ; i++){
    //   int key = arr[i];
    //   int j = i-1;
    //   while(j >= 0 && arr[j] > key){
    //     arr[j+1] = arr[j];
    //     j--;
    //   }
    //   arr[j+1] = key;
    // }

    // this is an example of ascending order where we get worst case time complexity O(n2);
    int n = arr.length;
    for(int i=1; i<n; i++){
      int key = arr[i];
      int j =i-1;
      while (j >= 0 && key < arr[j]) {
        arr[j+1] = arr[j];
        --j;
      }
      arr[j+1] = key;
    }
  }
  public static void main(String[] args){
    // int[] arr = {5, 2, 10, 2, 1};
    int[] arr = {9, 5, 1, 4, 3};
    // Insertion_Sort obj = new Insertion_Sort();
    insertionSort(arr);
    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i] + " ");
    }
  }
}
