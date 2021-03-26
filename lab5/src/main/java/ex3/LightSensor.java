package ex3;

public class LightSensor extends Sensor{

    public int lightSensor;

    public LightSensor() {
        for (int i = 0; i < 3; i++) {
            int randomInt = (int) (101 * Math.random());
            System.out.println("Random numbers: " + randomInt);
        }
    }

    @Override
    public int readValue(){
        return lightSensor;
    }

    @Override
    public String getLocation(){
        return location;
    }
}
