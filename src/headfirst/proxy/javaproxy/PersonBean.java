package headfirst.proxy.javaproxy;

import java.util.HashMap;
import java.util.Hashtable;

/**
 * Created by Gavin on 2017/3/24.
 */
public interface PersonBean {
    String getName();

    String getGender();

    String getInterests();

    int getHotOrNotRating();

    void setName(String name);

    void setGender(String gender);

    void setInterests(String interests);

    void setHotOrNotRating(int rating);
}
