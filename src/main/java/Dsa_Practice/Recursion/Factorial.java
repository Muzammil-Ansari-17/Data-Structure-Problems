package Dsa_Practice.Recursion;

public class Factorial {
    public int factorialnum(int num){
        if(num == 0 ) return 1;
        return num * factorialnum(num -1);
    }
    public static void main(String[] args) {
            Factorial obj = new Factorial();
        System.out.println(obj.factorialnum(5));
    }
}
