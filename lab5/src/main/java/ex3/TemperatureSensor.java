package ex3;
import java.util.Random;

public class TemperatureSensor extends Sensor{

    public int tempSensor;

    public TemperatureSensor() {
        for (int i = 0; i < 3; i++) {
            int randomInt = (int) (101 * Math.random());
            System.out.println("Random numbers: " + randomInt);
        }
    }

    @Override
    public int readValue(){
        return tempSensor;
    }

    @Override
    public String getLocation(){
        return location;
    }

}
