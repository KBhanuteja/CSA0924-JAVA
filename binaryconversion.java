import java.util.Scanner;
public class binaryconversion {
 static int binaryToDecimal(String binary) {
        int decimal = 0;
        int n = binary.length();
        
        for (int i = 0; i < n; i++) {
            if (binary.charAt(i) == '1') {
                decimal += Math.pow(2, n - i - 1);
            }
        }
        return decimal;
    }

    static String decimalToOctal(int decimal) {
        StringBuilder octal = new StringBuilder();
        
        while (decimal != 0) {
            octal.insert(0, decimal % 8);
            decimal /= 8;
        }
        
        return octal.toString();
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       
        System.out.print("Enter a binary number: ");
        String binaryString = scanner.nextLine();
   
        int decimal = binaryToDecimal(binaryString);
        System.out.println("Decimal equivalent: " + decimal);
 
        String octalString = decimalToOctal(decimal);
        System.out.println("Octal equivalent: " + octalString);
        
        scanner.close();
    }
}
