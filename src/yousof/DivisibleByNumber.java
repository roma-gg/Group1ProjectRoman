package yousof;

public class DivisibleByNumber {

    public static void main(String[] args) {

        System.out.println("Numbers between 1 - 100:");

        for (int i = 1; i <= 100 ; i++) {
            if(i % 15 == 0){
                System.out.println("Divisible by 15: " + i);
            }else if(i % 3 == 0){
                System.out.println("Divisible by 3: " + i);
            }else if(i % 5 == 0){
                System.out.println("Divisible by 5: " +i );
            }
        }

    }

}
//Write a program that can print the numbers between 1 - 100 that can be divisible by 3,5 and 15