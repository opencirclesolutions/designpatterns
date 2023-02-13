package nl.opencircle.designpatterns.factory.impl;

import nl.opencircle.designpatterns.factory.Sofa;

public class ModernSofa implements Sofa {
    @Override
    public void chill() {
        System.out.println("Lying down on my designer leather sofa");
    }
}
