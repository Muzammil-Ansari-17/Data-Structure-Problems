/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dsa_Practice.Class_Work.SectionA4.Tree;

/**
 *
 * @author HAROON TRADERS
 */
public class BST {
    Node root;

    public BST() {
        this.root = null;
    }
    public void insert(int item){
        root = myInsert(root, item);
    }
    
    public void search(int item){
        mySearch(root, item);
    }
    public void mySearch(Node node, int item){
        
        if(node == null){
            
            System.out.println("Item Not Found!");
            return;
        }
        if(node.data == item){
           
            System.out.println("Item Found");
            return;
        }
        if(item < node.data){
                mySearch(node.left, item);
        }else{
                mySearch(node.right, item);
        }
        
    }
    public Node myInsert(Node node, int item){
    
        if(node == null){
            Node newNode = new Node(item);
            return newNode;
        }
        if(item < node.data){
            node.left = myInsert(node.left, item);
        }else if (item > node.data){
            node.right = myInsert(node.right, item);
        }
        
        return node;
        
        
    }
    
    public void inOrderTT(Node node){
    
        if(node==null)
            return;
        
        inOrderTT(node.left);
        System.out.print(node.data +"  ");
        inOrderTT(node.right);
    }
    
    public void preOrderTT(Node node){
    
        if(node==null)
            return;
        
        System.out.print(node.data +"  ");
        preOrderTT(node.left);
        preOrderTT(node.right);
    }
     
    
}
