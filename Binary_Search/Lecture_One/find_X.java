package Binary_Search.Lecture_One;

public class find_X {
  public static int findX(int[] nums, int low, int high, int x){
    if(low > high) return -1;

    int mid = low + (high - low)/2;
    if(nums[mid] == x)
      return mid;
    else if(x > nums[mid])
      return findX(nums, mid+1, high, x);
      return findX(nums, low, mid-1, x);
  }

  public static int search(int[] nums, int x){
    return findX(nums, 0, nums.length-1, x);
  }
  public static void main(String[] args){
    int[] nums = {1, 3, 5, 6, 7, 10};
    int x = 10;
    int ind = search(nums, x);
    if(ind == -1){
      System.out.println("target is not present");
    } else {
      System.out.println("target is present at index: " + ind);
    }
  }
}
