public class Merge_Sort {

  public static void mergeSort(int[] arr, int lb, int ub){
    if(lb < ub){
      int mid = lb + (ub - lb)/2;
      mergeSort(arr, lb, mid);
      mergeSort(arr, mid+1, ub);
      merge(arr, lb, mid, ub);
    }
  }

  public static void merge(int[] arr, int lb, int mid, int ub){
    int n = ub - lb + 1;
    int[] b = new int[n];
    int i=lb, j=mid+1, k=0;
    while(i<=mid && j<=ub){
      if(arr[i] <= arr[j]){
        b[k++] = arr[i++];
      } else {
        b[k++] = arr[j++];
      }
    }

    while(i <= mid){
      b[k++] = arr[i++];
    }

    while(j <= ub){
      b[k++] = arr[j++];
    }

    for(i = 0; i < n; i++){
      arr[lb + i] = b[i];
    }
  }
  public static void main(String[] args){
    int[] arr = {15, 5, 24, 8, 1, 3, 16, 10, 20}; 
    mergeSort(arr, 0, arr.length-1);
    for(int i=0; i<arr.length; i++){
      System.out.print(arr[i] + " ");
    }
  }
}
