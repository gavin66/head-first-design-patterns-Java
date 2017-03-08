package headfirst.decorator.starbuzzWithSizes;

/**
 * Created by Gavin on 2017/3/8.
 */
public class Decaf extends Beverage {
    public Decaf() {
        description = "Decaf Coffee";
    }

    public double cost() {
        return 1.05;
    }
}
