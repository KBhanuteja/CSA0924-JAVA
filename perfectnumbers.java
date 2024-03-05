public class perfectnumbers {
    public static void main(String[] args) {
        int n = 10; // generate the first n perfect numbers
        int count = 0;
        int num = 1;

        System.out.println("The first " + n + " perfect numbers are:");

        while (count < n) {
            int sum = 0;
            for (int i = 1; i <= num/2; i++) {
                if (num % i == 0) {
                    sum += i;
                }
            }

            if (sum == num) {
                System.out.print(num + " ");
                count++;
            }

            num++;
        }
    }
}