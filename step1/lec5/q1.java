package step1.lec5;
//  Understand Recursion by printing something N times
// https://takeuforward.org/recursion/introduction-to-recursion-understand-recursion-by-printing-something-n-times/
public class q1 {
  public static void main(String[] args) {
    int n = 5;
    print(n);
  }

  public static void print(int n)
  {
    //before recursion part
    //base condition;
    if (n == 0)
      return;
    System.out.println(n); 
    print(n - 1); // function calling itself
    //after recursion part
  }
}
