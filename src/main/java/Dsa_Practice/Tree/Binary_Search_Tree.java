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

    public static boolean search(Node root,int key){
        if(root == null){
            return false;
        }else if(root.data > key){
            return search(root.left,key);
        }else if(root.data < key){
            return search(root.right,key);
        }else if(root.data == key){
            return true;
        }
        return false;
    }

    public static Node Delete(Node root,int value){
        if(root == null){
            System.out.println("Empty");
        }
        else if (root.data > value){
            root.left = Delete(root.left,value);
        }
        else if (root.data < value) {
            root.right = Delete(root.right,value);
        }
        else if(root.data == value){
//                case 1
            if(root.left == null && root.right == null ){
                return null;
            }
//            case 2
            if(root.left == null){
                return root.right;
            }
            else if (root.right == null) {
                return root.left;
            }
//            case 3
            Node IS = InorderSuccessor(root.right);
            root.data = IS.data;
            root.right = Delete(root.right,value);
        }
        return root;
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

