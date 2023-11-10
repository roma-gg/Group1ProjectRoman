package yousof;

public class Task2Mentor {

    public static void main(String[] args) {

        System.out.println(divide(60,10));
    }

    public static int divide(int divide1, int divide2){
        if(divide1 == 0){
            System.err.println("Cannot divide by zero");
        }
        int result = 0;
        while (divide1 >= divide2){
            divide1 -= divide2;
            result++;
        }
        return result;
    }
}
// Write a method that can divide two numbers without using division operator
// Hikmat task