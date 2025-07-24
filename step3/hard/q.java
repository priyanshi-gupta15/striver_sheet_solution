package step3.hard;
import java.util.Arrays;

public class q {
  public static void main(String[] args) {
    // int[] arr = { 3, 1, 2, 5, 3 };
    int[] arr = { 3,1,2,5,4,6,7,5 };
    System.out.println(Arrays.toString(missing(arr)));
    
  }
 
 public static int[] missing(int[] arr)
 {
   //count sort
   int i = 0;
   while (i < arr.length) {
      // int correct = i + 1;
    int correct = arr[i] - 1;
    if (arr[i] != correct) {
      swap(arr, i, correct);
    }

      i++;
    
   }
   for (int j = 0; j < arr.length; j++) {
    if(j+1!=arr[j])
    {
      return new int[] { arr[j], j+1 };
    }    
   }

   return new int[] { -1, -1 };
 }

 public static void swap(int[] arr, int a, int b) {
   int temp = arr[a];
   arr[a] = arr[b];
   arr[b] = temp;  
 }
  
}
