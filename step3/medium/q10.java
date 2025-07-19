package step3.medium;

import java.util.HashSet;
import java.util.Set;

//leetcode 128;
// nums=[100,4,200,1,3,2]
// output=4;

public class q10 {
  public static void main(String[] args) {
    int[] nums = { 100, 4, 200, 1, 3, 2 };
    System.out.println(longestConsecutive(nums));

  }

  public static  int longestConsecutive(int[] nums) {
    Set<Integer> numSet = new HashSet<>();

    // Put all numbers in HashSet
    for (int num : nums) {
      numSet.add(num);
    }
   
    int longestStreak = 0;
    for (int num : numSet) {
            // Only start counting if it's the start of sequence
            if (!numSet.contains(num - 1)) {
                int currentNum = num;
                int currentStreak = 1;
                
                while (numSet.contains(currentNum + 1)) {
                    currentNum += 1;
                    currentStreak += 1;
                }
                
                longestStreak = Math.max(longestStreak, currentStreak);
            }
        }
        
        return longestStreak;
  }
  
}
