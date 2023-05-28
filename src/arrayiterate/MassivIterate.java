package arrayiterate;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class MassivIterate {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList l1 = new ArrayList();
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            l1.add(sc.nextInt());
        }

        int q = sc.nextInt();
        for (int i = 0; i < q; i++) {
            System.out.println("Enter: Insert or Delete");
            String Str = sc.next();
            for (int j = 0; j < 1; j++) {
                                if (Str.equals("Insert")) {
                    int x = sc.nextInt();
                    int y = sc.nextInt();
                    l1.add(x, y);
                }
                if (Str.equals("Delete")) {
                    int x = sc.nextInt();
                    l1.remove(x);
                }
            }
        }
        Iterator it = l1.iterator();
        while (it.hasNext()) {
            System.out.print(it.next() + " ");
        }
    }
}

