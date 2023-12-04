package mira.week2;

public class SwapNumber {

    public static void main(String[] args) {

        int x = 2;
        int y = 4;

        x = x + y;
        y = x - y;
        x = x - y;

        System.out.println( "x = " + x);
        System.out.println("y = " + y);
    }
}
