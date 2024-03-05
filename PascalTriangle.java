import java.util.Scanner;

public class PascalTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of rows for Pascal's Triangle:");
        int numRows = scanner.nextInt();
        

        int[][] pascalTriangle = new int[numRows][numRows];
        
        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j <= i; j++) {
                if (j == 0 || j == i)
                    pascalTriangle[i][j] = 1;
                else
                    pascalTriangle[i][j] = pascalTriangle[i - 1][j - 1] + pascalTriangle[i - 1][j];
            }
        }
        

        System.out.println("Pascal's Triangle:");
        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(pascalTriangle[i][j] + " ");
            }
            System.out.println();
        }
    }
}
