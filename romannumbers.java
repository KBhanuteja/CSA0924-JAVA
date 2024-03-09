import java.util.Scanner;

public class romannumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a natural number (n): ");
        int n = scanner.nextInt();

        System.out.println("The Roman numeral equivalents of the first " + n + " natural numbers are:");
        for (int i = 1; i <= n; i++) {
            System.out.println(i + ": " + convertToRoman(i));
        }
    }

    public static String convertToRoman(int number) {
        if (number < 1 || number > 3999) {
            throw new IllegalArgumentException("Invalid number. Must be between 1 and 3999.");
        }

        int[] nums = {1, 4, 5, 9, 10, 40, 50, 90, 100, 400, 500, 900, 1000};
        String[] romanNumerals = {"I", "IV", "V", "IX", "X", "XL", "L", "XC", "C", "CD", "D", "CM", "M"};

        StringBuilder roman = new StringBuilder();

        for (int i = nums.length - 1; i >= 0; i--) {
            while (number >= nums[i]) {
                number -= nums[i];
                roman.append(romanNumerals[i]);
            }
        }

        return roman.toString();
    }
}