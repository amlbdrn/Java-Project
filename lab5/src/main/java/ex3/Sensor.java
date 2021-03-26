package ex3;

public abstract class Sensor {

    protected String location;

    abstract int readValue();
    abstract String getLocation();
}
