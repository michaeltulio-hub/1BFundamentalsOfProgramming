import javax.swing.JOptionPane;
public class joptionpaneLooping1 {
    public static void main(String[] args) {
        double num, highest, lowest;

        num = Double.parseDouble(JOptionPane.showInputDialog("Enter number 1:"));

        highest = num;
        lowest = num;

        for (int i = 2; i <= 10; i++) {

            num = Double.parseDouble(JOptionPane.showInputDialog("Enter number " + i + ":")
            );

            if (num > highest) {
                highest = num;
            }

            if (num < lowest) {
                lowest = num;
            }
        }

        JOptionPane.showMessageDialog(null, "Highest number: " + highest + "Lowest number: " + lowest);
    }
}
