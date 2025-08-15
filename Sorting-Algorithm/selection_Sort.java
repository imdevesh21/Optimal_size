public class selection_Sort {

  public static void selectioSort(int[] arr){
    int n = arr.length;
    // int temp = 0;
    // int min = Integer.MAX_VALUE;

    for(int i=0; i<n-1; i++){
      int min = i;
      for(int j=i+1; j<n; j++){
        if(arr[j] < arr[min]){
          min = j;
        }
      }
      int temp = arr[min];
      arr[min] = arr[i];
      arr[i] = temp;
    }
  }
  public static void main(String[] args) {
    int[] arr = {7, 4, 10, 8, 3, 1};
    int n = arr.length;
    selectioSort(arr);
    for(int i=0; i<n; i++){
      System.out.print  (arr[i] + " ");
    }

  }
}
