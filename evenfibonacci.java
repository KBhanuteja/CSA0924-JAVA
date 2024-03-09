public class evenfibonacci {

    public static void main(String[] args) {
        int n = 100;
        long sum = calculateEvenFibonacciSum(n);
        System.out.println("The sum of even numbers in the Fibonacci series up to " + n + " is: " + sum);
    }

    public static long calculateEvenFibonacciSum(int n) {
        long prevPrev = 0;
        long prev = 1;
        long sum = 0;

        while (prev + prevPrev <= n) {
            long current = prev + prevPrev;
            if (current % 2 == 0) {
                sum += current;
            }
            prevPrev = prev;
            prev = current;
        }

        return sum;
    }
}