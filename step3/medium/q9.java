package step3.medium;

import java.util.ArrayList;

//Problem Statement: Given an array, print all the elements which are leaders. A Leader is an element that is greater than all of the elements on its right side in the array.
// Input:
//  arr = [4, 7, 1, 0]
// Output:
//  7 1 0
// Explanation:
//  Rightmost element is always a leader. 7 and 1 are greater than the elements in their right side.
public class q9 {
  public static void main(String[] args) {
    int n = 6;
    int arr[] = { 10, 22, 12, 3, 0, 6 };
    System.out.println(leaders(arr,n));

  }

  public static ArrayList<Integer>  leaders(int[] arr,int n) {
  ArrayList<Integer> ans= new ArrayList<>();
  
    int max = arr[n - 1];
 
    ans.add(arr[n-1]);
    
    // Start checking from the end whether a number is greater
    // than max no. from right, hence leader.
    for (int i = n - 2; i >= 0; i--)
      if (arr[i] > max) {
        ans.add(arr[i]);
        max = arr[i];
      }

  return ans;
      
  }
  
}
