import java.util.Scanner;

public class romannumbers2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Enter a number between 1 and 3999 (or enter 0 to exit): ");
            int number = scanner.nextInt();
            if (number == 0) {
                break;
            }
            if (number < 1 || number > 3999) {
                System.out.println("Invalid number.");
                continue;
            }

            int[] numbers = {1, 4, 5, 9, 10, 40, 50, 90, 100, 400, 500, 900, 1000};
            String[] romanNumerals = {"I", "IV", "V", "IX", "X", "XL", "L", "XC", "C", "CD", "D", "CM", "M"};

            StringBuilder roman = new StringBuilder();
            for (int i = 12; i >= 0; i--) {
                while (number >= numbers[i]) {
                    number -= numbers[i];
                    roman.append(romanNumerals[i]);
                }
            }

            System.out.println("The Roman numeral equivalent is: " + roman.toString());
        }
    }
}