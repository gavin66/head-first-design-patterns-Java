package headfirst.strategy;

/**
 * Created by Gavin on 2017/2/10.
 */
public class FlyNoWay implements FlyBehavior{
    @Override
    public void fly() {
        System.out.println("I can't fly");
    }
}
