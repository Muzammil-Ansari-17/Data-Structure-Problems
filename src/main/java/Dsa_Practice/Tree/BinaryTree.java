package Dsa_Practice.Tree;

public class BinaryTree{
     public Node root;

    public BinaryTree(){
        this.root = null;
    }

//    Tree Traversals (Pre, Mid, Post)
//    ⭐ 1. PREORDER (Root → Left → Right)

    public void preOrderTT(Node node){
        if(node == null){
            return;
        }else{
            System.out.print(node.data+" ");
            preOrderTT(node.left);
            preOrderTT(node.right);
        }
    }

//    ⭐ 2. INORDER (Left → Root → Right)
    public void inOrder(Node node){
        if(node == null){
            return;
        }else{
            inOrder(node.left);
            System.out.print(node.data+" ");
            inOrder(node.right);
        }
    }

//    ⭐ 3. POSTORDER (Left → Right → Root)
    public void postOrder(Node node){
        if(node == null){
            return;
        }else {
            postOrder(node.left);
            postOrder(node.right);
            System.out.print(node.data+" ");
        }
    }
}