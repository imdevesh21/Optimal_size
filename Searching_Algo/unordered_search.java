package Searching_Algo;
// code for the unordered linear search
public class unordered_search {

  // public static int unordered_Search(int[] arr, int data, int n){
  //   for(int i=0; i<n; i++){
  //     if(arr[i] == data){
  //       return i;
  //     }
  //   }
  //   return -1;
  // }

  // linear search
  public static int searching(int[] arr, int data){
    int n = arr.length;
    for(int i=0; i<n; i++){
      if(arr[i] == data)
        return i;
    }
    return -1;
  }
  public static void main(String[] args){
    int[] arr = {2, 1, 9, 4, 6, 3, 7};
    // int n = arr.length;
    int data = 3;
    // int ans = unordered_Search(arr, data, n);
    int ans = searching(arr, data);
    System.out.println(ans);
  }
}
