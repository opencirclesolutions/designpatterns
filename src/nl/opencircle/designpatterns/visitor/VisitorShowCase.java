package nl.opencircle.designpatterns.visitor;

public class VisitorShowCase {

    public static void main(String... args) {

        // 4 + 5 * 7 - 9
        Expression expression = new BinaryOperator(
                Operation.TIMES, new BinaryOperator(Operation.PLUS, new Literal(4), new Literal(5)),
                new BinaryOperator(Operation.MINUS, new Literal(7), new Literal(9)));

        PrintVisitor visitor = new PrintVisitor();
        expression.accept(visitor);
        System.out.println();

        EvaluateVisitor ev = new EvaluateVisitor();
        System.out.println("Evaluation resulted in " + expression.accept(ev));
    }

    static class PrintVisitor implements Visitor<Object> {

        @Override
        public Object visitLiteral(Literal literal) {
            System.out.print(literal.getValue());
            return null;
        }

        @Override
        public Object visitBinaryOperator(BinaryOperator operator) {
            System.out.print("(");
            operator.getLeft().accept(this);

            switch (operator.getOperator()) {
                case DIV -> System.out.print(" / ");
                case MINUS -> System.out.print(" - ");
                case PLUS -> System.out.print(" + ");
                case TIMES -> System.out.print(" * ");
            }
            operator.getRight().accept(this);
            System.out.print(")");
            return null;
        }
    }

    static class EvaluateVisitor implements Visitor<Integer> {

        @Override
        public Integer visitLiteral(Literal literal) {
            return literal.getValue();
        }

        @Override
        public Integer visitBinaryOperator(BinaryOperator operator) {
            Integer leftValue = operator.getLeft().accept(this);
            Integer rightValue = operator.getRight().accept(this);

            return switch (operator.getOperator()) {
                case DIV -> leftValue / rightValue;
                case MINUS -> leftValue - rightValue;
                case PLUS -> leftValue + rightValue;
                case TIMES -> leftValue * rightValue;
            };

        }
    }
}
