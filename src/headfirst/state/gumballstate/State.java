package headfirst.state.gumballstate;

/**
 * Created by Gavin on 2017/3/21.
 */
public interface State {
    void insertQuarter();

    void ejectQuarter();

    void turnCrank();

    void dispense();

    void refill();
}
