package buket.mentorTasks;

import java.util.ArrayList;

public class DivisibleBy3_5_15 {

    public static void Divisible3515(){

        ArrayList<Integer> divisibleBy3 = new ArrayList<>();
        ArrayList<Integer> divisibleBy5 = new ArrayList<>();
        ArrayList<Integer> divisibleBy15 = new ArrayList<>();

        for (int i = 0; i < 101; i++) {
            if (i % 3 == 0 && i % 5 == 0){
                divisibleBy15.add(i);
            } else if (i % 3 == 0) {
                divisibleBy3.add(i);
            }else if (i % 5 == 0){
                divisibleBy5.add(i);
            }
        }

        System.out.println("divisibleBy15 = " + divisibleBy15);
        System.out.println("divisibleBy3 = " + divisibleBy3);
        System.out.println("divisibleBy5 = " + divisibleBy5);


    }
}
