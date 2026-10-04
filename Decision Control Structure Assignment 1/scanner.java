import java.util.Scanner;
import java.util.InputMismatchException;
import java.util.Scanner;
public class scanner {
    public static void main(String[] args) {
        int year;
        Scanner inputDevice = new Scanner(System.in);
        try{
            System.out.print("Please enter a year: ");
            year = inputDevice.nextInt();
            int mm = year % 400;
            if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) {
                System.out.println(year + " is a leap year");
            }else {
                System.out.println(year + " is not a leap year");
            }
        }catch (InputMismatchException e) {
            System.out.println("Error:Age must be a whole number.");
        } finally {
            inputDevice.close();
        }
    }
}


