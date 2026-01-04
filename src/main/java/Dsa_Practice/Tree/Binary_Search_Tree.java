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

    public static boolean search(Node root, int key) {
        // Base case: if the tree is empty, the key is not found
        if (root == null) {
            return false;
        }

        // If the key is smaller than root's data,
        // search in the left subtree
        else if (root.data > key) {
            return search(root.left, key);
        }

        // If the key is greater than root's data,
        // search in the right subtree
        else if (root.data < key) {
            return search(root.right, key);
        }

        // If the key is equal to root's data, we found it
        else if (root.data == key) {
            return true;
        }

        // This line is technically redundant because all cases are handled above
        return false;
    }

    public static Node Delete(Node root, int value) {
        // Base case: if the tree is empty
        if (root == null) {
            System.out.println("Empty"); // No node to delete
            return null;
        }

        // If the value to be deleted is smaller than root's data,
        // then it lies in the left subtree
        if (root.data > value) {
            root.left = Delete(root.left, value);
        }
        // If the value to be deleted is greater than root's data,
        // then it lies in the right subtree
        else if (root.data < value) {
            root.right = Delete(root.right, value);
        }
        // If value is equal to root's data, this is the node to be deleted
        else {
            // Case 1: Node with no children (Leaf node)
            if (root.left == null && root.right == null) {
                return null; // Simply remove the node
            }
            // Case 2: Node with only right child
            else if (root.left == null) {
                return root.right; // Replace node with its right child
            }
            // Case 2: Node with only left child
            else if (root.right == null) {
                return root.left; // Replace node with its left child
            }
            // Case 3: Node with two children
            else {
                // Find the inorder successor (smallest value in the right subtree)
                Node IS = InorderSuccessor(root.right);
                // Replace root's data with inorder successor's data
                root.data = IS.data;
                // Delete the inorder successor node from the right subtree
                // ⚡ Important: delete IS.data, not the original value
                root.right = Delete(root.right, IS.data);
            }
        }

        return root; // Return the (possibly updated) root node
    }
    public static Node InorderSuccessor(Node root){
        while (root.left != null){
            root = root.left;
        }
        return root;
    }

    public static void inorder(Node root){
        if(root == null){
            return;
        }else {
            inorder(root.left);
            System.out.print(root.data+" ");
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


        if(search(root,1)){
            System.out.println("Found");
        }else {
            System.out.println("Not Found");
        }

        System.out.println("Delete Node");
        root = Delete(root,5);
        inorder(root);

    }
}

