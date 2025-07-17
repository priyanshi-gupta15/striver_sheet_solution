package step1.lec5;
// Print N to 1 using Recursion
public class q4 {
  public static void main(String[] args) {
    int n = 5;
    print(n);
  }

  public static void print(int n) {
    if (n == 0)
      return;
    System.out.println(n);
    print(n - 1);
    
      
  }
  
}
