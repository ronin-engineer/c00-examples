package $09;

import java.util.Scanner;

public class $00_Quotient {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter 2 integers: ");
        int number1 = input.nextInt();
        int number2 = input.nextInt();

        System.out.println(number1 + " / " + number2 + " = " + (number1/number2));
        System.out.println("App continues...");
    }
}
