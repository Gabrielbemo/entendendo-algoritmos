package Leetcode.HashTable.LongestPalindrome409;

public class LongestPalindrome {
    static void main(String[] args) {
        System.out.println(longestPalindrome("abccccdd"));
    }

    public static int longestPalindrome(String s) {
        int[] characterFrequency = new int[128];

        for (char character : s.toCharArray()) {
            characterFrequency[character]++;
        }

        int palindromeLength = 0;
        boolean hasOddFrequency = false;

        for (int frequency : characterFrequency) {
            if (frequency % 2 == 0) {
                palindromeLength += frequency;
            } else {
                palindromeLength += frequency - 1;
                hasOddFrequency = true;
            }
        }

        if (hasOddFrequency) {
            palindromeLength++;
        }

        return palindromeLength;
    }
}
