package $09;

import java.util.Scanner;

public class $03_UncheckException {
    public static void main(String[] args) {
        int[] a = new int[5];   // 0 --> 4
        a[2] = 4;
        a[3] = 2;
        a[4] = 1;
        a[1] = 0;

        Scanner input = new Scanner(System.in);
        System.out.println("Enter index: ");
        int index = input.nextInt();

        try {
            System.out.println("a[" + index + "] = " + a[index]);
        }
        catch (RuntimeException ex) {
            System.out.println(ex.getLocalizedMessage());
            ex.printStackTrace();
        }

        System.out.println("App continues...");
    }

    // start = compile --> run app
}
