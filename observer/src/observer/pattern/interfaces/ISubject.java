package observer.pattern.interfaces;

/**
 * Created by stefanius on 16/06/14.
 */
public interface ISubject {
    public void registerObserver(IObserver observer);

    public void removeObserver(IObserver observer);

    public void notifyObservers();
}
