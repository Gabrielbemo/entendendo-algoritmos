package HackerRank.Java.JavaHashset;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int t = scanner.nextInt();

        Set<String> set = new HashSet<>();

        for (int i = 0; i < t; i++) {
            String a = scanner.next();
            String b = scanner.next();

            set.add(a + " " + b);

            System.out.println(set.size());
        }
        System.out.println(set);
        scanner.close();
    }
}