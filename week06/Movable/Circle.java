package week06.Movable;

import geometry.Point;
import week06.Shape.Resizable;
import week06.Shape.Shape;

public class Circle extends Shape implements Movable, Resizable{


    private Point center;
    protected double radius;

    public Circle(){
        this.radius = 1.0;
    }

    public Circle(double radius){
        this.radius = radius;
    }

    public Circle(double radius, String color, Boolean filled){
        super(color, filled);
        this.radius = radius;      
    }

    public Circle(Point center, double radius) {
        this.center = center;
        this.radius = radius;
    }

    // Implementing Movable interface
    @Override
    public void moveUp() {
        center.moveUp();
    }

    @Override
    public void moveRight() {
        center.moveRight();
    }

    @Override
    public void moveLeft() {
        center.moveLeft();
    }

    @Override
    public void moveDown() {
        center.moveDown();
    }

    // providing getter methods
    public Point getCenter() {
        return center;
    }

    public void setCenter(Point center){
        this.center = center;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius){
        this.radius = radius;
    }

    @Override
    public double getArea(){
        return Math.PI * radius * radius;
    }

    @Override
    public double getPerimeter(){
        return 2 * Math.PI * radius;
    }

    @Override
    public void resize(double percentage){
        radius *= (1 + percentage / 100);
    }

    @Override
    public String toString(){
        return "Circle[Shape[color= " + color + ", filled= " + filled + "]," + "radius= " + radius + "]";
    }

    

}
