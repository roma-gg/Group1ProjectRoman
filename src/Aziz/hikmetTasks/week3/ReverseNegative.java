package Aziz.hikmetTasks.week3;

import static Aziz.hikmetTasks.week3.PrimeNumbers.prime;

public class ReverseNegative {
    /*
    2. Numbers -- Reverse negative number
Write a return method that can reverse
negative number and return it as int
     */
    public static void main(String[] args) {

        System.out.println("reverse(987) = " + reverse(987));
        System.out.println("reverse(59) = " + reverse(59));
    }
    public static int reverse(int n){

        if(n>=100){
            int third = n%10;
            int second = (n%100)/10;
            int first = n/100;
            int reversedNumber = Integer.parseInt(third+""+second+""+first);
            return reversedNumber;
        }else{
            int third = n%10;
            int second = (n%100)/10;
            int reversedNumber = Integer.parseInt(third+""+second);
            return reversedNumber;
        }

    }
}
