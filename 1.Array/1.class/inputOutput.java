import java.util.*;

// public class inputOutput {
//   public static void main(String[] args) {
//     int marks[] = new int[3];
//     Scanner input = new Scanner(System.in);

//     System.out.println("Please enter your marks: ");

//     marks[0] = input.nextInt();
//     marks[1] = input.nextInt();
//     marks[2] = input.nextInt();

//     System.out.println("Physics: " + marks[0]);
//     System.out.println("Chemistry: " + marks[1]);
//     System.out.println("Maths: " + marks[2]);

//     int percentage = (marks[0] + marks[1] + marks[2]) / 3;
//     System.out.println("percentage % : " + percentage);
//     input.close();
//   }
// }


public class inputOutput {
  public static void update(int marks[]){ //passing the refrance of marks
    for(int i=0; i<marks.length; i++){
      marks[i] += 1;
    }
  }
  public static void main(String[] args){
    int marks[] = {97, 99, 93};
    update(marks);

    // printing the marks with an updated value
    for(int i=0; i<marks.length; i++){
      System.out.println("Updated marks: " + marks[i]);
    }
  }
}
