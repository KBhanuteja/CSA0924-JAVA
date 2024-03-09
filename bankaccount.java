import java.util.Scanner;

public class bankaccount {
private String name;
private int accountNumber;
private String accountType;
private double balance;
private static final double MIN_BALANCE = 500;

public bankaccount(String name, int accountNumber, String accountType, double balance) {
this.name = name;
this.accountNumber = accountNumber;
this.accountType = accountType;
this.balance = balance;
}

public void readAccountDetails() {
Scanner scanner = new Scanner(System.in);

System.out.print("Enter account holder name: ");
name = scanner.nextLine();

System.out.print("Enter account number: ");
accountNumber = scanner.nextInt();

System.out.print("Enter account type (savings/current): ");
accountType = scanner.next();

System.out.print("Enter initial balance: ");
balance = scanner.nextDouble();

scanner.close();
}

public void deposit(double amount) {
balance += amount;
}

public boolean withdraw(double amount) {
if (balance - amount >= MIN_BALANCE) {
balance -= amount;
return true;
} else {
System.out.println("Insufficient balance. Minimum balance should be " + MIN_BALANCE);
return false;
}
}

public void displayAccountDetails() {
System.out.println("Account holder name: " + name);
System.out.println("Account number: " + accountNumber);
System.out.println("Account type: " + accountType);
System.out.println("Balance: " + balance);
}

public static void main(String[] args) {
bankaccount account = new bankaccount("Bhanuteja", 123456, "savings", 1000);
Scanner scanner = new Scanner(System.in);

account.displayAccountDetails();

System.out.println("Enter amount to deposit: ");
double depositAmount = scanner.nextDouble();
account.deposit(depositAmount);
System.out.println("Amount deposited successfully.");
account.displayAccountDetails();

System.out.println("Enter amount to withdraw: ");
double withdrawAmount = scanner.nextDouble();
if (account.withdraw(withdrawAmount)) {
System.out.println("Amount withdrawn successfully.");
} else {
System.out.println("Withdrawal failed.");
}
account.displayAccountDetails();

scanner.close();
}
}