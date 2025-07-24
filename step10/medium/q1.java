package step10.medium;
// Given a string s,find the length of the longest substring without duplicate characters.


// leetcode 3
public class q1 {
  public static void main(String[] args) {
    String s = "bbbbb";
    System.out.println(lengthOfLongestSubstring(s));

  }
  public static  int lengthOfLongestSubstring(String s) {
        int max = 0;
        int left = 0, right = 0;
        while(right < s.length()){
            char ch = s.charAt(right);
            for(int i = left; i < right; i++){
                if(s.charAt(i)==ch){
                    left = i+1;
                    break;
                }
            }
            max = Math.max(max, right-left+1);
            right++;
        }
        return max;
    }
  
}
