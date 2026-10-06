import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class befferedreader {
    public static void main(String[] args){
        BufferedReader dataln = new BufferedReader (new InputStreamReader(System.in));
        try {
            System.out.print("Please enter your NSAT score: ");
            String nsatInput = dataln.readLine();
            System.out.print("Please enter your parent's salary: ");
            String salaryInput = dataln.readLine();
            System.out.print("Please enter your entrance examination score: ");
            String scoreInput = dataln.readLine();
            int nsat = Integer.parseInt(nsatInput);
            double salary = Double.parseDouble(salaryInput);
            int score = Integer.parseInt(scoreInput);
            if (nsat >= 91 && salary <= 3500 && score >= 85) {
                System.out.print("You're Accepted");
            }else if (nsat < 90 && salary > 10000 && score < 85) {
                System.out.print("You're Rejected");
            }else{
                System.out.print("Further Study");
            }
        }catch(IOException e){
            System.err.println("Error reading input stream.");
        }catch( NumberFormatException e) {
            System.err.println("Invalid number format! Please enter digits only.");
        }
    }
}