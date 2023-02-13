package nl.opencircle.designpatterns.visitor2;

public class Visitor2ShowCase {

    public static void main(String... args) {

        TreeNode left = new Junction(new Leaf("a"), new Leaf("b"), new Leaf("d"));
        TreeNode right = new Junction(new Leaf("x"), new Leaf("y"),
                new Junction(new Leaf("ab"), new Leaf("def"), new Junction(new Leaf("x"), new Leaf("qax")),
                        new Leaf("z"), new Junction(new Leaf("q"), new Leaf("v"))));
        TreeNode root = new Junction(left, right);

        MaxDepthVisitor visitor = new MaxDepthVisitor();
        int maxDepth = root.accept(visitor);
        System.out.println(maxDepth);

    }

    public static class MaxDepthVisitor implements TreeVisitor<Integer> {

        @Override
        public Integer visitLeaf(Leaf leaf) {
            // TODO: implement
            return 0;
        }

        @Override
        public Integer visitJunction(Junction junction) {
            // TODO: implement
            return 0;
        }
    }
}
