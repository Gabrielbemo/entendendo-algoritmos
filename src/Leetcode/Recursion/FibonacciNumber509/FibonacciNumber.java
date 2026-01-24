package Leetcode.Recursion.FibonacciNumber509;

public class FibonacciNumber {
    static void main(String[] args) {
        System.out.println(fib(8));
        System.out.println(fibRecursive(8));
    }

    public static int fib(int n) {
        if (n <= 1) return n;

        int previousValue = 0;
        int currentValue = 1;

        for (int count = 2; count <= n; count++) {
            int nextValue = previousValue + currentValue;
            previousValue = currentValue;
            currentValue = nextValue;
        }

        return currentValue;
    }

    public static int fibRecursive(int n) {
        if (n <= 1) return n;
        return fib(n - 1) + fib(n - 2);
    }


}
