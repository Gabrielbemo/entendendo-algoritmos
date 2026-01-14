import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {123, 25345345, 342, 444, 664};

        selectionSortAlgorithm(arr);

        System.out.println(Arrays.toString(arr));
    }

    public static int[] selectionSortAlgorithm(int[] arr){

        for (int i = 0; i < arr.length - 1; i++) {
            int lowerIndex = i;

            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[lowerIndex]) {
                    lowerIndex = j;
                }
            }

            int actualLowerValue = arr[lowerIndex];
            arr[lowerIndex] = arr[i];
            arr[i] = actualLowerValue;
        }

        return arr;
    }
}
