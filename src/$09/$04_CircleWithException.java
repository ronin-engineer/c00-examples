package $09;

public class $04_CircleWithException {
    private double radius;

    private static int numberOfObjects = 0;

    public $04_CircleWithException() throws IllegalArgumentException {
        this(1.0);
    }

    public $04_CircleWithException(double radius) throws IllegalArgumentException {
        setRadius(radius);
        numberOfObjects++;
    }

    public void setRadius(double newRadius) throws IllegalArgumentException {   // method3
        if (newRadius >= 0)
            radius = newRadius;
        else
            throw new IllegalArgumentException("Radius cannot be negative");
    }

    public double getRadius() {
        return radius;
    }

    public double getArea() {
        return radius * radius * 3.14159;
    }

    public static int getNumberOfObjects() {
        return numberOfObjects;
    }
}
