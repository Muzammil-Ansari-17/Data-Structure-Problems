package Dsa_Practice.Array;

import java.util.ArrayList;
import java.util.Random;
//24F-CS-154
//Muzammil Ahmed
public class Dyanamic_ArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> num = new ArrayList<>();
        Random r = new Random();

        for (int i = 0; i < 20; i++) {
            num.add(r.nextInt(10));
        }
        System.out.println("\nRandom integers");
        System.out.println(num);

        System.out.println("\nInserting at first index");
        num.addFirst(25);
        System.out.println(num);

        System.out.println("\nInserting at Middle");
        int mid = num.size()/2;
        num.add(mid,45);
        System.out.println(mid);
        System.out.println(num);

        System.out.println("\nInserting at last index");
        num.addLast(68);
        System.out.println(num);

        System.out.println("\nRemove integer at mid index");
        int resultmid= num.remove(mid);
        System.out.println(resultmid);
        System.out.println(num);


        System.out.println("\nInserting last value");
        num.addLast(58);
        System.out.println(num);

        System.out.println("Removing Duplicate");
        num = RemoveDuplicates(num);
        System.out.println(num);


    }

    public static ArrayList<Integer> RemoveDuplicates(ArrayList<Integer> num){
                ArrayList<Integer> newnum = new ArrayList<>();
                for(Integer x:num){
                    if(!newnum.contains(x)){
                        newnum.add(x);
                    }
                }
                return newnum;
    }


}
