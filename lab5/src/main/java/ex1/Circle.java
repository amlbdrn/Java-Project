package ex1;
public class Circle extends Shape {

    private double radius;

    private Circle() {
        radius=1.0;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override

    public String toString() {
        return "A circle with radius: " + radius + ", which is a subclass of" + super.toString();
    }

    @Override

    public double getArea(){
        return Math.PI*radius*radius;
    }

    @Override

    public double getPerimeter(){
        return 2*Math.PI*radius;
    }

}
