package step3.easy;

// leetcode 1752

// Given an array nums, return true if the array was originally sorted in non-decreasing order, then rotated some number of positions (including zero). Otherwise, return false.
public class q3 {
  public static void main(String[] args) {
    int[] nums = { 3, 4, 5, 1, 2  };
    System.out.println(check(nums));

  }

  public static  boolean check(int[] nums) {
    int count = 0, n = nums.length;

    for (int i = 0; i < n; i++) {
      if (nums[i] > nums[(i + 1) % n])
        count++;
      if (count > 1)
        return false;
    }

    return true;

  }
}
