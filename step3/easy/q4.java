package step3.easy;


//leetcode 26

public class q4 {
  public static void main(String[] args) {
    // Given an integer array nums sorted in non-decreasing order, remove the duplicates in-place such that each unique element appears only once. The relative order of the elements should be kept the same. Then return the number of unique elements in nums.
    int[] nums = { 1, 1, 2 };
    System.out.println(removeDuplicates(nums));
  }
   public static int removeDuplicates(int[] nums) {
        int j = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                nums[j] = nums[i];
                j++;
            }
        }
        return j;
    }
}
