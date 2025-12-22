/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dsa_Practice.Class_Work.Tree;

/**
 *
 * @author HAROON TRADERS
 */
public class BinaryTreeMain {
    public static void main(String[] args) {
        BST bst = new BST();
        bst.insert(15);
        bst.insert(12);
        bst.insert(20);
        bst.insert(10);
        bst.insert(9);
        bst.insert(17);
        bst.insert(18);
        bst.insert(5);
        bst.insert(4);
        bst.insert(13);
        bst.insert(14);
        
        System.out.println("");
        System.out.println("IN-ORDER Tree Traversal");
        bst.inOrderTT(bst.root);
        
        System.out.println("");
        System.out.println("PRE-ORDER Tree Traversal");
        bst.preOrderTT(bst.root);
        System.out.println("");
        bst.search(101);
        
        
        
        
        /*BinaryTree tree = new BinaryTree();
        Node first = new Node(10);
        tree.root = first;
        tree.root.left = new Node(20);
        tree.root.right = new Node(30);
        tree.root.left.left = new Node(40);
        tree.root.left.right = new Node(50);
        tree.root.right.left = new Node(60);
        tree.root.right.right = new Node(70);
        tree.root.left.left.left = new Node(80);
        
        System.out.println("");
        System.out.println("Pre-Order Tree Traversal");
        tree.preOrderTT(tree.root);
        
        System.out.println("");
        System.out.println("In-Order Tree Traversal");
        tree.inOrderTT(tree.root);
        
        System.out.println("");
        System.out.println("Post-Order Tree Traversal");
        tree.postOrderTT(tree.root);
        */
    }
}
