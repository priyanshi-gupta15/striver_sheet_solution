package step1.lec4;
//  Input:N = 2           
//     Output:True
    
//     Explanation: 2 is a prime number because it has two divisors: 1 and 2 (the number itself).
//check for prime;
public class q7 {
  public static void main(String[] args) {
    int n = 19;
    //brute force
    System.out.println(checkprime(n));
    //optimal approach
    System.out.println(isprime(n));
    
  }
  
  static boolean checkprime(int n){
    if (n <= 1) {
      return true;
    }
    for (int i = 2; i < n; i++) {
      if(n%i==0)
      {
        return false;
      }

    }
    return true;
  }
  static boolean isprime(int n){
    if (n <= 1) {
      return true;
    }
    for (int i = 2; i*i <= n; i++) {
      if(n%i==0)
      {
        return false;
      }

    }
    return true;
  }
  
}
