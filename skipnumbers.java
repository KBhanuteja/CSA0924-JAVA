import java.util.Scanner;

public class skipnumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the start of the range (m): ");
        int m = scanner.nextInt();

        System.out.print("Enter the end of the range (n): ");
        int n = scanner.nextInt();

        System.out.print("Enter the number of numbers to skip (k): ");
        int k = scanner.nextInt();

        
        for (int i = m; i <= n; i += k) {
            System.out.print(i + " ");}}}