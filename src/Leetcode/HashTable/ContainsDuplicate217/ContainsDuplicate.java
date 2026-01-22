package Leetcode.HashTable.ContainsDuplicate217;

import java.util.HashMap;

public class ContainsDuplicate {
    static void main(String[] args) {
        System.out.println(containsDuplicate(new int[]{1, 2, 3, 4, 3, 6}));
    }

    public static boolean containsDuplicate(int[] nums) {
        HashMap<Integer, Integer> numsHash = new HashMap<>();

        for(int value: nums){
            if(numsHash.get(value) != null){
                return true;
            }
            numsHash.put(value, value);
        }
        return false;
    }
}
