package org.example.LinkedList;
//Muzammil Ahmed
//24F-CS-154
public class Merge_LL {
    Node head;
    class Node{
        private int data;
        private Node next;

        Node(int  data){
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
    public Node merge(Node l1, Node l2){
        if(l1 == null){
            return l2;
        }
        else if (l2 == null){
            return l1;
        }

        Node temp = l1;
        while(temp.next != null){
           temp = temp.next;
        }
        temp.next = l2;
        return l1;
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

    public void bubblesort(){
        if(head == null){
            System.out.println("list does not exist.");
            return;
        }

        Node i,j;
        int temp;
        for (i = head; i !=null; i = i.next) {
            for ( j = head; j.next != null; j= j.next) {
                if(j.data > j.next.data){
                    temp = j.data;
                    j.data = j.next.data;
                    j.next.data = temp;
                }
            }

        }
    }



    public static void main(String[] args) {
        System.out.println("List 1");

        Merge_LL obj1 = new Merge_LL();
        obj1.addfirst(33);
        obj1.addfirst(57);
        obj1.addfirst(98);
        obj1.addfirst(90);
        obj1.addfirst(64);
        obj1.display();

        System.out.println("List 2");

        Merge_LL obj2 = new Merge_LL();
        obj2.addfirst(15);
        obj2.addfirst(74);
        obj2.addfirst(40);
        obj2.addfirst(82);
        obj2.addfirst(12);
        obj2.display();

        Merge_LL Merge = new Merge_LL();
        Merge.head = Merge.merge(obj1.head,obj2.head);
        System.out.println("Merged list");

        Merge.display();

        System.out.println("sorting LL");
        Merge.bubblesort();
        Merge.display();



    }
}
