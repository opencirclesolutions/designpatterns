package nl.opencircle.designpatterns.strategy;

public abstract class Calculation {

    public abstract boolean supports(Operator operator);

    public abstract double calculate(double a, double b);

}
