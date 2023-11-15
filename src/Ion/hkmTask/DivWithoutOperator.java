package Ion.hkmTask;

public class DivWithoutOperator {

    public static void noOperator(int num1, int num2) {
        if (num2 == 0) {
            throw new ArithmeticException("You can not devide by 0");
        }

        int count = 0;
        while (num1 >= num2) {
            num1 -= num2;
            count++;
        }
        System.out.println(count + "." + num1);

    }
}
