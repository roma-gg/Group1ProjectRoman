package Sumeyra.w2;

public class SwapNumbers {

    public static void main(String[] args) {

        swapNumbers(3,7);
    }

    public static void swapNumbers(int num1, int num2){


        num1 = num1+num2;   // storing the sum of num1 and num2 in num1
        num2 = num1-num2;   // storing the value of the original num1 in num2
        num1= num1-num2;    // storing the value of the original num2 in num1

        System.out.println(num1);
        System.out.println(num2);
    }
}
