package step3.medium;
//leetcode 2149
// input: nums = [3,1,-2,-5,2,-4]

import java.util.Arrays;

// Output: [3,-2,1,-5,2,-4]
public class q7 {
  public static void main(String[] args) {
    int[] nums = {3,1,-2,-5,2,-4};
    System.out.println(Arrays.toString(rearrangeArray(nums)));

  }

  public static  int[] rearrangeArray(int[] nums) {
    int[] ans = new int[nums.length];
    int pos = 0, neg = 1;
    for (int i = 0; i < nums.length; i++) {
      if (nums[i] < 0) {
        ans[neg] = nums[i];
        neg += 2;
      } else {
        ans[pos] = nums[i];
        pos += 2;
      }
    }
    return ans;

  }
}
