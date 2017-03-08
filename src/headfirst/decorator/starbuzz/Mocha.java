package headfirst.decorator.starbuzz;

/**
 * 装饰者 Mocha ,继承 CondimentDecorator
 * Created by Gavin on 2017/3/7.
 */
public class Mocha extends CondimentDecorator {
    // 被装饰者
    Beverage beverage;

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Mocha";
    }

    @Override
    public double cost() {
        return .20 + beverage.cost();
    }

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }
}
