package step3.hard;
// Length of the longest subarray with zero Sum

import java.util.HashMap;


// Problem Statement: Given an array containing both positive and negative integers, we have to find the length of the longest subarray with the sum of all elements equal to zero.

// contains both negative and postive so we use hashing

// Input Format: N = 6, array[] = {9, -3, 3, -1, 6, -5}
// Result: 5
// Explanation: The following subarrays sum to zero:
// {-3, 3} , {-1, 6, -5}, {-3, 3, -1, 6, -5}
// Since we require the length of the longest subarray, our answer is 5!

public class q5 {

  public static void main(String[] args) {
    // int array[] = { 9, -3, 3, -1, 6, -5 };
    int array[] = { 6, -2, 2, -8, 1, 7, 4, -10 };
    System.out.println(maxlen(array));
  }

  public static int maxlen (int[] nums)
  {
    int max = 0;
    int sum = 0;
    HashMap<Integer, Integer> map = new HashMap<>();
    for (int i = 0; i < nums.length; i++) {
      sum += nums[i];
      if(sum==0)
      {
        max = i+1;
      }
      else {
        if(map.containsKey(sum))
        {
          max = Math.max(max, i - map.get(sum));
        }
        else {
          map.put(sum, i);
        }
      }
        
    }
    return max;
  }
  
}
