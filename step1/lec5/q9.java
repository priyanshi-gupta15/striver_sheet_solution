package step1.lec5;

//leetcode 509;

//The Fibonacci numbers, commonly denoted F(n) form a sequence, called the Fibonacci sequence, such that each number is the sum of the two preceding ones, starting from 0 and 1. That is,

// F(0) = 0, F(1) = 1
// F(n) = F(n - 1) + F(n - 2), for n > 1.
public class q9 {
  public static void main(String[] args) {
    int n = 4;
    System.out.println(Fibonacci(n));
  }

  public static int Fibonacci(int n) {
    
      if(n<=1)
      {
        return n;
      }
      return Fibonacci(n-1) + Fibonacci(n-2);
    
      
  }
  
}
