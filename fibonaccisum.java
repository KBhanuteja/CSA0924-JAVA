import java.util.Scanner;

public class fibonaccisum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of terms: ");
        int n = scanner.nextInt();

        long sum = fibonacciSum(n);

        System.out.println("The sum of the first " + n + " numbers in the Fibonacci series is: " + sum);

        scanner.close();
    }

    public static long fibonacciSum(int n) {
        if (n <= 0) {
            throw new IllegalArgumentException("The number of terms must be positive.");
        }

        long prevPrev = 0;
        long prev = 1;
        long sum = 0;

        for (int i = 0; i < n; i++) {
            sum += prev;
            long next = prev + prevPrev;
            prevPrev = prev;
            prev = next;
        }

        return sum;
    }
}