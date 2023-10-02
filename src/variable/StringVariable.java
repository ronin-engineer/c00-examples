package variable;

import java.util.Scanner;

public class StringVariable {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        System.out.printf("Hello, %s\n", name);

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();
        System.out.printf("%s is %d years old.", name, age);
    }
}
