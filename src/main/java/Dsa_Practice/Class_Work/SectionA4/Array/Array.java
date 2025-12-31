/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dsa_Practice.Class_Work.SectionA4.Array;

/**
 *
 * @author HAROON TRADERS
 */
public class Array {

    private int myArr[];
    private int count;
    public Array(int items) {
        this.myArr = new int[items];
        this.count = 0;
    }
    
    public void insert(int n){
 
        if(count==myArr.length){
            int temp[] = new int[count*2];
            
            for (int i = 0; i < count; i++) {
                temp[i] = myArr[i];
            }
            myArr = temp;
        }
        
        myArr[count++] = n;
        
    }
    public void printArr(){
    
        for (int i = 0; i < count; i++) {
            System.out.print(myArr[i] + " ");
        }
        System.out.println("");
    }
    public void removeAt(int number){
        for (int i = number; i < count; i++) 
            myArr[i] = myArr[i+1];
        count--;
    }
    public int checkNumber(int number){
    
        for (int i = 0; i < count; i++) {
            if (myArr[i]==number) {
                return i;
            }
        }
        return -1;
    }
}
