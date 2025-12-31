/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dsa_Practice.Class_Work.SectionA4.PriorityQueue;

/**
 *
 * @author HAROON TRADERS
 */
public abstract class StateBank {
    
    public abstract double gateKaibor();
    
    public double kaibor(){
        return 11.5;
    }
}

class MCB extends StateBank{

    @Override
    public double gateKaibor() {
        return 11.5 + 1;
    }
    
    
}
class UBL extends StateBank{

    @Override
    public double gateKaibor() {
        return 11.5 + 2;
    }
}
class Meezan extends StateBank{

    @Override
    public double gateKaibor() {
        return 11.5 + 0;
    }
    
    
}
class HBL extends StateBank{

    @Override
    public double gateKaibor() {
        return 11.5 + 5;
    }
    
    
}