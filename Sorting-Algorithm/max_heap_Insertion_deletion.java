public class max_heap_Insertion_deletion {

  // To heapify a subtree rooted with node i which is an index in arr[]

  static void heapify(int[] arr, int n, int i) {
    // Initialize largest as root
    int largest = i;

    // left largest = 2 * i+1
    int l = 2 * i + 1;

    // right largest 2 * i + 2
    int r = 2 * i + 2;

    // if left child is larger than root
    if (l < n && arr[l] > arr[largest]) {
      largest = l;
    }

    // if right child is larger than the root
    if (r < n && arr[r] > arr[largest]) {
      largest = r;
    }

    // if largest is not the root

    if (largest != i) {
      int temp = arr[i];
      arr[i] = arr[largest];
      arr[largest] = temp;

      // recursively heapify the affected subtree
      heapify(arr, n, largest);
    }
  }

  // main function to do heap sort
  static void heapSort(int[] arr) {
    int n = arr.length;

    for (int i = n / 2 - 1; i >= 0; i--) {
      heapify(arr, n, i);
    }

    // one by one extract an element from heap
    for (int i = n - 1; i > 0; i--) {
      int temp = arr[0];
      arr[0] = arr[i];
      arr[i] = temp;
      heapify(arr, i, 0);
    }
  }

  // A utility function to print array of size n
  static void printArray(int arr[]) {
    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i] + " ");
    }
    System.out.println();
  }

  public static void main(String[] args) {
    int arr[] = { 9, 4, 3, 8, 10, 2, 5 };
    heapSort(arr);
    System.out.println("Sorted array is ");
    printArray(arr);
  }
}
