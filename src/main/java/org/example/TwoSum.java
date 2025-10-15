package org.example;

import java.util.Scanner;

public class TwoSum {
        int[] arr;
        int target;

        Scanner sc = new Scanner(System.in);
        public void Arrinput(){
            for (int i = 0; i < arr.length; i++) {
                System.out.println("Enter array");
                arr[i] = sc.nextInt();
            }
        }
        public void Tarinput(){
            System.out.println("enter target num :");
            target = sc.nextInt();
        }

        public int[] Solution(){
            for (int i = 0; i < arr.length; i++) {
                for (int j = i+1; j < arr.length ; j++) {
                    if(arr[i] + arr[j] == target){
                        return new int[]{i,j};
                    }
                }
            }
            return new int[]{};
        }


}

