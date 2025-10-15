package org.example.LinkedList;

public class Count_No_Node {
   Node head;
   class Node{
       int data;
       Node next;

       Node(int data){
           this.data = data;
           this.next = null;
       }
    }

    public void addfirst(int data){
       Node newnode = new Node(data);
       if(head == null){
           head = newnode;
       }else{
           newnode.next = head;
           head = newnode;
       }

    }
    public int countNode(){
       if(head == null){
           System.out.println("List does not exist.");
            return 0;
       }
       Node current = head;
       int count = 0;
       while(current != null){
           current = current.next;
           count++;
       }

        return count;
    }

    public static void main(String[] args) {
        Count_No_Node obj1 = new Count_No_Node();
        obj1.addfirst(10);
        obj1.addfirst(82);
        obj1.addfirst(32);
        obj1.addfirst(68);
        obj1.addfirst(55);
        obj1.addfirst(53);
        obj1.addfirst(45);
        obj1.addfirst(34);
        System.out.println("Number of node in linked list are :"+obj1.countNode());

    }
}
