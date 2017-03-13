package headfirst.singleton.threadsafe;

/**
 * Created by Gavin on 2017/3/13.
 */
public class SingletonClient {
    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance();
        System.out.println(singleton.getDescription());
    }
}
