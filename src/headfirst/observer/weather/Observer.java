package headfirst.observer.weather;

/**
 * Created by Gavin on 2017/2/13.
 */
public interface Observer {
    public void update(float temp, float humidity, float pressure);
}
