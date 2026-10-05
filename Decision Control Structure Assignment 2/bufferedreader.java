import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class bufferedreader {
    public static void main(String[] args) {
        BufferedReader dataln = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.print("Please enter your gross pay per hour: ");
            String payInput = dataln.readLine();
            System.out.print("Please hours worked: ");
            String hoursInput = dataln.readLine();
            double pay = Double.parseDouble(payInput);
            int hours = Integer.parseInt(hoursInput);
            double nn = hours * pay;
            double ww = nn * (0.10);
            double mm = nn - ww;
            double qq = nn * (0.12);
            double tt = nn - qq;
            double aa = nn * (0.15);
            double vv = nn - aa;
            double rr = nn * (0.20);
            double ll = nn - rr;
            if(pay <= 2000) {
                System.out.println( "Your gross pay in " + hours + "h is " + nn);
                System.out.println("Your withholding tax is " + ww  );
                System.out.println("Your net pay in " + hours + "h is " + mm);
            } else if(pay >= 2001 && pay <= 4000 ){
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
        }catch (IOException e){
            System.err.println("Error reading input stream.");
        }catch( NumberFormatException e) {
            System.err.println("Invalid number format! Please enter digits only.");
        }
    }
}
