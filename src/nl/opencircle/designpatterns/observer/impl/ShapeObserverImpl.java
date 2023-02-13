package nl.opencircle.designpatterns.observer.impl;

import nl.opencircle.designpatterns.observer.Observable;
import nl.opencircle.designpatterns.observer.ShapeObserver;

public abstract class ShapeObserverImpl implements ShapeObserver {

    private final Observable observable;

    public ShapeObserverImpl(Observable observable) {
        this.observable = observable;
        observable.register(this);
    }


}
