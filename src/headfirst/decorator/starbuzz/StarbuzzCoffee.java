package headfirst.decorator.starbuzz;

/**
 * 装饰器模式测试
 * Created by Gavin on 2017/3/7.
 */
public class StarbuzzCoffee {
    public static void main(String[] args){
        Beverage beverage = new Espresso();
        System.out.println(beverage.getDescription() + " $" + beverage.cost());

        // 制造 DarkRoast
        Beverage beverage2 = new DarkRoast();
        beverage2 = new Mocha(beverage2); // 使用 mocha 装饰它
        beverage2 = new Mocha(beverage2); // 使用第二个 mocha 装饰它
        beverage2 = new Whip(beverage2); // 使用 whip 装饰它
        System.out.println(beverage2.getDescription() + " $" + beverage2.cost());

        Beverage beverage3 = new HouseBlend();
        beverage3 = new Soy(beverage3);
        beverage3 = new Mocha(beverage3);
        beverage3 = new Whip(beverage3);
        System.out.println(beverage3.getDescription()
                + " $" + beverage3.cost());
    }
}
