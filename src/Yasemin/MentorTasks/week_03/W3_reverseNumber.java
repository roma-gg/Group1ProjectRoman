package Yasemin.MentorTasks.week_03;

public class W3_reverseNumber {

    public static int reverseNum(int num) {
        int reverse = 0;

        while (num != 0) {
            int step = num % 10;
            reverse = reverse * 10 + step;
            num /= 10;
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