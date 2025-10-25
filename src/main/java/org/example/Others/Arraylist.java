package org.example.Others;

import java.util.ArrayList;


public class Arraylist {

    public ArrayList<Integer> removeduplicate(ArrayList<Integer> list){
        ArrayList<Integer> num = new ArrayList<>();
        for (Integer x: list){
            if(!num.contains(x)){
                num.add(x);
            }
        }
        return num;
    }

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.add(22);
        list.add(21);
        list.add(58);
        list.add(25);
        list.add(33);
        list.add(21);

        System.out.println("Remove duplicate");
        Arraylist obj = new Arraylist();

        System.out.println(obj.removeduplicate(list));




    }
}
