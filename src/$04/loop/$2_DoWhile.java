package $04.loop;

public class $2_DoWhile {

    public static void main(String[] args) {
        int count = 10;
        while (count < 10) {
            System.out.printf("Ronin Engineer: %d\n", count);
            count++;
        }

        System.out.println("----------------------------");
        count = 10;
        do {
            System.out.printf("Ronin Engineer: %d\n", count);
            count++;
        } while (count < 10);
    }
}
