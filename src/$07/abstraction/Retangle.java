package $07.abstraction;

public class Retangle extends Shape {

    public Integer height;

    public Integer width;


    public Retangle(Integer height, Integer width, String color) {
        super(color);
        this.width = width;
        this.height = height;
    }

    @Override
    public int getArea() {
        return height * width;
    }

    public static void main(String[] args) {
        Retangle retangle = new Retangle(3, 4, "red");
        System.out.println("Area: " + retangle.getArea());
    }

}
