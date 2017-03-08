package headfirst.decorator.starbuzzWithSizes;

/**
 * Created by Gavin on 2017/3/8.
 */
public abstract class CondimentDecorator extends Beverage {
    public Beverage beverage;
    public abstract String getDescription();

    public Size getSize() {
        return beverage.getSize();
    }
}
