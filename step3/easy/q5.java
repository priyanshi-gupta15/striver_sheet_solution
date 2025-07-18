package step3.easy;

// leetcode 189

// Given an integer array nums, rotate the array to the right by k steps, where k is non-negative.

import java.util.Arrays;


// Input: nums = [1,2,3,4,5,6,7], k = 3
// Output: [5,6,7,1,2,3,4]
public class q5 {
  public static void main(String[] args) {
    int[] nums = { 1, 2, 3, 4, 5, 6, 7 };
    int d = 3;
    rotate(nums, d);
    System.out.println(Arrays.toString(nums));

  }
  public static void reverseArray(int[] arr, int start, int end){
        while(start < end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
    }

    public static void rotate(int[] arr, int d) {
        int n= arr.length;
        d = d % n;
        reverseArray(arr, 0, n-d-1);
        reverseArray(arr, n-d, n-1);
        reverseArray(arr, 0, n-1);
    }
}