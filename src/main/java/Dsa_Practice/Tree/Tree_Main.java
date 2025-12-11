import Dsa_Practice.Tree.BinaryTree;
import Dsa_Practice.Tree.Node;

public class Tree_Main{
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
        Node nine = new Node(90);

        tree.root = first;

        first.left = second;
        first.right = third;

        second.left = four;
        second.right = five;

        third.left = six;
        third.right = seven;

        four.left = eight;
        four.right = nine;


        System.out.println("Pre Order Traversal.");
        tree.preOrderTT(tree.root);

        System.out.println("\n\nIn Order Traversal");
        tree.inOrder(tree.root);

        System.out.println("\n\nPost Order Traversal");
        tree.postOrder(tree.root);

        System.out.println("\n\nLevel Order Traversal");
        tree.LevelOrder(tree.root);

        System.out.println("\n\nCount of Node Traversal");
        int NodeCount = tree.CountNodes(tree.root);
        System.out.println("Num of Nodes are :"+NodeCount);

        System.out.println("\n\nSum of Node Traversal");
        int NodeSum = tree.SumNodes(tree.root);
        System.out.println("Sum of Nodes are :"+NodeSum);

        System.out.println("\n\nHeight of Tree");
        int HofTree = tree.HeightOfTree(tree.root);
        System.out.println(HofTree);

    }
}
