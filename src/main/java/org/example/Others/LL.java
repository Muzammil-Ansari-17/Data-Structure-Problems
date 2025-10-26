package org.example.Others;

import org.example.LinkedList.Searching_LL;

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

        public void insertatmid(int index, int data){
            Node newnode = new Node(data);
            if(head == null){
                System.out.println("list does not exist.");
                return;
            }
            if(index == 0){
                addfirst(data);
                return;
            }

            Node current = head;
            for (int i = 0; i < index -1; i++) {
                if(current == null){
                    System.out.println("out of bound");
                    return;
                }
                current = current.next;
            }
            newnode.next = current.next;
            current.next = newnode;
        }

        public void deleteatmid(int index){
            if(head == null){
                System.out.println("list does not exist.");
                return;
            }
            if(index == 0){
                removefirst();
                return;
            }
            Node current = head;
            for (int i = 0; i < index -1; i++) {
                if(current == null){
                    System.out.println("index out of bound");
                    return;
                }
                current = current.next;
            }
            current.next = current.next.next;
        }

        public int countnode(){
            if(head == null){
                System.out.println( "list does not exist");
                return 0;
            }
            Node current = head;
            int count = 0;
            while(current != null){
                current = current.next;
                count++;
            }
            return count;
        }

        public Node merge(Node l1,Node l2){
            if (l1 == null){
                return l2;
            } else if (l2 == null) {
                return l1;
            }
            Node temp = l1;
            while(temp.next != null){
                temp = temp.next;
            }
            temp.next = l2;
            return l1;

        }
        public void bubblesort(){
            if(head == null){
                System.out.println("list doest not exist");
                return;
            }
            Node i,j;
            int temp;
            for ( i = head; i != null ; i = i.next) {
                for (j = head; j.next != null ; j = j.next) {
                    if(j.data > j.next.data){
                        temp = j.data;
                        j.data = j.next.data;
                        j.next.data = temp;
                    }
                }
            }
        }

        public void linearsearch(int value){
            if(head == null){
                System.out.println("list does not exist");
                return;
            }
            Node current = head;
            int count = 0;
            while(current != null){
                if(current.data == value){
                    System.out.println("Found "+current.data+" at "+count);
                    return;
                }
                count++;
                current = current.next;
            }
            System.out.println(" not found ");
        }

        public void remove_duplicate(){
            if(head == null){
                System.out.println("list doesnot exist");
                return;
            }
            Node current = head;
            while(current != null && current.next!=null){
                if(current.data == current.next.data){
                    current.next = current.next.next;
                }
                current = current.next;
            }
        }

        public Node reverseLL(){
            if(head == null){
                System.out.println("list does not exist");
                return null;
            }
            Node prev = null;
            Node current = head;
            Node next = null;
            while(current != null){
                next = current.next;
                current.next = prev;
                prev = current;
                current = next;
            }
            head = prev;
            return prev;
        }


    public static void main(String[] args) {
        LL obj = new LL();
        obj.addfirst(22);
        obj.addfirst(24);
        obj.addfirst(25);
        obj.addfirst(27);
        obj.addlast(54);
        obj.addlast(78);
        obj.addlast(78);
        obj.addlast(78);
        obj.removefirst();
        obj.removelast();
        obj.display();
        System.out.println();
        obj.insertatmid(2,71);
        obj.insertatmid(3,70);
        obj.insertatmid(4,62);
        obj.display();
        System.out.println();
        obj.deleteatmid(2);
        obj.deleteatmid(0);
        obj.display();
        System.out.println();
        System.out.println("No of Nodes are :"+obj.countnode());
        System.out.println();
        obj.bubblesort();
        obj.display();
        System.out.println();
        obj.linearsearch(54);
        System.out.println();
        obj.remove_duplicate();
        obj.display();
        System.out.println();
        obj.reverseLL();
        obj.display();
    }
}
