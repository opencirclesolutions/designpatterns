package nl.opencircle.designpatterns.visitor2;

public interface TreeVisitor<T> {

    T visitLeaf(Leaf leaf);

    T visitJunction(Junction junction);
}
