package nl.opencircle.designpatterns.factory.impl;

import nl.opencircle.designpatterns.factory.Chair;
import nl.opencircle.designpatterns.factory.FurnitureFactory;
import nl.opencircle.designpatterns.factory.Sofa;

public class ModernFurnitureFactory implements FurnitureFactory  {

    @Override
    public Chair createChair() {
        return new ModernChair();
    }

    @Override
    public Sofa createSofa() {
        return new ModernSofa();
    }
}
