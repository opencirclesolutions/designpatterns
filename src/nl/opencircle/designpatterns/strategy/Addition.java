package nl.opencircle.designpatterns.strategy;

public class Addition extends Calculation {

    public boolean supports(Operator op) {
        return op == Operator.PLUS;
    }

    @Override
    public double calculate(double a, double b) {
        return a + b;
    }
}
