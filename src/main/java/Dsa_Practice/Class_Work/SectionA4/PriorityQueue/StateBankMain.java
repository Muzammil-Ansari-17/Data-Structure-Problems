/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dsa_Practice.Class_Work.SectionA4.PriorityQueue;

/**
 *
 * @author HAROON TRADERS
 */
public class StateBankMain {
    public static void main(String[] args) {
        StateBank bank;
        bank = new HBL();
        System.out.println("Kaibor is in HBL:   "+bank.gateKaibor());
        
        bank = new MCB();
        System.out.println("Kaibor is in MCB:   "+bank.gateKaibor());
        
        bank = new UBL();
        System.out.println("Kaibor is in UBL:   "+bank.gateKaibor());
        
        bank = new Meezan();
        System.out.println("Kaibor is in MEEZAN:   "+bank.gateKaibor());
    }
}
