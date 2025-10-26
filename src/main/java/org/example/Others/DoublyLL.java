package org.example.Others;

public class DoublyLL {
        Node head;
        Node tail;
       public class Node{
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
           if(head == null ){
               head = newnode;
               tail = newnode;
           }else{
               newnode.next  =  head;
               head.prev = newnode;
               head = newnode;
           }
        }

        public void addlast(int data){
           Node newnode = new Node(data);
           if(head == null){
               head = newnode;
               tail = newnode;
           }else{
                tail.next = newnode;
                newnode.prev = tail;
                tail = newnode;
              }
       }

       public void removefirst(){
           if(head == null){
               System.out.println("list does not exist");
               return;
           }if(head == tail){
               head = tail = null;
           }
           else{
               head= head.next;
               head.prev = null;
           }
       }

       public void removelast(){
           if(head == null){
               System.out.println("list does not exist");
               return;
           }else{
               Node current = head;
               while(current.next.next != null){
                   current = current.next;
               }
               current.next = null;
               tail = current;
           }
       }

       public void insert_mid(int index,int data){
           int count = 0;
           Node current = head;
           Node newnode = new Node(data);
           if(head == null){
               System.out.println("list does not exist");
               return;
           } if (index == 0) {
               addfirst(data);
               return;
           }
           while(current != null && count < index-1 ){
               current = current.next;
               count++;
           }

           if (current == null || current.next == null) {
               addlast(data);
               return;
           }
               Node nextnode = current.next;
               newnode.next = nextnode;
               nextnode.prev = newnode;
               newnode.prev = current;
               current.next = newnode;
       }
        public void display(){
           if(head == null){
               System.out.println("list does not exist");
               return;
           }else{
               Node current =head;
               while(current != null){
                   System.out.print(" <-> "+current.data);
                   current = current.next;
               }
           }
        }

    public static void main(String[] args) {
        DoublyLL obj = new DoublyLL();
        obj.addfirst(56);
        obj.addfirst(57);
        obj.display();
        System.out.println();
        obj.addlast(90);
        obj.display();
        System.out.println();
        obj.removefirst();
        obj.display();
        System.out.println();
        obj.removelast();
        obj.display();
        System.out.println();
        obj.insert_mid(0,45);
        obj.insert_mid(1,47);
        obj.display();
        System.out.println();
        obj.insert_mid(8,90);
        obj.display();

    }
}
