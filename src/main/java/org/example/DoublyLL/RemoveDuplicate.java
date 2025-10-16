package org.example.DoublyLL;

public class RemoveDuplicate {
    Node head;
    Node tail;

    class Node{
        int data;
        Node next;
        Node prev;

        Node(int data){
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }
    public void addfirst(int data){
        Node newnode = new Node(data);
        if(head == null){
            head = head.next;
            return;
        }else{

        }

    }
    public void removeduplicate(){
        if(head == null){

        }
    }

    public static void main(String[] args) {

    }
}
