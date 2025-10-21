/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.example.Stack;

/**
 *
 * @author HAROON TRADERS
 */
public class StackDynamic {
    
    class Node{
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }       
    } // end of node
    
    Node top = null;
    
    public void push(int item){
    
        Node newNode = new Node(item);
        if(top==null)
            top = newNode;
        else{
            newNode.next = top;
            top = newNode;
        }
            
    }
    
    public void pop(){
        if(top==null){
        
            System.out.println("Stack Underflow");
        }else{
            System.out.println("pop:    "+top.data);
            top = top.next;
        }
        
    }
}
