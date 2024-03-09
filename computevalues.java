import java.util.Scanner;

public class computevalues { 
public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int n = scanner.nextInt();

        int nn = n * n;
        int nnn = nn * n;

        int result = n + nn + nnn;

        System.out.println("Result: " + result);

        scanner.close();
    }
}