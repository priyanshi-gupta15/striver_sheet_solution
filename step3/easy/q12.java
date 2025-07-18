package step3.easy;
 
// leetcode 136

// Given a non-empty array of integers nums, every element appears twice except for one. Find that single one.

// You must implement a solution with a linear runtime complexity and use only constant extra space.

// Input: nums = [4,1,2,1,2]

// Output: 4

public class q12 {
  public static void main(String[] args) {
    int[] nums = { 4, 1, 2, 1, 2 };
    int xor = 0;

    for (int i = 0; i < nums.length; i++) {
      xor ^= nums[i];
    }
    System.out.println(xor);
    
  }
  
}
