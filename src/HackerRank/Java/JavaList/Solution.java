package HackerRank.Java.JavaList;

import java.util.*;

public class Solution {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            list.add(scanner.nextInt());
        }

        int q = scanner.nextInt();

        for (int i = 0; i < q; i++) {

            String operation = scanner.next();

            if (operation.equals("Insert")) {
                int x = scanner.nextInt();
                int y = scanner.nextInt();

                list.add(x, y);
            } else if (operation.equals("Delete")) {
                int x = scanner.nextInt();

                list.remove(x);
            }
        }

        scanner.close();

        for (int num : list) {
            System.out.print(num + " ");
        }
    }
}