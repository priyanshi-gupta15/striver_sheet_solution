package step3.easy;
// Rotate array by K elements

import java.util.Arrays;

// Problem Statement: Given an array of integers, rotating array of elements by k elements either left or right.
public class q6 {
  public static void main(String[] args) {
    int[] nums = { 1, 2, 3, 4, 5, 6, 7 };
    int d = 3;
    rotate(nums, d,"right");
    System.out.println(Arrays.toString(nums));
    int[] nums1 = {3,7,8,9,10,11} ;
    int d1 = 3;
    rotate(nums1, d1, "left");
    System.out.println(Arrays.toString(nums1));

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

    public static void rotate(int[] arr, int d,String position) {
        int n= arr.length;
        d = d % n;
        if (position.equals("right"))
        {
          reverseArray(arr, 0, n - d - 1);
          reverseArray(arr, n - d, n - 1);
          reverseArray(arr, 0, n - 1);
        }
        else {
          reverseArray(arr, 0, d-1);
          reverseArray(arr, d, n - 1);
          reverseArray(arr, 0, n - 1);
          
        }
    }
}

