package step1.lec1;
// for loop
public class que6 {
  public static void main(String[] args) {
    // Print numbers from 1 to 10 using a for loop
    for (int i = 1; i <= 10; i++) {
      System.out.println("Number: " + i);
    }

    // for each
    String[] fruits = { "Apple", "Banana", "Cherry" };
    for (String fruit : fruits) {
      System.out.println("Fruit: " + fruit);
    }
    // Nested for loop
    for (int i = 1; i <= 3; i++) {
      for (int j = 1; j <= 3; j++) {
        System.out.println("i: " + i + ", j: " + j);
      }
    }
    
  }
  
}
