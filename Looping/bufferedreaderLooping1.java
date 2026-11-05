import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class bufferedreaderLooping1 {
    public static void main(String[] args) {
        System.out.println("Enter 10 numbers");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

       try{

           double num, highest, lowest;

           System.out.print("Enter number 1: ");

           num = Double.parseDouble(br.readLine());

           highest = num;
           lowest = num;

           for (int i = 2; i <= 10; i++) {

               System.out.print("Enter number " + i + ": ");
               num = Double.parseDouble(br.readLine());

               if (num > highest) {
                   highest = num;
               }

               if (num < lowest) {
                   lowest = num;
               }
           }

           System.out.println("Highest number: " + highest);
           System.out.println("Lowest number: " + lowest);
       }catch (IOException e) {
           System.err.println("Error reading input stream.");
       }catch (NumberFormatException e) {
           System.err.println("Invalid number format! Please enter digits only.");
       }
    }
}
