import java.util.Scanner;

public class binaryswitch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int choice;
        do {
            System.out.println("Menu:");
            System.out.println("1. Convert to Decimal");
            System.out.println("2. Convert to Octal");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter a binary number: ");
                    String binaryString = scanner.next();
                    int decimal = Integer.parseInt(binaryString, 2);
                    System.out.println("Decimal equivalent: " + decimal);
                    break;
                case 2:
                    System.out.print("Enter a binary number: ");
                    String binaryString2 = scanner.next();
                    int decimalForOctal = Integer.parseInt(binaryString2, 2);
                    String octalString = Integer.toOctalString(decimalForOctal);
                    System.out.println("Octal equivalent: " + octalString);
                    break;
                case 3:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Please enter again.");
            }
        } while (choice != 3);

        scanner.close();
    }
}
