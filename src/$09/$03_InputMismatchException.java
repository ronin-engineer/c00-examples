package $09;

import java.util.InputMismatchException;
import java.util.Scanner;

public class $03_InputMismatchException {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean continueInput = true;

        do {
           try {
               System.out.print("Enter 1 integers: ");
               int number = input.nextInt();
               System.out.println("The number is " + number);
               continueInput = false;
           }
           catch (InputMismatchException ex) {
               System.out.println("Try again. (Incorrect input: an integer is required.)");
               input.nextLine();
           }
        } while (continueInput);
    }
}
