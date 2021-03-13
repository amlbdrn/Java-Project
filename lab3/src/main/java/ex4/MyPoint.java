package ex4;

public class MyPoint {

    int x,y;

    public MyPoint(){
        this.x=this.y=0;
    }

    public MyPoint(int X, int Y){
        this.x=X;
        this.y=Y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setXY(int x, int y) {
        this.x=x;
        this.y=y;
    }

    public String toString() {
        return "(" + x + "," + y + ")";
    }

    public double Distance(int x, int y) {
        int xDist=this.x-x;
        int yDist=this.y-y;
        return Math.sqrt(xDist*xDist+yDist*yDist);
    }

    public double Distance(MyPoint another) {
        int xDist=this.x-another.x;
        int yDist=this.y-another.y;
        return Math.sqrt(xDist*xDist+yDist*yDist);
    }


}
