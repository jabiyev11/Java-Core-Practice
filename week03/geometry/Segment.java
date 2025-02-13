package geometry;
import week06.Movable.Movable;

public class Segment implements Movable{

    private Point p1;
    private Point p2;

    public Segment(Point p1, Point p2) {
        this.p1 = new Point(p1);
        this.p2 = new Point(p2);
    }

    public Segment(float x1, float y1, float x2, float y2) {
        this.p1 = new Point(x1, y1);
        this.p2 = new Point(x2, y2);
    }

    public Point getP1() {

        return p1;
    }

    public void setP1(Point p1) {
        this.p1 = p1;
    }

    public Point getP2() {
        return p2;
    }

    public void setP2(Point p2) {
        this.p2 = p2;
    }

    @Override
    public void moveUp(){
        p1.moveUp();
        p2.moveUp();
    }

    @Override
    public void moveDown(){
        p1.moveDown();
        p2.moveDown();;
    }

    @Override
    public void moveLeft(){
        p1.moveLeft();
        p2.moveLeft();
    }

    @Override
    public void moveRight(){
        p1.moveRight();
        p2.moveRight();
    }

    public void translate(float dx, float dy) {
        this.p1.translate(dx, dy);
        this.p2.translate(dx, dy);
    }

    public float length() {

        return p1.distance(p2);
    }

    public boolean equals(Segment s) {
        return this.p1.equals(s.p1) && this.p2.equals(s.p2);
    }

    public float getSlope() {
        if (p1.getX() == p2.getX())
            throw new ArithmeticException("Slope is undefined for vertical fine segment.");
        return (p2.getY() - p1.getY()) / (p2.getX() - p1.getY());
    }

    public float getIntercept() {
        return p1.getY() - this.getSlope() * p1.getX();
    }

    public boolean isOnLine(Point p) {
        if (p1.getX() == p2.getX())
            return p.getX() == p1.getX();
        float slope = this.getSlope();
        float intercept = this.getIntercept();
        return p.getY() == slope * p.getX() + intercept;
    }

    public boolean isOnSegment(Point point) {
        if (!this.isOnLine(point))
            return false;

        float minX = Math.min(p1.getX(), p2.getX());
        float maxX = Math.max(p1.getX(), p2.getX());
        float minY = Math.min(p1.getY(), p2.getY());
        float maxY = Math.max(p1.getY(), p2.getY());

        return point.getX() >= minX && point.getX() <= maxX && point.getY() >= minY && point.getY() <= maxY;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        sb.append(p1.toString()); // Assuming p1 and p2 are instances of Point
        sb.append(", ");
        sb.append(p2.toString());
        sb.append("]");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj) return true;
        if(this == null || getClass() != obj.getClass()) return false;

        Segment otherSegment = (Segment) obj;

        return (this.p1.equals(otherSegment.p1) && this.p2.equals(otherSegment.p2)) ||
        (this.p2.equals(otherSegment.p1) && this.p1.equals(otherSegment.p2));
        
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        Segment clonedSegment= (Segment) super.clone();
        clonedSegment.p1 = (Point) this.p1.clone();
        clonedSegment.p2 = (Point) this.p2.clone();
        return clonedSegment;   // Deep copying

        //Shallow copying might not be very useful in case of cloning Arrays or Objects, since
        // it will copy the reference and conqesuently change the original one as well in case of changing the copy
    }

}
