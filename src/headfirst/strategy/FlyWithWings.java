package headfirst.strategy;

/**
 * Created by Gavin on 2017/2/10.
 */
public class FlyWithWings implements FlyBehavior {
    @Override
    public void fly() {
        System.out.print("I'm flying!!");
    }
}
