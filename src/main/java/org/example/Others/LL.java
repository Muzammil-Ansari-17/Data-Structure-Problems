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

        public void merge(Node l1,Node l2){
            if(head == null){
                System.out.println("list does not exist");
                return;
            }
            Node current = head;
            while(current != null){
                current = current.next;
            }

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
    }
}
