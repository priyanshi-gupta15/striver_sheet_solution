package step1.lec6;
//letcode 1838

import java.util.Arrays;

public class leetcodeque {
  public static void main(String[] args) {
    int[] nums = { 1, 2, 4 };
    int k = 5;
    System.out.println(maxFrequency(nums, k));
  }
  

   public static  int maxFrequency(int[] nums, int k) {
         Arrays.sort(nums);
        long windowSum = 0;
        int maxFreq = 0;
        int l = 0;

        for (int r = 0; r < nums.length; r++) {
            windowSum += nums[r];

            // Shrink window if cost exceeds k
            while (windowSum + k < (long) nums[r] * (r - l + 1)) {
                windowSum -= nums[l];
                l++;
            }
            maxFreq = Math.max(maxFreq, r - l + 1);
        }

        return maxFreq;
        
    }
}
