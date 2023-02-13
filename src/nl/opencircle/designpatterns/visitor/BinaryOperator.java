package nl.opencircle.designpatterns.visitor;

public class BinaryOperator implements Expression {

    private Operation operator;

    private Expression left;

    private Expression right;

    public BinaryOperator(Operation operator, Expression left, Expression right) {
        this.operator = operator;
        this.left = left;
        this.right = right;
    }

    @Override
    public <T> T accept(Visitor<T> visitor) {
        return visitor.visitBinaryOperator(this);
    }

    public Operation getOperator() {
        return operator;
    }

    public void setOperator(Operation operator) {
        this.operator = operator;
    }

    public Expression getLeft() {
        return left;
    }

    public void setLeft(Expression left) {
        this.left = left;
    }

    public Expression getRight() {
        return right;
    }

    public void setRight(Expression right) {
        this.right = right;
    }


}
