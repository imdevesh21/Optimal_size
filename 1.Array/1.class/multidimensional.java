public class multidimensional {
  public static void main(String[] args) {
    // declearing 2-D array
    // 2-D array
  //   int arr[][] = {
  //     {0, 1},
  //     {2, 3},
  //     {4, 5},
  //   };

  //   for(int i=0; i<arr.length; i++){
  //     for(int j=0; j<arr[i].length; j++){
  //       System.out.println(arr[i][j] + " ");
  //     }
  //   }
  // }


  // declearing 3-d array
    int arr[][][] = {
        {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12}
        },
        {
            {13, 14, 15, 16},
            {17, 18, 19, 20},
            {21, 22, 23, 24}
        }
      };

        for(int i=0; i<arr.length; i++){
          for(int j=0; j<arr[i].length; j++){
            for(int k=0; k<arr[i][j].length; k++){
              System.out.println(arr[i][j][k] + " ");
            }
          }
        }
  }
}
