package Dsa_Practice.Recursion;

public class Sum_of_NaturalNumber {
    public int sum(int num){
        if(num == 0) return 0;
        return num + sum(num -1);
    }
    public static void main(String[] args) {
        Sum_of_NaturalNumber obj = new Sum_of_NaturalNumber();
        System.out.println(obj.sum(10));
    }
}
