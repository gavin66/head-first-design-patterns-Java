package headfirst.strategy;

/**
 * Created by Gavin on 2017/2/10.
 */
public class DecoyDuck extends Duck {

    public DecoyDuck() {
        setFlyBehavior(new FlyNoWay());
        setQuackBehavior(new MuteQuack());
    }

    @Override
    public void display() {
        System.out.print("I'm a duck Decoy");
    }

}
