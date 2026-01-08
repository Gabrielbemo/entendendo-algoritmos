import java.util.ArrayList;
import java.util.List;

public class BinarySearch {
    public static void main(String[] args) {

        List<Integer> sample = new ArrayList<>();
        int sampleSize = 128;
        int targetResult = 23;

        for (int i = 0; i < sampleSize; i++) {
            sample.add(i);
        }

        System.out.println(findWithBinarySearch(sample, sample.getFirst(), sample.getLast(), targetResult));
    }

    private static int findWithBinarySearch(List<Integer> sample, int startSample, int lastSample, int targetResult) {
        int midSample;
        int guess;
        while (startSample <= lastSample){
            midSample = ((startSample+lastSample) / 2);
            guess = sample.get(midSample);
            if(guess == targetResult){
                return midSample;
            }
            if (guess > targetResult){
                lastSample = midSample - 1;
            }else {
                startSample = midSample + 1;
            }
        }
        return -1;
    }
}
