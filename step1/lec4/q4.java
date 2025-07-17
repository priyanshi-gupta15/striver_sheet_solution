package step1.lec4;

//gcd or hcf;
public class q4 {
  public static void main(String[] args) {
    int a = 10;
    int b = 20;
    //brute force;
    System.out.println(findGcd(a, b));
    //optimal approach
    gcd(a, b);

  }

  public static int findGcd(int n1, int n2) {
        // Initialize gcd to 1
        int gcd = 1;

        for (int i = 1; i <= Math.min(n1, n2); i++) {
            
            if (n1 % i == 0 && n2 % i == 0) {
                gcd = i;
            }
        }
        return gcd;
    }

  public static void gcd(int a, int b) {
    while(b!=0)
    {
      int temp = b;
      b = a % b;
      a = temp;
    }
    System.out.println(a);
      
  }
}
