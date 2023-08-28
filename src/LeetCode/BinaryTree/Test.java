package LeetCode.BinaryTree;

public class Test {
    public static void main(String[] args) {
        Tree tree = Tree.generateTree();
        tree.preorder(tree.rootNode);
    }
}
