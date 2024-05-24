package geometry;

import week06.Movable.Movable;

public class Point implements Movable{

    private float x;
    private float y;

    public Point(){
        this.x = 0;
        this.y = 0;

    }

    public Point(float x, float y){
        this.x = x;
        this.y = y;

    }
    public Point(Point p){
        this.x = p.x;
        this.y = p.y;
    }

    public float getX(){        // We use get and set methods to implement conditions if needed
        return x;               // although we did not use here but still it is good practice to use them 
                                // and know how to implement if setting some conditions are needed
    }                          
    

    public void setX(float x){
        this.x = x;
    }

    public float getY(){
        return y;
    }

    public void setY(float y){
        this.y = y;
    }

    public void translate(float dx, float dy){
        this.x += dx;
        this.y += dy;
    }

    public float distance(Point p){
        return (float) Math.sqrt(Math.pow(p.x - this.x, 2) + Math.pow(p.y -this.y, 2));
    }


    @Override
    public boolean equals(Object obj){
        if(this == obj) return true;
        if(obj == null || getClass() != obj.getClass()) return false;

        Point otherPoint = (Point) obj;
        return Float.compare(otherPoint.x, x) == 0 && Float.compare(otherPoint.y, y) == 0; 
    }

    @Override
    public String toString() {
    
    return "(" + x + "," + y + ")";
}

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();   // Shallow copy
    }

    //Implementing Movable methods

    @Override
    public void moveUp(){
        y++;
    }

    @Override
    public void moveDown(){
        y--;
    }

    @Override
    public void moveRight(){
        x++;
    }

    @Override
    public void moveLeft(){
        x--;
    }
  
}
