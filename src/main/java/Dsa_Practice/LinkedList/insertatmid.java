package Dsa_Practice.LinkedList;

import java.util.Scanner;

public class insertatmid {
    Node head;
    class Node{
        private String data;
        private Node next;

        Node(String data){
            this.data = data;
            this.next = null;
        }
    }

    public void addfirst(String data){
        Node newNode = new Node(data);
        if(head ==  null){
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }
    public void insertmid(int insert, String data){
        if(head == null){
            System.out.println("list is not created");
        }
        if(insert == 0){
            addfirst(data);
        }else{
            Node newnode = new Node(data);
            Node current = head;
            for (int i = 0; i < insert -1 ; i++) {
                if(current == null){
                    System.out.println("out of bound ");
                    return;
                }
                current = current.next;
            }
            newnode.next = current.next;
            current.next = newnode;
        }
    }
    public void print(){
        if(head == null){
            System.out.println("List does not exist.");
            return;
        }
        Node current = head;
        while(current != null){
            System.out.print(current.data+" -> ");
            current = current.next;
        }
        System.out.println("Null");
    }
    public static void main(String[] args) {
        insertatmid obj = new insertatmid();
        System.out.println("Linked List");
        obj.addfirst("45");
        obj.addfirst("25");
        obj.addfirst("99");
        obj.addfirst("61");
        obj.addfirst("-79");
        obj.print();

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter index number :");
        int index = sc.nextInt();
        System.out.println("Enter Element :");
        int element = sc.nextInt();
        obj.insertmid(index, String.valueOf(element));
        obj.print();
    }
}

