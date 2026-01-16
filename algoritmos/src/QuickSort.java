import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[] sample = {1,5,3,8,12,9};
        quicksort(sample, 0, sample.length-1);
        System.out.println(Arrays.toString(sample));
    }

    public static void quicksort(int[] sample, int left, int right){
        if(left < right){
            int pivot = partition(sample, left, right);
            quicksort(sample, left, pivot-1);
            quicksort(sample, pivot+1, right);
        }
    }

    private static int partition(int[] sample, int left, int right) {
        int pivot = sample[right];

        int leftPointer = left - 1;

        for (int rightPointer = left; rightPointer < right; rightPointer++){
            if(sample[rightPointer] <= pivot){
                leftPointer = leftPointer+1;
                int oldValue = sample[leftPointer];
                sample[leftPointer] = sample[rightPointer];
                sample[rightPointer] = oldValue;
            }
        }
        int oldValue = sample[leftPointer+1];
        sample[leftPointer+1] = sample[right];
        sample[right] = oldValue;

        return leftPointer+1;
    }
}
