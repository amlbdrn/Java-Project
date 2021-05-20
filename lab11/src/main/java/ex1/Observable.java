package ex1;

import java.util.ArrayList;
import java.util.List;


public class Observable {

    private final List<Observer> observers = new ArrayList<>();

    public final void changeState(Object event) {
        notifyAllObservers(event);
    }

    public void register(Observer observer) {
        observers.add(observer);
    }

    private void notifyAllObservers(Object event) {
        for (Observer observer : observers) {
            observer.update(event);
        }
    }
}
