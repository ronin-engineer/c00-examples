package $07.interface0;

public class Computer {

    public int ram;

    public String model;

    public Computer(String model, int ram) {
        this.ram = ram;
        this.model = model;
    }

    @Override
    public String toString() {
        return "Computer - mode: " + model + ", ram: " + ram + " GB";
    }

    @Override
    public boolean equals(Object instance) {
        if (!(instance instanceof Computer)) { // bird == computer  => false ==> true
            return false;
        }

        Computer computer = (Computer) instance;
        return this.model.equals(computer.model) && this.ram == computer.ram;
    }

    public static void main(String[] agrs) {
        Computer computer0 = new Computer("IBM", 16);
        Computer computer1 = new Computer("IBM", 16);
        Computer computer2 = new Computer("Asus", 16);
        System.out.println("Created: " + computer0);
        System.out.println("Computer0 equals to computer1 ? " + computer0.equals(computer1));
        System.out.println("Computer0 equals to computer2 ? " + computer0.equals(computer2));

        Bird bird = new Bird();
        System.out.println("Computer0 equals to bird ? " + computer0.equals(bird));
    }
}
