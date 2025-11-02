package Dsa_Practice.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

//24F-CS-154
//Muzammil Ahmed
public class Array_List {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Random r = new Random();

        for (int i = 0; i <= 20; i++) {
            list.add(r.nextInt(100));
        }

        System.out.println("Unsorted List");
        for (int x: list){
            System.out.println(x);
        }

        Collections.sort(list);
        System.out.println("Sorted List");
        for (int x: list){
            System.out.println(x);
        }

        int target = list.get(r.nextInt(list.size()));
        System.out.println("Searching for "+target);
        System.out.println("Binary Search");
        int result = Collections.binarySearch(list,target);
        System.out.println("Found at index :"+result);
    }
}
