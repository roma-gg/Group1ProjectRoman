package mira.week1;

public class DivideWithoutOperator {
    public static void main(String[] args) {

        int a = 20;
        int b = 2;

        int count = 0;

        while (a >= b) {
            a -= b;
            count++;
        }

        System.out.println(count);


    }
}
/*
Divide two numbers without using division operator
 */