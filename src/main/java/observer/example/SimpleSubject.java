package observer.example;

import java.util.ArrayList;

public class SimpleSubject implements Subject<Integer> {
    private final ArrayList<Observer<Integer>> observers;
    private int value = 0;
    public SimpleSubject() {
        observers = new ArrayList<Observer<Integer>>();
    }

    public void registerObserver(Observer<Integer> o) {
        observers.add(o);
    }

    public void removeObserver(Observer<Integer> o) {
        observers.remove(o);
    }

    public void notifyObservers() {
        for(Observer<Integer> observer: observers) {
            observer.update(value);
        }
    }
    public void setValue(Integer value) {
        this.value = value.intValue();
        notifyObservers();
    }
}
