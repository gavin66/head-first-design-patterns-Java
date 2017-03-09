package headfirst.factory.pizzafm;

/**
 * Created by Gavin on 2017/3/9.
 */
public abstract class PizzaStore {
    abstract Pizza createPizza(String item);

    public Pizza orderPizza(String type){
        Pizza pizza = createPizza(type);
        System.out.println("--- Making a " + pizza.getName() + " ---");
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }
}
