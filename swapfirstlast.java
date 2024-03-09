import java.util.Scanner;

public class swapfirstlast {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        scanner.close();
        int[] newArr = swapFirstLast(arr);
        System.out.println("The new array with the first and last elements swapped is: ");
        for (int i = 0; i < n; i++) {
            System.out.print(newArr[i] + " ");
        }
    }

    public static int[] swapFirstLast(int[] arr) {
        int n = arr.length;
        int temp = arr[0];
        arr[0] = arr[n - 1];
        arr[n - 1] = temp;
        return arr;
    }
}