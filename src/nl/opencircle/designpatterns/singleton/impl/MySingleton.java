package nl.opencircle.designpatterns.singleton.impl;

public class MySingleton {

    private static final MySingleton INSTANCE = new MySingleton();

    private MySingleton() {
        // hidden constructor
    }

    public static MySingleton getInstance() {
        return INSTANCE;
    }

    public void sayHi() {
        System.out.println(this + " says hi");
    }
}
