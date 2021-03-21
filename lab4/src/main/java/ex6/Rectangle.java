package ex6;

public class Rectangle extends Shape{
    public double length;
    public double width;

    public Rectangle() {
        length=1.0;
        width=1.0;
    }

    public Rectangle(double width, double length, String color, boolean filled){
        this.length=1.0;
        this.width=1.0;
        this.color=color;
        this.filled=filled;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getArea() {
        return width*length;
    }

    public double getPerimeter() {
        return 2*(width+length);
    }
}

