/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dsa_Practice.Class_Work.SectionA4.PriorityQueue;

import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Queue;

/**
 *
 * @author HAROON TRADERS
 */
public class PQMain {
    public static void main(String[] args) {
        Employee e1 = new Employee(11, "Hamza", 15000, 2);
        Employee e2 = new Employee(1, "Marium", 2000, 3);
        
        String st1 = "Ali";
        String st2 = "Zahid";
        
        System.out.println(st1.compareTo(st2));
        
        
        if(st1.compareTo(st2)>st2.compareTo(st1)){
            System.out.println(st1 + " comes first");
        }else{
            System.out.println(st2+ " comes first");
        }
         //System.out.println(e1);
        //System.out.println(e2);
        
        Queue<Employee> q = new PriorityQueue<>();
        q.add(e1);
        q.add(e2);
        q.add(new Employee(31,"Ali",24000000,10));
        q.add(new Employee(13,"Muskan",3000000,5));
        q.add(new Employee(5,"Ahmed",400000,7));
        q.add(new Employee(20,"Ayesha",1300000,29));
        
        System.out.println(q);
        
        System.out.println("************ Poll() Method ****************");
        while(!q.isEmpty()){
            System.out.print(q.poll());
        }
        
    }
}
