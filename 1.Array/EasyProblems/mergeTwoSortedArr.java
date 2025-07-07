package EasyProblems;

import java.util.ArrayList;
import java.util.List;

public class mergeTwoSortedArr {

  // public static void merge(int[] nums1, int m, int[] nums2, int n){
  // int p1 = m-1, p2 = n-1, i=m+n-1;
  // while(p2 >= 0){
  // if(p1 >= 0 && nums1[p1] > nums2[p2]){
  // nums1[i] = nums1[p1];
  // p1--;
  // } else {
  // nums1[i] = nums2[p2];
  // p2--;
  // }
  // i--;
  // }

  // using a List

  // }

  // public static List<Integer> merge(int[] nums1, int[] nums2) {
  //   List<Integer> merged = new ArrayList<>();

  //   int i = 0, j = 0;

  //   while (i < nums1.length && j < nums2.length) {
  //     if (nums1[i] <= nums2[j]) {
  //       merged.add(nums1[i]);
  //       i++;
  //     } else {
  //       merged.add(nums2[j]);
  //       j++;
  //     }
  //   }
  //   // Add remaining elements
  //   while (i < nums1.length) {
  //     merged.add(nums1[i++]);
  //   }

  //   while (j < nums2.length) {
  //     merged.add(nums2[j++]);
  //   }
  //   return merged;
  // }

  public static void main(String[] args) {
    int[] nums1 = { 1, 2, 3, 0, 0, 0 };
    int[] nums2 = { 2, 5, 6 };
    // int m = 3;
    // int n = 3;
    // merge(nums1, m, nums2, n);
    // for (int num : nums1) {
    //   System.out.print(num + " ");
    // }
    // System.out.println();

  }
}
