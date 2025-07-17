package step1.lec1;
//data types
public class que2 {
  public static void main(String[] args) {
    // Primitive data types
    byte b = 10; // 1 byte
    short s = 1000; // 2 bytes
    int i = 100000; // 4 bytes
    long l = 10000000000L; // 8 bytes
    float f = 10.5f; // 4 bytes
    double d = 20.99; // 8 bytes
    char c = 'A'; // 2 bytes
    boolean bool = true; // 1 bit

    // Displaying the values of the variables
    System.out.println("Byte: " + b);
    System.out.println("Short: " + s);
    System.out.println("Integer: " + i);
    System.out.println("Long: " + l);
    System.out.println("Float: " + f);
    System.out.println("Double: " + d);
    System.out.println("Character: " + c);
    System.out.println("Boolean: " + bool);
    // Non-primitive data types
    String str = "Hello, World!"; // String is a non-primitive data type
    System.out.println("String: " + str);
    // Arrays are also non-primitive data types
    int[] arr = { 1, 2, 3, 4, 5 }; // Array of integers
    System.out.print("Array: ");
    for (int num : arr) {
      System.out.print(num + " ");
    }
    System.out.println();
    // Example of a class (non-primitive data type)
    Person person = new Person("John", 30);
    System.out.println("Person Name: " + person.name + ", Age: " + person.age);
    
  }
  // Example class to demonstrate non-primitive data type
  static class Person {
    String name;
    int age;
   //constructor
    Person(String name, int age) {
      this.name = name;
      this.age = age;
    }
  }
  
}
