package step1.lec1;

import java.util.*;
//user input and outpu
public class que1 {
  public static void main(String[] args) {

    // Declare a variable to hold the user's name
    String name;

      // Prompt the user to enter their name
      try ( // Create a Scanner object to read input from the console
              Scanner scanner = new java.util.Scanner(System.in)) {
          // Prompt the user to enter their name
          System.out.print("Enter your name: ");
          // Read the user's name from the console
          name = scanner.nextLine();
          // Print a greeting message that includes the user's name
          System.out.println("Hello, " + name + "! Welcome to the Java programming world.");
          // Close the scanner to prevent resource leak
      }
  }

}
