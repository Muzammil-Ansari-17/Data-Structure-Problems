package Dsa_Practice.Tree;

import java.util.LinkedList;
import java.util.Queue;

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

    public void LevelOrderTraversal(Node root){

        if(root == null){
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
                }else {
                    q.add(null);
                }
            }else{
                System.out.print(current.data+" ");
                if(current.left != null){
                    q.add(current.left);
                }if(current.right != null){
                    q.add(current.right);
                }
            }
        }
    }

    public void countNodes(Node node){
        int count = 1;
        if(node == null){
            return;
        }else{
            count++;
            countNodes(node.left);

            System.out.println(count);
        }

    }
}
