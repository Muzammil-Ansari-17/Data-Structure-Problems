/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dsa_Practice.Class_Work.SectionA4.Tree;

/**
 *
 * @author HAROON TRADERS
 */
public class BinaryTree {
    Node root;

    public BinaryTree() {
        this.root = null;
    }
    
    public void preOrderTT(Node node){
    
        if(node==null)
            return;
        System.out.print(node.data +"  ");
        preOrderTT(node.left);
        preOrderTT(node.right);
    }
    
     public void inOrderTT(Node node){
    
        if(node==null)
            return;
        
        inOrderTT(node.left);
        System.out.print(node.data +"  ");
        inOrderTT(node.right);
    }
     
     public void postOrderTT(Node node){
    
        if(node==null)
            return;
        
        postOrderTT(node.left);
        postOrderTT(node.right);
        System.out.print(node.data +"  ");
    }
    
}
