package Yasemin.MentorTasks;

public class reverseNumber {

    public static int reverseNum(int num) {
        int reverse = 0;
        System.out.println("number is = "+num);
        int numFirst = num;
        if (numFirst < 0) {
            num = numFirst * (-1);
        }
        while (num != 0) {
            int step = num % 10;
            reverse = reverse * 10 + step;
            num /= 10;
        }
        reverse = Integer.parseInt(String.valueOf(reverse));
        if (numFirst < 0) {
            reverse = reverse * (-1);
        }
return reverse;

    }
}


/*
The method should take an integer num as input, reverse its digits, and return the result as an integer. If the original number num is negative, the reversed result should also be negative.

For example:
If num is 123, the reversed result should be 321.
If num is -456, the reversed result should be -654.
If num is 0, the reversed result should still be 0. */