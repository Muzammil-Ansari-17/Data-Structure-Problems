package Dsa_Practice.LinkedList;

public class ReverseLL {
    Node head;
    Node prev;
    class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public  void addfirst(int data){
        Node newnode = new Node(data);
        if(head == null){
            head = newnode;
            return;
        }else{
            newnode.next = head;
            head = newnode;
        }
    }

    public void display(){
        if(head == null){
            System.out.println("list does not exist.");
            return;
        }
        Node current = head;
        while(current != null){
            System.out.print(current.data+" -> ");
            current = current.next;
        }
        System.out.print(" Null ");
    }

    public void reverse(){
        if(head == null){
            System.out.println("list does not exist.");
            return;
        }else{
            Node current = head;
            prev = null;
            Node next = null;
            while(current != null){
                next = current.next;
                current.next = prev;


            }
        }
    }
    public static void main(String[] args) {
            ReverseLL obj = new ReverseLL();
            obj.addfirst(11);
            obj.addfirst(23);
            obj.addfirst(41);
            obj.display();
    }
}
