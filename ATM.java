import java.util.Scanner;

public class ATM {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        
        int[] denominations = {2000, 500, 200, 100};
        
        
        System.out.println("Enter your priority for denominations (Enter numbers 0-3 representing 2000, 500, 200, 100 respectively): ");
        int priority = scanner.nextInt();
        
       
        if (priority < 0 || priority > 3) {
            System.out.println("Invalid priority input!");
            return;
        }
        
       
        System.out.println("Enter the total number of notes for each denomination: ");
        int[] notes = new int[4];
        for (int i = 0; i < 4; i++) {
            System.out.print("Number of " + denominations[i] + " notes: ");
            notes[i] = scanner.nextInt();
        }
        
       
        int totalBalance = 0;
        for (int i = 0; i < 4; i++) {
            totalBalance += denominations[i] * notes[i];
        }
        System.out.println("Total available balance: " + totalBalance);
        
        
        int priorityBalance = 0;
        for (int i = priority; i < 4; i++) {
            priorityBalance += denominations[i] * notes[i];
        }
        System.out.println("Total available balance based on priority: " + priorityBalance);
    }
}
