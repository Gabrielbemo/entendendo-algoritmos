package leetcode.array.twoSum1;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static void main(String[] args) {
        int[] sample = {1,4,7,3,9,22,64,23,12};

        System.out.println(Arrays.toString(twoSumFirtImpleention(sample, 16)));

        System.out.println(Arrays.toString(twoSumOptimized(sample, 16)));
    }

    public static int[] twoSumFirtImpleention(int[] sample, int target) {
        for (int firstPointer = 0; firstPointer < sample.length; firstPointer++) {
            for (int movingPointer = firstPointer + 1; movingPointer < sample.length; movingPointer++) {
                if (sample[firstPointer] + sample[movingPointer] == target) {
                    int[] result = {firstPointer, movingPointer};
                    return result;
                }
            }
        }
        return null;
    }

    public static int[] twoSumOptimized(int[] sample, int target) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < sample.length; i++) {
            int difference = target - sample[i];

            if (map.containsKey(difference)) {
                return new int[] { map.get(difference), i };
            }

            map.put(sample[i], i);
        }

        return null;
    }
}
