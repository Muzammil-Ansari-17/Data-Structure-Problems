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
    }

    public static void main(String[] args) {
        PriorityQueue<PQ> pq = new PriorityQueue<>((a,b) -> a.marks - b.marks);
        pq.add("Muzamm")
    }
}
