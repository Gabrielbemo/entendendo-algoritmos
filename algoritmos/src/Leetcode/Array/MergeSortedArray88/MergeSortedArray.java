package Leetcode.Array.MergeSortedArray88;

import java.util.Arrays;

public class MergeSortedArray {
    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int m = 3;
        int[] nums2 = {2, 5, 6};
        int n = 3;
        merge(nums1, m, nums2, n);
        System.out.println(Arrays.toString(nums1));
    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int firstWriteIndex = m + n - 1;
        int lastValidIndexFirst = m - 1;
        int lastValidIndexSecond = n - 1;

        while (lastValidIndexSecond >= 0) {

            if (lastValidIndexFirst >= 0 && nums1[lastValidIndexFirst] > nums2[lastValidIndexSecond]) {
                nums1[firstWriteIndex] = nums1[lastValidIndexFirst];
                lastValidIndexFirst--;
            } else {
                nums1[firstWriteIndex] = nums2[lastValidIndexSecond];
                lastValidIndexSecond--;
            }
            firstWriteIndex--;
        }
    }
}
