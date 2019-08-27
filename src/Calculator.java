import java.math.*;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        double pi = Math.PI;
        int digits;
        Scanner scan = new Scanner(System.in);
        System.out.print("How many digits of Pi would you like? ");
        String digitsStr = scan.nextLine();

        //Redundancy prevent user inputting wrong data type
        digitsStr = digitsStr.replaceAll( "[^\\d]", "" );
        digits = Integer.parseInt(digitsStr);


    }
}