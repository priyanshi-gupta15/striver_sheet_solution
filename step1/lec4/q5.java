package step1.lec4;
//leetcode 1134

//armstrong number;
// Input:N = 153
               
//  Output:True
 
//  Explanation: 13+53+33 = 1 + 125 + 27 = 153
public class q5 {
  public static void main(String[] args) {
    int a = 153;
    System.out.println(isarmstrong(a));

  }

  public static boolean isarmstrong(int a)
  {
    int sum= 0;
    int og = a;
    int k = String.valueOf(a).length();
    while (a != 0)
    {
      int ld = a % 10;
      sum += Math.pow(ld, k);
      a = a / 10;

    }
    return sum == og;
  }
  
}
