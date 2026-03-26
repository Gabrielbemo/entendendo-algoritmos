package HackerRank.Java.JavaBitSet;

import java.util.BitSet;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int m = scanner.nextInt();

        BitSet B1 = new BitSet(n);
        BitSet B2 = new BitSet(n);

        for (int i = 0; i < m; i++) {

            String op = scanner.next();
            int x = scanner.nextInt();
            int y = scanner.nextInt();

            BitSet first = (x == 1) ? B1 : B2;
            BitSet second = (y == 1) ? B1 : B2;

            switch (op) {
                case "AND":
                    first.and(second);
                    break;
                case "OR":
                    first.or(second);
                    break;
                case "XOR":
                    first.xor(second);
                    break;
                case "FLIP":
                    first.flip(y);
                    break;
                case "SET":
                    first.set(y);
                    break;
            }

            System.out.println(B1.cardinality() + " " + B2.cardinality());
        }

        scanner.close();
    }
}