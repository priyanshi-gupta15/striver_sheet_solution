package step1.lec1;

import java.util.*;
// what are arrays ,string
public class que5 {
  public static void main(String[] args) {
    // Array declaration and initialization
    int[] numbers = {1, 2, 3, 4, 5};
    
    // Accessing array elements
    System.out.println("First element: " + numbers[0]);
    System.out.println("Second element: " + numbers[1]);
    
    // String declaration and initialization
    String greeting = "Hello, World!";
    
    // Accessing characters in a string
    System.out.println("First character: " + greeting.charAt(0));
    System.out.println("Length of the string: " + greeting.length());
    
    // built-in methods of array
    System.out.println("Length of the array: " + numbers.length);
    System.out.println("Last element: " + numbers[numbers.length - 1]);
    // Looping through the array
    for (int i = 0; i < numbers.length; i++) {
      System.out.println("Element at index " + i + ": " + numbers[i]);
    }
    //copy of array
    int[] copiedArray = new int[numbers.length];
    System.arraycopy(numbers, 0, copiedArray, 0, numbers.length);

    //fill array
    int[] filledArray = new int[5];
    java.util.Arrays.fill(filledArray, 10); // Fill with 10

    // Sorting an array
    Arrays.sort(numbers);

  
    // String methods

    System.out.println("Uppercase: " + greeting.toUpperCase());
    System.out.println("Lowercase: " + greeting.toLowerCase());

    // Checking if the string contains a substring
    if (greeting.contains("World")) {
      System.out.println("The string contains 'World'.");
    } else {
      System.out.println("The string does not contain 'World'.");
    }

    // Finding the index of a character
    int index = greeting.indexOf('W');
    System.out.println("Index of 'W': " + index);
    // Replacing a substring
    String replacedGreeting = greeting.replace("World", "Java");
    System.out.println("Replaced greeting: " + replacedGreeting);
    // Splitting a string
    String[] words = greeting.split(", ");
    System.out.println("Words in the greeting:");
    for (String word : words) {
      System.out.println(word);
    }
    // Checking if the string starts with a prefix
    if (greeting.startsWith("Hello")) {
      System.out.println("The string starts with 'Hello'.");
    } else {
      System.out.println("The string does not start with 'Hello'.");
    }
    // Checking if the string ends with a suffix
    if (greeting.endsWith("!")) {
      System.out.println("The string ends with '!'.");
    } else {
      System.out.println("The string does not end with '!'.");
    }
    // Converting a string to a character array
    char[] charArray = greeting.toCharArray();
    System.out.println("Character array:");
    for (char c : charArray) {
      System.out.print(c + " ");
    }
    System.out.println();
    // Concatenating strings
    String additionalText = " How are you?";
    String fullGreeting = greeting + additionalText;
    System.out.println("Full greeting: " + fullGreeting);
    // Checking if the string is empty
    System.out.println(greeting.isEmpty());

    // Checking if the string is equal to another string
    String anotherGreeting = "Hello, World!";
    System.out.println(greeting.equals(anotherGreeting));
    
    // Looping through the string
    for (int i = 0; i < greeting.length(); i++) {
      System.out.println("Character at index " + i + ": " + greeting.charAt(i));
    }
  }
  
}
