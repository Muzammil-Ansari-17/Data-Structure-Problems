package org.example.DoublyLL;

public class Delete_by_Value {
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
            head = newnode;
            tail = newnode;
        }else{
            newnode.next = head;
            head.prev = newnode;
            head = newnode;
        }
    }

    public void delete(int key){
        if(head == null){
            System.out.println("List does not exist. ");
            return;
        }
        Node current = head;

        while(current != null && current.data != key){
            current = current.next;
        }
        if(current == null){
            System.out.println("index out of bound !");
        }

        if(current == head){
            head = head.next;
            if(head != null){
                head.prev = null;
            }else{
                tail = null;
            }
        }
        else if(current == tail){
            current.prev = tail;
            tail.next = null;

        }
        else{
            current.prev.next = current.next;
            current.next.prev = current.prev;
        }

        System.out.println("Deleted node is " +key);

    }
    public void dispaly(){
        if(head == null){
            System.out.println("list doesnot exist.");
        }else{
            Node current = head;
            System.out.print(" Null");
            while(current != null){
                System.out.print(" -> "+current.data);
                current = current.next;
            }
            System.out.println(" Null");
        }
    }
    public static void main(String[] args) {

        Delete_by_Value obj = new Delete_by_Value();
        obj.addfirst(45);
        obj.addfirst(45);
        obj.addfirst(67);
        obj.addfirst(21);
        obj.dispaly();


        obj.delete(67);
        obj.dispaly();
    }
}

