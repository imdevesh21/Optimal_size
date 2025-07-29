package solve;
import java.util.*;

import java.util.*;

public class SubsetsGenerator {

    // Recursive method to generate subsets
    // static void generateSubsets(int index, int[] arr, List<List<Integer>> res, List<Integer> current) {
    //     if (index == arr.length) {
    //         res.add(new ArrayList<>(current));  // Add a copy of current subset
    //         return;
    //     }

    //     // Include current element
    //     current.add(arr[index]);
    //     generateSubsets(index + 1, arr, res, current);

    //     // Backtrack: remove the included element
    //     current.remove(current.size() - 1);

    //     // Exclude current element
    //     generateSubsets(index + 1, arr, res, current);
    // }

    // Main method to generate and sort subsets
    // static List<List<Integer>> getAllSubsets(int[] arr) {
    //     Arrays.sort(arr);  // Sort input for lexicographic correctness

    //     List<List<Integer>> result = new ArrayList<>();
    //     List<Integer> current = new ArrayList<>();

    //     generateSubsets(0, arr, result, current);

    //     // Lexicographically sort all subsets
    //     result.sort((a, b) -> {
    //         int minLen = Math.min(a.size(), b.size());
    //         for (int i = 0; i < minLen; i++) {
    //             if (!a.get(i).equals(b.get(i))) {
    //                 return a.get(i) - b.get(i);
    //             }
    //         }
    //         return a.size() - b.size();
    //     });

    //     return result;
    // }

    // using bitmask
    public static List<List<Integer>> getAllSubsets(int[] nums){
        Arrays.sort(nums);
        int n = nums.length;

        List<List<Integer>> res = new ArrayList<>();
        for(int i=0; i<(1<<n); i++){
            ArrayList<Integer> current = new ArrayList<>();
            for(int j=0; j<n; j++){
                if((i & (1 << j)) != 0){
                    current.add(nums[j]);
                }
            }
            res.add(current);
        }
        res.sort((a, b) -> {
            int len = Math.min(a.size(), b.size());
            for(int i=0; i<len; i++){
                int comp = Integer.compare(a.get(i), b.get(i));
                if(comp != 0) return comp;
            }
            return Integer.compare(a.size(), b.size());
        });
        return res;
    }

    // Main driver method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.print("Enter array elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        List<List<Integer>> subsets = getAllSubsets(arr);

        System.out.println("All subsets (lexicographically sorted):");
        for (List<Integer> subset : subsets) {
            for (int num : subset) {
                System.out.print(num + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}
