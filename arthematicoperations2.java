import java.util.Scanner;

public class arthematicoperations2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter second number: ");
        int num2 = scanner.nextInt();

        System.out.println("Addition: " + add(num1, num2));
        System.out.println("Subtraction: " + subtract(num1, num2));
        System.out.println("Multiplication: " + multiply(num1, num2));
        System.out.println("Division: " + divide(num1, num2));

        scanner.close();
    }

    public static int add(int num1, int num2) {
        int sum = 0;
        boolean isNum1Negative = num1 < 0;
        boolean isNum2Negative = num2 < 0;
        int absNum1 = Math.abs(num1);
        int absNum2 = Math.abs(num2);

        while (absNum1 > 0 || absNum2 > 0) {
            if (absNum1 > 0) {
                absNum1--;
                sum++;
            }
            if (absNum2 > 0) {
                absNum2--;
                sum++;
            }
        }

        if (isNum1Negative && isNum2Negative) {
            return -sum;
        } else if (isNum1Negative) {
            return -(sum + 1);
        } else if (isNum2Negative) {
            return -(sum + 1);
        } else {
            return sum;
        }
    }

    public static int subtract(int num1, int num2) {
        return add(num1, multiply(-1, num2));
    }

    public static int multiply(int num1, int num2) {
        if (num1 == 0 || num2 == 0) {
            return 0;
        }

        if (num1 < 0) {
            num1 = -num1;
        }

        if (num2 < 0) {
            num2 = -num2;
        }

        int result = 0;

        for (int i = 0; i < num2; i++) {
            result = add(result, num1);
        }

        return result;
    }

    public static int divide(int num1, int num2) {
        if (num2 == 0) {
            throw new IllegalArgumentException("Cannot divide by zero.");
        }

        int quotient = 0;
        int sign = 1;

        if (num1 < 0) {
            sign = -1;
            num1 = -num1;
        }

        if (num2 < 0) {
            sign = -sign;
            num2 = -num2;
        }

        while (num1 >= num2) {
            num1 = subtract(num1, num2);
            quotient++;
        }

        return sign * quotient;
    }

    public static int multiply( num, multiplier) {
        if (multiplier == 0) {
            return 0;
        }

        if (multiplier > 0) {
            return add(num, multiply(num, multiplier - 1));
        } else {
            return subtract(num, multiply(num, -multiplier - 1));
        }
    }
}