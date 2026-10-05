import java.util.Scanner;
import java.util.InputMismatchException;
public class scanner {
    public static void main(String[] args) {
        double pay;
        int hours;
        Scanner inputDevice = new Scanner(System.in);
        try {
            System.out.print("Enter gross pay per hour: ");
            pay = inputDevice.nextDouble();
            System.out.print("Enter hours worked: ");
            hours = inputDevice.nextInt();
            double nn = hours * pay;
            double ww = nn * (0.10);
            double mm = nn - ww;
            double qq = nn * (0.12);
            double tt = nn - qq;
            double aa = nn * (0.15);
            double vv = nn - aa;
            double rr = nn * (0.20);
            double ll = nn - rr;
            if (pay <= 2000) {
                System.out.println( "Your gross pay in " + hours + "h is " + nn);
                System.out.println("Your withholding tax is " + ww  );
                System.out.println("Your net pay in " + hours + "h is " + mm);
            } else if(pay >= 2001 && pay <= 4000 ) {
                System.out.println( "Your gross pay in " + hours + "h is " + nn);
                System.out.println("Your withholding tax is " + qq  );
                System.out.println("Your net pay in " + hours + "h is " + tt);
            } else if(pay >= 4001 && pay <= 10000 ) {
                System.out.println( "Your gross pay in " + hours + "h is " + nn);
                System.out.println("Your withholding tax is " + aa );
                System.out.println("Your net pay in " + hours + "h is " + vv);
            } else {
                System.out.println( "Your gross pay in " + hours + "h is " + nn);
                System.out.println("Your withholding tax is " + rr );
                System.out.println("Your net pay in " + hours + "h is " + ll);
            }
        }catch(InputMismatchException e){
            System.out.println("Error:Gross pay must be a whole number.");
        }finally {
            inputDevice.close();
        }
    }
}
