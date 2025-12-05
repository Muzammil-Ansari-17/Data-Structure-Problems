package Dsa_Practice.Tree;

public class Tree_Main {

    public static void main(String[] args) {

        BinaryTree tree = new BinaryTree();

        Node first = new Node(10);
        Node second = new Node(20);
        Node third = new Node(30);
        Node four = new Node(40);
        Node five = new Node(50);
        Node six = new Node(60);
        Node seven = new Node(70);
        Node eight = new Node(80);

        tree.root = first;
        first.left = second;
        first.right = third;

        second.left = four;
        second.right = five;

        third.left = six;
        third.right = seven;

        four.left = eight;

        System.out.println();
        System.out.println("Post-Order Traversal:");
        tree.postOrderTT(tree.root);

        System.out.println("\n\nIn-Order Traversal:");
        tree.inOrderTT(tree.root);

        System.out.println("\n\nPre-Order Traversal:");
        tree.preOrderTT(tree.root);

        System.out.println("\n\nLevel order Traversal");
        tree.LevelOrderTraversal(tree.root);


        System.out.println("\n\nCount Nodes");
        tree.countNodes(tree.root);
    }
}
