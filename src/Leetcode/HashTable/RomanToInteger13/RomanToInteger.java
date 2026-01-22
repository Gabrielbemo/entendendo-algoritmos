package Leetcode.HashTable.RomanToInteger13;

import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {
    static void main(String[] args) {
        System.out.println(romanToInt("IXXIII"));
    }

    static public int romanToInt(String s) {
        Map<Character, Integer> romanValues = new HashMap<>();
        romanValues.put('I', 1);
        romanValues.put('V', 5);
        romanValues.put('X', 10);
        romanValues.put('L', 50);
        romanValues.put('C', 100);
        romanValues.put('D', 500);
        romanValues.put('M', 1000);

        int totalValue = 0;

        for (int index = 0; index < s.length(); index++) {

            int currentValue = romanValues.get(s.charAt(index));

            if (index + 1 < s.length()) {
                int nextValue = romanValues.get(s.charAt(index + 1));

                if (currentValue < nextValue) {
                    totalValue -= currentValue;
                } else {
                    totalValue += currentValue;
                }
            } else {
                totalValue += currentValue;
            }
        }

        return totalValue;
    }

}
