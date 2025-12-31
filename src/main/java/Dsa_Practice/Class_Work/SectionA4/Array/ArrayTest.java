/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dsa_Practice.Class_Work.SectionA4.Array;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author HAROON TRADERS
 */
public class ArrayTest {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7,8,9,10};
        Scanner sc = new Scanner(System.in);        
        System.out.println(arr[1]+arr[9]);
        System.out.print(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[0]+""+arr[1]);
        System.out.println("Using for loop");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        System.out.println("using for each loop");
        for(int x:arr){
            System.out.println(x);
        }
        System.out.println("Without Loop");
        System.out.print(Arrays.toString(arr)+" ");
        int newArr[] = new int[5];
        System.out.println("");
        int sum=0;
        for (int i = 0; i < newArr.length; i++) {
            
            System.out.print("Enter value at index   "+i+"  ");
            newArr[i] = sc.nextInt();
            
        }
        
        for(int x:newArr){
            System.out.println(x);
            sum+=x;
        }
        System.out.println("Sum:    "+sum);
        System.out.println("Average:    "+sum/newArr.length);
        
    }
    
}
