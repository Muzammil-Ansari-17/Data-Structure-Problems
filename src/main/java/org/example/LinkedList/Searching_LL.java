package org.example.LinkedList;
//Muzammil Ahmed
public class Searching_LL {
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
            return;
        }
        newnode.next = head;
        head = newnode;
    }

    public void search(int key ){
            if(head == null){
                System.out.println("list does not exist.");
                return;
            }

            Node current = head;
            int count = 0;
            boolean found = false;
            while(current != null){
                if(current.data == key){
                    System.out.println("key found at " +count);
                    found = true;
                    break;
                }
                current = current.next;
                count++;
            }
            if(!found){
                System.out.println("Key not found!");
            }

    }
    public void display(){
        if(head == null){
            System.out.println("list does not exist");
        }
        Node current = head;
        while(current != null){
            System.out.print(current.data+" -> ");
            current = current.next;
        }
        System.out.println("Null");

    }



    public static void main(String[] args) {

        int key = 13;

        Searching_LL obj = new Searching_LL();
            obj.addfirst(21);
            obj.addfirst(13);
            obj.addfirst(33);
            obj.addfirst(44);
            obj.addfirst(54);
            obj.addfirst(27);
            obj.addfirst(99);
            obj.addfirst(75);
            obj.display();

            obj.search(key);

    }
}
