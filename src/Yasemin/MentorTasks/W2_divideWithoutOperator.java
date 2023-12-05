package Yasemin.MentorTasks;

public class W2_divideWithoutOperator {

    public static void divideWithoutOp(int num1, int num2){
        int result=0;
        int reminder;
        while(num1>=num2) {
            result++;
            num1=num1-num2;

        }
        System.out.println("Result is: "+result+" and remaining is: "+num1);





    }
}
