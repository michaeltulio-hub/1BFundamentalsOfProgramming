import javax.swing.JOptionPane;
public class JOption {
    public static void main(String[] args) {
        String input = JOptionPane.showInputDialog("Enter a year:");
        int year = Integer.parseInt(input);
        if ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0)) {
            JOptionPane.showMessageDialog(null, year + " is a leap year.");
        }else {
            JOptionPane.showMessageDialog(null, year + " is not a leap year");
        }
    }
}
