import java.util.Scanner;
import java.util.*;
public class factorialN {

  // private static int fact(int n){
  //   if(n == 0 || n == 1){
  //     return 1;
  //   }
  //   return n * fact(n - 1);
  // }

  // using memoization
  private static Map<Integer, Integer> memo = new HashMap<>();
  public static int fact(int n){
    if(n == 0 || n == 1) return 1;
    if(memo.containsKey(n)){
      return memo.get(n);
    }
    int ans = n * fact(n - 1);
    memo.put(n, ans);
    return ans;
  }
  public static void main(String[] agrs){
    Scanner s = new Scanner(System.in);
    System.out.print("Enter the value of N: ");
    int n = s.nextInt();
    int ans = fact(n);
    System.out.println("The factorial sum of N: " + ans);
    s.close();
  }
}
