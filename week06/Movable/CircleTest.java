package week06.Movable;

import geometry.*;

public class CircleTest {
    public static void main(String[] args) {

        //e
        Point point = new Point(0, 0);
        point.moveUp();
        point.moveRight();

        Circle circle = new Circle(new Point(3, 4), 2);
        circle.moveLeft();
        circle.moveDown();

        System.out.println("Point is at (" + point.getX() + "," + point.getY() + ")");
        System.out.println("Circle center is at (" + circle.getCenter().getX() + "," + circle.getCenter().getY() + ")");

    }
}
