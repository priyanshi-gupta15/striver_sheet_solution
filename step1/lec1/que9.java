package step1.lec1;
//time complexity and space complexity
// basics and methods to find complexity
public class que9 {
  public static void main(String[] args) {
    // Example of O(1) time complexity
    int constantTimeOperation = 5; // This operation takes constant time regardless of input size
    System.out.println("Constant Time Operation: " + constantTimeOperation);

    // Example of O(n) time complexity
    int[] array = { 1, 2, 3, 4, 5 };
    for (int i = 0; i < array.length; i++) {
      System.out.println("Element at index " + i + ": " + array[i]);
    }

    // Example of O(n^2) time complexity
    for (int i = 0; i < array.length; i++) {
      for (int j = 0; j < array.length; j++) {
        System.out.println("Pair: (" + array[i] + ", " + array[j] + ")");
      }
    }
    // Example of O(log n) time complexity (binary search)
    int target = 3;
    int left = 0;
    int right = array.length - 1;
    while (left <= right) {
      int mid = left + (right - left) / 2;
      if (array[mid] == target) {
        System.out.println("Found target " + target + " at index " + mid);
        break;
      } else if (array[mid] < target) {
        left = mid + 1;
      } else {
        right = mid - 1;
      }
    }
    if (left > right) {
      System.out.println("Target " + target + " not found in the array.");
    }

    // Space Complexity Example
    int[] largeArray = new int[1000]; // O(n) space complexity
    System.out.println("Space Complexity Example: Array length is " + largeArray.length);

  }

}

// Note: Time complexity is a measure of how the runtime of an algorithm grows with the size of the input.
// Space complexity is a measure of how the memory usage of an algorithm grows with the size of the input.

// Common time complexities include O(1), O(log n), O(n), O(n log n), O(n^2), etc.
// Common space complexities include O(1), O(n), O(n^2), etc.
// To analyze the complexity of an algorithm, you can count the number of basic operations performed as a function of the input size.
// For example, in a loop that iterates n times, the time complexity is O(n) because the number of operations grows linearly with n.

//methods to find complexity:
// 1. Count the number of operations: Analyze the algorithm and count how many basic operations it performs in relation to the input size.
//2. Identify the dominant term: In a polynomial time complexity, identify the term that grows the fastest as the input size increases.
// 3. Use Big O notation: Express the time complexity using Big O notation, which describes the upper bound of the algorithm's growth rate.
//use akaike's method: For recursive algorithms, you can use the Master Theorem or recursion trees to analyze the time complexity.
//akra bazzi for recursive algorithms: For recursive algorithms, you can use the Akra-Bazzi method to analyze the time complexity. This method is particularly useful for divide-and-conquer algorithms.