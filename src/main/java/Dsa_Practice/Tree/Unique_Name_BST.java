package Dsa_Practice.Tree;

public class Unique_Name_BST {
    public static class Node{
        String name;
        Node right;
        Node left;

        Node(String name){
            this.name = name;
            this.right = null;
            this.left = null;
        }
    }
    public static class Bst{
        public Node root;

        public Bst(){
            this.root = null;
        }
    }
    public static void main(String[] args) {
            Bst tree = new Bst();
            Node first = new Node("M");
            Node second = new Node("U");
            Node third = new Node("Z");
            Node fourth = new Node("A");
            Node five = new Node("M");
            Node six = new Node("M");
            Node seven = new Node("I");
            Node eight = new Node("L");

            tree.root = first;
            first.right = second;

//            incomplete
    }
}
