package step1.lec1;
// function pass by refference and pass by value
public class que8 {
  public static void main(String[] args) {

    // Demonstrating pass by value
    int x = 5;
    int y = 10;
    System.out.println("Before swap: x = " + x + ", y = " + y);
    swap(x, y);
    System.out.println("After swap: x = " + x + ", y = " + y);
    // Note: The values of a, b, x, and y remain unchanged after the swap function call.

    //pass by reference
    int[] arr = { 1, 2, 3 };
    System.out.println("Before modification: arr[0] = " + arr[0]);
    modifyArray(arr);
    System.out.println("After modification: arr[0] = " + arr[0]);

  }
  // Function to modify an array (demonstrating pass by reference)
  public static void modifyArray(int[] array) {
    array[0] = 100; // Modifying the first element of the array
    System.out.println("Inside modifyArray: array[0] = " + array[0]);
  }
  
  // Function to swap two integers
  public static void swap(int x, int y) {
    int temp = x;
    x = y;
    y = temp;

    System.out.println("Inside swap: x = " + x + ", y = " + y);
  }
  
  // Note: This demonstrates pass by value, as the original variables a and b remain unchanged.
  // In Java, primitive types are passed by value, meaning the function receives a copy of the variable.
  // If you want to demonstrate pass by reference, you would need to use objects or arrays.
  // For example, you can create a class to hold the values and pass an instance of that class.
  // However, Java does not support true pass by reference for primitive types.
}
