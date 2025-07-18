package step3.easy;

import java.util.ArrayList;

//Union of Two Sorted Arrays
// n = 5,m = 5.
// arr2[] = {2,3,4,4,5}
// Output:
//  {1,2,3,4,5}
public class q9 {
  static ArrayList<Integer> FindUnion(int arr1[], int arr2[], int n, int m) {
   int i = 0, j = 0; // pointers
  ArrayList<Integer > Union=new ArrayList<>(); // Uninon vector
  while (i < n && j < m) {
    if (arr1[i] <= arr2[j]) // Case 1 and 2
    {
      if (Union.isEmpty() || Union.get(Union.size()-1) != arr1[i])
        Union.add(arr1[i]);
      i++;
    } else // case 3
    {
      if (Union.isEmpty() || Union.get(Union.size()-1) != arr2[j])
        Union.add(arr2[j]);
      j++;
    }
  }
  while (i < n) // IF any element left in arr1
  {
    if (Union.get(Union.size()-1) != arr1[i])
      Union.add(arr1[i]);
    i++;
  }
  while (j < m) // If any elements left in arr2
  {
    if (Union.get(Union.size()-1) != arr2[j])
      Union.add(arr2[j]);
    j++;
  }
  return Union;
}

public static void main(String args[]) {
  int n = 10, m = 7;
  int arr1[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
  int arr2[] = { 2, 3, 4, 4, 5, 11, 12 };
  ArrayList<Integer> Union = FindUnion(arr1, arr2, n, m);
  for (int val: Union)
    System.out.print(val+" ");
}
}

