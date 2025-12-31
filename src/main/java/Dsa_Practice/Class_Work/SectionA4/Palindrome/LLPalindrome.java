/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dsa_Practice.Class_Work.SectionA4.Palindrome;

/**
 *
 * @author HAROON TRADERS
 */
public class LLPalindrome {
    class Stack{
        int stackArr[];
        int top;

        public Stack(int sizeOfStack) {
            stackArr = new int[sizeOfStack];
            this.top=-1;
        }
        
        public void push(int item){
            if(top==stackArr.length-1){
                System.out.println("Stack Overflow");
                return;
            }else{
                stackArr[++top] = item;
            }
        }
        public int pop(){
            if(top==-1){
                System.out.println("Stack Underflow");
                return -1;
            }
            else{
                return stackArr[top--];
            }
        }
        
    }
    class Node{
    
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
        
    } // node class
    Node head=null;
    int count=0;
    public void append(int item){
    
        Node newNode = new Node(item);
        if(head==null){
           head = newNode;
           
        }else{
        
            Node current = head;
            while(current.next!=null){
                current = current.next;
            }
            current.next = newNode;
        }
        count++;     
    }
    public boolean isPalindrome(){
        
        Stack stack = new Stack(count);
        Node current = head;
            while(current!=null){
                stack.push(current.data);
                current = current.next;
            }
        current = head;
        while(current!=null){
            int val = stack.pop();
            if(current.data == val){
                current = current.next;
            }else{
                return false;
            }
        }
        return true;
        
    }
    
    public void printLL(){
        Node current = head;
            while(current!=null){
                System.out.print(current.data + "-->");
                current = current.next;
            }
            System.out.println("NULL");
    }
}
