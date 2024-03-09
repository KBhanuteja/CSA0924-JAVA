import java.util.Scanner;

public class linecounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string to count the number of lines: ");
        String code = scanner.nextLine();

        int lineCount = countLines(code);
        System.out.println("Total number of lines: " + lineCount);

        scanner.close();
    }

    public static int countLines(String code) {
        int lineCount = 0;
        int pos = 0;

   
        while (pos < code.length()) {
         
            if (code.charAt(pos) == '\n') {
                lineCount++;
            }

            
            pos++;
        }


        if (pos > 0 && lineCount == 0) {
            lineCount++;
        }

        return lineCount;
    }
}