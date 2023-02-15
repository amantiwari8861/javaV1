//Complete the code segment to define a class Point with parameter x,y and method distance()for calculating distance between two points.
//Note: Pass objectsof type class Point as argument in distance() method. 

import java.util.Scanner;

public class XYdistance extends Point {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Point p1 = new Point();
        p1.x = sc.nextDouble();
        p1.y = sc.nextDouble();
        Point p2 = new Point();
        p2.x = sc.nextDouble();
        p2.y = sc.nextDouble();
        Circle c1 = new Circle();
        c1.distance(p1, p2);

    }

}

class Point {
    double x, y;
    double distance(Point p1, Point p2) {
        System.out.print(Math.sqrt(Math.pow((p2.x - p1.x), 2) + Math.pow((p2.y - p1.y), 2)));
        return Math.sqrt(Math.pow((p2.x - p1.x), 2) + Math.pow((p2.y - p1.y), 2));
    }
}