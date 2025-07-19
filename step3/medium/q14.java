package step3.medium;
// Given an array of integers nums and an integer k, return the total number of subarrays whose sum equals to k.

// A subarray is a contiguous non-empty sequence of elements within an array./

// Input: nums = [1,1,1], k = 2
// Output: 2

import java.util.HashMap;

public class q14 {
    public static void main(String[] args) {
        int[] nums = { 1, 1, 1 };
        int k = 2;
        System.out.println(subarraySum(nums, k));

    }
  
    //using hashing
    public static int subarraySum(int[] nums, int k) {
        int c = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            int w = sum - k;
            c += map.getOrDefault(w, 0);
            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }
        return c;
    }
    
    //using 2 pointer;
    //not work here beacuse of all element are not positive or negative here ,combination of elements are occurs thats why two pointer fail here,
  
}
