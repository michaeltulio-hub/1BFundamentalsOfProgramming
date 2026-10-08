import javax.swing.JOptionPane;
public class joption {
    public static void main(String[] args) {
        char recomendee = JOptionPane.showInputDialog("\"Are you a recommendee of Jedi Master Obi Wan? Enter “R” for recommendee, Enter “N” for non-recommendee: ").charAt(0);
        String tallin = JOptionPane.showInputDialog("Please enter your Height in cm: ");
        Double tall = Double.parseDouble(tallin);
        String agein = JOptionPane.showInputDialog("Please enter your Age: ");
        int age = Integer.parseInt(agein);
        char citizen = JOptionPane.showInputDialog("Are you a citizen of the Planet Endor? Enter “C” for citizen of Endor, Enter “N” for non-citizen: ").charAt(0);
        if ( recomendee == 'R' ) {
            JOptionPane.showMessageDialog( null, "You're Accepted");
        }else if( tall >= 200 && age <= 25 && age >= 21 && citizen == 'C') {
            JOptionPane.showMessageDialog( null, "You're Accepted");
        }else{
            JOptionPane.showMessageDialog( null, "You're Rejected");
        }
    }
}
