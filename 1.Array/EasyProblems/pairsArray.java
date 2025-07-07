package EasyProblems;

public class pairsArray {

  // public static void returnPairs(int arr[]){
  //   int totalPairs = 0;
  //   for(int i=0; i<arr.length; i++){
  //     for(int j=i+1; j<arr.length; j++){
  //       System.out.println("(" + arr[i] + ", " + arr[j] + ")");
  //       totalPairs++;
  //     }
  //   }
  //   System.out.println("Total numbers of Pairs: " + totalPairs);
  // }

  // variation of this problem might be ask find pair of a given sum with target

  public static void returnPairs(int arr[], int target){
    int pairsum = 0;
    for(int i=0; i<arr.length; i++){
      for(int j=i+1; j<arr.length; j++){
        if(arr[i] + arr[j] == target){
          System.out.println("(" + arr[i] + ", " + arr[j] + ")");
          pairsum++;
        }
      }
    }
    System.out.println("The total pairs are in array: " + pairsum);
  }
  public static void main(String[] args) {
    int arr[] = {1, 2, 3, 4};
    int target = 3;
    returnPairs(arr, target);
  }
}
