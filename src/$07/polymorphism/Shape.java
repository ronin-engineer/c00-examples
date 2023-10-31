package $07.polymorphism;

public class Shape {
    private String color;

    private Integer area;

    public Shape(String color) {
        this.color = color;
    }


    public void showInfo() {
        System.out.println("Area: " + area);
        System.out.println("Color: " + color);
    }

    public void showColor() {
        System.out.println("This shape is " + color);
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Integer getArea() {
        return area;
    }

    public void setArea(Integer area) {
        this.area = area;
    }

    public int calculateArea() {
        return area;
    }
}
