package headfirst.adapter.ducks;

import com.sun.tools.doclets.formats.html.SourceToHTMLConverter;

/**
 * Created by Gavin on 2017/3/16.
 */
public class DuckTestDrive {
    public static void main(String[] args) {
        MallardDuck duck = new MallardDuck();

        WildTurkey turkey = new WildTurkey();
        Duck turkeyAdapter = new TurkeyAdapter(turkey);

        System.out.println("The Turkey says...");
        turkey.gobble();
        turkey.fly();

        System.out.println("\nThe Duck says...");
        testDuck(duck);

        System.out.println("\nThe TurkeyAdapter says...");
        testDuck(turkeyAdapter);

    }

    private static void testDuck(Duck duck){
        duck.quack();
        duck.fly();
    }

}
