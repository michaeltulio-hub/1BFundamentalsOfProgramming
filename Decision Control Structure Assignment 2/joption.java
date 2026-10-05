import javax.swing.JOptionPane;
public class joption {
    public static void main(String[] args) {
        String input = JOptionPane.showInputDialog("Enter your gross pay per hour: ");
        double pay = Double.parseDouble(input);
        String inputs = JOptionPane.showInputDialog("Enter hours worked: ");
        int hour = Integer.parseInt(inputs);
        double nn = hour * pay;
        double ww = nn * (0.10);
        double mm = nn - ww;
        double qq = nn * (0.12);
        double tt = nn - qq;
        double aa = nn * (0.15);
        double vv = nn - aa;
        double rr = nn * (0.20);
        double ll = nn - rr;
        if(pay <= 2000) {
            JOptionPane.showMessageDialog( null, "Your gross pay in " + hour + "h is " + nn);
            JOptionPane.showMessageDialog(  null, "Your withholding tax is " + ww);
            JOptionPane.showMessageDialog(  null, "Your net pay in " + hour + "h is " + mm);
        } else if(pay >= 2001 && pay <= 4000 ) {
            JOptionPane.showMessageDialog( null, "Your gross pay in " + hour + "h is " + nn);
            JOptionPane.showMessageDialog(  null, "Your withholding tax is " + qq);
            JOptionPane.showMessageDialog(  null, "Your net pay in " + hour + "h is " + tt);
        }else if(pay >= 4001 && pay <= 10000 ) {
            JOptionPane.showMessageDialog( null, "Your gross pay in " + hour + "h is " + nn);
            JOptionPane.showMessageDialog(  null, "Your withholding tax is " + aa);
            JOptionPane.showMessageDialog( null, "Your gross pay in " + hour + "h is " + vv);
        }else {
            JOptionPane.showMessageDialog( null, "Your gross pay in " + hour + "h is " + nn);
            JOptionPane.showMessageDialog(  null, "Your withholding tax is " + rr);
            JOptionPane.showMessageDialog( null, "Your gross pay in " + hour + "h is " + ll);
        }
    }
}