import java.util.Scanner;

public class numbercounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int totalCount = 0;
        int positiveCount = 0;
        int negativeCount = 0;
        int zeroCount = 0;

        while (true) {
            System.out.print("Enter an integer or type 'quit' to exit: ");
            String input = scanner.next();

            if ("quit".equalsIgnoreCase(input)) {
                break;
            }

            int number = Integer.parseInt(input);
            totalCount++;

            if (number > 0) {
                positiveCount++;
            } else if (number < 0) {
                negativeCount++;
            } else {
                zeroCount++;
            }
        }

        System.out.println("Total count: " + totalCount);
        System.out.println("Positive count: " + positiveCount);
        System.out.println("Negative count: " + negativeCount);
        System.out.println("Zero count: " + zeroCount);

        scanner.close();
    }
}