package $07.inheritance;

public class Retangle extends Shape {

    public Integer height;

    public Integer width;

    public String color;


    public Retangle(Integer height, Integer width, String color) {
        super(color);
        this.width = width;
        this.height = height;
        this.color = "sub" + color;
        System.out.println("Created a retangle");
    }

    public void showInfo() {
        System.out.println("Color: " + this.color);
        this.showColor();
        System.out.println("Height: " + height);
        System.out.println("Width: " + width);
    }

    public void showColor() {
        System.out.println("Color: " + this.color);
    }

    public void showArea() {
        System.out.println("Area: " + super.getArea());
    }

    public void calculateArea() {
        super.setArea((double) (height * width));
    }

    public static void main(String[] args) {
        Retangle retangle = new Retangle(3, 4, "yellow");
        retangle.showInfo();
        retangle.calculateArea();
        retangle.showArea();
    }
}
