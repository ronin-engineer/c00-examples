package $04.loop;

public class $4_NestedLoops {
    public static void main(String[] args) {
        System.out.println("Multiplication Table");
        System.out.print("    ");
        for (int i = 1; i <= 9; i++) {
            System.out.print("   " + i);
        }

        System.out.println("\n----------------------------------------");
        for (int i = 1; i <= 9; i++) {
            System.out.print(i + " | ");
            for (int j = 1; j <= 9; j++) {
                System.out.printf("%4d", i * j); // xxxx
            }
            System.out.println();
        }
    }
}
