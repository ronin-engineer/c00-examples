package $07.encapsulation;

public class Shape {
    private String color;

    private Integer area;


    public Shape(String color) {
        this.color = color;
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
}
