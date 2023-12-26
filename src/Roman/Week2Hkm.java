package Roman;

import java.util.ArrayList;

public class Week2Hkm {

    public int num1 = 5;
    public int num2 = 10;
    public void swapTwoVariables (int num1, int num2) {
        num1 += num2;
        num2 = num1 - num2;
        num1 = num1 - num2;
        this.num1 = num1;
        this.num2 = num2;
    }

    public void divisibleBy3_5_15() {
        var divisibleBy_3_5 = new ArrayList<Integer>();
        var divisibleBy_3 = new ArrayList<Integer>();
        var divisibleBy_5 = new ArrayList<Integer>();
        for (int i = 1; i < 101; i++) {
            if (i % 5 == 0 && i % 3 == 0)
                divisibleBy_3_5.add(i);
            else if (i % 5 == 0)
                divisibleBy_5.add(i);
            else if (i % 3 == 0)
                divisibleBy_3.add(i);
        }
        System.out.println("Divisible by 3, 5, and 15: " + divisibleBy_3_5);
        System.out.println("Divisible by 5: " + divisibleBy_5);
        System.out.println("Divisible by 3: " + divisibleBy_3);
    }

    public void printConsecutiveNums(int num) {
        for (int i = 1; i <= num; i++) {
            System.out.println();
            if (i % 2 != 0 && i % 3 != 0 && i % 5 != 0)
                System.out.print(i);
            if (i % 2 == 0)
                System.out.print("Codility");
            if (i % 3 == 0)
                System.out.print("Test");
            if (i % 5 == 0)
                System.out.print("Coders");
        }
    }

}
