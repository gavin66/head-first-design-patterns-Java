package headfirst.observer.weather;

/**
 * Created by Gavin on 2017/2/13.
 */
public interface Subject {
    public void registerObserver(Observer o);

    public void removeObserver(Observer o);

    public void notifyObservers();
}
