import java.util.Scanner;

public class sumzero {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        scanner.close();
        int[] pair = findPairClosestToZero(arr);
        System.out.println("The pair of numbers whose sum is closest to zero is: " + pair[0] + " and " + pair[1]);
    }

    public static int[] findPairClosestToZero(int[] arr) {
        int minSum = Integer.MAX_VALUE;
        int[] minSumPair = new int[2];

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                int sum = arr[i] + arr[j];
                if (Math.abs(sum) < Math.abs(minSum)) {
                    minSum = sum;
                    minSumPair = new int[]{arr[i], arr[j]};
                }
            }
        }

        return minSumPair;
    }
}