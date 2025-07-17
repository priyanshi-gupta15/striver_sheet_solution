package step1.lec6;
// Find the highest/lowest frequency element
// Input: array[] = {10,5,10,15,10,5};
// Output: 10 15
// Explanation: The frequency of 10 is 3, i.e. the highest and the frequency of 15 is 1 i.e. the lowest.

import java.util.HashMap;
import java.util.Map;

public class q3 {
  public static void main(String[] args) {
    int[] arr = {10,5,10,15,10,5};
    HashMap<Integer, Integer> freq = new HashMap<>();

    for (int i = 0; i < arr.length; i++) {
      freq.put(arr[i], freq.getOrDefault(arr[i], 0) + 1);
    }
        int maxFreq = 0, minFreq = arr.length;
        int maxEle = 0, minEle = 0;
    for(Map.Entry<Integer,Integer> entry : freq.entrySet())
    {
      int count = entry.getValue();
      int element = entry.getKey();

      if (count > maxFreq) {
        maxEle = element;
        maxFreq = count;
      }
      if (count < minFreq) {
        minEle = element;
        minFreq = count;
      }

    }
    System.out.println("The highest frequency element is: " + maxEle);
        System.out.println("The lowest frequency element is: " + minEle);

    
  }
}