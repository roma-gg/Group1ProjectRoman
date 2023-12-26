package Sumeyra.w3;

public class ReverseInteger {
    public static void main(String[] args) {

        System.out.println(reverseInt(12345));
        System.out.println(reverseInt(-12345));

    }


    public static int reverseInt (int n){

        int rev = 0;

        while(n!=0){

            int lastDigit = n % 10;
            rev = rev * 10 + lastDigit;
            n /= 10;

        }

        return rev;
    }
}
