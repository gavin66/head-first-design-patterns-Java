package headfirst.singleton.subclass;

/**
 * Created by Gavin on 2017/3/13.
 */
public class SingletonTestDrive {
    public static void main(String[] args) {
        Singleton foo = CoolerSingleton.getInstance();
        Singleton bar = HotterSingleton.getInstance();
        System.out.println(foo);
        System.out.println(bar);
    }
}
