package ex6;

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

    public double getArea() {
        return Math.PI*Math.pow(radius,2);
    }

    public double getPerimeter() {
        return 2*Math.PI*radius;
    }

    @Override

    public String toString() {
        return "A circle with radius: " + radius + ", which is a subclass of" + super.toString();
    }
}
