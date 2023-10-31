package $07.interface0;

public class App {
    public static void main(String[] args) {
        Flyable fa = new Aircraft();
        Flyable fb = new Bird();

        fa.fly();
        fb.fly();
    }
}
