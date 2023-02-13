package nl.opencircle.designpatterns.observer;

import nl.opencircle.designpatterns.observer.impl.ShapeObserverImpl;
import nl.opencircle.designpatterns.observer.impl.ShapeStore;

public class ObservableShowcase {

    public static void main(String... args) throws Exception {

        ShapeStore store = new ShapeStore();

        ShapeObserver countingObserver = new ShapeObserverImpl(store) {

            private int shapeCount = 0;

            @Override
            public void onShapeAdded(Shape shape) {
                shapeCount++;
                System.out.println("CountingObserver: Shape added. Current shape count is " + shapeCount);
            }

            @Override
            public void onShapeRemoved(Shape shape) {
                shapeCount--;
                System.out.println("CountingObserver: Shape removed. Current shape count is " + shapeCount);
            }
        };
        ShapeObserver loggingObserver = new ShapeObserverImpl(store) {

            @Override
            public void onShapeAdded(Shape shape) {
                System.out.println("LoggingObserver: logging a shape " + shape.getClass().getName());
            }

            @Override
            public void onShapeRemoved(Shape shape) {
                // do nothing (not interested)
            }
        };

        ShapeObserver onlySquaresObserver = new ShapeObserverImpl(store) {

            @Override
            public void onShapeAdded(Shape shape) {
                if (shape instanceof Square s) {
                    System.out.println("SquaresObserver: received a square with side " + s.getSide());
                }
            }

            @Override
            public void onShapeRemoved(Shape shape) {

            }
        };

        store.addSquare(new Square(4));
        Thread.sleep(5000);

        Circle circle = new Circle(7);
        store.addCircle(circle);
        Thread.sleep(5000);

        store.addSquare(new Square(7));
        Thread.sleep(5000);

        store.removeCircle(circle);
        Thread.sleep(5000);
    }
}
