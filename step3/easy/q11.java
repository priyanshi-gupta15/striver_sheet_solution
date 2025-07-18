package step3.easy;
//max consecutive ones

// leetcode 485
// Input: nums = [1,1,0,1,1,1]
// Output: 3
// Explanation: The first two digits or the last three digits are consecutive 1s. The maximum number of consecutive 1s is 3.

public class q11 {
  public static void main(String[] args) {
    int nums[] = {1,1,0,1,1,1};
    int max = 0;
    int count = 0;
    for (int i = 0; i < nums.length; i++) {
      if (nums[i] == 1) {
        count++;
        max = Math.max(max, count);
      } else {
        count = 0;
      }

    }
    System.out.println(max); 
  }
}
