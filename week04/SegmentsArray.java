package week04;

import geometry.*;

public class SegmentsArray{

    public static void main(String[] args) {
        Point p1 = new Point(2, 3);
        Point p2 = new Point(4, 6);
        Point p3 = new Point(1, 1);

        Segment[] segments = {
            new Segment(p1, p2),
            new Segment(p2, p3),
            new Segment(p3, p1)
        };

        Segment[] minSegments = findSegmentsWithMinimumLength(segments);

        System.out.println("Segments with the minimum length: ");
        for(Segment segment : minSegments){
            System.out.println(segment);
        }

    }
    
    public static Segment[] findSegmentsWithMinimumLength(Segment[] segments){
        
        if(segments.length == 0){
            return new Segment[0];
        }

        int count = 0 ;
        double min = Double.MAX_VALUE;

        Segment[] minSegments = new Segment[segments.length];
        for (Segment segment : segments) {
            double length = segment.length();

            if (length < min) {

                min = length;

                count = 1;

                minSegments[0] = segment;

            } else if (length == min) {

                minSegments[count++] = segment;

            }
        }

        Segment[] result = new Segment[count];
        
        for (int i = 0; i < count; i++) {

            result[i] = minSegments[i];

        }
        return result;
    }
}
