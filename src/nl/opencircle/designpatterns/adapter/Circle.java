package nl.opencircle.designpatterns.adapter;

public interface Circle {

    double getRadius();

    default boolean isBiggerThan(Circle other) {
        return this.getRadius() > other.getRadius();
    }
}
