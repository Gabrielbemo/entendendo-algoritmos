package HackerRank.Java.JavaAnagrams;

import java.util.Scanner;

public class Solution {

    static boolean isAnagram(String a, String b) {
        a = a.toLowerCase();
        b = b.toLowerCase();

        if (a.length() != b.length()) {
            return false;
        }

        int[] letterCount = new int[26];

        for (int i = 0; i < a.length(); i++) {
            letterCount[a.charAt(i) - 'a']++;
            letterCount[b.charAt(i) - 'a']--;
        }

        for (int count : letterCount) {
            if (count != 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String a = scanner.next();
        String b = scanner.next();

        scanner.close();

        boolean result = isAnagram(a, b);

        System.out.println(result ? "Anagrams" : "Not Anagrams");
    }
}