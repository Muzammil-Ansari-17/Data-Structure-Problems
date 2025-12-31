/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dsa_Practice.Class_Work.SectionA4.LinkList;

/**
 *
 * @author HAROON TRADERS
 */
public class LL {
    
    class Node{
        private int data;
        private Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
        
    } // End of Node Class
    
    Node first=null;
    Node last = null;
    public void addFirst(int item){
        Node newNode = new Node(item);
        if(first==null){
            first= last = newNode;
        }else{
            newNode.next = first;
            first = newNode;
                    
        }
    
    }
    
    public void printLL(){
    
        Node current = first;
        while(current!=null){
            System.out.print(current.data+" -->");
            current = current.next;
        }
        System.out.println("NULL");
    }
    
    public void addLast(int item){
        Node newNode = new Node(item);
        if(last ==null){
            first = last = newNode;
        }else{
            last.next = newNode;
            last = newNode;
        }
    }
}
