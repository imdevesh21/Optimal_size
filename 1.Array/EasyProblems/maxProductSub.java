package EasyProblems;

public class maxProductSub {

  // public static int maxSub(int[] nums){
  //   int maxProduct = Integer.MIN_VALUE;
  //   for(int i=0; i<nums.length; i++){
  //     int product = 1;
  //     for(int j=i; j<nums.length; j++){
  //       product = product * nums[j];
  //       maxProduct = Math.max(maxProduct, product);
  //     }
  //   }
  //   return maxProduct;
  // }

  // the above sol for this problem will cost us O(n2) which is not optimal in terms of time complexity and the below sol time complexity is O(n);
  public static int maxProduct(int[] nums){
    int maxPro = Integer.MIN_VALUE;
    int preffix = 1;
    int suffix = 1;
    for(int i=0; i<nums.length; i++){
      preffix *= nums[i];
      maxPro = Math.max(maxPro, preffix);
      if(preffix == 0){
        preffix = 1;
      }
    }
    for(int i=nums.length-1; i>=0; i--){
      suffix *= nums[i];
      maxPro = Math.max(maxPro, suffix);
      if(suffix == 0){
        suffix = 1;
      }
    }
    return maxPro;
  }
  public static void main(String[] args) {
    int[] nums = {2, 3, -2, 4};
    // int ans = maxSub(nums);
    int ans = maxProduct(nums);
    System.out.println("The maximum subarray is: " + ans);
  }
}
