import javax.swing.JOptionPane;
public class JOptionpaneLooping3 {
    public static void main(String[] args) {

        double balance = 20000.00;
        double amount = 1;

        while (amount != 0) {

            String input = JOptionPane.showInputDialog(
                    "Enter amount (0 to stop):"
            );

            amount = Double.parseDouble(input);

            if (amount > 0) {
                balance = balance + amount;
            }
            else if (amount < 0) {
                if (balance >= Math.abs(amount)) {
                    balance = balance + amount;
                }
                else {
                    JOptionPane.showMessageDialog(null, "INSUFFICIENT FUNDS!");
                }
            }

            if (amount != 0) {
                JOptionPane.showMessageDialog(null,
                        String.format("Outstanding Balance: P%.2f", balance));
            }
        }

        JOptionPane.showMessageDialog(null,
                String.format("Final Balance: P%.2f", balance));
    }
}
