package headfirst.proxy.gumball;

import java.io.Serializable;

/**
 * Created by Gavin on 2017/3/23.
 */
public interface State extends Serializable {
    void insertQuarter();

    void ejectQuarter();

    void turnCrank();

    void dispense();
}
