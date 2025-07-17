package step2.lec2;

import java.util.Arrays;

public class recusive_bubblesort {
  public static void main(String[] args) {
     int arr[] = {13, 46, 24, 52, 20, 9};
     int n = arr.length;
     bubble_sort(arr, n);
     System.out.println(Arrays.toString(arr));

  }
  static void bubble_sort(int[] arr, int n) {
        //Base case: range == 1.
        if (n == 1) return;

        int didSwap = 0;
        for (int j = 0; j <= n - 2; j++) {
            if (arr[j] > arr[j + 1]) {
                int temp = arr[j];
                arr[j] = arr[j + 1];
                arr[j + 1] = temp;
                didSwap = 1;
            }
        }

        // if no swapping happens.
        if (didSwap == 0) return;

        //Range reduced after recursion:
        bubble_sort(arr, n - 1);

    }
}
