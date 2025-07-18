package step3.easy;
//second largest without sorting
public class q2 {
  public static void main(String[] args) {

    int[] arr = { 2, 15, 8, 6, 2, 18 };
    int max1 = arr[0];
    int max2 = arr[0];

    for (int i = 0; i < arr.length; i++) {
      if (arr[i] >= max1) {
        max2 = max1;
        max1 = arr[i];
      }
      else if(arr[i]<=max1 && arr[i]>=max2)
      {
        max2 = arr[i];
      }
    }
    System.out.println("the largest element in array is " + max2);

  }
}