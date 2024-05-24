package week06.Movable;

import geometry.*;

public class MoveArrayTest {
    // f
    public static void main(String[] args) {

        Movable[] movables = new Movable[] {
                new Point(2, 4),
                new Segment(new Point(1, 2), new Point(3, 1)),
                new Circle(new Point(4, 5), 3.0)
        };

        moveAll(movables, "up");

        for(Movable movable: movables){
            System.out.println(movable.toString());
        }

        // We can also use: System.out.println(Arrays.toString(movables));
    }

    public static void moveAll(Movable[] movables, String direction){
        for(Movable movable: movables){
            switch(direction.toLowerCase()){
                case "up":
                movable.moveUp();
                break;
                case "down":
                movable.moveDown();
                break;
                case "right":
                movable.moveRight();
                break;
                case "left":
                movable.moveLeft();;
                break;
                default: 
                System.out.println("Invalid direction. Use up, down, right or left");
                break;
            }
        }
    }

}
