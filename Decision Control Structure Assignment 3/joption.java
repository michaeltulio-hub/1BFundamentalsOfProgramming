import javax.swing.JOptionPane;
public class joption {
    public static void main(String[] args){
        String input = JOptionPane.showInputDialog("Please enter your NSAT score: ");
        int nsat = Integer.parseInt(input);
        String inputs = JOptionPane.showInputDialog("Please enter your parent's salary: ");
        Double salary = Double.parseDouble(inputs);
        String inputscore = JOptionPane.showInputDialog("Please enter your entrance examination score: ");
        int score = Integer.parseInt(inputscore);
        if(nsat >= 91 && salary <= 3500 && score >= 85) {
            JOptionPane.showMessageDialog (  null, "You're Accepted");
        }else if (nsat < 90 && salary > 10000 && score < 85 ) {
            JOptionPane.showMessageDialog (  null, "You're Rejected");
        }else{
            JOptionPane.showMessageDialog (  null, "Further study");
        }
    }
}
