package step3.medium;
// leetcode 121
// Input: prices = [7,1,5,3,6,4]
// Output: 5
// Explanation: Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6-1 = 5.
// Note that buying on day 2 and selling on day 1 is not allowed because you must buy before you sell.
public class q6 {
  public static void main(String[] args) {
    int[] nums = { 7, 1, 5, 3, 6, 4 };
    System.out.println(maxProfit(nums));

  }
  public static int maxProfit(int[] prices)  {
    int maxPro = 0;
    int minPrice = Integer.MAX_VALUE;
    for (int i = 0; i < prices.length; i++) {
        minPrice = Math.min(minPrice, prices[i]);
        maxPro = Math.max(maxPro, prices[i] - minPrice);
    }
    return maxPro;
    }
  
}
