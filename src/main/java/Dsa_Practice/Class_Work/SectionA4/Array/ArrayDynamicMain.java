/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dsa_Practice.Class_Work.SectionA4.Array;

/**
 *
 * @author HAROON TRADERS
 */
public class ArrayDynamicMain {
    public static void main(String[] args) {
        
        Array arr = new Array(5);
        arr.insert(7);
        arr.insert(2);
        arr.insert(6);
        arr.insert(10);
        arr.insert(78);
        arr.insert(100);
        arr.insert(55);
         arr.insert(10);
        arr.insert(78);
        arr.insert(100);
        arr.insert(55);
        arr.printArr();
        arr.removeAt(4);
        arr.printArr();
        //System.out.println("Item: "+arr.checkNumber(79));
        System.out.println((arr.checkNumber(78)==-1 ? "Item Not Found":"Item found at index:"+arr.checkNumber(78)));
    }
}
