package step1.lec5;
// Print 1 to N using Recursion
public class q3 {
  public static void main(String[] args) {
    int n = 5;
    print(n);
  }

  public static void print(int n) {
    if (n == 0)
      return;
    print(n - 1);
    System.out.println(n);
      
  }
  
}
