package org.example;


import java.util.Scanner;

public class TwodArrray {

    Scanner sc = new Scanner(System.in);
    int row;
    int column;
    int[][] arr;

    public void input(){

        System.out.println("Enter Rows :");
        row = sc.nextInt();
        System.out.println("Enter Column :");
        column = sc.nextInt();
        arr = new int[row][column];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.print("Enter Element of Array"+i+" "+j+" :");
                arr[i][j] = sc.nextInt();
            }
            System.out.println();
        }

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.println(arr[i][j]);
            }
        }
        System.out.println();
    }
}
