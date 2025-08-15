public class bubble_Sort {

  public static void bubbleSort(int[] nums){
    int n = nums.length;
    for(int i=0; i<n-1; i++){
      int flag = 0;
      for(int j=0; j<n-1-i; j++){
        if(nums[j] > nums[j+1]){
          int temp = nums[j];
          nums[j] = nums[j+1];
          nums[j+1] = temp;
          flag = 1;
        }
      }
      if(flag == 0){
        break;
      }
    }
  }
  public static void main(String[] args){
    int[] nums = {16, 15, 6, 8, 5};
    bubbleSort(nums);
    for (int num : nums) {
      System.out.print(num + " ");
    }
  }
}
