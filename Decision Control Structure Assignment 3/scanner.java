import java.util.Scanner;
import java.util.InputMismatchException;
public class scanner {
    public static void main(String[] args) {
        int nsat;
        double salary;
        int entrance;
        Scanner inputDevice = new Scanner(System.in);
        try {
            System.out.print("PLease  enter your NSAT score: ");
            nsat = inputDevice.nextInt();
            System.out.print("Please enter your parent's salary: ");
            salary = inputDevice.nextDouble();
            System.out.print("Please enter your entrance examination score:  ");
            entrance = inputDevice.nextInt();
            int mm = nsat * entrance;
            int ww = mm/2;
            if (ww >= 91 && salary <= 3500 ){
                System.out.print("You're Accepted");
            }else if (nsat < 90 && salary > 10000 && entrance < 85){
                System.out.print("You're Rejected");
            }else{
                System.out.print("Further Study");
            }

        }catch(InputMismatchException e) {
            System.out.print("Error: Wrong format! Please enter numbers only." );
        }finally{
            inputDevice.close();
        }
    }
}
