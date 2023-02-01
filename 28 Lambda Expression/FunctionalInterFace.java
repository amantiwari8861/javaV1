@FunctionalInterface
interface Vehicles {
    public abstract int speed(double d);
}

public class FunctionalInterFace {

    public static void main(String[] args) {

        Vehicles maruti = (double d3) -> {
            System.out.println("my speed is " + d3 + "km/hr");
            return (int) d3;
        };
        maruti.speed(85.6);
    }
}

/* @FunctionalInterface
interface Shape {
    public abstract void draw();

    // public abstract Double perimeter(); //Uncomment the abstract method to
    // observe the difference

    public default Double area(Integer radius) {
        return radius * 3.14;
    }

    public default Double area(Double height, Double width) {
        return height * width;
    }

    public static void print() {
        System.out.println("Inside Shape");
    }
}

class Tester {
    public static void main(String[] args) {
        Shape.print();
    }
} */