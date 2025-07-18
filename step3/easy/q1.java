package step3.easy;
// Find the Largest element in an array
public class q1 {
  public static void main(String[] args) {
    int[] arr = { 2, 5, 18, 6, 2, 8 };

    //1st approach sort and then return last element;

    // 2nd is optimal approach
    int max= arr[0];
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] > max) {
        max = arr[i];
      }
    }
    System.out.println("the largest element in array is "+ max);
  }
  
  
}
