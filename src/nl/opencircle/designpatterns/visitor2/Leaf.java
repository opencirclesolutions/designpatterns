package nl.opencircle.designpatterns.visitor2;

public class Leaf implements TreeNode {

    private String value;

    public Leaf(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public <T> T accept(TreeVisitor<T> visitor) {
        return visitor.visitLeaf(this);
    }
}
