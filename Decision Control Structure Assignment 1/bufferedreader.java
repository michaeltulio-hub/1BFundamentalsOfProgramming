import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class bufferedreader {
    public static void main(String[] args) {
        BufferedReader dataln = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.print("Please Enter a year: ");
            String yearInput = dataln.readLine();
            int year = Integer.parseInt(yearInput);
            if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) {
                System.out.println(year + " is a leap year");
            } else {
                System.out.println(year + " is not a leap year");
            }
        }catch (IOException e) {
            System.err.println("Error reading input stream.");
        }catch (NumberFormatException e) {
            System.err.println("Invalid number format! Please enter digits only.");
        }
    }
}