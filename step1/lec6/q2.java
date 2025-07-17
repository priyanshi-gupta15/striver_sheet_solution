package step1.lec6;
//Count frequency of each element in the array
// Input: arr[] = {10,5,10,15,10,5};

import java.util.HashMap;
import java.util.Map;

// Output: 10  3
// 	       5  2
//         15  1
// Explanation: 10 occurs 3 times in the array
// 	            5 occurs 2 times in the array
//              15 occurs 1 time in the array
public class q2 {
  public static void main(String[] args) {
    int[] arr = {10,5,10,15,10,5};
    HashMap<Integer, Integer> freq = new HashMap<>();

    for (int i = 0; i < arr.length; i++) {
      freq.put(arr[i], freq.getOrDefault(arr[i], 0) + 1);
    }
    
    for(Map.Entry<Integer,Integer> entry : freq.entrySet())
    {
      System.out.println(entry.getKey() + " " + entry.getValue());

    }

  }
  
}
