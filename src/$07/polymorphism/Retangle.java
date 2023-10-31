package $07.polymorphism;

public class Retangle extends Shape {

    public int height;

    public int width;


    public Retangle(int height, int width, String color) {
        super(color);
        this.width = width;
        this.height = height;
    }

    @Override
    public void showInfo() {
        System.out.println("Height: " + height);
        System.out.println("Width: " + width);
        System.out.println("Color: " + super.getColor());
        System.out.println("Area: " + calculateArea());
    }


    public int calculateArea(int a) {
        super.setArea((height * width * a));
        return getArea();
    }

    public int calculateArea(int a, int b) {
        super.setArea((height * width * a * b));
        return getArea();
    }

    public long calculateArea(int a, int b, int c) {
        super.setArea((height * width * a * b));
        return getArea();
    }


    public static void main(String[] args) {
        Retangle retangle = new Retangle(3, 4, "red");
        retangle.showInfo();
    }
}
