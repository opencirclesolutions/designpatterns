package nl.opencircle.designpatterns.visitor;

public interface Visitor<T> {

    T visitLiteral(Literal literal);

    T visitBinaryOperator(BinaryOperator operator);
}
