package step3.easy;
// Longest Subarray with sum K | [Postives and Negatives]

import java.util.HashMap;
import java.util.Map;

// Problem Statement: Given an array and a sum k, we need to print the length of the longest subarray that sums to k.

// Input Format: N = 3, k = 1, array[] = {-1, 1, 1}
// Result: 3
// Explanation: The longest subarray with sum 1 is {-1, 1, 1}. And its length is 3.

public class q14 {
  public static void main(String[] args) {
    //using hashing
    
    int[] a = { -1, 1, 1 };
    int k = 1;
     int n = a.length; // size of the array.

        Map<Integer, Integer> preSumMap = new HashMap<>();
        int sum = 0;
        int maxLen = 0;
        for (int i = 0; i < n; i++) {
          //calculate the prefix sum till index i:
          sum += a[i];

          // if the sum = k, update the maxLen:
          if (sum == k) {
            maxLen = Math.max(maxLen, i + 1);
          }

          // calculate the sum of remaining part i.e. x-k:
          int rem = sum - k;

          //Calculate the length and update maxLen:
          if (preSumMap.containsKey(rem)) {
            int len = i - preSumMap.get(rem);
            maxLen = Math.max(maxLen, len);
          }

          //Finally, update the map checking the conditions:
          if (!preSumMap.containsKey(sum)) {
            preSumMap.put(sum, i);
          }
        }
      System.out.println(maxLen);

    
  }
  
}
