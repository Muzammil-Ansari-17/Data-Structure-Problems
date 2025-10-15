package org.example.Array;

import java.util.Scanner;

public class Array_Size_by_User {

    Scanner sc = new Scanner(System.in);
    int[] arr;
    int size;

    public void size_input(){
        System.out.println("enter size of array :");
        size = sc.nextInt();
        arr = new int[size];
    }

    public void arr_input(){
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
    }
    public void arr_output(){
        for (int i = 0; i < size; i++) {
            System.out.println( arr[i]);
        }
    }
}
