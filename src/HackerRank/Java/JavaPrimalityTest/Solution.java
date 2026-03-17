package HackerRank.Java.JavaPrimalityTest;

import java.math.BigInteger;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        BigInteger n = scanner.nextBigInteger();
        scanner.close();

        System.out.println(n.isProbablePrime(100) ? "prime" : "not prime");
    }
}