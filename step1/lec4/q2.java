package step1.lec4;
//reverse number 

//leetcode problem number 7;
// Example 1:
// Input: x = 123
// Output: 321
public class q2 {
  public static void main(String[] args) {
    int x = 123;
    System.out.println(reverse(x));
    int y = -234;
    System.out.println(reverse(y));

  }
  public static int reverse(int x) {
        long rev = 0;

        while(x != 0) {
            rev = (rev * 10) + (x % 10);
            x = x / 10;
        }

        return (rev > Integer.MAX_VALUE || rev < Integer.MIN_VALUE) ? 0 : (int)rev;
    }
  
}
