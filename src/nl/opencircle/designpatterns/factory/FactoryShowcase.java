package nl.opencircle.designpatterns.factory;

import nl.opencircle.designpatterns.factory.impl.ModernFurnitureFactory;

public class FactoryShowcase {

    public static void main(String... args) {
        FurnitureFactory factory = new ModernFurnitureFactory();

        Chair chair = factory.createChair();
        Sofa sofa = factory.createSofa();

        chair.sit();
        sofa.chill();
    }
}
