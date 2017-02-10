package headfirst.strategy;

/**
 * Created by Gavin on 2017/2/10.
 */
public class FlyRocketPowered implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("I'm flying with a rocket");
    }
}
