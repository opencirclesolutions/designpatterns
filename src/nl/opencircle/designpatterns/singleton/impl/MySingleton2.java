package nl.opencircle.designpatterns.singleton.impl;

public class MySingleton2 {

    private static MySingleton2 INSTANCE;

    private MySingleton2() {
        // hidden constructor
    }

    public static synchronized MySingleton2 getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new MySingleton2();
        }
        return INSTANCE;
    }

    public void sayHi() {
        System.out.println(this + " says hi as well");
    }
}
