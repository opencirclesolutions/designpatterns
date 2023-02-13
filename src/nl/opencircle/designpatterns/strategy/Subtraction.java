package nl.opencircle.designpatterns.strategy;

public class Subtraction extends Calculation {

    public boolean supports(Operator op) {
        return op == Operator.MINUS;
    }

    @Override
    public double calculate(double a, double b) {
        return a - b;
    }
}

