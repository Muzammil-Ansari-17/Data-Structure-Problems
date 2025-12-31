/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dsa_Practice.Class_Work.SectionA4.LinkList;

/**
 *
 * @author HAROON TRADERS
 */
public class DoublyLL {
    
    class Node{
    
        private int data;
        private Node next;
        private Node previous;

        public Node(int data) {
            this.data = data;
            this.next = null;
            this.previous = null;
        }
        
    }
    
    Node first;
    Node last;
    
    public void addFirst(int item){
        Node newNode = new Node(item);
        if(first==null)
            first = last = newNode;
        else{
            first.previous = newNode;
            newNode.next = first;
            first = newNode;
        }
    }
    
    public void printBackward(){
    
        Node temp = last;
        System.out.print("NULL-->");
        while(temp!=null){
            System.out.print(temp.data+"<-->");
            temp = temp.previous;
        }
        System.out.println("NULL");
    }
}
