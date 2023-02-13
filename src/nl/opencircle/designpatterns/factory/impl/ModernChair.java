package nl.opencircle.designpatterns.factory.impl;

import nl.opencircle.designpatterns.factory.Chair;

public class ModernChair implements Chair {

    @Override
    public void sit() {
        System.out.println("Sitting upright in a hard plastic chair");
    }
}
