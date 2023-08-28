package LeetCode.BinaryTree;

class Node<T> {
    T data;
    Node<T> leftNode;
    Node<T> rightNode;

    Node(T data) {
        this.data = data;
    }
}

public class Tree<T> {
    Node<T> rootNode;
    public void add(Node<Integer> node, int x) {
        int data = node.data;
        if (x > data) {
            if (node.rightNode != null) {
                this.add(node.rightNode, x);
            } else {
                node.rightNode = new Node<>(x);
            }
        } else {
            if (node.leftNode != null) {
                this.add(node.leftNode, x);
            } else {
                node.leftNode = new Node<>(x);
            }
        }
    }

    public static Tree generateTree() {
        Tree<Integer> tree = new Tree<>();
        tree.rootNode = new Node<Integer>(7);
        tree.add(tree.rootNode, 4);
        tree.add(tree.rootNode, 9);
        tree.add(tree.rootNode, 2);
        tree.add(tree.rootNode, 6);
        tree.add(tree.rootNode, 8);
        tree.add(tree.rootNode, 10);
        tree.add(tree.rootNode, 1);
        tree.add(tree.rootNode, 3);
        tree.add(tree.rootNode, 5);
        return tree;
    }
    // 前序遍历
    public void preorder(Node node) {
        System.out.print(node.data + " ");
        if (node.leftNode != null) {
            preorder(node.leftNode);
        }
        if(node.rightNode != null){
            preorder(node.rightNode);
        }
    }

    // 中序遍历
    public void inorder(Node node) {
        if (node.leftNode != null) {
            inorder(node.leftNode);
        }
        System.out.print(node.data + " ");
        if(node.rightNode != null){
            inorder(node.rightNode);
        }
    }

    // 后序遍历
    public void postorder(Node node) {
        if (node.leftNode != null) {
            inorder(node.leftNode);
        }
        if(node.rightNode != null){
            inorder(node.rightNode);
        }
        System.out.print(node.data + " ");
    }
}
