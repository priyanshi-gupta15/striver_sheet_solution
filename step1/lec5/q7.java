package step1.lec5;
// Reverse a given Array

import java.util.Arrays;


public class q7 {
  static void reverseArray(int arr[], int start, int end) {
      if (start < end) {
         int tmp = arr[start];
         arr[start] = arr[end];
         arr[end] = tmp;
         reverseArray(arr, start + 1, end - 1);
      }
   }
   public static void main(String[] args) {
      int arr[] = { 5, 4, 3, 2, 1};
      reverseArray(arr, 0, arr.length - 1);
      System.out.println(Arrays.toString(arr));
   }
  
}
