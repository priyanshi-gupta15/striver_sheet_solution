package step3.easy;

// Longest Subarray with given Sum K(Positives)

// Problem Statement: Given an array and a sum k, we need to print the length of the longest subarray that sums to k.

// Input Format: N = 3, k = 5, array[] = {2,3,5}
// Result: 2
// Explanation: The longest subarray with sum 5 is {2, 3}. And its length is 2.

public class q13 {
  public static void main(String[] args) {
    //using two pointer optimize the code

    int[] a = { 2, 3, 5 };
    int k = 5;
    int n = a.length; // size of the array.

        int left = 0, right = 0; // 2 pointers
        long sum = a[0];
        int maxLen = 0;
        while (right < n) {
          // if sum > k, reduce the subarray from left
          // until sum becomes less or equal to k:
          while (left <= right && sum > k) {
            sum -= a[left];
            left++;
          }

          // if sum = k, update the maxLen i.e. answer:
          if (sum == k) {
            maxLen = Math.max(maxLen, right - left + 1);
          }

          // Move forward thw right pointer:
          right++;
          if (right < n)
            sum += a[right];
        }
      System.out.println(maxLen);
        
    
  }
}
