package yousof;

public class PrimeNumber {

    public static void main(String[] args) {

        int num1 = 7;
        int num2 = 12;

        System.out.println(num1 + " is prime: " + isPrime(num1));
        System.out.println(num2 + " is prime: " + isPrime(num2));

    }

    public static boolean isPrime(int num){
        if(num < 2){
            return false;
        }else{
          return true;
        }

    }

}
//Numbers -- Prime Number
//Write a method that can check if a number is
//prime or not