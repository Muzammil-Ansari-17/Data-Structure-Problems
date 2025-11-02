package Dsa_Practice.Array;

import java.util.Scanner;

public class Input_2d_Array {
    public static void main(String[] args) {
        int arr[][] = new int[5][5];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length ; j++) {
                System.out.print("Enter element "+i+" "+j+" :");
                    arr[i][j] = sc.nextInt();

            }

        }
    }
}
