public class Shell_Sort {

  public static void sort(int[] arr){
    int n = arr.length;

    for(int gap=n/2; gap>=1; gap/=2){
      for(int j=gap; j<n; j++){
        for(int i=j-gap; i>=0; i-=gap){
          if(arr[i+gap] > arr[i]){
            break;
          } else {
            int temp = arr[i+gap];
            arr[i+gap] = arr[i];
            arr[i] = temp;
          }
        }
      }
    }
  }
  public static void main(String[] args){
    int[] arr = {33, 45, 62, 12, 98};
    System.out.print("Array before sorting: ");
    for(int i=0; i<arr.length; i++){
    System.out.print(arr[i] + " ");
    }
    System.out.println();

    // Sort the array
    sort(arr);

    System.out.print("Array after sorting: ");
    for(int i=0; i<arr.length; i++){
      System.out.print(arr[i] + " ");
    }
    System.out.println();
  }
}
