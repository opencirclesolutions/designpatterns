package nl.opencircle.designpatterns.singleton;

import nl.opencircle.designpatterns.singleton.impl.MySingleton;
import nl.opencircle.designpatterns.singleton.impl.MySingleton2;

public class SingletonShowCase {

    public static void main(String... args) {
        MySingleton.getInstance().sayHi();
        MySingleton.getInstance().sayHi();
        MySingleton.getInstance().sayHi();

        MySingleton2.getInstance().sayHi();
        MySingleton2.getInstance().sayHi();
    }
}
