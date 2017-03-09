package headfirst.factory.pizzafm;

/**
 * Created by Gavin on 2017/3/9.
 */
public class NYPizzaStore extends PizzaStore {
    @Override
    Pizza createPizza(String item) {

        switch (item) {
            case "cheese":
                return new NYStyleCheesePizza();
            case "veggie":
                return new NYStyleVeggiePizza();
            case "clam":
                return new NYStyleClamPizza();
            case "pepperoni":
                return new NYStylePepperoniPizza();
            default:
                return null;
        }
    }
}
