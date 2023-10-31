package $04.function;

public class $0_Function {

    public static void main(String[] args) {
        int x = 5;
        int y = 2;
        int result = max(x, y);

        System.out.printf("The maximum of %d and %d is %d.\n", x, y, result);


        int a = 6;
        int b = 10;
        result = max(a, b);

        System.out.printf("The maximum of %d and %d is %d.\n", a, b, result);
    }

    public static int max(int num1, int num2) {
        int result;

        if (num1 > num2)
            result = num1;
        else
            result = num2;

        return result;
    }
}
