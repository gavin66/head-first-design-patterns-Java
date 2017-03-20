package headfirst.templatemethod.simplebarista;

/**
 * Created by Gavin on 2017/3/17.
 */
public class Barista {
    public static void main(String[] args) {
        Tea tea = new Tea();
        Coffee coffee = new Coffee();
        System.out.println("Making tea...");
        tea.prepareRecipe();
        System.out.println("Making coffee...");
        coffee.prepareRecipe();
    }
}
