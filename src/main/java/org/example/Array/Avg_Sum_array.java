package org.example.Array;

import java.util.Scanner;

public class Avg_Sum_array {

    public static void main(String[] args) {
        int[] arr = new int[10];
        Scanner sc = new Scanner(System.in);
        int sum = 0;

        System.out.println("Enter elements");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(i+" :");
            arr[i] = sc.nextInt();
            sum += arr[i];
        }
        double avg = sum / arr.length;

        System.out.println("sum :"+sum);
        System.out.println("avg "+avg);

    }

}
