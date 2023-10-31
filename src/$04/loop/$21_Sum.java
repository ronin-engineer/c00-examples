package $04.loop;

import java.util.Scanner;

public class $21_Sum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int input;

        do {
            System.out.print("Enter a number: ");
            input = scanner.nextInt();
            sum += input;
        } while (input != 0);

        System.out.println("Sum = " + sum);
    }
}
