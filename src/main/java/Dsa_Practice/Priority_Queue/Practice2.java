package Dsa_Practice.Priority_Queue;

import java.util.Collections;
import java.util.PriorityQueue;

public class Practice2 {
    public static void main(String[] args) {
        PriorityQueue<String> pq = new PriorityQueue<>(Collections.reverseOrder());
        pq.add("Muzammil");
        pq.add("Ahmed");
        pq.add("Faraz");
        pq.add("Nabeel");
        pq.add("Sohaib");

        while (!pq.isEmpty()){
            System.out.println(pq.poll());
        }

    }
}
