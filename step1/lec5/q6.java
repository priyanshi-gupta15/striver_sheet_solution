package step1.lec5;
// Factorial of a Number : Iterative and Recursive
public class q6 {
   public static int factorial(int n) {
        // Base case: factorial of 0 is 1
        if (n == 0) {
            return 1;
        }

        // Recursive case: n * factorial of (n-1)
        return n * factorial(n - 1);
    }

    public static void main(String[] args) {
        // Define the number to compute factorial
        int n = 5;

        // Call the factorial function and print the result
        System.out.println(factorial(n));
    }
  
}
