package Yasemin.MentorTasks.week_03;

public class W3_PrimeNumber {

    public static void isPrime(int num){
        int result=1;
        for (int i = 2; i <num ; i++) {
            result=result*num%i;
        }
        if(result!=0){
            System.out.println(num+" is a prime number");
        }else {
            System.out.println(num+" is not prime number");
        }
    }
}
/*
Numbers -- Prime Number
Write a method that can check if a number is
prime or not
 */