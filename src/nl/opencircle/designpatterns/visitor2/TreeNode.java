package nl.opencircle.designpatterns.visitor2;

import nl.opencircle.designpatterns.visitor.Visitor;

public interface TreeNode {

    <T> T accept(TreeVisitor<T> visitor);
}
