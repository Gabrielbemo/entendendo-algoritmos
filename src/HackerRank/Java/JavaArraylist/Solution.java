package HackerRank.Java.JavaArraylist;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        List<List<Integer>> list = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int d = scanner.nextInt();

            List<Integer> row = new ArrayList<>();

            for (int j = 0; j < d; j++) {
                row.add(scanner.nextInt());
            }

            list.add(row);
        }

        int q = scanner.nextInt();

        while (q-- > 0) {
            int x = scanner.nextInt();
            int y = scanner.nextInt();

            try {
                System.out.println(list.get(x - 1).get(y - 1));
            } catch (Exception e) {
                System.out.println("ERROR!");
            }
        }

        scanner.close();
    }
}
