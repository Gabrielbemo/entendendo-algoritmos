package Leetcode.Recursion.PowerOfTwo231;

public class PowerOfTwo {
    public static void main(String[] args) {
        System.out.println(isPowerOfTwoFirst(8));
        System.out.println(isPowerOfTwoOptimized(8));
        System.out.println(isPowerOfTwoRecursive(8));
    }

    public static boolean isPowerOfTwoFirst(int n) {
        if (n <= 0) return false;

        while (n % 2 == 0) {
            n /= 2;
        }

        return n == 1;
    }

    public static boolean isPowerOfTwoOptimized(int n) {
        if (n <= 0) return false;
        return (n & (n - 1)) == 0;
    }

    public static boolean isPowerOfTwoRecursive(int n) {
        if (n <= 0) return false;
        if (n == 1) return true;
        if (n % 2 != 0) return false;
        return isPowerOfTwoRecursive(n / 2);
    }
}
