package Sumeyra.week5;

public class reverseString {

    public static void main(String[] args) {

        reverseString("sumeyra");

    }



    public static void reverseString(String str) {

        String reversed = "";

        for (int i = str.length() - 1; i >= 0; i--) {

            reversed += "" + str.charAt(i);

        }


        System.out.println(reversed);


    }

}