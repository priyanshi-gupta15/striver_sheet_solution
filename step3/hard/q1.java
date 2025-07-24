package step3.hard;
//leetcode 118;
//pascale triangle;

import java.util.ArrayList;
import java.util.List;

public class q1 {
    public static void main(String[] args) {
        int n = 5;
        System.out.println(generate(n));
    }

    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> outer = new ArrayList<>();

        for (int i = 0; i < numRows; i++) {
            List<Integer> inner = new ArrayList<>();
            for (int j = 0; j <= i; j++) {
                if (j == 0 || j == i) {
                    inner.add(1);

                } else {
                    inner.add(outer.get(i - 1).get(j - 1) + outer.get(i - 1).get(j));
                }
            }
            outer.add(inner);

        }

        return outer;

    }

}



// want to print only last line


// public static List<Integer> getRow(int rowIndex) {
//     List<Integer> row = new ArrayList<>();
//     row.add(1); // First element is always 1

//     for (int i = 1; i <= rowIndex; i++) {
//         // Traverse from end to start to avoid overwriting values
//         for (int j = row.size() - 1; j >= 1; j--) {
//             row.set(j, row.get(j) + row.get(j - 1));
//         }
//         row.add(1); // Last element of each row is always 1
//     }

//     return row;
// }
