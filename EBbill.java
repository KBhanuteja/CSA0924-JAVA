import java.util.Scanner;

public class EBBill {
    private String consumerNo;
    private String consumerName;
    private int previousMonthReading;
    private int currentMonthReading;

    public EBBill(String consumerNo,String consumerName,int previousMonthReading,int currentMonthReading) {
        this.consumerNo = consumerNo;
        this.consumerName = consumerName;
        this.previousMonthReading = previousMonthReading;
        this.currentMonthReading = currentMonthReading;
    }

    public double computeBillAmount() {
        int unitsConsumed = currentMonthReading - previousMonthReading;
        double billAmount = 0;

        if (unitsConsumed <= 100) {
            billAmount = unitsConsumed * 1.0;
        } else if (unitsConsumed <= 200) {
            billAmount = 100 * 1.0 + (unitsConsumed - 100) * 2.5;
        } else if (unitsConsumed <= 500) {
            billAmount = 100 * 1.0 + 100 * 2.5 + (unitsConsumed - 200) * 4.0;
        } else {
            billAmount = 100 * 1.0 + 100 * 2.5 + 300 * 4.0 + (unitsConsumed - 500) * 6.0;
        }

        return billAmount;
    }

    public String getConsumerNo() {
        return consumerNo;
    }

    public String getConsumerName() {
        return consumerName;
    }

    public int getPreviousMonthReading() {
        return previousMonthReading;
    }

    public int getCurrentMonthReading() {
        return currentMonthReading;
    }

    public void setConsumerNo(String consumerNo) {
        this.consumerNo = consumerNo;
    }

    public void setConsumerName(String consumerName) {
        this.consumerName = consumerName;
    }

    public void setPreviousMonthReading(int previousMonthReading) {
        this.previousMonthReading = previousMonthReading;
    }

    public void setCurrentMonthReading(int currentMonthReading) {
        this.currentMonthReading = currentMonthReading;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter consumer number: ");
        String consumerNo = scanner.nextLine();
        System.out.println("Enter consumer name: ");
        String consumerName = scanner.nextLine();
        System.out.println("Enter previous month reading: ");
        int previousMonthReading = scanner.nextInt();
        System.out.println("Enter current month reading: ");
        int currentMonthReading = scanner.nextInt();
        scanner.close();

        EBBill ebBill = new EBBill(consumerNo, consumerName, previousMonthReading, currentMonthReading);
        double billAmount = ebBill.computeBillAmount();
        System.out.println("Bill Amount: " + billAmount);
    }
}