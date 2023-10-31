package $09;

import java.util.Scanner;

public class $01_QuotientWithIf {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter 2 integers: ");
        int number1 = input.nextInt();
        int number2 = input.nextInt();

        if (number2 != 0)
            System.out.println(number1 + " / " + number2 + " = " + (number1/number2));
        else
            System.out.println("Divisor must not be zero!!!");

        // continues
    }
}
