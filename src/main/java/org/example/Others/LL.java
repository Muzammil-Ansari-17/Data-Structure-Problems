package org.example.Others;

public class LL {
    Node head;
    public class Node{
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
                return;
            }else{
                newnode.next = head;
                head = newnode;
            }
        }

        public void addlast(int data){
            Node newnode = new Node(data);
            if(head == null) {
                head = newnode;
                return;
            }
            Node current = head;
                while(current.next != null){
                    current = current.next;
                }
                current.next = newnode;
        }


        public void display(){
            if(head == null){
                System.out.println("list does not exist");
                return;
            }else{
                Node current = head;
                while(current != null){
                    System.out.print(" -> "+current.data);
                    current = current.next;
                }
                System.out.print(" Null ");
            }

        }

         public void removefirst(){
            if(head == null){
                System.out.println("list does not exist");
            }else{
                head = head.next;
            }
        }

        public void removelast(){
            if(head == null){
                System.out.println("list doesnot exist.");
            }
                Node current = head;
                while(current.next.next != null){
                    current = current.next;
                }
                current.next = null;
        }



    public static void main(String[] args) {
        LL obj = new LL();
        obj.addfirst(22);
        obj.addfirst(24);
        obj.addfirst(25);
        obj.addfirst(27);
        obj.addlast(54);
        obj.addlast(78);
        obj.removefirst();
        obj.removelast();
        obj.display();
    }
}
