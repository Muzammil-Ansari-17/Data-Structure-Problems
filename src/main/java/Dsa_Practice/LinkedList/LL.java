package Dsa_Practice.LinkedList;

public class LL {
    Node head;

    class Node {
        String data;
        Node next;

        Node(String data) {
            this.data = data;
            this.next = null;
        }
    }

    //addfirst
       public void addfirst(String data){
            Node newnode = new Node(data);
            if(head == null){
                head = newnode;
                return;
            }
            newnode.next = head;
            head = newnode;
       }

       //addlast
        public void addlast(String data){
            Node newnode = new Node(data);
            if(head == null){
                head = newnode;
                return;
            }
            Node currnode = head;
            while(currnode.next != null){
                currnode = currnode.next;
            }
                currnode.next = newnode;
        }

    //remove first
    public void removefirst(){
           if(head == null){
               System.out.println("Link list is not exist.");
           }
           head = head.next;
    }

    //removelast
    public void removelast(){
           if(head == null){
               System.out.println("link list does`nt exist.");
           }
           Node current = head;
           while(current.next.next !=null){
                current = current.next;
           }
           current.next = null;
    }

    //addmid
    public void addmid(int index ,String data){
        if(head == null){
            System.out.println("List does`nt exist.");
        }
        if(index == 0){
            addfirst(data);
        }else{
            Node newnode = new Node(data);
            Node current = head;
            for (int i = 0; i < index -1; i++) {
                if(current == null){
                    System.out.println("position out of bound.");
                }
                current = current.next;
                return;
            }
            newnode.next = current.next;
            current.next = newnode;

            }
        }

    //print
    public void print(){
        if(head == null){
            System.out.println("Link does`nt exist");
            return;
        }
        Node currnode = head;
        while(currnode != null){
            System.out.print(currnode.data +" -> ");
            currnode = currnode.next;
        }
        System.out.print("Null");
    }


    public static void main(String[] args) {
        LL obj = new LL();

        System.out.println("addfirst");
        obj.addfirst("Name");
        obj.addfirst("My");
        obj.addfirst("is");
        obj.addfirst("Muzammil");
        obj.print();
        System.out.println("addlast");
        obj.addlast("true");
        obj.addlast("False");
        obj.print();
        System.out.println("removefirst");
        obj.removefirst();
        obj.print();
        System.out.println("removelast");
        obj.removelast();
        obj.print();
        System.out.println("addmid");
        obj.addmid(0,"66");
        obj.addmid(2,"45");
        obj.print();
    }
}
