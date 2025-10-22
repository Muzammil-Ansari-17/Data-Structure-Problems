package org.example.Array;

import java.util.Scanner;

public class Avg_sum_2dArray {

    public static void main(String[] args) {
        int arr[][] = new int[5][5];
        int sum = 0;
        int count = 0;
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print("Enter element " + i + " " + j + " :");
                arr[i][j] = sc.nextInt();
                sum += arr[i][j];
                count++;
            }

        }
        double avg = sum / count;
        System.out.println("sum :"+sum);
        System.out.println("avg :"+avg);
    }
}


