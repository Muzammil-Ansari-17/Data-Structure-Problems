package Dsa_Practice.Priority_Queue;

import java.util.PriorityQueue;

public class Practice3 {
    public static class PQ{
        String name;
        int marks;

        PQ(String name , int marks){
            this.name = name;
            this.marks = marks;
        }

        public String toString(){
            return name+" "+ marks;
        }
    }

    public static void main(String[] args) {
        PriorityQueue<PQ> pq = new PriorityQueue<>((a,b) -> b.marks - a.marks);
        pq.add(new PQ("Muzammil",98));
        pq.add(new PQ("Ahmed",100));
        pq.add(new PQ("Faraz",99));

        while (!pq.isEmpty()){
            System.out.println(pq.poll());
        }
    }
}
