package $09;

import java.util.Scanner;

public class $06_Finally {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter integer: ");
        int number = input.nextInt();

        try {
            System.out.println("running");
            if (number < 0) {
                throw new NullPointerException("error");
            } else if (number < 3) {
                throw new RoninException("s");
            } else
                System.out.println(number);
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception:" + e.getMessage());
        }
        catch (ArithmeticException e) {

        }
        catch (RoninException e) {

        }
        finally {
            System.out.println("closing app");
        }

        System.out.println("closed app");
    }
}
