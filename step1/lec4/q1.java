package step1.lec4;
//count digit
public class q1 {
  public static void main(String[] args) {
  //    Input:N = 12345            
  //     Output:5
  //     Explanation:  The number 12345 has 5 digits.

  //brute force approach;
  int digit = 1234345;
  int count = 0;
     while(digit>0)
     {
       count++;
       digit /= 10;

     }
     System.out.println(count);

     

     //optimal approach using log10
     int n = 23456;
     int cnt = (int) (Math.log10(n) + 1);
     System.out.println(cnt);
  }
  
}
