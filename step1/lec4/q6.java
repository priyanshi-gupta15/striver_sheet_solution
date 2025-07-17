package step1.lec4;

// print all divisor;
  // Input:N = 36
              //  
  // Output:[1, 2, 3, 4, 6, 9, 12, 18, 36]
  // 
  // Explanation: The divisors of 36 are 1, 2, 3, 4, 6, 9, 12, 18, 36.
public class q6 {
  public static void main(String[] args) {

    int n = 36;
    //brute force
    finddivisor(n);
    //optimal approach;
    findalldivisor(n);

  }

  public static void finddivisor(int n) {
    for (int i = 1; i <= n; i++) {
      if (n % i == 0) {
        System.out.print(i + " ");
      }

    }
    System.out.println();
      
  }
  public static void findalldivisor(int n) {
    for (int i = 1; i*i<= n; i++) {
      if (n % i == 0) {
        System.out.print(i + " ");

        if(i!=n/i)
        {
          System.out.print(n/i+ " ");

        }
      }

    }
    System.out.println();
    //we can sort output to store in arraylist;
      
  }
  
}
