package $07.abstraction;

public abstract class Shape {

    private String color;

    private int area;

    public Shape(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setArea(int area) {
        this.area = area;
    }

    public abstract int getArea();
}
