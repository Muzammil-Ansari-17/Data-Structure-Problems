package org.example.DoublyLL;
//Muzammil Ahmed
//24F-cs-154
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
            head = newnode;
            tail = newnode;
        }else{
            newnode.next = head;
            head.prev = newnode;
            head = newnode;
        }

    }
    public void removeduplicate() {
        Node current = head;

        while (current != null) {
            Node comp = current.next;
            while (comp != null) {
                if (comp.data == current.data) {
                    // Remove the duplicate node
                    if (comp.next != null) {
                        comp.next.prev = comp.prev;
                    } else {
                        // comp is tail
                        tail = comp.prev;
                    }
                    if (comp.prev != null) {
                        comp.prev.next = comp.next;
                    }
                }
                comp = comp.next; // move inner loop forward
            }
            current = current.next; // move outer loop forward after inner loop finishes
        }
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
        RemoveDuplicate obj = new RemoveDuplicate();
        obj.addfirst(34);
        obj.addfirst(32);
        obj.addfirst(23);
        obj.addfirst(76);
        obj.addfirst(91);
        obj.addfirst(68);
        obj.addfirst(34);
        obj.addfirst(40);
        obj.dispaly();
        obj.removeduplicate();
        obj.dispaly();

    }
}
