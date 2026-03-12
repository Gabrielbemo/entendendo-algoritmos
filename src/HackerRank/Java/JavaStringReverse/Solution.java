package HackerRank.Java.JavaStringReverse;

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String A=sc.next();

        sc.close();

        boolean isPalindrome = true;

        for (int left = 0, right = A.length() - 1; left < right; left++, right--) {
            if (A.charAt(left) != A.charAt(right)) {
                isPalindrome = false;
                break;
            }
        }

        System.out.println(isPalindrome ? "Yes" : "No");
    }
}




