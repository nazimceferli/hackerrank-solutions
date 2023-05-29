package phonebook;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class PhoneBook {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Say daxil et:");
        int n = scan.nextInt();
        scan.nextLine();
        Map<String, Integer> map = new HashMap<>(n);


        for (int i = 0; i < n; i++) {
            System.out.println("Enter name:");
            String name = scan.nextLine();
            System.out.println("Enter phone num:");
            String num = scan.nextLine();

            //System.out.println(name + " "+ num);
            map.put(name, Integer.valueOf(num));
        }


        while (scan.hasNext()) {
            String search = scan.nextLine();

            if (map.containsKey(search)) {
                System.out.println(search + "=" + map.get(search));
            } else {
                System.out.println("Not found");
            }
        }

    }
}

