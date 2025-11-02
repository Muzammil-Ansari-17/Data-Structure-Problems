package Dsa_Practice.LinkedList;

public class RemoveDuplicate {
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
        }else{
            newnode.next = head;
            head = newnode;
        }
    }

    public void remove_duplicate(){
      Node current = head;

      while(current != null){
          Node comp = current;
          while(comp.next !=null){
              if(comp.next.data == current.data){
                  comp.next = comp.next.next;
              }else{
                  comp  = comp.next;
              }
          }
          current = current.next;
      }
    }
    public void display(){
        Node current = head;
        while (current != null){
            System.out.print(current.data+" -> ");
            current = current.next;
        }
    }

    public static void main(String[] args) {
            RemoveDuplicate obj = new RemoveDuplicate();
            obj.addfirst(22);
            obj.addfirst(5);
            obj.addfirst(4);
            obj.addfirst(3);
            obj.addfirst(22);
            obj.display();
            System.out.println();
            obj.remove_duplicate();
            obj.display();
    }
}
