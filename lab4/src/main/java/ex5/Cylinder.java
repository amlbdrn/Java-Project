package ex5;

import ex1.Circle;

public class Cylinder extends Circle{

   public double height=1.0;
   public double volume;

    public Cylinder(){
        this.height=height;
        this.volume=volume;
    }

    public Cylinder(double radius){
        super(radius);
    }

    public Cylinder(double radius, double height){
        super(radius);
        this.height=height;
    }

    public double getHeight() {
        return height;
    }

    public double getVolume() {
        return volume;
    }

    @Override

    public double getArea() {

        return 2*3.14*super.getRadius()*height+2*3.14*super.getRadius()*super.getRadius();
    }
}