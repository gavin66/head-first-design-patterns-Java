package headfirst.decorator.starbuzzWithSizes;

/**
 * Created by Gavin on 2017/3/8.
 */
public class Espresso extends Beverage {
    public Espresso() {
        description = "Espresso";
    }

    public double cost() {
        return 1.99;
    }
}
