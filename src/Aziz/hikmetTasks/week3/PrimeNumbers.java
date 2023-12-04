package Aziz.hikmetTasks.week3;

public class PrimeNumbers {
    /*
    1. Numbers -- Prime Number
Write a method that can check if a number is
prime or not
     */
    public static void main(String[] args) {
        //prime number samples:
        System.out.println("prime(7) = " + prime(73));
        System.out.println("prime(79) = " + prime(79));
        System.out.println("prime(43) = " + prime(43));
        System.out.println("prime(97) = " + prime(97));

    }
    public static boolean prime(int n){
        boolean prime = true;
        if(n%2==0 & n%3==0 & n%5==0){
            prime = false;
        }
        return prime;
    }

}
