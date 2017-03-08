package headfirst.decorator.starbuzz;

/**
 * Created by Gavin on 2017/3/7.
 */
public class Whip extends CondimentDecorator {
    Beverage beverage;

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Whip";
    }

    @Override
    public double cost() {
        return 0.10 + beverage.cost();
    }

    public Whip(Beverage beverage) {
        this.beverage = beverage;
    }
}
