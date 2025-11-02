package Dsa_Practice.DoublyLL;

public class Insertion {
    Node head;
    Node tail;
    int count = 0;
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
        count++;
    }

    public void addlast(int data) {
        Node newnode = new Node(data);
        if (head == null) {
            head = newnode;
            tail = newnode;
        } else {
            tail.next = newnode;
            newnode.prev = tail;
            tail = newnode;
        }
        count++;
    }

    public void insertatindex(int index, int data){
        Node newnode = new Node(data);
        if(index < 0 || index > count){
            System.out.println("list does not exist.");
            return;
        }

        if( index == 0){
            addfirst(data);
            return;
        }

        if(index == count){
            addlast(data);
            return;
        }
        
        else{
            Node current = head;
            for (int i = 0; i < index -1  ; i++) {
                if(current.next != null){
                    current = current.next;
                }
            }
                Node nextnode = current.next;
                newnode.next = nextnode;
                newnode.prev = current;
                current.next = newnode;
                nextnode.prev = newnode;
            }
         count++;
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
            Insertion obj = new Insertion();
            obj.addfirst(44);
            obj.addfirst(44);
            obj.addfirst(44);
            obj.insertatindex(1,56);
            obj.dispaly();
            obj.insertatindex(3,87);
            obj.dispaly();
            obj.insertatindex(5,90);
            obj.dispaly();
    }
}
