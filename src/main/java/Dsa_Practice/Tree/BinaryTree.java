package Dsa_Practice.Tree;

public class BinaryTree {

    public Node root;

    public BinaryTree() {
        this.root = null;
    }

    public void preOrderTT(Node node) {
        if (node == null) return;

        System.out.print(node.data + " ");
        preOrderTT(node.left);
        preOrderTT(node.right);
    }

    public void inOrderTT(Node node) {
        if (node == null) return;

        inOrderTT(node.left);
        System.out.print(node.data + " ");
        inOrderTT(node.right);
    }

    public void postOrderTT(Node node) {
        if (node == null) return;

        postOrderTT(node.left);
        postOrderTT(node.right);
        System.out.print(node.data + " ");
    }
}
