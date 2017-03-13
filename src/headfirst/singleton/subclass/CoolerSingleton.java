package headfirst.singleton.subclass;

/**
 * Created by Gavin on 2017/3/13.
 */
public class CoolerSingleton extends Singleton {
    protected static Singleton uniqueInstance;

    private CoolerSingleton(){
        super();
    }
}
