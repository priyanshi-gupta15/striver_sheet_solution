package step3.hard;

import java.util.ArrayList;
import java.util.List;

// leetcode 229
public class q2 {
  public static void main(String[] args) {
    // int[] nums = { 3, 2, 3 };
    int[] nums = { 1, 2 };
    System.out.println(majorityElement(nums));

  }
   public static List<Integer> majorityElement(int[] nums) {

       //can be solve with hashing 

       //but we use  Boyer-Moore Algorithm  this is used for constant spacae complexity  and o(n) time complexity;

       int count1=0,count2=0;
       Integer candidate1 = null,candidate2=null;
       for (int num : nums) {
            if (candidate1 != null && num == candidate1)
                count1++;
            else if (candidate2 != null && num == candidate2)
                count2++;
            else if (count1 == 0) {
                candidate1 = num;
                count1 = 1;
            } else if (count2 == 0) {
                candidate2 = num;
                count2 = 1;
            } else {
                count1--;
                count2--;
            }
        }

        // Second pass to verify
        count1 = count2 = 0;
        for (int num : nums) {
            if (num == candidate1) count1++;
            else if (num == candidate2) count2++;
        }

        List<Integer> result = new ArrayList<>();
        int n = nums.length;
        if (count1 > n / 3) result.add(candidate1);
        if (count2 > n / 3) result.add(candidate2);

        return result;
        
        
    }
  
}
