package step3.easy;
// leetcode 283
//move zeros to end;

import java.util.Arrays;

// Input: nums = [0,1,0,3,12]
// Output: [1,3,12,0,0]
public class q7 {
  public static void main(String[] args) {
    int[] nums = { 0, 1, 0, 3, 12 };
    moveZeroes(nums);
    System.out.println(Arrays.toString(nums));
  }
   public static void moveZeroes(int[] nums) {
        int left = 0;

        for (int right = 0; right < nums.length; right++) {
            if (nums[right] != 0) {
                int temp = nums[right];
                nums[right] = nums[left];
                nums[left] = temp;
                left++;
            }
        }    
        
    }
  
}
