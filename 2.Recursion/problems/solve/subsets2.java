package solve;
import java.sql.Array;
import java.util.*;
import java.util.stream.Gatherer.Integrator;

public class subsets2 {

//   // list to store the final subset
//   private List<List<Integer>> subsets;
//   // the provided array of numbers, from which we will form subsets
//   private int[] numbers;

//   // public method to find all subsets with duplicates
//   private List<List<Integer>> subsetWithDuplicates(int[] nums){
//     subsets = new ArrayList<>();
//     Arrays.sort(nums);
//     this.numbers = nums;
//     backtracking(0, new ArrayList<>());
//     return subsets;
//   }

//   private void backtracking(int index, List<Integer> currentSubsets){
//     subsets.add(new ArrayList<>(currentSubsets));

//     // Iterate  through the numbers starting from index
//     for(int i=index; i<numbers.length; ++i){
//       // skip duplicates check if current element is same as the previous element
//       if(i != index && numbers[i] == numbers[i-1]){
//         continue; //if it's a duplicate continue
//       }
//       // include current element in the subset
//       currentSubsets.add(numbers[i]);

//       // recuresively call backtrack for the next elements
//       backtracking(i+1, currentSubsets);

//       // Exclude the current element from the subset(backtracking step)
//       currentSubsets.remove(currentSubsets.size() - 1);
//     }
//   }

  static void printAns(List<List<Integer>> ans){
    System.out.print("The unique subsets are: ");
    System.out.print(ans.toString().replace(",", " "));
  }

  public static void findSets(int ind, int[] nums, List<Integer> res, List<List<Integer>> currentSets){
    currentSets.add(new ArrayList<>(res));
    for(int i=ind; i<nums.length; i++){
      if(i > ind && nums[i] == nums[i-1]){
        continue;
      }
      res.add(nums[i]);
      findSets(i + 1, nums, res, currentSets);
      res.remove(res.size() - 1);
    }
  }


  public static List<List<Integer>> subsetsWithDup(int[] nums){
    Arrays.sort(nums);
    List<List<Integer>> subsets = new ArrayList<>();
    findSets(0, nums, new ArrayList<>(), subsets);
    // ArrayList<ArrayList<Integer>> result = new ArrayList<>();
    return subsets;
  }

  public void main(String[] args) {
    // Scanner sc = new Scanner(System.in);
    // System.out.print("Enter the size of array: ");
    // int n = sc.nextInt();
    // int[] arr = new int[n];
    // System.out.print("Enter the array elements: ");
    // for(int i=0; i<n; i++){
    //   arr[i] = sc.nextInt();
    // }
    // // List<List<Integer>> subsets = subsetWithDuplicates(arr);
    // System.out.print("All subsets are lexicographically sorted. ");
    // for(List<Integer> subset : subsets){
    //   for(int num : subset){
    //     System.out.print(num + " ");
    //   }
    //   System.out.println();
    // }
    // sc.close();
    int[] nums = {1, 2, 3};
    List < List<Integer>> ans = subsetsWithDup(nums);
    printAns(ans);
  }
}
