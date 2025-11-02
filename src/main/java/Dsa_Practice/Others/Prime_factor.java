package Dsa_Practice.Others;

public class Prime_factor {

    public void findprimefactor(int n){
        for (int i = 2; i <= n; i++) {
            while(n %i == 0){
                System.out.println(i+" ");
                n /= i;
            }
        }
    }
    public static void main(String[] args) {
        Prime_factor obj = new Prime_factor();
        obj.findprimefactor(12);
    }
}
