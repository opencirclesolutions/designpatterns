package nl.opencircle.designpatterns.visitor;

public interface Expression {

    <T> T accept(Visitor<T> visitor);
}
