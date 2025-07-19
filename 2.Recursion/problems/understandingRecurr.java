public class understandingRecurr {
  // understanding recurssion with an example of a persons in queue(line)
  static int peopleCount(Person currPerson){
    // if no one behind
    if(currPerson == null || currPerson.behind == null){
      return 0;
    }
    return 1 + peopleCount(currPerson.behind);
  }
  public static void main(String[] args){
    Person A = new Person("A");
    Person B = new Person("B");
    Person C = new Person("C");
    Person D = new Person("D");

    A.behind = B;
    B.behind = C;
    C.behind = D;

    System.out.println("People behind A: " + peopleCount(A)); // Output: 3
    System.out.println("People behind B: " + peopleCount(B)); // Output: 2
    System.out.println("People behind B: " + peopleCount(C)); // Output: 2
    System.out.println("People behind D: " + peopleCount(D));
  }
}
