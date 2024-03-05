import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class NthMinMthMaxWithSumDifference {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the list of numbers separated by spaces: ");
        String[] numbersInput = scanner.nextLine().split(" ");
        List<Integer> numbers = new ArrayList<>();

        for (String num : numbersInput) {
            numbers.add(Integer.parseInt(num));
        }
        System.out.print("Enter the value of n: ");
        int n = scanner.nextInt();

        System.out.print("Enter the value of m: ");
        int m = scanner.nextInt();
        int nthMin = findNthMin(numbers, n);
        int mthMax = findMthMax(numbers, m);
        int sum = nthMin + mthMax;
        int difference = nthMin - mthMax;
        System.out.println("The " + n + "th minimum element is: " + nthMin);
        System.out.println("The " + m + "th maximum element is: " + mthMax);
        System.out.println("Sum of " + n + "th minimum and " + m + "th maximum elements: " + sum);
        System.out.println("Difference of " + n + "th minimum and " + m + "th maximum elements: " + difference);
    }

    public static int findNthMin(List<Integer> numbers, int n) {
        if (n <= 0 || n > numbers.size()) {
            throw new IllegalArgumentException("Invalid value of n");
        }

        Collections.sort(numbers);
        return numbers.get(n - 1);
    }

    public static int findMthMax(List<Integer> numbers, int m) {
        if (m <= 0 || m > numbers.size()) {
            throw new IllegalArgumentException("Invalid value of m");
        }

        Collections.sort(numbers, Collections.reverseOrder());
        return numbers.get(m - 1);
    }
}
