import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class MeanMedianMode {

    public static void main(String[] args) {
        double[] numbers = {10, 20, 20, 30, 40, 40, 40, 50, 50};
        System.out.println("Mean: " + getMean(numbers));
        System.out.println("Median: " + getMedian(numbers));
        System.out.println("Mode: " + getMode(numbers));
    }

    public static double getMean(double[] numbers) {
        double sum = 0;
        for (double number : numbers) {
            sum += number;
        }
        return sum / numbers.length;
    }

    public static double getMedian(double[] numbers) {
        Arrays.sort(numbers);
        int length = numbers.length;
        if (length % 2 == 0) {
            return (numbers[length / 2 - 1] + numbers[length / 2]) / 2.0;
        } else {
            return numbers[length / 2];
        }
    }

    public static double getMode(double[] numbers) {
        HashMap<Double, Integer> numberCount = new HashMap<>();
        for (double number : numbers) {
            numberCount.put(number, numberCount.getOrDefault(number, 0) + 1);
        }

        int maxCount = 0;
        for (Map.Entry<Double, Integer> entry : numberCount.entrySet()) {
            maxCount = Math.max(maxCount, entry.getValue());
        }

        for (Map.Entry<Double, Integer> entry : numberCount.entrySet()) {
            if (entry.getValue() == maxCount) {
                return entry.getKey();
            }
        }

        return -1; // No mode found
    }
}