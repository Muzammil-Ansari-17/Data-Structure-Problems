package Dsa_Practice.Tree;

import java.util.LinkedList;
import java.util.Queue;

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

    public void LevelOrder(Node node){
        if(node == null){
            return;
        }
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        q.add(null);

        while(!q.isEmpty()){
            Node current = q.remove();
            if(current == null){
                System.out.println();
                if(q.isEmpty()){
                    break;
                }else{
                    q.add(null);
                }
            }else{
                System.out.print(current.data+" ");
                if(current.left != null){
                    q.add(current.left);
                }
                if (current.right != null){
                    q.add(current.right);
                }
            }
        }
    }

}