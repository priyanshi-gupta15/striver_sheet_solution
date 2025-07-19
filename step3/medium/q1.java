package step3.medium;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

//leetcode 1;

// You may assume that each input would have exactly one solution, and you may not use the same element twice.

// You can return the answer in any order.
// Input: nums = [2,7,11,15], target = 9
// Output: [0,1]
// Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].

public class q1 {
  public static void main(String[] args) {
    int[] arr = {2, 6, 5, 8, 11};
    int target = 14;
    System.out.println(Arrays.toString(twoSum(arr, target)));

  }

  //brute force approach
  //  for (int i = 0; i < nums.length; i++) {
  //  for (int j = i + 1; j < nums.length; j++) {
  //        if (nums[i] + nums[j] == target) {
  //            return new int[] { i, j };
  //         }
  //      }
  //   }

  //using hashmap Most Optimized Approach
  public static int[] twoSum(int[] arr, int target) {
    Map<Integer, Integer> map = new HashMap<>();
    for (int i = 0; i < arr.length; i++) {
        int complement = target - arr[i];
        if (map.containsKey(complement)) {
            return new int[]{map.get(complement), i};
        }
        map.put(arr[i], i);
    }
    return new int[]{-1, -1};
}


}
