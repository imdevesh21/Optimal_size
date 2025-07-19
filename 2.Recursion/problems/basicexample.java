import java.util.Scanner;

public class basicexample {

  // public static int sum(int x, int y){
  //   // return x + y; // sum of two number
  //   return x * y;
  // }
  // public static void main(String[] args) {
  //   Scanner reader = new Scanner(System.in);
  //   System.out.println("Enter the value of x: ");
  //   int x = reader.nextInt();
  //   System.out.println("Enter the value of y: ");
  //   int y = reader.nextInt();

  //   int res = sum(x, y);
  //   System.out.println("Sum: " + res);
  // }

  public static int power(int a, int b) {
    if(b == 0){
      return 1;
    }
    return a * power(a, b - 1);
  
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the num value: ");
    int x = sc.nextInt();
    int y = sc.nextInt();
    int ans = power(x, y);
    System.out.println(ans);
  }
}
