package $02;

import java.util.Scanner;

public class StringVariable {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        System.out.printf("Hello, %s\n", name);

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();
        scanner.nextLine();
        System.out.printf("%s is %d years old.\n", name, age);

        System.out.print("Enter your height: ");
        int height = scanner.nextInt();
        System.out.printf("%s is %s cm", name, height);
    }
}
