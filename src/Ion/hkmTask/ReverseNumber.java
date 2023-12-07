package Ion.hkmTask;

public class ReverseNumber {


   public static int reverseInteger(int number) {

       if (number < 0) {
           number = -number;
       }

       int reversed = 0;

       while (number > 0) {
           int digit = number % 10;
           reversed = reversed * 10 + digit;
           number = number / 10;
       }
       return reversed;
   }
}
