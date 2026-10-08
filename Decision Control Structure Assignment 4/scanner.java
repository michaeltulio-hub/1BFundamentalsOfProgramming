import java.util.Scanner;
import java.util.InputMismatchException;
public class scanner {
    public static void main(String[] args) {
        int age;
        double tall;
        char citizen;
        char recomendee;
        Scanner inputDevice = new Scanner(System.in);
        try {
            System.out.print("Are you a recommendee of Jedi Master Obi Wan? Enter “R” for recommendee, Enter “N” for non-recommendee: " );
            recomendee = inputDevice.next().charAt(0);
            System.out.print("Please enter your Height in cm: ");
            tall = inputDevice.nextDouble();
            System.out.print("Please enter your Age: ");
            age = inputDevice.nextInt();
            System.out.print("Are you a citizen of the Planet Endor? Enter (“C” for citizen of Endor, Enter “N” for non-citizen: ");
            citizen = inputDevice.next().charAt(0);
            if (recomendee == 'R' ) {
                System.out.print("You're Accepted");
            }else if( tall >= 200 && age <= 25 && age >= 21 && citizen == 'C'){
                System.out.print("You're Accepted");
            }else {
                System.out.print("You're Rejected");
            }

        }catch(InputMismatchException e) {
            System.out.print("Error: Wrong format! Please enter numbers only." );
        }finally{
            inputDevice.close();
        }
    }
}
