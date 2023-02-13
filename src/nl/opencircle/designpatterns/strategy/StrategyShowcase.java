package nl.opencircle.designpatterns.strategy;

public class StrategyShowcase {

    public static void main(String... args) {
        Calculator calculator = new Calculator();
        System.out.println("4 + 5 is " + calculator.calculate(Operator.PLUS, 4, 5));
        System.out.println("6 * 7 is " + calculator.calculate(Operator.MULTIPLY, 4, 5));
        System.out.println("74 - 5 is " + calculator.calculate(Operator.MINUS, 74, 5));
    }
}
