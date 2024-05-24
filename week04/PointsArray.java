package week04;
import geometry.Point;

public class PointsArray {
    public static void main(String[] args) {
        Point[] points = {
            new Point(2, 3),
            new Point(3, -5),
            new Point(-1, 8),
            new Point(4, 4),
            new Point(-5, 9)
        };

        Point mostNorthern = points[0];
        Point mostSouthern = points[0];
        Point mostWestern = points[0];
        Point mostEastern = points[0];

        for(int i = 0; i < points.length; i++){
            Point current = points[i];
            if(current.getX() > mostEastern.getX()){
                mostEastern = current;
            }
            if(current.getX() < mostWestern.getX()){
                mostWestern = current;
            }
            if(current.getY() > mostNorthern.getY()){
                mostNorthern = current;
            }
            if(current.getY() > mostSouthern.getY()){
                mostSouthern = current;
            }
        }

        System.out.println("Most Northern is " + mostNorthern);
        System.out.println("Most Southern is " + mostSouthern);
        System.out.println("Most Eastern is " + mostEastern);
        System.out.println("Most Western is " + mostWestern);
        
    

    }

    
}
