package nl.opencircle.designpatterns.strategy;

public class Multiplication extends Calculation {

    public boolean supports(Operator op) {
        return op == Operator.MULTIPLY;
    }

    @Override
    public double calculate(double a, double b) {
        return a * b;
    }
}

