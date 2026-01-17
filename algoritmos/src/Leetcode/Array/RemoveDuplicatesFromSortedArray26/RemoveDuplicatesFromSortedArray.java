package Leetcode.Array.RemoveDuplicatesFromSortedArray26;

import java.util.Arrays;

public class RemoveDuplicatesFromSortedArray {
    public static void main(String[] args) {
        int[] a = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        removeDuplicates(a);
        System.out.println(Arrays.toString(a));
    }

    public static int removeDuplicates(int[] nums) {
        int left = 0;
        for (int right = 1; right < nums.length; right++) {
            if (nums[right] > (nums[left])) {
                left++;
                nums[left] = nums[right];
            }
        }
        return left + 1;
    }
}
