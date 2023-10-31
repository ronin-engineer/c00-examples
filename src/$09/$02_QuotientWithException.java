package $09;

import java.util.Scanner;

public class $02_QuotientWithException {

    public static int quotient(int number1, int number2) {  // callee
        if (number2 == 0) {
            throw new ArithmeticException("Divisor must not be zero!!!");
        }

        return number1 / number2;
    }

    public static void main(String[] args) {    // caller
        Scanner input = new Scanner(System.in);

        System.out.print("Enter 2 integers: ");
        int number1 = input.nextInt();
        int number2 = input.nextInt();

        try {
            int result = quotient(number1, number2);
            System.out.println(number1 + " / " + number2 + " = " + result);
        }
        catch (ArithmeticException ex) {
            System.out.println("Exception: " + ex.getMessage());    // exception handler
        }

        System.out.println("App continues...");
    }
}
