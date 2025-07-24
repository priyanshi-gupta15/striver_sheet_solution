package step10.medium;
// leetcode 1004
// max consecutive 3

public class q2 {
  public static void main(String[] args) {
    int[] nums = { 1, 1, 1, 0, 0, 0, 1, 1, 1, 1, 0 };
    int k = 2;
    System.out.println(longestOnes(nums, k));

  }
   public static int longestOnes(int[] nums, int k) {
        int left = 0;
        int maxlen = 0;
        int zerocnt = 0;

        for (int right = 0; right < nums.length; right++) {
            // If current element is 0, increment zeroCount
            if (nums[right] == 0)
                zerocnt++;

            while (zerocnt > k) {
                if (nums[left] == 0)
                    zerocnt--;

                left++;
            }

                // Update max length of valid window
                maxlen = Math.max(maxlen, right - left + 1);
            
        }
        
        return maxlen;
    }
  
}
