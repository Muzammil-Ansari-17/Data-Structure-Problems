package Dsa_Practice.LinkedList;

public class binary_sort {
    class Node {
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    Node head;
    public void addfirst(int data){
        Node newnode = new Node(data);
        if(head == null){
            head = newnode;
        }else {
            newnode.next = head;
            head = newnode;
        }
    }

    public void bubblesort(){
        Node current = head;
        boolean swapped;
        do{
            swapped = false;
            while(current.next != null){
                if(current.data > current.next.data){
                    int temp = current.data;
                    current.data = current.next.data;
                    current.next.data = temp;
                    swapped = true;
                }
                current = current.next;
            }
        }
        while (swapped);
    }

    public  void display(){
        if(head == null){
            System.out.println("list doesnot exist.");
            return;
        }else{
            Node current = head;
            while(current != null){
                System.out.print(current.data+" -> ");
                current = current.next;
            }

            System.out.println("null");
        }
    }
    public static void main(String[] args) {
            binary_sort obj = new binary_sort();
            obj.addfirst(22);
        obj.addfirst(76);
        obj.addfirst(91);
        obj.addfirst(81);
        obj.addfirst(-1);
        obj.display();
        obj.bubblesort();
        obj.display();
    }
}
