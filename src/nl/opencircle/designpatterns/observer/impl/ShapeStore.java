package nl.opencircle.designpatterns.observer.impl;


import nl.opencircle.designpatterns.observer.*;

import java.util.ArrayList;
import java.util.List;

public class ShapeStore implements Observable {

    private final List<ShapeObserver> observers = new ArrayList<>();

    @Override
    public void register(ShapeObserver o) {
        observers.add(o);
    }

    public void addSquare(Square square) {
        observers.forEach(observers -> observers.onShapeAdded(square));
    }

    public void addCircle(Circle circle) {
        observers.forEach(observers -> observers.onShapeAdded(circle));
    }

    public void removeSquare(Square square) {
        observers.forEach(observers -> observers.onShapeRemoved(square));
    }

    public void removeCircle(Circle circle) {
        observers.forEach(observers -> observers.onShapeRemoved(circle));
    }
}
