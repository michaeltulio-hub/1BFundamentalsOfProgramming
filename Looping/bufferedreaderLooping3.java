import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class bufferedreaderLooping3 {
    public static void main(String[] args) throws IOException {

        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

        double balance = 20000.00;
        double amount;

        do {
            System.out.print("Enter amount (0 to stop): ");
            amount = Double.parseDouble(input.readLine());

            if (amount > 0) {
                balance += amount;
                System.out.printf("Outstanding Balance: %.2f%n", balance);
            }
            else if (amount < 0) {
                if (balance >= Math.abs(amount)) {
                    balance += amount;
                    System.out.printf("Outstanding Balance: %.2f%n", balance);
                }
                else {
                    System.out.println("INSUFFICIENT FUNDS!");
                    System.out.printf("Outstanding Balance: %.2f%n", balance);
                }
            }

        } while (amount != 0);

        System.out.println("Transaction ended.");
    }
}
