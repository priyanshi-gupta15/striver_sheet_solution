package step1.lec4;

//check palindrome number;
//leetcode 9;
// Input: x = 121
// Output: true
// Explanation: 121 reads as 121 from left to right and from right to left.
public class q3 {
  public static void main(String[] args) {
    
    int a = 12321;
    System.out.println(ispaindrome(a));

  }

  public static boolean  ispaindrome(int x)
  {
    int rev = 0;
    int og = x;
    while (x != 0) {
      rev = rev * 10 + (x % 10);
      x /= 10;
    }

    return og == rev;
  }
  
}
