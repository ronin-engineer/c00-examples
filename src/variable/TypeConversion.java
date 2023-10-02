package variable;

public class TypeConversion {

    public static void main(String[] args) {
        long l = 100L;
        float f = 5.5f;
        int n1 = (int) l;
        int n2 = (int) f;

        System.out.printf("n1: %d - n2: %d", n1, n2);
    }
}
