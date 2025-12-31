/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dsa_Practice.Class_Work.SectionA4.Array;

import java.util.Scanner;

/**
 *
 * @author HAROON TRADERS
 */
public class TwoDArray {
 
    public static void main(String[] args) {
        
        int twoDArr [][] = {{57,74,11},{10,14,87},{47,48,98}};
        System.out.println("for each");
        for(int temp[]:twoDArr){
            for(int x:temp){
                System.out.print(x+ "  ");
            }
            System.out.println("");
        }
        System.out.println("for loop");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(twoDArr[i][j]+"  ");
            }
            System.out.println("");
        }
        
        int ROW=2;
        int COL=3;
        int newTwoD[][] = new int[ROW][COL];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter values in 2D Array");
        for (int i = 0; i < ROW; i++) {
            for (int j = 0; j < COL; j++) {
                newTwoD[i][j]= sc.nextInt();
            }
        }
        
        for(int temp[]:newTwoD){
            for(int x:temp){
                System.out.print(x+ "  ");
            }
            System.out.println("");
        }
    }
}
