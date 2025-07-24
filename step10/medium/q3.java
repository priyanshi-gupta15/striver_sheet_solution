package step10.medium;

import java.util.HashMap;
import java.util.Map;

public class q3 {
  public static void main(String[] args) {
    int[] fruits = { 1, 2, 1 };
    System.out.println(totalFruit(fruits));

  }
   public static int totalFruit(int[] fruits) {
        Map<Integer, Integer> map = new HashMap<>();
        int left = 0, maxLen = 0;

        for (int right = 0; right < fruits.length; right++) {
            // Add fruit to map
            map.put(fruits[right], map.getOrDefault(fruits[right], 0) + 1);

            // If we have more than 2 types, shrink window
            while (map.size() > 2) {
                map.put(fruits[left], map.get(fruits[left]) - 1);
                if (map.get(fruits[left]) == 0) {
                    map.remove(fruits[left]);
                }
                left++; // shrink window
            }

            // Update maximum length
            maxLen = Math.max(maxLen, right - left + 1);
        }

        return maxLen;
        
    }
  
  
}
