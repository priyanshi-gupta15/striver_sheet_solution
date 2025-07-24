package step3.hard;
import java.util.*;
// Count the number of subarrays with given xor K

// Input Format: A = [4, 2, 2, 6, 4] , k = 6
// Result: 4
// Explanation: The subarrays having XOR of their elements as 6 are  [4, 2], [4, 2, 2, 6, 4], [2, 2, 6], [6]

public class q6 {
  public static void main(String[] args) {
    int[] a = { 5, 6, 7, 8, 9 };
    int k = 5;
    // int[] a = { 4, 2, 2, 6, 4 };
    // int k = 6;
    int ans = subarraysWithXorK(a, k);
    System.out.println("The number of subarrays with XOR k is: " + ans);

  }

  public static int subarraysWithXorK(int[] a, int k) {
    int n = a.length; //size of the given array.
    int xr = 0;
    Map<Integer, Integer> mpp = new HashMap<>(); //declaring the map.
    mpp.put(xr, 1); //setting the value of 0.
    int cnt = 0;

    for (int i = 0; i < n; i++) {
      xr ^= a[i];
      int x = xr ^ k;
      cnt += mpp.getOrDefault(x, 0);
      
      mpp.put(xr, mpp.getOrDefault(xr, 0) + 1);
    }
    return cnt;
  }  
}
