package ex1;
public class Square extends Rectangle {

    public Square() {
        width=length;
    }

    public Square(double side) {
        width=side;
        length=side;
    }

    public Square(double side, String color, boolean filled) {
        width=side;
        length=side;
        this.color=color;
        this.filled=filled;
    }

    public double getSide() {
        return width;
    }

    public void setSide(double side) {
        width=side;
        length=side;
    }

    public void setWidth(double width) {
        this.width=width;
        this.length=length;
    }

    public void setLength(double length) {

        this.length=length;
    }

    @Override
    public String toString() {
        return "A square with side: " + length + ", which is a subclass of " + super.toString();
    }
}
