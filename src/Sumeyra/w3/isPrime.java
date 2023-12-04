package Sumeyra.w3;

public class isPrime {
    public static void main(String[] args) {

        System.out.println(isPrime(15));
        System.out.println(isPrime(53));
    }

    public static boolean isPrime( int n){

        if(n<2){
            return false;
        }
        for (int i =2 ; i < n; i++) {
             if(n % i == 0){
               return false;
            }
        }

        return true;

    }


}
