package Dsa_Practice.Priority_Queue;

import java.util.PriorityQueue;
import java.util.Scanner;

public class Print_managment_system {
        public static class PMS{
            String print;
            int priority;

            public PMS(String print, int priority){
                this.print = print;
                this.priority = priority;
            }

            public String prioritycase(){
                switch (priority){
                    case 1: return "Urgent";
                    case 2: return "normal";
                    default: return "low";

                }
            }
            public String toString(){
                return print+" "+prioritycase();
            }
        }
    public static void main(String[] args) {
        PriorityQueue<PMS> queue = new PriorityQueue<>((a,b) -> a.priority - b.priority);
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of Print :");
        int nofprint = sc.nextInt();

        for (int i = 1; i <= nofprint ; i++) {

            System.out.print("Enter name of Print job "+i+" :");
            String nameofPrint = sc.next();
            sc.nextLine();

            System.out.println("1 -> Urgent, 2 -> Mid, 3 -> Low");
            System.out.println("Enter priority level : ");
            int priority = sc.nextInt();
            sc.nextLine();

            queue.add(new PMS(nameofPrint,priority));
        }
        System.out.println("print job | priority ");
        while (!queue.isEmpty()){
            System.out.println(queue.poll());
        }
    }
}




