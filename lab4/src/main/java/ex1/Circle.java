package ex1;

    public class Circle {

        public double radius=1.0;
        public String color="red";
        public double PI=3.141592653589793;

        public Circle(){

        }

        public Circle(double radius) {
            this.radius=radius;
        }

        public Circle(double radius,String color){
            this.color=color;
            this.radius=radius;
        }

        public String getColor() {
            return color;
        }

        public double getRadius() {
            return radius;
        }

        public double getArea() {
            return PI*radius*radius;
        }
}
