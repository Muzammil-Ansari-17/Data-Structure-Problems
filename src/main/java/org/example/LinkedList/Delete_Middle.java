package org.example.LinkedList;

import java.util.Scanner;

public class Delete_Middle {
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
        Node newnode = new Node(data);
        if(head == null){
            head = newnode;
            return;
        }
        newnode.next = head;
        head = newnode;

    }

    public void remove_first(){
            if(head == null){
                System.out.println("list does not exist.");
                return;
            }
            head = head.next;

    }

    public void deletemid(int index){
            if(head == null){
                System.out.println("list does not exist.");
                return;
            }
            if(index == 0){
                remove_first();
            }

            Node current = head;
            Node prev = null;
            int count = 0;

            while(current != null && count < index){
                prev =  current;
                current = current.next;
                count++;
            }
            if(current == null){
                System.out.println("out of bound");
                return;
            }
            prev.next = current.next;
        System.out.println("Deleted node is at "+index+ " :"+current.data);
    }

    public void display(){
        if(head == null){
            System.out.println("list does not exist");
        }
        Node current = head;
        while(current != null){
            System.out.print(" -> "+current.data);
            current = current.next;
        }
        System.out.println(" -> Null");

    }

    public static void main(String[] args) {
        Delete_Middle obj = new Delete_Middle();
        obj.addfirst("37");
        obj.addfirst("89");
        obj.addfirst("130");
        obj.addfirst("90");
        obj.addfirst("51");
        obj.addfirst("23");
        obj.display();

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter index number to delete :");
        int index_num = sc.nextInt();
        obj.deletemid(index_num);

        obj.display();

    }
}
