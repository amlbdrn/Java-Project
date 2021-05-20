package ex1;

public class Main {

    public static void main(String[] args) {
        Sensor sensor=new Sensor();
        Interface ui=new Interface();
        sensor.register(ui);
        new Thread(sensor).start();
    }
}
