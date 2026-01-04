package Dsa_Practice.Priority_Queue;
import java.util.PriorityQueue;

public class CPU_Scheduling_With_Priority_Queue {

        public static class CPU_P{
            String name;
            int priority;

            CPU_P(String name, int priority){
                this.name = name;
                this.priority = priority;
            }

            public String toString() {
                return name;
            }
        }

    public static void main(String[] args) {
            PriorityQueue<CPU_P> pqueue = new PriorityQueue<>((a,b) -> a.priority - b.priority);

            pqueue.offer(new CPU_P("P2",1));
            pqueue.offer(new CPU_P("P1",3));
            pqueue.offer(new CPU_P("P3",2));

            PriorityQueue<CPU_P> Display = new PriorityQueue<>(pqueue);

            while(!Display.isEmpty()){
                System.out.print(Display.poll().toString());
                System.out.print(" -> ");
            }

    }
}
