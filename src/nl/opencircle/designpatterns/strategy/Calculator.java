package nl.opencircle.designpatterns.strategy;

import java.util.List;

public class Calculator {

    private List<Calculation> calculations = List.of(new Addition(), new Multiplication(), new Subtraction());

    public double calculate(Operator operator, double a, double b) {
        Calculation calculation = calculations.stream().filter(calc -> calc.supports(operator)).findFirst().get();
        return calculation.calculate(a, b);
    }

    public double calculateWithout(Operator operator, double a, double b) {
        if (operator == Operator.PLUS) {
            return a + b;
        } else if (operator == Operator.MINUS) {
            return a - b;
        } else {
            return a * b;
        }
    }
}
