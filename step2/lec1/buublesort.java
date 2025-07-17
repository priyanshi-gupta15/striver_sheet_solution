package step2.lec1;


import java.util.Arrays;

public class buublesort {
  public static void main(String[] args) {
    int[] arr = { 13, 46, 24, 52, 20, 9 };

    for (int i = 0; i < arr.length; i++) {
      boolean sorted = true; //using this we can optimize complexity to check the remail are same sorted or not

      //at every pass last element are at thier correct index; so we loop till arr.length-i
      for (int j = 1; j < arr.length - i; j++) {
        if (arr[j - 1] > arr[j]) {
          sorted = false;
          //swap
          int temp = arr[j - 1];
          arr[j - 1] = arr[j];
          arr[j] = temp;
        }
      }
      if (sorted) {
        break;
      }
    }
    
    System.out.println(Arrays.toString(arr));
  }
  
}
