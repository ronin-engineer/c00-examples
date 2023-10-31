package $07.inheritance;

public class Shape {
    public String color;

    private Double area;


    public Shape(String color) {
        this.color = color;
        System.out.println("Created a shape");
    }

    public Shape() {
        System.out.println("Created a shape");
    }

    public void showColor() {
        System.out.println("This shape is " + color);
    }

    public Double getArea() {
        return area;
    }

    public void setArea(Double area) {
        this.area = area;
    }
}
