package Ion.hkmTask;

public class Swap {

    public static void swapValue(int x, int y){
        x = x + y;
        y = x - y;
        x = x - y;

        System.out.println("x = " + x);
        System.out.println("y = " + y);

    }

}
