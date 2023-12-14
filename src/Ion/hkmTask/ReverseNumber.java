package Ion.hkmTask;

public class ReverseNumber {


   public static int reverseInteger(int number) {

       boolean isNegative = false;
       if (number < 0) {
           isNegative = true;
           number = -number;
       }

       int reversed = 0;

       while (number > 0) {
           int digit = number % 10;
           reversed = reversed * 10 + digit;
           number = number / 10;
       }

       return isNegative ? -reversed : reversed;
   }
}
