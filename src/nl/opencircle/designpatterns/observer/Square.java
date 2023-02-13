package nl.opencircle.designpatterns.observer;

public final class Square extends Shape {

        private int side;
        public Square(int side) {
            this.side = side;
        }

        public int getSide() {
            return this.side;
        }

    }