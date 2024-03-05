import java.util.Scanner;

public class FibonacciSeries {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of terms for Fibonacci series: ");
        int n = scanner.nextInt();

        System.out.println("Fibonacci Series:");
        printFibonacciSeries(n);

        int sum = calculateFibonacciSum(n);
        System.out.println("Sum of Fibonacci Series up to " + n + " terms: " + sum);
    }

    public static void printFibonacciSeries(int n) {
        int first = 0, second = 1;

        for (int i = 0; i < n; i++) {
            System.out.print(first + " ");

            int next = first + second;
            first = second;
            second = next;
        }

        System.out.println();
    }

    public static int calculateFibonacciSum(int n) {
        int first = 0, second = 1, sum = 0;

        for (int i = 0; i < n; i++) {
            sum += first;

            int next = first + second;
            first = second;
            second = next;
        }

        return sum;
    }
}
