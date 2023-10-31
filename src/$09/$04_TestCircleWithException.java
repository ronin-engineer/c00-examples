package $09;

public class $04_TestCircleWithException {
    public static void main(String[] args) {    // method2

            $04_CircleWithException c1 = new $04_CircleWithException(5); // call method3
            $04_CircleWithException c2 = new $04_CircleWithException(-5);
            $04_CircleWithException c3 = new $04_CircleWithException(0);


        System.out.println("Number of objects created: " + $04_CircleWithException.getNumberOfObjects());
    }
}
