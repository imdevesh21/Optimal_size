import java.util.Arrays;

public class QuickSortFirstPivot {

    // public static void quickSort(int[] arr, int low, int high, String call) {
    //     if (low < high) {
    //         System.out.println("Calling quickSort(" + low + ", " + high + ") from " + call);
    //         int pivotIndex = partition(arr, low, high);

    //         System.out.println("After partition: " + Arrays.toString(arr));
    //         System.out.println("Pivot " + arr[pivotIndex] + " placed at index " + pivotIndex);
    //         System.out.println("------------------------------------------------");

    //         quickSort(arr, low, pivotIndex - 1, "left of " + arr[pivotIndex]);
    //         quickSort(arr, pivotIndex + 1, high, "right of " + arr[pivotIndex]);
    //     }
    // }

    // // Partition using first element as pivot
    // public static int partition(int[] arr, int low, int high) {
    //     int pivot = arr[low];
    //     int i = high + 1;

    //     for (int j = high; j > low; j--) {
    //         if (arr[j] > pivot) {
    //             i--;
    //             // swap arr[i] and arr[j]
    //             int temp = arr[i];
    //             arr[i] = arr[j];
    //             arr[j] = temp;
    //         }
    //     }

    //     // Swap pivot (arr[low]) with arr[i - 1]
    //     int temp = arr[i - 1];
    //     arr[i - 1] = arr[low];
    //     arr[low] = temp;

    //     return i - 1; // new pivot position
    // }
    public static void quickSort(int[] arr, int low, int high){
        if(low < high){
            int partIndx = partition(arr, low, high);
            quickSort(arr, partIndx+1, high);
            quickSort(arr, low, partIndx-1);
        }
    }

    public static int partition(int[] arr, int low, int high){
        int pivot = arr[high];
        int i = low - 1;
        for(int j=low; j<high; j++){
            if(arr[j] < pivot){
                i++;

                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[i+1];
        arr[i+1] = arr[high];
        arr[high] = temp;
        return i-1;
    }

    public static void main(String[] args){
        int[] arr = {10, 15, 1, 2, 9, 16, 11};
        
        partition(arr, 0, arr.length-1);
        for(int i=1; i<arr.length; i++){
            System.out.println(arr[i]);
        }
    }
    // public static void main(String[] args) {
    //     int[] arr = {10, 15, 1, 2, 9, 16, 11};

    //     System.out.println("Original Array: " + Arrays.toString(arr));
    //     System.out.println("===============================================");
    //     quickSort(arr, 0, arr.length - 1, "main");
    //     System.out.println("===============================================");
    //     System.out.println("Final Sorted Array: " + Arrays.toString(arr));
    // }
}
