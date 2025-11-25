package Dsa_Practice.Queue;

import java.util.Collection;
import java.util.Collections;
import java.util.PriorityQueue;

public class Priority_Queue {
    public static void main(String[] args) {
        PriorityQueue<Integer> obj = new PriorityQueue<>(Collections.reverseOrder());
        obj.add(22);
        obj.add(34);
        obj.add(6);
        obj.add(21);

        System.out.println("Unsorted Priority Queue "+obj);
        while (!obj.isEmpty()){
            System.out.print(obj.poll()+" ");
        }
    }
}
