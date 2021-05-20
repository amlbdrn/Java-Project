package ex1;

import java.util.Random;

public class Sensor extends Observable implements Runnable {

    private static final Random RANDOM = new Random();

    @Override
    public void run() {
        while(true) {
            changeState(RANDOM.nextInt(50));
            try{
                Thread.sleep(1000);
            }
            catch (InterruptedException interruptedException) {
                interruptedException.printStackTrace();
            }
        }
    }
}
