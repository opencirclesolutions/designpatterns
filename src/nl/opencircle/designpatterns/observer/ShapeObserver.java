package nl.opencircle.designpatterns.observer;

public interface ShapeObserver {

    void onShapeAdded(Shape shape);

    void onShapeRemoved(Shape shape);
}
