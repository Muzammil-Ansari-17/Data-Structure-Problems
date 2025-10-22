package org.example.Array;

import java.util.Scanner;

public class Input_1d_Array {

    public static void main(String[] args) {
            int[] arr = new int[10];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter elements");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(i+" :");
            arr[i] = sc.nextInt();
        }
    }
}
