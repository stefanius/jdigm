package observer.pattern.base;

import observer.pattern.interfaces.IObserver;
import observer.pattern.interfaces.ISubject;

import java.util.ArrayList;

/**
 * Created by stefanius on 16/06/14.
 */
public abstract class Subject implements ISubject{

    protected ArrayList<IObserver> observers = new ArrayList<IObserver>();

    public void registerObserver(IObserver observer) {
        this.observers.add(observer);
    }

    public void removeObserver(IObserver observer) {
        this.observers.remove(observer);
    }

    public void notifyObservers() {
        for (IObserver ob : observers) {
            ob.update(this);
        }
    }
}
