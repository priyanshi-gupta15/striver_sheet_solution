package step3.easy;
// linerar search;
// Input: arr[]= 1 2 3 4 5, num = 3
// Output: 2

public class q8 {
  public static void main(String[] args) {
    int arr[] = { 13, 46, 24, 52, 20, 9 };
    int target = 53;
    System.out.println(search(arr, target));

  }

  public static int search(int[] nums ,int target)
  {
    for (int i = 0; i < nums.length; i++) {
      if (target == nums[i]) {
        return i;
      }

    }
    return -1;
  }
  
}
