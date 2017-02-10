package headfirst.strategy;

/**
 * Created by Gavin on 2017/2/10.
 */
public class RubberDuck extends Duck{
    public RubberDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new Squeak();
    }

    @Override
    public void display() {
        System.out.println("I'm a rubber duckie");
    }
}
