package org.example.Others;

import java.util.Scanner;

public class Array3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];

        System.out.print("Enter ELement");
        for (int i = 0; i < arr.length ; i++) {
            System.out.println("Elemrnt "+i+" :");
           arr[i] = sc.nextInt();
        }
        int positive_count = 0;
        int negative_count = 0;
        int zero_count = 0;
        int sum_positive = 0;
        int sum_negative = 0;
        for (int num : arr) {
            if(num > 0 ){
                positive_count++;
                sum_positive += num;
            }
            else if(num < 0){
                negative_count++;
                sum_negative += num;
            }
            else{
                zero_count++;
            }
        }

        System.out.println("postive numbers are : "+positive_count);
        System.out.println("Negative numbers are :"+negative_count);
        System.out.println("Zero count :"+zero_count);
        System.out.println("sum of positive number :"+sum_positive);
        System.out.println("sum of negative number :"+sum_negative);
    }
}
