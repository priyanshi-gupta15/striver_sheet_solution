package step1.lec5;
//sum of 1st n number by recusion

//formula
// int sum = N * (N + 1) / 2;
public class q5 {
  public static void main(String[] args) {
    int n = 6;
    sum(n,0);
  }

  public static void sum(int n,int sum) {
    if (n == 0)
    { System.out.println(sum);
      return;
    }
    sum += n;
    sum(n - 1,sum);  
  }
  
}
