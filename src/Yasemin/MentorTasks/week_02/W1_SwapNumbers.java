package Yasemin.MentorTasks.week_02;

public class W1_SwapNumbers {

    public static void swapNumbers(int a, int b){

        System.out.println(" a= "+a+"   b= "+b);
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("numbers are swapped  a= "+a+"   b= "+b);
    }

}
