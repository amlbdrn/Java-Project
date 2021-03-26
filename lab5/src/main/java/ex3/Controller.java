package ex3;

public class Controller {

    public TemperatureSensor tempSensor=new TemperatureSensor();
    public LightSensor lightSensor=new LightSensor();


    public void control(){
        for(int i=0;i<20;i++){
            try{
                Thread.sleep(1000);
            }
            catch (InterruptedException ex){
                System.out.println(ex);
            }
            int t=tempSensor.readValue();
            int l=lightSensor.readValue();
            System.out.println("Temp "+t);
            System.out.println("Light "+l);
            System.out.println();
        }
    }
}
