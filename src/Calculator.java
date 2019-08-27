import java.math.*;
import java.util.Scanner;
import mathHelpers.*;

public class Calculator {
    public static void main(String[] args) {
        double pi = Math.PI;
        double result;
        int digits;
        Scanner scan = new Scanner(System.in);
        System.out.print("How many digits of Pi would you like? ");
        String digitsStr = scan.nextLine();

        //Redundancy prevent user inputting wrong data type
        digitsStr = digitsStr.replaceAll( "[^\\d]", "" );
        digits = Integer.parseInt(digitsStr);

        result = mathHelpers.roundDec(pi, digits);
        System.out.println("Pi with " + digitsStr + " is: " + String.valueOf(result));
    }
}