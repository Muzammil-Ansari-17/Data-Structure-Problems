package org.example.LinkedList;

public class LinkedL {
        Node head;
       class Node{
           String data;
           Node next;

           Node(String data){
               this.data = data;
               this.next = null;
           }
       }

        public void addfirst(String data){
            Node newNode = new Node(data);
            if(head == null){
                head = newNode;
                return;
            }
            newNode.next = head;
            head = newNode;
        }

        public void addlast(String data){
           Node newNode = new Node(data);
           if(head == null){
               head = newNode;
               return;
           }
           Node currnode = head;
           while(currnode.next != null){
               currnode = currnode.next;
           }
            currnode.next = newNode;

        }

        public void print(){
           if(head == null){
               System.out.println("list is empty");
                return;
           }
            Node currnode = head;
            while(currnode != null){
                System.out.print(currnode.data+" -> ");
                currnode = currnode.next;
            }
            System.out.println("Null");
        }

        public void removefirst(){
            if(head == null){
                System.out.println("Head is null ");
            }
            head = head.next;
        }

        public void removelast() {
           if(head == null){
               System.out.println("list does not exist.");
           }
           Node current = head;
           while(current.next.next != null){
               current = current.next;
           }
           current.next =null;


        }
    public static void main(String[] args) {
            LinkedL a = new LinkedL();
            a.addfirst("4");
            a.addfirst("first");
            a.print();
            a.addlast("last1");
            a.addlast("last2");
            a.print();
            System.out.println("remove last");
            a.removelast();
            a.print();
    }

}
