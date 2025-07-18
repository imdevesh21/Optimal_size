public class stackWorking {

  public static void main(String[] args) {
    System.out.println("This is main -> first");
    first();
  }

  public static void first(){
    System.out.println("This first -> second");
    second();
  }

  public static void second(){
    System.out.println("second -> hello");
  }
}
