package nl.opencircle.designpatterns.visitor2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Junction implements TreeNode {

    private List<TreeNode> children;

    public Junction(TreeNode... children) {
        this.children = Arrays.asList(children);
    }

    public List<TreeNode> getChildren() {
        return Collections.unmodifiableList(children);
    }

    @Override
    public <T> T accept(TreeVisitor<T> visitor) {
        return visitor.visitJunction(this);
    }
}
