import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class bufferedreader {
    public static void main(String[] args) {
        BufferedReader dataln = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.print("Are you a recommendee of Jedi Master Obi Wan? Enter “R” for recommendee, Enter “N” for non-recommendee: " );
            char recomendee = dataln.readLine().charAt(0);
            System.out.print("Please enter your Height in cm: ");
            String tallInput = dataln.readLine();
            Double tall = Double.parseDouble(tallInput);
            System.out.print("Please enter your Age: ");
            String ageInput = dataln.readLine();
            int age = Integer.parseInt(ageInput);
            System.out.print("Are you a citizen of the Planet Endor? Enter (“C” for citizen of Endor, Enter “N” for non-citizen: ");
            char citizen = dataln.readLine().charAt(0);
            if ( recomendee == 'R' ) {
                System.out.print("You're Accepted");
            }else if( tall >= 200 && age <= 25 && age >= 21 && citizen == 'C') {
                System.out.print("You're Accepted");
            }else{
                System.out.print("You're Rejected");
            }
        }catch (IOException e){
            System.err.println("Error reading input stream.");
        }catch( NumberFormatException e) {
            System.err.println("Invalid number format! Please enter digits only.");
        }

    }
}
