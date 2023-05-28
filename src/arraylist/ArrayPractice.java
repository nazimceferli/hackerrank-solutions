package arraylist;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArrayPractice {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner input = new Scanner(System.in);

        List<List<Integer>> queries = new ArrayList<>();


        int n = input.nextInt();
        for (int i = 0; i < n; i++) {
            int d = input.nextInt();
          List<Integer> row = new ArrayList();
            for (int j = 0; j < d; j++) {
                row.add(input.nextInt());
            }
            queries.add(row);
        } // this loop adds each list to quries list

        int q = input.nextInt();
        for (int i = 0; i < q; i++) {
            int x = input.nextInt();
            int y = input.nextInt();
            try {
                System.out.println(queries.get(x - 1).get(y - 1));  /* this will print element if present other wise exception will be raised */
            } catch (Exception e) {
                System.out.println("ERROR!");
            }
        }

    }
}