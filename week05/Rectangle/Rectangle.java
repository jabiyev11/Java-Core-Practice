package week05.Rectangle;

import week06.Shape.Resizable;
import week06.Shape.Shape;

public class Rectangle extends Shape implements Resizable {
    
    protected double width, length;

    public Rectangle(){
        this.width = 1.0;
        this.length = 1.0;
    }

    public Rectangle(double width, double length){
        this.width = width;
        this.length = length;
    }

    public Rectangle(double width, double length, String color, boolean filled){
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    public double getWidth(){
        return width;
    }

    public void setWidth(double width){
        this.width = width;
    }

    public double getLength(){
        return length;
    }

    public void setLength(double length){
        this.length = length;
    }

    @Override
    public double getArea(){
        return width * length;
    }

    @Override
    public double getPerimeter(){
        return 2 * (width + length);
    }

    @Override
    public String toString() {
        return "Rectangle[Shape[color= " + getColor() + ",filled= " + isFilled() + "],width= " + width + ",length= " + length + "]"; 
    }

    @Override
    public void resize(double percentage) {
        width *= (1 + percentage / 100);
        length *= (1 + percentage / 100);
    }

    @Override
    public boolean equals(Object obj){
        if(this == obj) return true;
        if(obj == null || !(obj instanceof Rectangle)) return false;

        Rectangle rect = (Rectangle) obj;

        return this.width == rect.width && this.length == rect.length;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return (Rectangle) super.clone();
    }









}
