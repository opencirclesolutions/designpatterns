package nl.opencircle.designpatterns.factory.impl;

import nl.opencircle.designpatterns.factory.Chair;

public class AntiqueChair implements Chair {
    @Override
    public void sit() {
        System.out.println("Swinging around in my rocking chair");
    }
}
