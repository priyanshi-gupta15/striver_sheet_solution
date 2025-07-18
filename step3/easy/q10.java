package step3.easy;

//leetcode 268
// Given an array nums containing n distinct numbers in the range [0, n], return the only number in the range that is missing from the array.

// Input: nums = [3,0,1]

// Output: 2
public class q10 {
  public static void main(String[] args) {
    int[] nums = { 3, 0, 1 };

    // sum of n terms is sum = (N + N+1)/2;
    System.out.println(missingNumber(nums));

  }

  public static int missingNumber(int[] nums) {
    int n = nums.length;
    int total = n * (n + 1) / 2;
    int sum = 0;
    for (int num : nums) {
      sum += num;
    }
    return total - sum;
  }

  // using hashing

  //   public int missingNumber(int[] nums) {
  //     Set<Integer> set = new HashSet<>();
  //     for (int num : nums) {
  //         set.add(num);
  //     }
  //     for (int i = 0; i <= nums.length; i++) {
  //         if (!set.contains(i)) return i;
  //     }
  //     return -1;
  // }


  //using count sort 1 more way;
}
