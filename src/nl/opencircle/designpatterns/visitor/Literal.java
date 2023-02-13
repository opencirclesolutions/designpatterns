package nl.opencircle.designpatterns.visitor;

public class Literal implements Expression {

    private Integer value;

    public Literal(Integer value) {
        this.value = value;
    }

    public Integer getValue() {
        return value;
    }

    public void setValue(Integer value) {
        this.value = value;
    }

    @Override
    public <T> T accept(Visitor<T> visitor) {
        return visitor.visitLiteral(this);
    }
}
