package $07.interface0;

public class Bird implements Animal, Flyable {

    @Override
    public void run() {
        System.out.println("Bird runs!!!");
    }

    @Override
    public void fly() {
        System.out.println("Bird flies!!!");
    }
}
