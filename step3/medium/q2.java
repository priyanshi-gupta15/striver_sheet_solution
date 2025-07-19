package step3.medium;
// sort colors 

import java.util.Arrays;


// leetcode 75
// We will use the integers 0, 1, and 2 to represent the color red, white, and blue, respectively.

// You must solve this problem without using the library's sort function.

// Input: nums = [2,0,2,1,1,0]
// Output: [0,0,1,1,2,2]

 
public class q2 {
  public static void main(String[] args) {
    int[] nums = { 0, 2, 1, 2, 0, 1 };
    int n = nums.length;
    // sortColors(nums);
    // System.out.println(Arrays.toString(nums));
    sortArray(nums, n);
    System.out.println(Arrays.toString(nums));


  }

  public static void sortColors(int[] nums) {
    int count0 = 0;
    int count1 = 0;
    for (final int x : nums) {
      if (x == 0) {
        count0++;
      } else if (x == 1) {
        count1++;
      }
    }

    for (int i = 0; i < nums.length; i++) {
      if (count0 > 0) {
        nums[i] = 0;
        count0--;
      } else if (count1 > 0) {
        nums[i] = 1;
        count1--;
      } else {
        nums[i] = 2;
      }
    }
  }
  
    
  // 1 more way popular Dutch National flag algorithm. 
  public static void sortArray(int[] arr, int n) {
        int low = 0, mid = 0, high = n - 1;

        while (mid <= high) {
            if (arr[mid] == 0) {
                // swap arr[low] and arr[mid]
                int temp = arr[low];
                arr[low] = arr[mid];
                arr[mid] = temp;
                low++;
                mid++;
            } else if (arr[mid] == 1) {
                mid++;
            } else {
                // swap arr[mid] and arr[high]
                int temp = arr[mid];
                arr[mid] = arr[high];
                arr[high] = temp;
                high--;
            }
        }
    }

}
