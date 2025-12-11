package Dsa_Practice.Tree;



public class Binary_Search_Tree {
    public static class Node{
        int data;
        Node right;
        Node left;

        Node(int data){
            this.data = data;
        }
    }

    public static Node insert(Node root, int data){
        if(root == null){
            root = new Node(data);
            return root;
        }
        if(root.data > data ){
           root.left =  insert(root.left, data);
        }
        else {
            root.right = insert(root.right , data);

        }
        return root;
    }

    public static void inorder(Node root){
        if(root == null){
            return;
        }else {
            inorder(root.left);
            System.out.println(root.data+" ");
            inorder(root.right);
        }
    }

    public static void main(String[] args) {
        int[] values = {3,5,8,9,5,2,7,2};
        Node root = null;

        for (int i = 0; i < values.length; i++) {
            root = insert(root,values[i]);
        }
        inorder(root);
        System.out.println();
    }
}

