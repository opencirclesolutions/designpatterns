package nl.opencircle.designpatterns.factory.impl;

import nl.opencircle.designpatterns.factory.Sofa;

public class AntiqueSofa implements Sofa {

    @Override
    public void chill() {
        System.out.println("Chilling in a very fluffy sofa");
    }
}
