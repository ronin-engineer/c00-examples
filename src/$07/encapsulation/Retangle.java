package $07.encapsulation;

public class Retangle extends Shape {

    public Integer height;

    public Integer width;


    public Retangle(Integer height, Integer width, String color) {
        super(color);
        this.width = width;
        this.height = height;
    }

    public void showInfo() {
        System.out.println("Height: " + height);
        System.out.println("Width: " + width);
        System.out.println("Color: " + super.getColor());
    }

    public Integer calculateArea() {
        super.setArea((height * width));
        return getArea();
    }

}
