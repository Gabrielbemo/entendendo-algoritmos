package Leetcode.Array.SearchInsertPosition35;

public class SearchInsertPosition {
    public static void main(String[] args) {
        int[] nums = {1, 3, 5, 6};
        int target = 2;
        System.out.println(searchInsert(nums, target));
    }

    public static int searchInsert(int[] nums, int target) {
        int leftIndex = 0;
        int rightIndex = nums.length - 1;

        while (leftIndex <= rightIndex) {
            int middleIndex = leftIndex + (rightIndex - leftIndex) / 2;
            int middleValue = nums[middleIndex];

            if (middleValue == target) {
                return middleIndex;
            }

            if (middleValue < target) {
                leftIndex = middleIndex + 1;
            } else {
                rightIndex = middleIndex - 1;
            }
        }

        return leftIndex;
    }
}
