package step3.medium;
// Given an array nums of size n, return the majority element.

// leetcode 169

import java.util.HashMap;
import java.util.Map;



// The majority element is the element that appears more than ⌊n / 2⌋ times. You may assume that the majority element always exists in the array.
// Input: nums = [2,2,1,1,1,2,2]
// Output: 2
 

public class q3 {

  public static void main(String[] args) {
    int[] nums = { 2, 2, 1, 1, 1, 2, 2 };
    // Arrays.sort(nums);
    // System.out.println(nums[nums.length / 2]);

    //hashing approach
    System.out.println(majorityElement(nums));

  }

  public static int majorityElement(int[] v) {
      //size of the given array:
      int n = v.length;

      //declaring a map:
      HashMap<Integer, Integer> mpp = new HashMap<>();

      //storing the elements with its occurnce:
      for (int i = 0; i < n; i++) {
          int value = mpp.getOrDefault(v[i], 0);
          mpp.put(v[i], value + 1);
      }

      //searching for the majority element:
      for (Map.Entry<Integer, Integer> it : mpp.entrySet()) {
          if (it.getValue() > (n / 2)) {
              return it.getKey();
          }
      }

      return -1;
  }
    

  //boyre moore algo optimized algo
   public static int majorityElements(int[] nums) {
        int count = 0;
        int candidate = 0;

        for (int num : nums) {
            if (count == 0) {
                candidate = num;  // Choose a new candidate
            }
            count += (num == candidate) ? 1 : -1;
        }

        return candidate;
    }
  
}
