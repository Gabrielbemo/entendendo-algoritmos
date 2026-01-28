package HackerRank.Java.JavaLoopsII;

import java.util.Scanner;

class Solution {
    public static void returnSerie(int a, int b, int n) {
        for (int i = 0; i < n; i++) {
            a += Math.pow(2, i) * b;
            System.out.print(a + " ");
        }
    }

    public static void main(String[] argh) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int i = 0; i < t; i++) {
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            returnSerie(a, b, n);
            System.out.println();
        }
        in.close();
    }
}
