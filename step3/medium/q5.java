package step3.medium;

public class q5 {
  public static void main(String[] args) {

    int[] nums = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
    int n =nums.length;
    System.out.println(printmaxSubArray(nums,n));
  }

  public static long printmaxSubArray(int[] arr, int n) {
    long maxi = Long.MIN_VALUE;
    long sum = 0;
    int start = 0;
    int ansStart = -1, ansEnd = -1;
    for (int i = 0; i < n; i++) {

            if (sum == 0) start = i; // starting index

            sum += arr[i];

            if (sum > maxi) {
                maxi = sum;

                ansStart = start;
                ansEnd = i;
            }

            // If sum < 0: discard the sum calculated
            if (sum < 0) {
                sum = 0;
            }
        }
        System.out.println("The subarray is:");
        for (int i = ansStart; i <= ansEnd; i++) {
          System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.println("max sum is:");
  return maxi;
  }
  
}
