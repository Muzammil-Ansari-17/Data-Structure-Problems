package Dsa_Practice.Queue;

import java.util.PriorityQueue;

public class Task_Manager_Using_Priority_Queue {

    public static class TaskManager{
        String Task;
        int priority;

        TaskManager(String Task , int priority){
                this.Task = Task;
                this.priority = priority;
        }

        @Override
        public String toString(){
            return Task+" (Priority: "+priority+")";
        }
    }
    public static void main(String[] args) {

        PriorityQueue<TaskManager> task = new PriorityQueue<>((a,b) -> a.priority - b.priority);
        task.offer(new TaskManager("Finish Dsa Assignment",1));
        task.offer(new TaskManager("Check Email",5));
        task.offer(new TaskManager("Make Presentation",2));

        int i = 1;
        System.out.println("\nTask list");
        for (TaskManager t: task){
            System.out.println(i+": "+t);
            i++;
        }

        System.out.println("\nCompleted Task : "+task.poll());

        System.out.println("\nRemaining Task");
        i = 1;
        for(TaskManager t: task){
            System.out.println(i+": "+t);
            i++;
        }
    }
}
