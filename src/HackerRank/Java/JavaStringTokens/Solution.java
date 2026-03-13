package HackerRank.Java.JavaStringTokens;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();

        if (s.isEmpty()) {
            System.out.println(0);
            return;
        }

        String[] tokens = s.split("[^a-zA-Z]+");

        System.out.println(tokens.length);

        for (String token : tokens) {
            System.out.println(token);
        }
        scan.close();
    }
}
