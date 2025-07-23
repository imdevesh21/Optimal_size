import java.util.HashMap;
import java.util.Scanner;
import java.util.*;
public class fibonacciNum {
  private Map<Integer, Integer> memo = new HashMap<>();
  public int fib(int n){
    // base case
    if(n <= 1) return n;

    // check if already completed
    if(memo.containsKey(n)){
      return memo.get(n);
    }
    int res = fib(n-1) + fib(n-2);
    memo.put(n, res);
    return res;
  }
  public static void main(String[] args){
    Scanner sb = new Scanner(System.in);
    System.out.println("Enter the value of n: ");
    int n = sb.nextInt();
    fibonacciNum obj = new fibonacciNum();
    System.out.println("Fibonacci(" + n + ") = " + obj.fib(n));
    sb.close();
  }
}
