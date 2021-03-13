package ex1;

public class Robot {

    private int x;

    public Robot() {
        x = 1;
    }

    public void Change(int k) {

        if (k >= 1)
            x += k;
    }

    public int getX () {
            return x;
    }

    public void String () {

            System.out.println("The position is: " + x);
    }
}
