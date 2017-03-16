package headfirst.adapter.ducks;

/**
 * Created by Gavin on 2017/3/16.
 */
public class MallardDuck implements Duck {
    @Override
    public void quack() {
        System.out.println("Quack");
    }

    @Override
    public void fly() {
        System.out.println("I'm flying");
    }
}
